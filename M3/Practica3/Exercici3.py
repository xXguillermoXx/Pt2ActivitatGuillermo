#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Calculadora
A=float(raw_input("Introduce el primer operando="))
B=raw_input("Introduce el operador=")
C=float(raw_input("Introduce el segundo operando="))
if B=="+":
	print A,B,C,"=",A+C
elif B=="-":
	print A,B,C,"=",A-C
elif B=="*":
	print A,B,C,"=",A*C
elif B=="/":
	print A,B,C,"=",A/C
while A!=0000:
	print "Introduce 0000 en el primer operando para finalizar el programa"
	A=float(raw_input("Introduce el primer operando="))
	if A==0000:
		break
	B=raw_input("Introduce el operador=")
	C=float(raw_input("Introduce el segundo operando="))
	if B=="+":
		print A,B,C,"=",A+C
	elif B=="-":
		print A,B,C,"=",A-C
	elif B=="*":
		print A,B,C,"=",A*C
	elif B=="/":
		print A,B,C,"=",A/C
print "Programa finalizado"
