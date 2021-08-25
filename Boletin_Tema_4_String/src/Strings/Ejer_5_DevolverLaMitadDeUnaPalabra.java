package Strings;

import java.util.Scanner;

public class Ejer_5_DevolverLaMitadDeUnaPalabra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//5. Dada una cadena de caracteres, devuelve la mitad inicial de la cadena.
		
		//aparentemente se pide un Array de Char, pero la gracia aquí será hacerlo con un String
		
		Scanner sc = new Scanner(System.in);
		
		String texto;
		
		System.out.println("Introduzca un texto");
		texto = sc.nextLine();
		
		for(int i=0; i<texto.length()/2; i++) {
			System.out.print(texto.charAt(i));
		}
	}

}
