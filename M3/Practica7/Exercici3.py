#!/usr/bin/env python
# -*- coding: utf-8 -*-
notal=[]
notak=[]
media=0
cantidad=int(raw_input("Introduce la cantidad de alumnos="))
while 0>=cantidad or 51<=cantidad:
	print "Error"
	cantidad=int(raw_input("Introduce la cantidad de alumnos="))
for i in range(0,cantidad,1):
	nota=int(raw_input("Introduce una nota"))
	media=media+nota
	if i==0:
		notal.append(nota)
		continue
	notal.append(nota)
for i in range(cantidad-1,-1,-1):
	print notal[i],",",
