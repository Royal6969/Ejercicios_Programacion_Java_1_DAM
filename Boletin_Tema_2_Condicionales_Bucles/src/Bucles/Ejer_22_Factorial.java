package Bucles;

import java.util.Scanner;

public class Ejer_22_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//Escribe un programa que calcule el factorial de un número entero leído por teclado.

		System.out.println("Introduzca un número para calcular su factorial ");
		int num;
		num = sc.nextInt();
		int factorial = 1;
		
		while(num>0) {
			factorial=factorial*num;
			num--;
		}
		System.out.println("El factorial del número " +num+ " es " +factorial);
	}

}
