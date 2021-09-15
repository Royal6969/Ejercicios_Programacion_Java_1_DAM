package Boletin_Tema_4_Strings;

import java.util.Scanner;

public class Ejer_1_Longitud_Cadena {

/*
 * 1. Inicializar mediante teclado dos cadenas: nombre y apellido. 
 * Posteriormente mostrarlas por pantalla junto con su longitud.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre, apellido;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		nombre = sc.next();
		System.out.println("Introduce tu apellido");
		apellido = sc.next();
		
		System.out.println(nombre+ " " +nombre.length());
		System.out.println(apellido+ " " +apellido.length());
		
	}

}
