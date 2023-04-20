.macro init; .endm
.section .text.init; .align 6; .weak stvec_handler; .weak mtvec_handler; .globl _start; _start: j test_2; .align 2; write_tohost: sw gp, tohost, t5; sw zero, tohost + 4, t5; j write_tohost;

  #-------------------------------------------------------------
  # Arithmetic tests
  #-------------------------------------------------------------

  test_2: addi x1, x0, 5;

unimp

  .data
 .pushsection .tohost,"aw",@progbits; .align 6; .global tohost; tohost: .dword 0; .size tohost, 8; .align 6; .global fromhost; fromhost: .dword 0; .size fromhost, 8; .popsection; .align 4; .global begin_signature; begin_signature:

 

.align 4; .global end_signature; end_signature: