package Condicionales;

import java.util.Scanner;

public class Ejer_1_HoraYbuenosDias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas
		//tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a
		//5, respectivamente. Sólo se tendrán en cuenta las horas, los minutos no se deben introducir
		//por teclado.
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Introduzca la hora que es ");
		
		hora = sc.nextInt();
		
		if(hora>=6 && hora<=12) {
			System.out.println("Buenos días!!");
		}
		
			else if(hora>=13 && hora<=20) {
			System.out.println("Buenas tardes!!");	
			}
			else {
				System.out.println("Buenas noches!!");
			}
	}

}
