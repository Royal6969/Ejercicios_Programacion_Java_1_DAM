package Examen_ArrayList;

import java.util.Scanner;

public class Prueba_Cancion {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Excepcion_Nombre {
		// TODO Auto-generated method stub

		Lista_Canciones canciones = new Lista_Canciones();
		
		int opcion;
		
		do {
			showMenu();
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				canciones.insertarCancion();
				System.out.println();
				break;
			case 2:
				canciones.listadoSegunInterprete();
				System.out.println();
				break;
			case 3:
				canciones.listadoSegunGenero();
				System.out.println();
				break;
			case 4:
				canciones.listadoPorA�os();
				System.out.println();
				break;
			case 5:
				canciones.sonIguales();
				System.out.println();
				break;
			case 0:
				System.out.println("Gracias y hasta luego!");
				break;
			}
			
			
		}while(opcion != 0);
	}
	
	//M�TODOS
	public static void showMenu() {
		System.out.println("Introduca una opci�n del men�");
		System.out.println("1. Insertar una nueva canci�n. Si el nombre de la canci�n est� en blanco, saltar� una excepci�n");
		System.out.println("2. Listado canciones ordenado seg�n int�rprete");
		System.out.println("3. Listado ordenado por g�nero mostrando cada n�mero total de canciones por g�nero, y al final, su total global");
		System.out.println("4. Mostrar los datos de la canci�n m�s antigua y de la m�s reciente");
		System.out.println("5. Pedir los nombres de dos canciones y decir si son iguales (dos canciones se consideran iguales si tienen el mismo nombre e int�rprete");
		System.out.println("0. Salir");
	}

}
