A=int(raw_input("Introduce la cantidad del producto="))
B=float(raw_input("Introduce el precio del producto="))
totalsin=A*B
iva=A*B*0.21
totalcon=totalsin+iva
print "El precio total sin iva es=", totalsin, "El precio total con iva es=", totalcon
