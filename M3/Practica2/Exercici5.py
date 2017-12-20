#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Programa que te dice el descuento
A=int(raw_input("Introduce el precio original="))
B=int(raw_input("Introduce el precio pagado="))
C=A-B
D=C*100/A
if A==B:
	print "No ha habido descuento"
else:
	print "El descuento en euros ha sido=", C, "€ El descuento en porcentaje ha sido=", D, "%"
