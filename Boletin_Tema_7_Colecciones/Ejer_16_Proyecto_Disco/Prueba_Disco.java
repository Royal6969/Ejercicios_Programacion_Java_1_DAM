package Ejer_16_Proyecto_Disco;

import java.util.Scanner;

/*
 * 6. ENUNCIADO PROYECTO DISCO
Menú de opciones:
1. Insertar nuevo disco, según su codigo, que es único
2. Listado ordenado según autor
3. Listado agrupado por género, mostrando el número de discos de cada género
4. Listado por duración
5. Eliminar un disco según su código
6. Salir
Clases:
- Disco
- LDisco: insertaDisco, eliminaDisco, listadoAutor, listadoDuracion,listadoGenero.
- PruebaDisco
- GeneroComparator
- DuracionComparator
 */

public class Prueba_Disco {

static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista_Discos spotify = new Lista_Discos();
		
		int opcion;
		
		do {
			showMenu();
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				spotify.insertarDisco();
				System.out.println();
				break;
				
			case 2:
				spotify.ordenarSegunAutores();
				System.out.println();
				break;
				
			case 3:
				spotify.ordenarSegunGenero();
				System.out.println();
				break;
				
			case 4:
				spotify.listadoPorDuracion();
				System.out.println();
				break;
				
			case 5:
				spotify.eliminarDisco();
				System.out.println();
				break;
				
			case 0:
				System.out.println("Adioss, gracias por probar");
				break;
			}
			
		}while(opcion != 0);
	}
	public static void showMenu() {
		
		System.out.println("Introduzca una opción del menú");
		System.out.println("1. Insertar nuevo disco, según su codigo, que es único\r\n"
				+ "2. Listado ordenado según autor\r\n"
				+ "3. Listado agrupado por género, mostrando el número de discos de cada género\r\n"
				+ "4. Listado por duración\r\n"
				+ "5. Eliminar un disco según su código\r\n"
				+ "0. Salir ");
	}

}
