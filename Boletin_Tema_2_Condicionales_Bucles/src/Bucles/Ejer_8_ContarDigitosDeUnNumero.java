package Bucles;

import java.util.Scanner;

public class Ejer_8_ContarDigitosDeUnNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//8. Realiza un programa que nos diga cu�ntos d�gitos tiene un n�mero introducido por teclado.

		Scanner sc = new Scanner(System.in);
		
		int numSC; //El n�mero introducido
		int numDig = 1; //El n�mero de d�gitos del n�mero introducido ES EL CONTADOR
		int numsyso;
		
		System.out.println("Introduzca un n�mero para saber su n�mero de d�gitos ");
		numSC = sc.nextInt();
		numsyso=numSC;
		
		while(numSC>10) {
			numSC /= 10; //quitar una cifra a la derecha 
			numDig ++; //contador empieza en 1 (minimo una cifra)
			}
		
		System.out.println("El n�mero " +numsyso+ " tiene " +numDig+ " d�gitos");
	}

}
