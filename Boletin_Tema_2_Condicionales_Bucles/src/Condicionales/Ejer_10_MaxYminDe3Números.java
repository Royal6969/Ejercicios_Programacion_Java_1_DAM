package Condicionales;

import java.util.Scanner;

public class Ejer_10_MaxYminDe3Números {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		int max;
		int min;
		
		System.out.println("Este programa dirá cual es el mayor y el menor de los tres números");
		System.out.println("Introduzca el 1º número ");
		num1 = sc.nextInt();
		System.out.println("Introduzca el 1º número ");
		num2 = sc.nextInt();
		System.out.println("Introduzca el 1º número ");
		num3 = sc.nextInt();
		
		if(num1<num2) {
			if(num1<num3) {
				min=num1;
				System.out.println("El menor número es el " +min);
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
		System.out.println("El número mayor es " +max);
		System.out.println("El número menor es " +min);
	}	

}
