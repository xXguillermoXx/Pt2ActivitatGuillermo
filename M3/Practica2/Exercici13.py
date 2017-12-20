#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Programa que te dice algo segun los hijos que tengas
A=int(raw_input("Introduce los hijos que tienes="))
if A<0:
	print "Error, no puedes tener menos hijos que 0."
elif A==0:
	print "Lo que te ahorras en pañales crack."
elif A==1:
	print "Cuidado no le des caprichos que se lia."
elif A<1 and A<5:
	print "Tu no te aburres en casa ehhhh."
elif A>4:
	print "Pos bueno pos ok pos que te lo pases bien."
else:
	print "No se como has hecho pa llegar aqui"
