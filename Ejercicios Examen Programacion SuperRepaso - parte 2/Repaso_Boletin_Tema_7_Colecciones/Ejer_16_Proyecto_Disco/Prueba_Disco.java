package Ejer_16_Proyecto_Disco;
import java.util.Scanner;
/*
 * 16. ENUNCIADO PROYECTO DISCO
 * Menú de opciones:
 * 1. Insertar nuevo disco, según su codigo, que es único
 * 2. Listado ordenado según autor
 * 3. Listado agrupado por género, mostrando el número de discos de cada género
 * 4. Listado por duración
 * 5. Eliminar un disco según su código
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
	//MÉTODOS
	public static void showMenu() {
		System.out.println("Introduzca una opción del menú");
		System.out.println("1. Insertar nuevo disco, según su codigo, que es único\n"
				+ " 2. Listado ordenado según autor\n"
				+ " 3. Listado agrupado por género, mostrando el número de discos de cada género\n"
				+ " 4. Listado por duración\n"
				+ " 5. Eliminar un disco según su código\n"
				+ " 0. Salir");
		System.out.println();
	}

}
