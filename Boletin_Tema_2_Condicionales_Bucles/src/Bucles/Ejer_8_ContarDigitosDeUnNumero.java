package Bucles;

import java.util.Scanner;

public class Ejer_8_ContarDigitosDeUnNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//8. Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.

		Scanner sc = new Scanner(System.in);
		
		int numSC; //El número introducido
		int numDig = 1; //El número de dígitos del número introducido ES EL CONTADOR
		int numsyso;
		
		System.out.println("Introduzca un número para saber su número de dígitos ");
		numSC = sc.nextInt();
		numsyso=numSC;
		
		while(numSC>10) {
			numSC /= 10; //quitar una cifra a la derecha 
			numDig ++; //contador empieza en 1 (minimo una cifra)
			}
		
		System.out.println("El número " +numsyso+ " tiene " +numDig+ " dígitos");
	}

}
