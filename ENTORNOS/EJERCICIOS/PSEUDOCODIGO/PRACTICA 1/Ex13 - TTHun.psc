Algoritmo TTHun
	
	n = 1
	
	mul2 = 0
	
	mul3 = 0
	
	mientras n<=100
		
		Escribir "N�mero: ", n
		
		Si (n%2=0)
			
			Escribir "M�ltiplo de 2 encontrado"
			
			mul2 = mul2 + 1
			
		FinSi
		
		Si (n%3=0)
			
			Escribir "M�ltiplo de 3 encontrado"
			
			mul3 = mul3 + 1
			
		FinSi
		
		n = n + 1
		
	FinMientras
	
FinAlgoritmo
