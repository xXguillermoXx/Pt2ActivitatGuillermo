#!/usr/bin/env python
# -*- coding: utf-8 -*-
nombre=raw_input("Introduce tu nombre=")
ba = nombre.count('a')
be = nombre.count('e')
bi = nombre.count('i')
bo = nombre.count('o')
bu = nombre.count('u')
total = ba+be+bi+bo+bu
print "El nombre contiene",len(nombre),"caracteres y",total,"vocales"
