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
				canciones.listadoPorAños();
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
	
	//MÉTODOS
	public static void showMenu() {
		System.out.println("Introduca una opción del menú");
		System.out.println("1. Insertar una nueva canción. Si el nombre de la canción está en blanco, saltará una excepción");
		System.out.println("2. Listado canciones ordenado según intérprete");
		System.out.println("3. Listado ordenado por género mostrando cada número total de canciones por género, y al final, su total global");
		System.out.println("4. Mostrar los datos de la canción más antigua y de la más reciente");
		System.out.println("5. Pedir los nombres de dos canciones y decir si son iguales (dos canciones se consideran iguales si tienen el mismo nombre e intérprete");
		System.out.println("0. Salir");
	}

}
