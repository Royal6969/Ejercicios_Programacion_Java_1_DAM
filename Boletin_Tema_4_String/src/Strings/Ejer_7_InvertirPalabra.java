package Strings;

import java.util.Scanner;

public class Ejer_7_InvertirPalabra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//7. Dada una cadena mostrarla al revés.
		
		//Iremos recorriendo la cadena, carácter a carácter, desde el último carácter hasta el primero. 
		//Para ello nos apoyamos en un bucle for.
		
		//for (int x=sCadena.length()-1;x>=0;x--)
		//sCadenaInvertida = sCadenaInvertida + sCadena.charAt(x);
		//System.out.println(sCadenaInvertida);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una palabra");
		String palabra = sc.nextLine();
		
		char[] InvertirPalabra = palabra.toCharArray(); //declaramos un Array de char, que usaremos para invertir el String (la palabra)
		//le damos directamente el valor del String (palabra) y le damos la función de convertir el String en caracteres con el .ToCharArray
		
		for(int i=palabra.length()-1; i>=0; i--) { //recorremos la palabra (caracter por caracter)
			System.out.print(""+InvertirPalabra[i]); //mostramos la plabra invertida, mostrando uno a uno sus caracteres invertidos
		}
	}

}
