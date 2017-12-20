A=int(raw_input("Introduce la cantidad del producto="))
B=float(raw_input("Introduce el precio del producto="))
C=int(raw_input("Introduce el iva="))
totalsin=A*B
iva=totalsin*C/100
totalcon=totalsin+iva
print "El precio total sin iva es=", totalsin, "El precio total con iva es=", totalcon
