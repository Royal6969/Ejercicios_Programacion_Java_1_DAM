package Examen_ArrayList;

import java.util.Comparator;

public class A�o_Comparator implements Comparator<Cancion>{

	@Override
	public int compare(Cancion cancion1, Cancion cancion2) {
		return cancion1.getA�o() - cancion2.getA�o();
	}

}
