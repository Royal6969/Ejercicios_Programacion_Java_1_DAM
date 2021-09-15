package Examen_ArrayList;

import java.util.Comparator;

public class Genero_Comparator implements Comparator<Cancion>{

	@Override
	public int compare(Cancion cancion1, Cancion cancion2) {
		return cancion1.getGenero().compareTo(cancion2.getGenero());
	}

}
