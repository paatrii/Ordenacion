Algoritmo Ordenacion
	Escribir 'Ingrese el primer valor:'
	Leer num1
	Escribir 'Ingrese el segundo valor:'
	Leer num2
	Escribir 'Ingrese el tercer valor:'
	Leer num3
	Si num1<num2 Y num1<num3 Entonces
		menor <- num1
		Si num2<num3 Entonces
			medio <- num2
			mayor <- num3
		SiNo
			medio <- num3
			mayor <- num2
		FinSi
	SiNo
		Si num2<num1 Y num2<num3 Entonces
			menor <- num2
			Si num1<num3 Entonces
				medio <- num1
				mayor <- num3
			SiNo
				medio <- num3
				mayor <- num1
			FinSi
		SiNo
			menor <- num3
			Si num1<num2 Entonces
				medio <- num1
				mayor <- num2
			SiNo
				medio <- num2
				mayor <- num1
			FinSi
		FinSi
	FinSi
	Escribir menor,' ',medio,' ',mayor
FinAlgoritmo

