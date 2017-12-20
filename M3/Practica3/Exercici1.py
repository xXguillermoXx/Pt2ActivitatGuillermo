#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Programa que calcula la raiz quadrada
import math
A=float(raw_input("Introduce un numero positivo="))
while A<0:
	print "Error no puede ser un numero negativo"
	A=float(raw_input("Introduce un numero positivo="))
A=math.sqrt(A)
print "La raiz cuadrada es=", A
