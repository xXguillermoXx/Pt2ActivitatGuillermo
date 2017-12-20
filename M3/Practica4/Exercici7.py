#!/usr/bin/env python
# -*- coding: utf-8 -*-
alumno=10
suma=0.0
notabaja=10
for i in range(1,alumno+1):	
	nombre=raw_input("Introduce el nombre=")
	nota=float(raw_input("Introduce la nota="))
	suma=suma+nota
	if nota<=notabaja:
		notabaja=nota
		nombrebaja=nombre
	
media=suma/alumno
print "La nota media es=",media
print "El nombre del alumno con peor nota es=",nombrebaja
