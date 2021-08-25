package Bucles;

import java.util.Scanner;

public class Ejer_20_SumaTotal100ContadorYmedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escribe un programa que permita ir introduciendo una serie indeterminada de números
		//mientras su suma no supere el valor 100. Cuando esto último ocurra, se debe mostrar el total
		//acumulado, el contador de los números introducidos y la media.
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int suma = 0;
		int media = 0;
		int cont = 0;
		
		do {
		System.out.println("Introduzca un número ");
		num = sc.nextInt();
		
			if(suma+num<=100) {
				suma+=num;
				cont++;	
			} else {
				num=101;
					}
		}
			while (num<100 && suma<=100); 
			
		media=suma/cont;
		System.out.println("Se han introducido " +cont+ " números, la suma de todos es " +suma+ " , y la media de todos ellos es "+media);
	}

}
