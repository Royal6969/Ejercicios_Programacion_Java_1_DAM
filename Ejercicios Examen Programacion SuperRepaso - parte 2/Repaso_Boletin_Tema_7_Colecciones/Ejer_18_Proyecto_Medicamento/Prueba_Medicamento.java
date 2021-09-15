package Ejer_18_Proyecto_Medicamento;

import java.util.Scanner;

/*
 * E. PruebaMedicamento: menú de opciones:
 * a. INSERTAR MEDICAMENTO (con su código, nombre, precio y si tiene o no receta) //esto lo hacemos en la clase medicamento lo de pedir los datos 
 * b. LISTAR MEDICAMENTOS (ordenados por nombre y en caso de igualdad por su precio) //aquí me está pidiendo una ordenación natural (CompareTo)
 * c. INCREMENTAR PRECIO %
 * d. DECIR SI DOS MEDICAMENTOS SON IGUALES
 * e. SALIR
 */
public class Prueba_Medicamento {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ExcepcionPrecioMenorCero {
		// TODO Auto-generated method stub

		Lista_Medicamentos medicamentos = new Lista_Medicamentos();

		int opcion;
		do {
			showMenu();
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				medicamentos.insertarMedicamento(); 
				//al poner este método me ha saltado un error, en el que al darle a la solucion (surround try/catch) me ha metido el throws ExcepcionPrecioMenos0 en la declaración del main
				System.out.println();
				break;
			case 2:
				medicamentos.listarMedicamentos();
				System.out.println();
				break;
			case 3:
				medicamentos.incrementarPrecio_v2();
				System.out.println();
				break;
			case 4: 
				medicamentos.sonIguales();
				System.out.println();
				break;
			case 0:
				System.out.println("Gracias y hasta luego!");
				break;
			}
		}while(opcion != 0);
	}
	public static void showMenu() {
		System.out.println("Introduzca una opción del menú");
		System.out.println(" 1. INSERTAR MEDICAMENTO (con su código, nombre, precio y si tiene o no receta)\n"
				+ " 2. LISTAR MEDICAMENTOS (ordenados por nombre y en caso de igualdad por su precio)\n"
				+ " 3. INCREMENTAR PRECIO %\n"
				+ " 4. DECIR SI DOS MEDICAMENTOS SON IGUALES\n"
				+ " 0. SALIR");
	}

}
