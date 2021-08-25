package Bucles;

import java.util.Scanner;

public class Ejer_18_ContadorMediaMayorPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realiza un programa que vaya pidiendo números hasta que se introduzca un numero
		//negativo y nos diga cuantos números se han introducido, la media de los impares y el mayor
		//de los pares. El número negativo sólo se utiliza para indicar el final de la introducción de
		//datos pero no se incluye en el cómputo.
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int cont = 1;
		int contaux = 0;
		int contimp = 0;
		int media = 0;
		int suma = 0;
		int mayorpar = 0;
		
		while (cont>0) {
			System.out.println("Introduzca un número ");
			num = sc.nextInt();
			if(num<0) {
				cont=0;
			}
			else {
				if(num%2==0) {
					if(num>mayorpar) {
						mayorpar=num;
						}
					}
				else { 	
					contimp++;
					suma+=num;
				}
			}
			contaux++;
		}
		media=suma/contimp;
		System.out.println("El total de números introducidos es "+contaux+ " ,la media de los números impares es " +media+ "  y el mayor de los números pares es " +mayorpar);
	}

}
