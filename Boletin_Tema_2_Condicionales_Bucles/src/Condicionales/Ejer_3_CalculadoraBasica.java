package Condicionales;

import java.util.Scanner;

public class Ejer_3_CalculadoraBasica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realiza una calculadora con opciones para ejecutar las cuatro operaciones aritm�ticas b�sicas. 
		//El usuario elige la operaci�n a realizar y los n�meros para operar, antes de obtener el resultado.
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		double num1;
		double num2;
		double suma = 0;
		double resta = 0;
		double multiplicaci�n = 0;
		double divisi�n = 0;
		
		System.out.println("Introduzca el modo operacional que desee");
		System.out.println("Para sumar, pulse 1");
		System.out.println("Para restar, pulse 2");
		System.out.println("Para multiplicar, pulse 3");
		System.out.println("Para dividir, pulse 4");
		
		num = sc.nextInt();
		
		switch(num) {
		
			case 1:
				
				System.out.println("Se encuentra en el modo suma");
				System.out.println("se sumar�n los dos numeros que introduzca");
			
				System.out.println("Introduzca el 1� n�mero");
				num1 = sc.nextDouble();
				System.out.println("Introduzca el 2� n�mero");
				num2 = sc.nextDouble();
				
				suma=num1+num2;
				
				System.out.println("El resultado es: " +suma);
				break;
			
			case 2:
				
				System.out.println("Se encuentra en el modo resta");
				System.out.println("Se restar�n los dos n�meros que introduzca");
				
				System.out.println("Introduzca el 1� n�mero");
				num1 = sc.nextDouble();
				System.out.println("Introduzca el 2� n�mero");
				num2 = sc.nextDouble();
				
				resta=num1-num2;
				
				System.out.println("El resultado es: " +resta);
				break;
				
			case 3:
				
				System.out.println("Se encuentra en el modo multiplicaci�n");
				System.out.println("Se multiplcar�n los n�meros que introduzca");
				
				System.out.println("Introduzca el 1� n�mero");
				num1 = sc.nextDouble();
				System.out.println("Introduzca el 2� n�mero");
				num2 = sc.nextDouble();
				
				multiplicaci�n=num1*num2;
				
				System.out.println("El resultado es: " +multiplicaci�n);
				break;
			
			case 4:
				
				System.out.println("Se encuentra en el modo divisi�n");
				System.out.println("Se dividir�n los dos n�meros que introduzca");
				
				System.out.println("Introduzca el 1� n�mero");
				num1 = sc.nextDouble();
				System.out.println("Introduzca el 2� n�mero");
				num2 = sc.nextDouble();
				
				divisi�n=num1/num2;
				
				System.out.println("El resultado es: " +divisi�n);
				break;
				
			default:
				
				System.out.println("No has elegido una opci�n del men�, pruebe otra vez");
				break;
		}
	}

}
