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
					System.out.println("No se pueden crear m�s socios. Cupo completo");
				}
				break;
				
			case 2:
				modificarCumplea�os(conjuntoSocios);
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
				System.out.println("Esta opci�n no existe en el men�");
				break;
			}
			
			
		}while(opcion!=0);
	}
	
	public static void mostrarMenu() {
		
		System.out.println("Elija una opci�n del men�");
	
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
		Fecha cumplea�os;
		int dia, mes, a�o;
		
		System.out.println("Introduzca un NIF");
		nif = sc.nextInt();
		System.out.println("Introduzca su nombre");
		nombre = sc.next();
		System.out.println("Introduzca el d�a de nacimimiento");
		dia = sc.nextInt();
		System.out.println("Introduzca el mes de nacimimiento");
		mes = sc.nextInt();
		System.out.println("Introduzca el a�o de nacimimiento");
		a�o = sc.nextInt();
		cumplea�os = new Fecha(dia, mes, a�o);
		
		conjuntoSocios.getConjuntoSocios()[Socio.getnSocios()] = new Socio(nif, nombre, cumplea�os);
	}
	
	public static void modificarCumplea�os(Conjunto_Socios conjuntoSocios) {
		
		System.out.println("Introduzca el n� del socio al que quiere modificar");
		int posicion = sc.nextInt();
		
		if(posicion<Socio.getnSocios()) {
			int dia, mes, a�o;
			System.out.println("Introduzca el d�a de nacimimiento");
			dia = sc.nextInt();
			System.out.println("Introduzca el mes de nacimimiento");
			mes = sc.nextInt();
			System.out.println("Introduzca el a�o de nacimimiento");
			a�o = sc.nextInt();
			Fecha cumplea�os = new Fecha(dia, mes, a�o);
			
			conjuntoSocios.getConjuntoSocios()[posicion].setCumplea�os(cumplea�os);
		
		}else {
			System.out.println("Este socio no existe");
		}
	}
	
	

}
