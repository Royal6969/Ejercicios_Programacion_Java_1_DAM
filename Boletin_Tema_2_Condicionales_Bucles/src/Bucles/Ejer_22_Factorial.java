package Bucles;

import java.util.Scanner;

public class Ejer_22_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//Escribe un programa que calcule el factorial de un n�mero entero le�do por teclado.

		System.out.println("Introduzca un n�mero para calcular su factorial ");
		int num;
		num = sc.nextInt();
		int factorial = 1;
		
		while(num>0) {
			factorial=factorial*num;
			num--;
		}
		System.out.println("El factorial del n�mero " +num+ " es " +factorial);
	}

}
