#!/usr/bin/env python
# -*- coding: utf-8 -*-
palabra=raw_input("Introduce una palabra=")
j=len(palabra)
for i in range(0,j,1):
	print palabra[0:i]
for x in range(j,0,-1):
	print palabra[0:x]
