.global printn

#
# Print numbers according to given format
#
# Format: o - octal, h - hex, d - decimal
#
printn:
prologue:
    # Create enough space on the stack
    addi sp, sp, -20
    
    # Save return address on stack
    stw ra, 0(sp)
    # r16 - current vararg
    addi r16, sp, 4
    # r17 - memory address of current string char
    mov r17, r4

    stw r4,  4(sp)
    stw r5,  8(sp)
    stw r6, 12(sp)
    stw r7, 16(sp)

print_loop_start:
    # Load value of current char
    ldw r18, 0(r17)

    # Branch to handlers of specific print formats
    compeqi, r19, r18, 0x6f
    bneq r19, r0, br_oct

    compeqi, r19, r18, 0x68
    bneq r19, r0, br_hex

    compeqi, r19, r18, 0x64
    bneq r19, r0, br_dec

    compeqi, r19, r18, 0
    bneq r19, r0, epilogue

    # Don't know the character. Quit.
    br epilogue

br_oct:
    mov r4, r18
    call printOct
    br print_loop_end

br_hex:
    mov r4, r18
    call printHex
    br print_loop_end

br_dec:
    mov r4, r18
    call printDec
    br print_loop_end

print_loop_end:
    # Advance to next argument to function
    addi r16, r16, 4
    # Advance to the next string char
    addi r17, r17, 4
    br print_loop_start

epilogue:
    ldw ra, 0(sp)
    addi sp, sp, 20
    ret

