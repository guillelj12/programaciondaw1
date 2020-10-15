Algoritmo SumarDosEnteros
	Escribir 'Este programa calcula el cociente entre dos enteros'
	Para i<-0 Hasta 9 Hacer
		Escribir 'Operación nº ',i+1
		Escribir 'Introducir entero 1'
		Leer A
		Escribir 'Introducir entero 2'
		Leer B
		Si B<>0 Entonces
			Resultado <- A/B
			Escribir Resultado
		SiNo
			Escribir 'División por cero'
		FinSi
	FinPara
	Escribir 'Mensaje de despedida'
FinAlgoritmo
