package Ejer_7_Persona_OrdenacionNatural_SortedSet;
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

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Lista_Personas { //ya no es comparable, sino comparator??

	//ATRIBUTOS
	SortedSet<Persona> lista_personas = new TreeSet<Persona>();

	public Lista_Personas() {
		super();
	}

	public Lista_Personas(SortedSet<Persona> lista_personas) {
		super();
		this.lista_personas = lista_personas;
	}

	public SortedSet<Persona> getLista_personas() {
		return lista_personas;
	}

	public void setLista_personas(SortedSet<Persona> lista_personas) {
		this.lista_personas = lista_personas;
	}

	@Override
	public String toString() {
		return "Lista_Personas [lista_personas=" + lista_personas + "]";
	}
	
	
	
}
