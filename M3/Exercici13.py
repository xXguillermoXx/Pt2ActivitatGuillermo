#!/usr/bin/env python
# -*- coding: utf-8 -*-
A=int(raw_input("Introduce las ventas de coca-cola="))
B=int(raw_input("Introduce las ventas de fanta="))
C=int(raw_input("Introduce las ventas de limonada="))
precioA=A*1.20
precioB=B*0.80
precioC=C*0.50
total=precioA+precioB+precioC
print "Producto\tVentas\tPrecio\tTotal"
print "Coca-cola\t",A,"\t1.20 €\t",precioA,"€"
print "Fanta\t\t",B,"\t0.80 €\t",precioB,"€"
print "Limonada\t",C,"\t0.50 €\t",precioC,"€"
print "Total\t\t\t\t",total,"€"
