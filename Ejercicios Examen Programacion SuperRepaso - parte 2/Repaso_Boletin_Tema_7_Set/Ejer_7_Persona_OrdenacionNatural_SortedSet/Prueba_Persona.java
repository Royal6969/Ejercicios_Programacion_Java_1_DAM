package Ejer_7_Persona_OrdenacionNatural_SortedSet;
import java.util.Iterator;
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

		Lista_Personas personas = new Lista_Personas();
		
		Persona p1 = new Persona("Sergio", "Diaz", 26);
		Persona p2 = new Persona("Fernando", "Campos", 19);
		Persona p3 = new Persona("Carlos", "Acebedo", 18);
		Persona p4 = new Persona("Carlos", "Acebedo", 19);
		Persona p5 = new Persona("Chema", "Guerrero", 20);
		
		personas.getLista_personas().add(p1);
		personas.getLista_personas().add(p2);
		personas.getLista_personas().add(p3);
		personas.getLista_personas().add(p4);
		personas.getLista_personas().add(p5);
		
		//a. TreeSet()
		SortedSet<Persona> lista1 = new TreeSet<Persona>(); 
		//b. TreeSet(Collection c)
		SortedSet<Persona> lista2 = new TreeSet<Persona>(personas.getLista_personas()); 
		//c. Treset(Comparator c)
		SortedSet<Persona> lista3 = new TreeSet<Persona>(new Comparar_Edad()); 
		lista3.add(p1);
		lista3.add(p2);
		lista3.add(p3);
		lista3.add(p4);
		lista3.add(p5);
		//d. TreeSet(SortetSet s)
		SortedSet<Persona> lista4 = new TreeSet<Persona>(lista2);
		
		System.out.println("Listado de lista 1");
		imprimir(lista1);
		System.out.println("Listado de lista 2");
		imprimir(lista2);
		System.out.println("Listado de lista 3");
		imprimir(lista3);
		System.out.println("Listado de lista 4");
		imprimir(lista4);
		
	}
	public static void imprimir(SortedSet<Persona> lista) {
		Iterator<Persona> iterator = lista.iterator();
		while(iterator.hasNext()) {
			Persona p = new Persona();
			p = iterator.next();
			System.out.println(p.toString());
		}
	}

}
