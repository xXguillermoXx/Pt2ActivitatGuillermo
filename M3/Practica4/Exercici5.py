#!/usr/bin/env python
# -*- coding: utf-8 -*-
nombre=raw_input("Introduce tu nombre=")
edad=int(raw_input("Introduce tu edad="))
anno=int(raw_input("Introduce el año actual="))
if edad==1:
	print "Has nacido este año"
elif edad==2:
	print "En el año", anno-1, "naciste"
naci=anno-edad
for i in range(naci,anno,+1):
	if edad==1:
		print "En el año", anno, "naciste"
	print "En el año", i, "tenias", (i-naci), "años"	
print "Adios", nombre

