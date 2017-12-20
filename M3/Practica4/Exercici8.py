#!/usr/bin/env python
# -*- coding: utf-8 -*-
alumno=0
suma=0.0
notabaja=10
x="si"
while x=="si":
	alumno=alumno+1
	nombre=raw_input("Introduce el nombre=")
	nota=float(raw_input("Introduce la nota="))
	suma=suma+nota
	if nota<=notabaja:
		notabaja=nota
		nombrebaja=nombre
	x=raw_input("Quieres continuar?")
	
media=suma/alumno
print "La nota media es=",media
print "El nombre del alumno con peor nota es=",nombrebaja
