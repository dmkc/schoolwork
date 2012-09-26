.include "nios_macros.s"

.global main

/* list of registers
r2: program counter
r3: accumulator
r4: temporary values
*/

acc:
 .word 0

main:
 movia r2, START   /* move pc to right place */
 movi r3, 0    /* initialize accumulator */
 movi r4, 0    /* initialize temp */
LOOP:
 movia r4, acc
 ldw r3, 0(r4)
 
 ldb r4, 0(r2)
 beq r4, r0, clear
 
 ldb r4, 0(r2)
 cmpeqi r4, r4, 1
 bne r4, r0, add
 
 ldb r4, 0(r2)
 cmpeqi r4, r4, 2
 bne r4, r0, subtract
 
 ldb r4, 0(r2)
 cmpeqi r4, r4, 3
 bne r4, r0, exit
 
 ldb r4, 0(r2)
 cmpeqi r4, r4, 4
 bne r4, r0, subrev
 
 ldb r4, 0(r2)
 cmpeqi r4, r4, 5
 bne r4, r0, lessthanzero
 
 br ERROR
clear:
 movi r3, 0    /* set the accumulator to 0 */
 br end_loop
add:
 addi r2, r2, 4   /* increment address */
 ldb r4, 0(r2)   /* get info from program */
 add r3, r3, r4

 br end_loop
subtract:
 addi r2, r2, 4   /* increment address */
 ldb r4, 0(r2)   /* get info from program */
 sub r3, r3, r4
 br end_loop
exit:
 br infinite
subrev:
 addi r2, r2, 4   /* increment address */
 ldb r4, 0(r2)   /* get info from program */
 sub r3, r4, r3
 br end_loop
lessthanzero:
 addi r2, r2, 4   /* increment address */
 cmplei r4, r3, -1
 bne r4, r0, setpc
 
 br end_loop
setpc:
 ldw r4, 0(r2)
 mov r2, r4
 
 br LOOP
end_loop:
 addi r2, r2, 4   /* increment address */
 ldw r4, 0(r2)
 mov r2, r4    /* go to address of next instruction */
 movia r4, acc   /* store accumulator register into memory */
 stw r3, 0(r4)
 br LOOP

infinite:
 br infinite

ERROR:
 movi r2, 0xFFFFFFFF
 br infinite

/* TEST PROGRAM */
START2:
.word 0
.word NEXT
NEXT:
.word 1
.word 22
.word NEXT2
NEXT2:
.word 2
.word 10
.word NEXT3
NEXT4:
.word 2
.word 5
.word NEXT3
NEXT3:
.word 3

START:
.word 0
.word INSTR1_SUB
INSTR1_SUB:
.word 2
.word 5
.word INSTR2_TLTZ
INSTR2_TLTZ:
.word 5
.word INSTR3_SUBR
.word FIN
INSTR3_SUBR:
.word 4
.word 0
.word FIN
FIN:
.word 3
