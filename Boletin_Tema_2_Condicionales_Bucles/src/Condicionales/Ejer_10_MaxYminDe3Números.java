package Condicionales;

import java.util.Scanner;

public class Ejer_10_MaxYminDe3N�meros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		int max;
		int min;
		
		System.out.println("Este programa dir� cual es el mayor y el menor de los tres n�meros");
		System.out.println("Introduzca el 1� n�mero ");
		num1 = sc.nextInt();
		System.out.println("Introduzca el 1� n�mero ");
		num2 = sc.nextInt();
		System.out.println("Introduzca el 1� n�mero ");
		num3 = sc.nextInt();
		
		if(num1<num2) {
			if(num1<num3) {
				min=num1;
				System.out.println("El menor n�mero es el " +min);
				if(num2>num3) {
					max=num2;
				}else {max=num3;}
				
			}else {min=num3; max=num2;}
				
		}else {
			if(num1>num3) {
				max=num1;
					if(num2>num3) {
						min=num3;
					}else {min=num2;}
			}else {min=num2; max=num3;}
			}
		System.out.println("El n�mero mayor es " +max);
		System.out.println("El n�mero menor es " +min);
	}	

}
