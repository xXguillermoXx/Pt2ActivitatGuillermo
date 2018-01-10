#!/usr/bin/env python
# -*- coding: utf-8 -*-
def triangulo():
	for m in range(9):
		print ".",
	print 9,
	for n in range(9):
		print ".",
	print
	for x in range(8,10):
		if x==8:
			for m in range(8):
				print ".",
		print x,
	for y in range(8,7,-1):
		print y,
		if y==8:
			for n in range(8):
				print ".",
	print
	for x in range(7,10):
		if x==7:
			for m in range(7):
				print ".",
		print x,
	for y in range(8,6,-1):
		print y,
		if y==7:
			for n in range(7):
				print ".",
	print
	for x in range(6,10):
		if x==6:
			for m in range(6):
				print ".",
		print x,
	for y in range(8,5,-1):
		print y,
		if y==6:
			for n in range(6):
				print ".",
	print	
	for x in range(5,10):
		if x==5:
			for m in range(5):
				print ".",
		print x,
	for y in range(8,4,-1):
		print y,
		if y==5:
			for n in range(5):
				print ".",
	print	
	for x in range(4,10):
		if x==4:
			for m in range(4):
				print ".",
		print x,
	for y in range(8,3,-1):
		print y,
		if y==4:
			for n in range(4):
				print ".",
	print
	for x in range(3,10):
		if x==3:
			for m in range(3):
				print ".",
		print x,
	for y in range(8,2,-1):
		print y,
		if y==3:
			for n in range(3):
				print ".",
	print
	for x in range(2,10):
		if x==2:
			for m in range(2):
				print ".",
		print x,
	for y in range(8,1,-1):
		print y,
		if y==2:
			for n in range(2):
				print ".",
	print
	for x in range(1,10):
		if x==1:
			print ".",
		print x,
	for y in range(8,0,-1):
		print y,
		if y==1:
			print ".",
	print
	for x in range(10):
		print x,
	for y in range(8,-1,-1):
		print y,
	print
num=int(raw_input("Introduce el numero de veces que se repita el triangulo="))
for i in range(num):
	triangulo()
