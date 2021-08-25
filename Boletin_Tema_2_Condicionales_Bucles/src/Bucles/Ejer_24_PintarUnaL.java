package Bucles;

import java.util.Scanner;

public class Ejer_24_PintarUnaL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la altura de la L");
		int altura = sc.nextInt();
		int longitud = 1; //contador horizontal
		int i = 1; //contador
		
		
		while(i<=altura) {
			if(i == altura) {
				while(longitud<=(altura/2)+1) { //esto es la base
				System.out.print("*");
				longitud++;
				}
			}else {
				System.out.print("*");
				System.out.println(" ");
			}
			i++;
		}
		
	}

}
