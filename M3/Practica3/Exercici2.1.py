#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Programa que indica que pasa cuando transcurre un segundo
anno=int(raw_input("Introduce un anno="))
mes=int(raw_input("Introduce un mes="))
dia=int(raw_input("Introduce un dia="))
hora=int(raw_input("Introduce una hora="))
minuto=int(raw_input("Introduce un/os minuto/s="))
segundo=int(raw_input("Introduce un/os segundo/s="))
while segundo<0:
	print "Error no pueden haber segundos negativos"
	segundo=int(raw_input("Introduce un/os segundo/s="))
else:
	if segundo<=58:
		segundo=segundo+1
	elif segundo==59:
		segundo=0
		minuto=minuto+1
	if minuto==60:
		minuto=0
		hora=hora+1
	if hora==24:
		hora=0
		dia=dia+1
	if dia==31:
		dia=0
		mes=mes+1
	if mes==13:
		mes=0
		anno=anno+1

print segundo,"segundos",minuto,"minutos",hora,"horas",dia,"dias",mes,"mes",anno,"anno"
