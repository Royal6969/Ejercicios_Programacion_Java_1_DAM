package Recursividad;

import java.util.Scanner;

public class Ejer_10_EscribirCadenaCaracteresAlReves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//10. Escribir una cadena al revés + Escribir un número al revés
	
		Scanner sc = new Scanner(System.in);
//________________________________________________________________________________________________________	
		System.out.println("Introduzca un número para darle la vuelta e invertir el orden de sus cifras");
		int num = sc.nextInt();
		
		System.out.println(invertirNumero(num, 2));
		//syso (invertirNumero(num, X) donde (X) es el nº de cifras -1
		System.out.println();
//_________________________________________________________________________________________________________
		System.out.println("Introduzca una palabra para darle la vuelta e invertir el orden de sus letras");
		String palabra = sc.next();
		
		System.out.println(invertirPalabra(palabra, palabra.length()-1));
	}	
//_________________________________________________________________________________________________________
		
	public static int invertirNumero(int num, int posicion) { //recuerda que aqui mismo se pueden declarar variables sin necesidad de declararlas en el main
		
		if(num<10) {
			return num;
			
		}else {
			return (num%10)*(int)Math.pow(10, posicion) + (invertirNumero(num/10, posicion-1));
		}
	}
//___________________________________________________________________________________________________________
	
	public static String invertirPalabra(String palabra, int posChar) {
		
		if(posChar==0) {
			return palabra.charAt(posChar)+""; //lo del (+"") es un truquito para los chars se consideren Strings
		
		}else {
			return palabra.charAt(posChar) + (invertirPalabra(palabra, posChar-1));
		}
	}
}
