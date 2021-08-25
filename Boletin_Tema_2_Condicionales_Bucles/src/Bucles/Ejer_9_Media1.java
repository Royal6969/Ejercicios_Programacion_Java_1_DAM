package Bucles;

import java.util.Scanner;

public class Ejer_9_Media1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//9. Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. 
		//A priori, el programa no sabe cuántos números se introducirán. 
		//El usuario indicará que ha terminado de introducir los datos cuando meta un número negativo.
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int numCont = 0;
		int media = 0;
		
		System.out.println("Este programa calcula la media de los números positivos introducidos.");
	    System.out.println("Puede ir introduciendo números (para parar, introduzca un número negativo):");
	    
	    do {
	    	media+=num;
	    	numCont++;
	    	System.out.println("Introduzca un número ");
	    	num = sc.nextInt();

	    	} while (num>0);
	    	
	    	numCont--;
	    	media=media/numCont;
	    	
	    	System.out.println("La media de los números es " +media);
	
	}

}
