package Bucles;

import java.util.Scanner;

public class Ejer_9_Media1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//9. Escribe un programa que calcule la media de un conjunto de n�meros positivos introducidos por teclado. 
		//A priori, el programa no sabe cu�ntos n�meros se introducir�n. 
		//El usuario indicar� que ha terminado de introducir los datos cuando meta un n�mero negativo.
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int numCont = 0;
		int media = 0;
		
		System.out.println("Este programa calcula la media de los n�meros positivos introducidos.");
	    System.out.println("Puede ir introduciendo n�meros (para parar, introduzca un n�mero negativo):");
	    
	    do {
	    	media+=num;
	    	numCont++;
	    	System.out.println("Introduzca un n�mero ");
	    	num = sc.nextInt();

	    	} while (num>0);
	    	
	    	numCont--;
	    	media=media/numCont;
	    	
	    	System.out.println("La media de los n�meros es " +media);
	
	}

}
