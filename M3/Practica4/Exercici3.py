#!/usr/bin/env python
# -*- coding: utf-8 -*-
n1=int(raw_input("Introduce el primer numero="))
n2=int(raw_input("Introduce el segundo numero="))
if n1<n2:
	for nt in range(n2,n1,-1):
		print nt 
elif n2<n1:
	for nt in range(n2,n1,+1):
		print nt
elif n1==n2:
	print "Los numeros son iguales", n1, ",", n2
