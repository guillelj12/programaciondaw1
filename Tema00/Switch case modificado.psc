Algoritmo sin_titulo
	Escribir 'Elija operación:'
	Escribir '1 - Suma'
	Escribir '2 - Resta'
	Escribir '3 - Multiplica'
	Escribir '4 - Divide'
	Leer N
	Si N>=1 y N<=4 Entonces
		Escribir 'Introduzca el entero A'
		Leer A
		Escribir 'Introduzca el entero B'
		Leer B
		Segun N  Hacer
			N=1:
				R <- A+B
			N=2:
				R <- A-B
			N=3:
				R <- A*B
			expresion:
			N=4:
				R <- A/B
			De Otro Modo:
				Escribir 'Introduzca un número válido'
		FinSegun
	FinSi
	Escribir R
FinAlgoritmo
