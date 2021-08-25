package Ejer_20_Lista_Cadenas;

import java.util.Scanner;

/*
 * 20. Implementar una lista de Cadena, que funcione como una cola de palabras. 
 * Menú de operaciones: 
 * 
 * insertar un Cadenas (encolar), 
 * eliminar una palabra (desencolar), 
 * listar. 
 * 
 * El funcionamiento de una cola consiste en insertar por un extremo de la lista 
 * y eliminar por el otro extremo de la lista.
 */

public class Prueba_Cadena {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista_Cadenas mrX = new Lista_Cadenas();
		
		int opcion;
		
		do {
			System.out.println("Introduzca una opción del menú");
			System.out.println("1. Insertar un Cadenas");
			System.out.println("2. Eliminar un Cadenas");
			System.out.println("3. Listar todos los Cadenas");
			System.out.println("0. Salir");
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				mrX.insertarCadena();
				break;
				
			case 2:
				mrX.eliminarCadenas();
				break;
				
			case 3:
				mrX.listarCadenas();
				break;
				
			case 0:
				System.out.println("Hasta luego");
				break;
			}
			
		}while(opcion!=0);
	}

}
