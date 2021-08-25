package Ejer_7_Personas_Ordenar_SortedSet;

import java.util.Comparator;

public class Comparar_Edades implements Comparator<Persona>{

	@Override
	public int compare(Persona Personaje1, Persona Personaje2) {
		// TODO Auto-generated method stub
		
		return Personaje1.getEdad() - Personaje2.getEdad();
	}

}
