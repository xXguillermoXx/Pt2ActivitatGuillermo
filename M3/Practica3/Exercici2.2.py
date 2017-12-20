#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Programa que te dice el descuento
A=int(raw_input("Introduce el precio original="))
B=int(raw_input("Introduce el precio pagado="))
while A<0:
	print "Error no puede haber un precio negativo"
	A=int(raw_input("Introduce el precio original="))
while B<0:
	print "Error no puedes haber pagado menos de 0"
	B=int(raw_input("Introduce el precio pagado="))
C=A-B
D=C*100/A
if A==B:
	print "No ha habido descuento"
else:
	print "El descuento en euros ha sido=", C, "€ El descuento en porcentaje ha sido=", D, "%"
