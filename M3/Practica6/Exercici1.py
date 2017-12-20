#!/usr/bin/env python
# -*- coding: utf-8 -*-
texto=raw_input("Introduce texto=")
caracter=raw_input("Introduce un caracter=")
if caracter in texto:
	print "El caracter",caracter,"aparece en",texto
else:
	print "El caracter",caracter,"no aparece en",texto
