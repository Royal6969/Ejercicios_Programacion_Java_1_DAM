package Condicionales;

import java.util.Scanner;

public class Ejer_3_CalculadoraBasica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realiza una calculadora con opciones para ejecutar las cuatro operaciones aritméticas básicas. 
		//El usuario elige la operación a realizar y los números para operar, antes de obtener el resultado.
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		double num1;
		double num2;
		double suma = 0;
		double resta = 0;
		double multiplicación = 0;
		double división = 0;
		
		System.out.println("Introduzca el modo operacional que desee");
		System.out.println("Para sumar, pulse 1");
		System.out.println("Para restar, pulse 2");
		System.out.println("Para multiplicar, pulse 3");
		System.out.println("Para dividir, pulse 4");
		
		num = sc.nextInt();
		
		switch(num) {
		
			case 1:
				
				System.out.println("Se encuentra en el modo suma");
				System.out.println("se sumarán los dos numeros que introduzca");
			
				System.out.println("Introduzca el 1º número");
				num1 = sc.nextDouble();
				System.out.println("Introduzca el 2º número");
				num2 = sc.nextDouble();
				
				suma=num1+num2;
				
				System.out.println("El resultado es: " +suma);
				break;
			
			case 2:
				
				System.out.println("Se encuentra en el modo resta");
				System.out.println("Se restarán los dos números que introduzca");
				
				System.out.println("Introduzca el 1º número");
				num1 = sc.nextDouble();
				System.out.println("Introduzca el 2º número");
				num2 = sc.nextDouble();
				
				resta=num1-num2;
				
				System.out.println("El resultado es: " +resta);
				break;
				
			case 3:
				
				System.out.println("Se encuentra en el modo multiplicación");
				System.out.println("Se multiplcarán los números que introduzca");
				
				System.out.println("Introduzca el 1º número");
				num1 = sc.nextDouble();
				System.out.println("Introduzca el 2º número");
				num2 = sc.nextDouble();
				
				multiplicación=num1*num2;
				
				System.out.println("El resultado es: " +multiplicación);
				break;
			
			case 4:
				
				System.out.println("Se encuentra en el modo división");
				System.out.println("Se dividirán los dos números que introduzca");
				
				System.out.println("Introduzca el 1º número");
				num1 = sc.nextDouble();
				System.out.println("Introduzca el 2º número");
				num2 = sc.nextDouble();
				
				división=num1/num2;
				
				System.out.println("El resultado es: " +división);
				break;
				
			default:
				
				System.out.println("No has elegido una opción del menú, pruebe otra vez");
				break;
		}
	}

}
