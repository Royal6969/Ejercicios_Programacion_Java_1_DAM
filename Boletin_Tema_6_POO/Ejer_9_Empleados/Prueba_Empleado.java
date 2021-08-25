package Ejer_9_Empleados;

import java.util.Scanner;

public class Prueba_Empleado {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion;
		
		Conjunto_Empleado conjuntoEmpleados = new Conjunto_Empleado(); //llamar al conjunto de empelados que creé antes
		
		do {
			mostrarMenu();
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				darAltaProgramador(conjuntoEmpleados);
				break;
			
			case 2:
				darAltaContable(conjuntoEmpleados);
				break;
					
			case 3:
				aumentarSalario(conjuntoEmpleados);
				break;
				
			case 4:
				conjuntoEmpleados.listadoCompleto();
				break;
				
			case 5:
				conjuntoEmpleados.listadoEdades();
				break;
				
			case 6:
				conjuntoEmpleados.listadoLenguajes();
				break;
				
			case 7:
				conjuntoEmpleados.listadoAsientosDescendente();
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
	
	public static void darAltaProgramador(Conjunto_Empleado conjuntoEmpleados) { //en el main, por lo general, serán estáticos los métodos
		
		String nombre;
		String cedula;
		int edad;
		boolean casado;
		String casadoS;
		double salario;
		int linCodHora;
		String lenguaje;
		
		System.out.println("Introduzca el nombre");
		nombre = sc.next(); //juanCa tiene que preguntar por el truco
		System.out.println("Intruduzca la cédula");
		cedula = sc.next();
		System.out.println("Introduzca la edad");
		edad = sc.nextInt();
		System.out.println("Introduzca si está o no casado (si/no)");
		casadoS = sc.next();
		if(casadoS.equalsIgnoreCase("si")) {
			casado = true;
		}else {
			casado = false;
		}
		System.out.println("Introduzca el salario");
		salario = sc.nextDouble();
		System.out.println("Introduzca el nº de líneas por horas");
		linCodHora = sc.nextInt();
		System.out.println("Introduzca su lenguaje de programación");
		lenguaje = sc.next();
		
		//crear un programador en la posicion Empleado.getnCedula (ncedula por el que va) del Array Conjunto_Empleado
		conjuntoEmpleados.getConjuntoEmpleados()[Empleado.getnCedula()] = new Programador(nombre, cedula, edad, casado, salario, linCodHora, lenguaje);
	}
	
	public static void darAltaContable(Conjunto_Empleado conjuntoEmpleados) {
		
		String nombre;
		String cedula;
		int edad;
		boolean casado;
		String casadoS;
		double salario;
		int asientoHora;
		
		System.out.println("Introduzca el nombre");
		nombre = sc.next(); //juanCa tiene que preguntar por el truco
		System.out.println("Intruduzca la cédula");
		cedula = sc.next();
		System.out.println("Introduzca la edad");
		edad = sc.nextInt();
		System.out.println("Introduzca si está o no casado (si/no)");
		casadoS = sc.next();
		if(casadoS.equalsIgnoreCase("si")) {
			casado = true;
		}else {
			casado = false;
		}
		System.out.println("Introduzca el salario");
		salario = sc.nextDouble();
		System.out.println("Introduca los asientos por hora");
		asientoHora = sc.nextInt();
		
		conjuntoEmpleados.getConjuntoEmpleados()[Empleado.getnCedula()] = new Contable(nombre, cedula, edad, casado, salario, asientoHora);
	}
	
	public static void aumentarSalario(Conjunto_Empleado conjuntoEmpleados) {
		
		int posicion;
		double aumento;
		
		System.out.println("¿A que empleado le va a aumentar el salario?");
		posicion = sc.nextInt();
		
		System.out.println("Intruduzca el porcentaje de aumento");
		aumento = sc.nextDouble();
		
		if(posicion<Empleado.getnCedula() && posicion>=0) {
		
			conjuntoEmpleados.getConjuntoEmpleados()[posicion].aumentarSalario(aumento); //OJITO
			
		}else {
			System.out.println("Esto no está en el Array");
		}
	}
	
	public static void mostrarMenu() {
		
			System.out.println("Elija una opción del menú");
		
			System.out.println("1. Dar alta nuevo programador");
			System.out.println("2. Dar alta nuevo contable");
			System.out.println("3. Aumentar salario de un empleado");
			System.out.println("4. Listado completo de empleados");
			System.out.println("5. Listado empleados por edades");
			System.out.println("6. Listado programadores por lenguaje dominante");
			System.out.println("7. Listado contables por asientos por hora (orden descendente");
			System.out.println("0. Salir");
	}
	
}
