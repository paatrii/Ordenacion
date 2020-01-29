import java.util.Scanner;

public class Ordenacion {
	
	public Ordenacion() {
		
	}
		
		
		public static String ordenar3(int num1, int num2, int num3) 
		{
			int Mayor; 
			int Menor;
			int Medio;
	
		if(num1>num2 && num1 > num3) {
			Mayor = num1;
		}else if (num2 > num1 && num2 > num3) {
			Mayor = num2;
		}else {
			Mayor = num3;
		}
		
		if(num1 < num2 && num1 < num3) {
			Menor = num1;
		}else if (num2 < num1 && num2 < num3) {
			Menor = num2;
		}else {
			Menor = num3;
		}
		
		Medio = (num1 + num2 + num3) - (Mayor + Menor);
		
		return Menor + ", " + Medio + ", " + Mayor;

			
	   }
		
	}

