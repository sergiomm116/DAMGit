Algoritmo sin_titulo
	n = 1
	i = 0
	p = 0
	mientras n <= 100 hacer
			escribir n
			n = n + 1
			si ((n%2)=0)
				p = p + n
			SiNo
				i = i + n
			FinSi
			
		FinMientras
		escribir p " es la suma de los números pares."
		escribir i " es la suma de los números impares."
FinAlgoritmo
