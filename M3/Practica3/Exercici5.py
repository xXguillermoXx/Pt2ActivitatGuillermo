#!/usr/bin/env python
# -*- coding: utf-8 -*-
euros=int(raw_input("Introduce los euros que quieres sacar="))
centimos=int(raw_input("Introduce los centimos que quieres sacar="))
c1=0
c2=0
c5=0
c10=0
c20=0
c50=0
e1=0
e2=0
b5=0
b10=0
b20=0
b50=0
b100=0
b200=0
b500=0
while centimos==0:
	print "Error no te podemos sacar 0 centimos"
	centimos=int(raw_input("Introduce los centimos que quieres sacar="))
while centimos>=100:
	print "Error no te podemos sacar mas de 100 centimos ya que se pasa a €"
	centimos=int(raw_input("Introduce los centimos que quieres sacar="))
while euros>=500:
	euros=euros-500
	b500=b500+1
while euros>=200:
	euros=euros-200
	b200=b200+1
while euros>=100:
	euros=euros-100
	b100=b100+1
while euros>=50:
	euros=euros-50
	b50=b50+1
while euros>=20:
	euros=euros-20
	b20=b20+1
while euros>=10:
	euros=euros-10
	b10=b10+1
while euros>=5:
	euros=euros-5
	b5=b5+1
while euros>=2:
	euros=euros-2
	e2=e2+1
while euros>=1:
	euros=euros-1
	e1=e1+1
while centimos>=50:
	centimos=centimos-50
	c50=c50+1
while centimos>=20:
	centimos=centimos-20
	c20=c20+1
while centimos>=10:
	centimos=centimos-10
	c10=c10+1
while centimos>=5:
	centimos=centimos-5
	c5=c5+1
while centimos>=2:
	centimos=centimos-2
	c2=c2+1
while centimos>=1:
	centimos=centimos-1
	c1=c1+1
print b500, "billetes de 500€."
print b200, "billetes de 200€."
print b100, "billetes de 100€."
print b50, "billetes de 50€."
print b20, "billetes de 20€."
print b10, "billetes de 10€."
print b5, "billetes de 5€."
print e2, "monedas de 2€."
print e1, "monedas de 1€."
print c50, "monedas de 50 centimos."
print c20, "monedas de 20 centimos."
print c10, "monedas de 10 centimos."
print c5, "monedas de 5 centimos."
print c2, "monedas de 2 centimos."
print c1, "monedas de 1 centimos."
