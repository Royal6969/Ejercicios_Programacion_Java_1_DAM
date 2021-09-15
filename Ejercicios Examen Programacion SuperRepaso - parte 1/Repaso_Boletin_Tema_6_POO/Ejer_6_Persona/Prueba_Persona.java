package Ejer_6_Persona;

import java.util.Scanner;

public class Prueba_Persona {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conjunto_Socio conjunto_socios = new Conjunto_Socio();
		int opcion;
		
		do {
			showMenu();
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				altaSocio(conjunto_socios);
				break;
				
			case 2:
				modificarFechaNacimiento(conjunto_socios);
				 break;
				 
			case 3:
				conjunto_socios.listadoCompleto();
				break;
				
			case 4:
				conjunto_socios.listadoSegunNombre();
				break;
				
			case 5:
				conjunto_socios.listadoCompletoSegunNacimiento();
				break;
				
			case 0:
				System.out.println("Muchas gracias y hasta luego!");
				break;
			}
		}while(opcion != 0);
		
	}
	//MÉTODOS
	
	public static void showMenu() {
		System.out.println("1. Alta de socio (pedir datos: nif, nombre y fecha de nacimiento\n"
				+ " (crear una clase Fecha propia: dia, mes y año)).\n"
				+ " 2. Modificación de fecha de nacimiento (pedir el número de socio).\n"
				+ " 3. Listado completo.\n"
				+ " 4. Listado completo ordenado según el nombre.\n"
				+ " 5. Listado completo ordenado según la fecha de nacimiento.\n"
				+ " 0. Salir.");
	}
	
	public static void altaSocio(Conjunto_Socio conjunto_socios) {
		int nif;
		String nombre;
		int dia, mes, año;
		System.out.println("Introduzca un NIF");
		nif = sc.nextInt();
		System.out.println("Introduzca un nombre");
		nombre = sc.next();
		System.out.println("Para la fecha de nacimiento primeo introduzca el día");
		dia = sc.nextInt();
		System.out.println("Ahora introduzca el mes");
		mes = sc.nextInt();
		System.out.println("Y por último introduzca el año");
		año = sc.nextInt();
		Fecha nacimiento = new Fecha(dia, mes, año); //dps de Fecha con Ctrl+\s salieron los atributos
		
		conjunto_socios.getConjunto_socios()[Socio.getnSocio()] = new Socio(nif, nombre, nacimiento);
	}
	
	public static void modificarFechaNacimiento(Conjunto_Socio conjunto_socios) {
		int posicion;
		System.out.println("Introduca el nº socio que desea modificar la fecha de nacimiento");
		posicion = sc.nextInt();
		
		if(posicion < Socio.getnSocio()) { //se comprueba que el socio existe 
			int dia, mes, año;
			System.out.println("Introduce el día");
			dia = sc.nextInt();
			System.out.println("Introduce el mes");
			mes = sc.nextInt();
			System.out.println("Introduce el año");
			año = sc.nextInt();
			
			Fecha nacimiento = new Fecha(dia, mes, año);
			
			conjunto_socios.getConjunto_socios()[posicion].setNacimiento(nacimiento);
		}else {
			System.out.println("No existe ningún socio con este número");
		}
	}
}
