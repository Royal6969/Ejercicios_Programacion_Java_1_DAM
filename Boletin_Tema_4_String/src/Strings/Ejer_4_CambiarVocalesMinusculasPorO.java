package Strings;

import java.util.Scanner;

public class Ejer_4_CambiarVocalesMinusculasPorO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String texto;
		
		System.out.println("Introduzca un texto");
		texto = sc.nextLine();
		
		texto = texto.replace('a', 'o').replace('e', 'o').replace('i', 'o').replace('u', 'o');
		
		System.out.println(texto);
	}

}
