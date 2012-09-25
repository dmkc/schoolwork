.data
; EXAMPLE PROGRAM HERE
START:
.word 0
.word INSTR1
INSTR1:
.word 1
.word 77
.word INSTR3
INSTR2:
.word 0
.word FIN
INSTR3:
.word 2
.word 15
.word FIN
FIN:
.word 3

; Instructions
clear: .word 0
add  : .word 1
sub  : .word 2
exit : .word 3


;;;; Code 

.text
_start:
; r11 - temp register
; r12 - our current instruction address
; r13 - current instruction
; r14 - operand
; r15 - the accumulator

; Load current instruction into r12
movia r11, START

; process instruction name
SWITCH:
ldwio r12, 4(r11)
; offset
movia r11, add
ldwio r13, 0(r11)
beq r12, r13, DO_CLEAR
ldwio r13, 4(r11)
beq r12, r13, DO_ADD
ldwio r13, 8(r11)
beq r12, r13, DO_SUB
ldwio r13, 12(r11)
beq r12, r13, DO_EXIT

; 0 - clear accumulator
DO_CLEAR:
addi r15, r0, 0x0
br done

; 1 - add number to accumulator
DO_ADD:
loadwio r14, 8(r11)
add r15, r15, r14
br DO_NEXT

; 2 - subtract number from accum
DO_SUB:
loadwio r14, 8(r11)
sub r15, r15, r14

; 3 - exit program
DO_EXIT:
ret

DO_NEXT:
; Load address of next instruction
ldwio r11, 12(r12)
ldwio r12, 0(r11)
br SWITCH

