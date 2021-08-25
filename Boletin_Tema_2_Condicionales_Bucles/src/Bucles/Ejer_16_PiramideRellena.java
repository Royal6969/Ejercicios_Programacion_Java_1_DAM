package Bucles;

import java.util.Scanner;

public class Ejer_16_PiramideRellena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realiza un programa que pinte una pirámide por pantalla. 
		//La altura se debe pedir por teclado. 
		//El carácter con el que se pinta la pirámide también se debe pedir por teclado.
	
		//https://github.com/LuisJoseSanchez/aprende-java-con-ejercicios/blob/master/soluciones/05_Bucles/S05Ejercicio19.java
		
		Scanner sc = new Scanner(System.in);
		
		String signo;
		int altura;
		int espacio;
		int longitud=1;
		int ancho = 1; //para saber cuando dejar de escribir la pirámide
		
		System.out.println("Este programa creará una pirámide ");
		System.out.println("Intruzca la altura de la pirámide ");
		altura = sc.nextInt();
		System.out.println("Introduzca el carácter para crear la pirámide ");
		signo = sc.next();
		
		espacio=altura-1;
		
		while(ancho<=altura) {
			for(int i=1; i<=espacio; i++) {
				System.out.print(" "); //sobra el (LN)
			}
			for(int i=1; i<=longitud; i++) {
				System.out.print(signo);
			}
			System.out.println();
			
			//ahora cambio de variables
			
			espacio--;
			ancho++;
			longitud+=2;
		}
		
		
		
	}

}
