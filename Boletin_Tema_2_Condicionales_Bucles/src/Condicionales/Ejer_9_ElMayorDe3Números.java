package Condicionales;

import java.util.Scanner;

public class Ejer_9_ElMayorDe3N�meros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Leer tres n�meros y visualizar el mayor.
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Este programa dir� cual es el mayor de los tres n�meros");
		System.out.println("Introduzca el 1� n�mero ");
		num1 = sc.nextInt();
		System.out.println("Introduzca el 1� n�mero ");
		num2 = sc.nextInt();
		System.out.println("Introduzca el 1� n�mero ");
		num3 = sc.nextInt();
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println("El n�mero mayor es el " +num1);
				}else {System.out.println("El n�mero mayor es el " +num3);}
						
			if(num2>num3) {
				if(num2>num1) {
					System.out.println("El n�mero mayor es el " +num2);
					}else {System.out.println("El n�mero mayor es el " +num1);}
				}
		}
	}
}
	

