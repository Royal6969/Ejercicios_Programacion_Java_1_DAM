package Condicionales;

import java.util.Scanner;

public class Ejer_9_ElMayorDe3Números {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Leer tres números y visualizar el mayor.
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Este programa dirá cual es el mayor de los tres números");
		System.out.println("Introduzca el 1º número ");
		num1 = sc.nextInt();
		System.out.println("Introduzca el 1º número ");
		num2 = sc.nextInt();
		System.out.println("Introduzca el 1º número ");
		num3 = sc.nextInt();
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println("El número mayor es el " +num1);
				}else {System.out.println("El número mayor es el " +num3);}
						
			if(num2>num3) {
				if(num2>num1) {
					System.out.println("El número mayor es el " +num2);
					}else {System.out.println("El número mayor es el " +num1);}
				}
		}
	}
}
	

