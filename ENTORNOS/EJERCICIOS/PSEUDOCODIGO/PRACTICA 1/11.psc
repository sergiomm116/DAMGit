Algoritmo sin_titulo
	n = 0
	
	escribir "Introduce un número y te dire si es multiplo de 3: "
	leer n
	si ((n%3)=0) Entonces
		escribir n " es un multiplo de 3."
		mientras n > 3
			n = n - 3
			escribir n
		FinMientras
	SiNo
		escribir n " no es multiplo de 3."
		
	FinSi
FinAlgoritmo
