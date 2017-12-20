#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Metge virtual
A=int(raw_input("Introdueix la teva edat="))
B=raw_input("Introdueix el teu sintoma entre els següents de la llista(Esternuts i mal de cap, Problemes d’estomac, Tos.), si no presentes cap sintoma d'aquest vingui a la meva consulta personal(escrigui el sintoma per agafar hora per la consulta)=")
if B=="Esternuts i mal de cap":
	print "Li recomano prendre paracetamol."
elif B=="Problemes d'estomac":
	print "Li recomano prdendre àcid acetil salicílic."
elif A<=12 and B=="Tos":
	print "Li recomano caramel de mel."
elif A>=12 and B=="Tos":
	print "Li recomano caramel d’eucaliptus."
else:
	print "Ja tens hora previa per la consulta"
