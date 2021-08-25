package Condicionales;

import java.util.Calendar;
import java.util.Scanner;

public class Ejer_13_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Dados la hora HH, MM y SS, calcular la hora dentro de un segundo. 
		//Realizar dos versiones, una usando la clase Calendar y otra sin usarla.
		
		Scanner sc = new Scanner(System.in);
		
		int horas;
		int minutos;
		int segundos;
		
		 Calendar hora = Calendar.getInstance(); //esto es como cuando se pone el SCANNER

	        System.out.println("Dime una hora");
	        horas=sc.nextInt();
	        System.out.println("Dime los minutos");
	        minutos=sc.nextInt();
	        System.out.println("Dime los segundos");
	        segundos=sc.nextInt();
	        segundos++; //le sumamos 1 a los segundos porque es lo que pide el programa

	        hora.set(Calendar.HOUR_OF_DAY, horas); //esto va asi porque si
	        hora.set(Calendar.MINUTE, minutos);
	        hora.set(Calendar.SECOND, segundos);
	        System.out.println("La hora en un segundo sera " +hora.getTime());
	}

}
