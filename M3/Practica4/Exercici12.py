#!/usr/bin/env python
# -*- coding: utf-8 -*-
numero=int(raw_input("Introduce un numero="))
for i in range(0,numero+1,1):
	print
	for x in range(i,0,-1):
		if x==1:
			print x,
			continue
		print x,",",
		
