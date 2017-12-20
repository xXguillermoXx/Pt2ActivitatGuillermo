#!/usr/bin/env python
# -*- coding: utf-8 -*-
nombre="lul"
while nombre!="fi":
	nombre=raw_input("Introduce tu nombre=")
	if nombre=="fi":
		continue
	numero=int(raw_input("Introduce un numero="))
	if numero==0 or numero<0:
		while numero==0 or numero<0:
			print "Tiene que ser un numero positivo"
			numero=int(raw_input("Introduce un numero="))
	for i in range(0,numero,1):
		print nombre,
	print
