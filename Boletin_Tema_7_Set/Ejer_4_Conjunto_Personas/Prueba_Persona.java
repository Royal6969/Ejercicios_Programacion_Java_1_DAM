package Ejer_4_Conjunto_Personas;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/* 4. Sean s1 y s2, los conjuntos que respectivamente representan a los alumnos
matriculados en una asignatura en el presente curso académico y en el anterior.

Set permite simular operaciones sobre conjuntos: 
unión mediante el método addAll(Collection), 
intersección (sólo elementos comunes a los dos conjuntos) mediante el método retainAll(Collection) 
y la diferencia mediante el método removeAll(Collection).

Se desea realizar:
a. un método que a partir de ambos conjuntos, muestre un listado con los
alumnos repetidores.
b. un método que a partir de ambos conjuntos, muestre un listado con cada
alumno matriculado en uno u otro curso.
c. un método que a partir de ambos conjuntos, muestre un listado con los
alumnos NO repetidores en el presente curso
*/
public class Prueba_Persona {

static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Persona> s1 = new HashSet<Persona>();
		Set<Persona> s2 = new HashSet<Persona>();

		Persona alumno1 = new Persona("Sergio");
		Persona alumno2 = new Persona("Carlos");
		Persona alumno3 = new Persona("Fernando");
		Persona alumno4 = new Persona("JuanCarlos");
		Persona alumno5 = new Persona("Chema");
		Persona alumno6 = new Persona("Alfonso");
		Persona alumno7 = new Persona("Adan");
		Persona alumno8 = new Persona("Angel");

		s1.add(alumno1);
		s1.add(alumno2);
		s1.add(alumno3);
		s1.add(alumno4);
		s1.add(alumno5);
		s1.add(alumno6);
		
		s2.add(alumno4);
		s2.add(alumno5);
		s2.add(alumno6);
		s2.add(alumno7);
		s2.add(alumno8);
		
		int opcion;
		
		System.out.println(s1);
		System.out.println(s2);
		
		do {
			System.out.println("Introduzca una opción del menú");
			System.out.println("1. Mostrar un listado con cada alumno matriculado en uno u otro curso.");
			System.out.println("2. Mostrar un listado con los alumnos repetidores");
			System.out.println("3. Mostrar un listado con los alumnos NO repetidores en el presente curso");
			System.out.println("0. Salir");
			System.out.println();
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				mostrarAlumnos(s1, s2);
				break;
				
			case 2:
				mostrarRepetidores(s1, s2);
				break;
				
			case 3:
				mostrarAprobados(s1, s2);
				break;
				
			case 0:
				System.out.println("hasta luego");
				break;
			}
			
			
		}while(opcion!=0);
	}
	//MÉTODOS
	public static void mostrarAlumnos(Set<Persona> s1, Set<Persona> s2) {
		
		Set<Persona> sAUX = new HashSet<Persona>();
		
		sAUX.addAll(s1);
		sAUX.addAll(s2);
		
		System.out.println("Los alumnos son: ");
		System.out.println(sAUX);
		System.out.println();
	}
	public static void mostrarRepetidores(Set<Persona> s1, Set<Persona> s2) {
		
		Set<Persona> sAUX = new HashSet<Persona>();
		
		sAUX.addAll(s1);
		sAUX.retainAll(s2);
		
		System.out.println("Los alumnos repetidores son: ");
		System.out.println(sAUX);
		System.out.println();
	}
	public static void mostrarAprobados(Set<Persona> s1, Set<Persona> s2) {
		
		Set<Persona> sAUX = new HashSet<Persona>();
		
		sAUX.addAll(s1);
		sAUX.removeAll(s2);
		
		System.out.println("Los alumnos aprobados son: ");
		System.out.println(sAUX);
		System.out.println();
	}
	

}
