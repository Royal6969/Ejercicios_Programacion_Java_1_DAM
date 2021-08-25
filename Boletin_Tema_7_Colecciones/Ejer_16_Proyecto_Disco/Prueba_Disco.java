package Ejer_16_Proyecto_Disco;

import java.util.Scanner;

/*
 * 6. ENUNCIADO PROYECTO DISCO
Men� de opciones:
1. Insertar nuevo disco, seg�n su codigo, que es �nico
2. Listado ordenado seg�n autor
3. Listado agrupado por g�nero, mostrando el n�mero de discos de cada g�nero
4. Listado por duraci�n
5. Eliminar un disco seg�n su c�digo
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
		
		System.out.println("Introduzca una opci�n del men�");
		System.out.println("1. Insertar nuevo disco, seg�n su codigo, que es �nico\r\n"
				+ "2. Listado ordenado seg�n autor\r\n"
				+ "3. Listado agrupado por g�nero, mostrando el n�mero de discos de cada g�nero\r\n"
				+ "4. Listado por duraci�n\r\n"
				+ "5. Eliminar un disco seg�n su c�digo\r\n"
				+ "0. Salir ");
	}

}
