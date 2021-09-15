package Examen_ArrayList;

import java.util.Comparator;

public class Año_Comparator implements Comparator<Cancion>{

	@Override
	public int compare(Cancion cancion1, Cancion cancion2) {
		return cancion1.getAño() - cancion2.getAño();
	}

}
