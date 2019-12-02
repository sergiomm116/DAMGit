Algoritmo Echo
	
	Escribir "Introduce oraciones. Introduce STOP para parar el programa."
	
	Leer eco
	
	counter = 0;
	
	control = 0;
	
	Mientras (eco!="STOP")
		
		counter = counter + 1;
		
		Escribir "Frase número: ", counter, " ", " ", " ", " ", "Echo: ", eco;
		
		Leer eco;
		
	FinMientras
	
	Escribir "El programa se ha detenido.";
	
FinAlgoritmo
