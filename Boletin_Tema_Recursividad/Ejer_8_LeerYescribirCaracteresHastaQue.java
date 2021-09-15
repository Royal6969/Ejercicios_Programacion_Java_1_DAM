package Recursividad;

import java.util.Scanner;

public class Ejer_8_LeerYescribirCaracteresHastaQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//8. Leer y escribir caracteres hasta pulsar *.
		
		Scanner sc = new Scanner(System.in);
		
		String caracteres;
		System.out.println("Escriba lo que quiera y se mostrará, hasta que pulse (*)");
		caracteres = sc.nextLine();
		
		leerEscribir(caracteres);
	}
	public static void leerEscribir(String caracteres) {
		
		Scanner sc = new Scanner(System.in);
		
		if((caracteres.contains(caracteres)=="*")) { //aqui falta añadir un metodo propio de los String
			System.out.println("Fin del programa");
		
		}else {
			System.out.println("Escriba lo que quiera y se mostrará, hasta que pulse (*)");
			caracteres = sc.nextLine();
			leerEscribir(caracteres);
		}
	}

}
