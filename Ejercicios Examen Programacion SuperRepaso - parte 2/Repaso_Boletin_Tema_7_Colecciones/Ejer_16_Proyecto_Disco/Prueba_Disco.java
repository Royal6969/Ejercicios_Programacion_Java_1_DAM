package Ejer_16_Proyecto_Disco;
import java.util.Scanner;
/*
 * 16. ENUNCIADO PROYECTO DISCO
 * Men� de opciones:
 * 1. Insertar nuevo disco, seg�n su codigo, que es �nico
 * 2. Listado ordenado seg�n autor
 * 3. Listado agrupado por g�nero, mostrando el n�mero de discos de cada g�nero
 * 4. Listado por duraci�n
 * 5. Eliminar un disco seg�n su c�digo
 * 6. Salir
 * 
 * Clases:
 * Disco
 * LDisco: insertaDisco, eliminaDisco, listadoAutor, listadoDuracion,listadoGenero.
 * PruebaDisco
 * GeneroComparator
 * DuracionComparator
 */
public class Prueba_Disco {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista_Discos discos = new Lista_Discos();
		
		int opcion;
		do {
			showMenu();
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				discos.insertarDisco();
				break;
			case 2:
				discos.ordenarPorAutores();
				break;
			case 3:
				discos.ordenarPorGenero();
				break;
			case 4:
				discos.ordenarPorDuracion();
				break;
			case 5:
				discos.eliminarDisco();
				break;
			case 0:
				System.out.println("Gracias y hasta luego!");
				break;
			}
			
		}while(opcion != 0);
	}
	//M�TODOS
	public static void showMenu() {
		System.out.println("Introduzca una opci�n del men�");
		System.out.println("1. Insertar nuevo disco, seg�n su codigo, que es �nico\n"
				+ " 2. Listado ordenado seg�n autor\n"
				+ " 3. Listado agrupado por g�nero, mostrando el n�mero de discos de cada g�nero\n"
				+ " 4. Listado por duraci�n\n"
				+ " 5. Eliminar un disco seg�n su c�digo\n"
				+ " 0. Salir");
		System.out.println();
	}

}
