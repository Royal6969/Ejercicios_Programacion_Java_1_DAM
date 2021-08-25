package Ejer_7_Personas_Ordenar_SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

/*
 * 7. Clase Persona (nombre, apellidos y edad); ordenación natural por apellido, nombre y edad; 
 * igualdad especificada por los tres campos). 
 * Establecer un segundo criterio de ordenación por edad. 
 * 
 * Se pide probar la creación de un SortedSet utilizando los 4 constructores siguientes: 
 * a. TreeSet()
 * b. TreeSet(Collection c)
 * c. Treset(Comparator c)
 * d. TreeSet(SortetSet s)
 */

public class Prueba_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortedSet<Persona> Lista_Personas = new TreeSet<Persona>();
		
		Persona p1 = new Persona("Sergio", "Diaz", 26);
		Persona p2 = new Persona("Fernando", "Campos", 19);
		Persona p3 = new Persona("Carlos", "Acebedo", 18);
		Persona p4 = new Persona("Carlos", "Acebedo", 19);
		Persona p5 = new Persona("Chema", "Guerrero", 20);
		
		TreeSet<Persona> Conjunto1 = new TreeSet<Persona>();

		Conjunto1.add(p1);
		Conjunto1.add(p2);
		Conjunto1.add(p3);
		Conjunto1.add(p4);
		Conjunto1.add(p5);
		
		TreeSet<Persona> Conjunto2 = new TreeSet<Persona>(Conjunto1);
		TreeSet<Persona> Conjunto3 = new TreeSet<Persona>(new Comparar_Edades());
		TreeSet<Persona> Conjunto4 = new TreeSet<Persona>(Conjunto1);
		
		System.out.println(Conjunto1);
		System.out.println();
		
		System.out.println(Conjunto2);
		System.out.println();
		
		System.out.println(Conjunto3);
		System.out.println();
		
		System.out.println(Conjunto4);
		System.out.println();
	}

}
