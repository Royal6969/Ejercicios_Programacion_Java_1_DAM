package Ejer_7_Persona_OrdenacionNatural_SortedSet;

import java.util.Comparator;

public class Comparar_Edad implements Comparator<Persona>{

	@Override
	public int compare(Persona p1, Persona p2) {
		// TODO Auto-generated method stub
		return p1.getEdad() - p2.getEdad(); //esto lo que cambia es el orden ascendente/descendente
	}

	
}
