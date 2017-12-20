#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Programa que te dice si es igual, mayor o menor que 0
A=int(raw_input("Introduce primer numero="))
B=int(raw_input("Introduce segundo numero="))
C=A*B
if C==0:
	print "El producto es igual a 0"
elif C>=0:
	print "El producto es mayor que 0"
else:
	print "El producto es menor que 0"
