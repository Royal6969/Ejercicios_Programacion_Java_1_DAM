package Bucles;

import java.util.Scanner;

public class Ejer_14_Sumar100siguientesNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//14.Realiza un programa que sume los 100 n�meros siguientes a un n�mero entero y positivo introducido por teclado. 
		//Se debe comprobar que el dato introducido es correcto (que es un n�mero positivo).

		Scanner sc = new Scanner(System.in);
		
		int num;
		int suma = 0;
		
		System.out.println("Introduzca un n�mero positivo, y se le sumar�n los 100 n�meros siguientes al mismo");
		
		num = sc.nextInt();
		
		if(num>=0) {
			for(int i=0; i<100; i++) {
				suma+=num; 
				num++;
						}
			System.out.println("La suma de los 100 n�meros siguientes es " +suma);
				}
			else {
				System.out.println("Lo siento, este n�mero es negativo y no se puede hacer...");
			}
	}
}

