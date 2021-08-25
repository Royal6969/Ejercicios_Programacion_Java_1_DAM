package Ejer_18_Proyecto_Medicamento;

import java.util.Scanner;

/*
 * E. PruebaMedicamento: menú de opciones:
 * 
 * a. INSERTAR MEDICAMENTO (con su código, nombre, precio y si tiene o no receta)
 * b. LISTAR MEDICAMENTOS (ordenados por nombre y en caso de igualdad por su precio)
 * c. INCREMENTAR PRECIO %
 * d. DECIR SI DOS MEDICAMENTOS SON IGUALES
 * e. SALIR
 */

public class Prueba_Medicamento {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws ExcepcionPrecioMenorCero {
		// TODO Auto-generated method stub

		Lista_Medicamentos farmacia = new Lista_Medicamentos(); //el vacío
		
		int opcion;
		
		do {
			System.out.println("Elija una opción del menú");
			System.out.println("1. INSERTAR MEDICAMENTO");
			System.out.println("2. LISTAR MEDICAMENTOS");
			System.out.println("3. INCREMENTAR PRECIO %");
			System.out.println("4. DECIR SI DOS MEDICAMENTOS SON IGUALES");
			System.out.println("0. SALIR");
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				farmacia.insertarMedicamento();
				break;
				
			case 2:
				farmacia.listarMedicamentos();
				break;
				
			case 3:
				farmacia.incrementarPrecio();
				break;
				
			case 4:
				farmacia.sonIguales();
				break;
				
			case 0:
				System.out.println("Hasta luego");
				break;
			}
			
		}while(opcion!=0);
	}

}
