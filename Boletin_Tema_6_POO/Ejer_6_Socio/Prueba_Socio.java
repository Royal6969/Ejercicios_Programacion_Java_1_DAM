package Ejer_6_Socio;

import java.util.Scanner;

import Ejer_9_Empleados.Empleado;
import Ejer_9_Empleados.Programador;

public class Prueba_Socio {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		Conjunto_Socios conjuntoSocios = new Conjunto_Socios();
		
		do {
			mostrarMenu();
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				if(Socio.getnSocios()<10) {
				altaSocio(conjuntoSocios);
				
				}else {
					System.out.println("No se pueden crear más socios. Cupo completo");
				}
				break;
				
			case 2:
				modificarCumpleaños(conjuntoSocios);
				break;
				
			case 3:
				conjuntoSocios.listadoCompleto();
				break;
				
			case 4:
				conjuntoSocios.listadoNombre();
				break;
				
			case 5:
				conjuntoSocios.listadoEdades();
				break;
				
			case 0:
				System.out.println("Fin del programa. Sayonara!");
				break;
				
			default:
				System.out.println("Esta opción no existe en el menú");
				break;
			}
			
			
		}while(opcion!=0);
	}
	
	public static void mostrarMenu() {
		
		System.out.println("Elija una opción del menú");
	
		System.out.println("1. Dar alta nuevo socio");
		System.out.println("2. Modificar fecha nacimiento");
		System.out.println("3. Listado completo de socios");
		System.out.println("4. Listado socios por nombre");
		System.out.println("5. Listado socios por fecha nacimiento");
		System.out.println("0. Salir");
	}
	
	public static void altaSocio(Conjunto_Socios conjuntoSocios) {
		
		int nif; 
		String nombre; 
		Fecha cumpleaños;
		int dia, mes, año;
		
		System.out.println("Introduzca un NIF");
		nif = sc.nextInt();
		System.out.println("Introduzca su nombre");
		nombre = sc.next();
		System.out.println("Introduzca el día de nacimimiento");
		dia = sc.nextInt();
		System.out.println("Introduzca el mes de nacimimiento");
		mes = sc.nextInt();
		System.out.println("Introduzca el año de nacimimiento");
		año = sc.nextInt();
		cumpleaños = new Fecha(dia, mes, año);
		
		conjuntoSocios.getConjuntoSocios()[Socio.getnSocios()] = new Socio(nif, nombre, cumpleaños);
	}
	
	public static void modificarCumpleaños(Conjunto_Socios conjuntoSocios) {
		
		System.out.println("Introduzca el nº del socio al que quiere modificar");
		int posicion = sc.nextInt();
		
		if(posicion<Socio.getnSocios()) {
			int dia, mes, año;
			System.out.println("Introduzca el día de nacimimiento");
			dia = sc.nextInt();
			System.out.println("Introduzca el mes de nacimimiento");
			mes = sc.nextInt();
			System.out.println("Introduzca el año de nacimimiento");
			año = sc.nextInt();
			Fecha cumpleaños = new Fecha(dia, mes, año);
			
			conjuntoSocios.getConjuntoSocios()[posicion].setCumpleaños(cumpleaños);
		
		}else {
			System.out.println("Este socio no existe");
		}
	}
	
	

}
