package Bucles;

import java.util.Scanner;

public class Ejer_20_SumaTotal100ContadorYmedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escribe un programa que permita ir introduciendo una serie indeterminada de n�meros
		//mientras su suma no supere el valor 100. Cuando esto �ltimo ocurra, se debe mostrar el total
		//acumulado, el contador de los n�meros introducidos y la media.
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int suma = 0;
		int media = 0;
		int cont = 0;
		
		do {
		System.out.println("Introduzca un n�mero ");
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
		System.out.println("Se han introducido " +cont+ " n�meros, la suma de todos es " +suma+ " , y la media de todos ellos es "+media);
	}

}
