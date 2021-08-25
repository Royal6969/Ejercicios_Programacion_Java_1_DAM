package Bucles;

import java.util.Scanner;

public class Ejer_26_PintarLaU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Este programa pintará un U");
		System.out.println("Introduzca la altura que desea para la U");

		int altura = sc.nextInt();
		int cont = 1;

		while(cont<=altura) {
			if(cont==altura) {
				System.out.println(" ***** "); //esto para la base
			}else {System.out.println("*     *");} //esto para los laterales
			
			cont++;
		}
		
	}

}
