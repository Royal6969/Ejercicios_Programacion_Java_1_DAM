package Strings;

import java.util.Scanner;

public class Ejer_1_NombreYapellidoMostrarLongitudCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String Nombre;
		String Apellidos;
		
		System.out.println("¿Cuál es su nombre?");
		Nombre = sc.nextLine();
		
		System.out.println("¿Cuáles son sus apellidos?");
		Apellidos = sc.nextLine();
		
		System.out.print("Su nombre es: " +Nombre+ " y mide: " +Nombre.length()+ " caracteres");
		System.out.println();
		System.out.print("y sus apellidos son: " +Apellidos+ " y mide: " +Apellidos.length()+ " caracteres");
			
	}

}
