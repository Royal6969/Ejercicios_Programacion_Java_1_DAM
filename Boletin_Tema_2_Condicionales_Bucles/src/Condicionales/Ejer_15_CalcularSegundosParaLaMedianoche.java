package Condicionales;

import java.util.Scanner;

public class Ejer_15_CalcularSegundosParaLaMedianoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escribe un programa que dada una hora determinada (horas y minutos), 
		//calcule los segundos que faltan para llegar a la medianoche.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Este programa calcula los segundos que faltan para la medianoche");
		System.out.println("Introduzca la hora (digital) que es (sin los minutos!)");
		int horas = sc.nextInt();
		System.out.println("Introduzca en que minuto(s) se encuentra");
		int minutos = sc.nextInt();
		
		int segundostrans = (horas*60*60)+(minutos*60);
		int segundoshastanoche = 0;
		segundoshastanoche=(24*60*60)-segundoshastanoche;
		
		System.out.println("Quedan " +segundoshastanoche+ " segundos para la medianoche");
		
	}

}
