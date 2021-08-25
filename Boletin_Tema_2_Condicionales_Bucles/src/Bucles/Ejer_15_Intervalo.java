package Bucles;

import java.util.Scanner;

public class Ejer_15_Intervalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escribe un programa que obtenga los n�meros enteros comprendidos entre dos n�meros
		//introducidos por teclado y validados como distintos, el programa debe empezar por el menor
		//de los enteros introducidos e ir incrementando de 7 en 7.
		
		Scanner sc = new Scanner(System.in);
		
		int Principio;
		int Final;
		
		System.out.println("Este programa mostrar� los n�meros comprendidos de 7 en 7 en un intervalo ");
		
		do {
			System.out.println("Introduzca un primer n�mero ");
			Principio = sc.nextInt();
			System.out.println("Introduzca otro n�mero diferente del primero ");
			Final = sc.nextInt();
			
			if(Principio == Final) {
				System.out.println("Los n�meros introducidos son iguales... Por favor, vuelva a introducir los n�meros ");
				}
		
			} while(Principio == Final);
		
		if(Principio > Final) {
			
			int intercambio = Principio;
			
			Principio = Final;
			Final = intercambio;
			}
		
		for (int i=Principio; i<=Final; i+=7) {
			System.out.println(i+ "");
		}
		
	}

}
