package Bucles;

import java.util.Scanner;

public class Ejer_2_LeerNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num;
		String respuesta;
		
		do {
			System.out.println("Introduzca un número ");
			num = sc.nextInt();
			System.out.println("¿Desea continuar? s/n");
			respuesta = sc.next();
			
			//}while(respuesta!="n"); CON STRING EL != y el == NO FUNCIONA
			}while(respuesta.equals("s")); //BORRAR EL Arg0 y poner lo que necesito
	}

}
