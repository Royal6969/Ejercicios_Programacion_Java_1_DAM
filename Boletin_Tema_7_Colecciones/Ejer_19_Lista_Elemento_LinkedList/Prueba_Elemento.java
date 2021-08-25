package Ejer_19_Lista_Elemento_LinkedList;

import java.util.Scanner;

/*
 * 19. Implementar una lista de Elemento, que funcione como una pila de palabras. 
 * Menú de operaciones: 
 * 
 * insertar un elemento (apilar), 
 * eliminar una palabra (desapilar), 
 * listar. 
 * 
 * El funcionamiento de una pila consiste en insertar y eliminar el elemento que está en la cima
 */

public class Prueba_Elemento {

static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista_Elementos mrX = new Lista_Elementos();
		
		int opcion;
		
		do {
			System.out.println("Introduzca una opción del menú");
			System.out.println("1. Insertar un Elemento");
			System.out.println("2. Eliminar un Elemento");
			System.out.println("3. Listar todos los elementos");
			System.out.println("0. Salir");
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				mrX.insertarElemento();
				break;
				
			case 2:
				mrX.eliminarElementos();
				break;
				
			case 3:
				mrX.listarElementos();
				break;
				
			case 0:
				System.out.println("Hasta luego");
				break;
			}
			
		}while(opcion!=0);
	}

}
