package Recursividad;

import java.util.Scanner;

public class Ejer_6_MultiplicarNumerosConLaSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//6. Multiplicación de dos enteros, usando la suma.
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int total = 0;
		
		System.out.println("Introduzca los números que se van a multiplicar");
		System.out.print("Numero 1: ");
		num1 = sc.nextInt();
		System.out.print("Número 2: ");
		num2 = sc.nextInt();
		
		total = multiplicacion(num1, num2, total);
		
		System.out.println("El total de la multiplicación es: "+total);
	}
	public static int multiplicacion(int num1, int num2, int total) {
		
		if(num2==1) {
			total+=num1;
			return total;
			
		}else {
			total+=num1;
			return multiplicacion(num1, (num2-1), total);
		}
	}

}
