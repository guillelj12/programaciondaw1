Algoritmo SumarDosEnteros
	Escribir 'Este programa calcula el cociente entre dos enteros, hasta que meta como divisor un 0'
	Repetir
		Escribir 'Introducir entero 1'
		Leer A
		Si A<>0 Entonces
			Escribir 'Introducir entero 2'
			Leer B
			Si B<>0 Entonces
				Resultado <- A/B
				Escribir Resultado
			SiNo
				Escribir 'División por cero'
			FinSi
		FinSi
	Hasta Que A=0
	Escribir 'Mensaje de despedida'
FinAlgoritmo
