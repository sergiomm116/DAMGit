Algoritmo sin_titulo
	Escribir "escribeme S o N"
	Leer a
	si a=="S"  o a=="N"
		Escribir "bien hecho"
	FinSi
	si a!="S"  o a!="N"
		repetir 
			Escribir "no es correcto prueba otra vez"
			Leer a
			
		Hasta Que a= "S" o a="N"
		escribir "bien hecho"
		
	FinSi
FinAlgoritmo
