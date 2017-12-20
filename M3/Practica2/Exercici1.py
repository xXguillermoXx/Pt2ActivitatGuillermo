#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Programa que te dice si puedes ir a la carcel
nombre=raw_input("Introduce tu nombre=")
edad=int(raw_input("Introduce tu edad="))
if edad>=18:
	print "Puedes ir a la carcel"
else:
	print "Aun eres menor no puedes ir a la carcel"
print "Adios", nombre, "!"
