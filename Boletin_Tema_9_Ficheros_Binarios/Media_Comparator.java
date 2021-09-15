package Proyecto_Fichero_Binario;

import java.util.Comparator;

public class Media_Comparator implements Comparator<Alumno_Media>{

	@Override
	public int compare(Alumno_Media o1, Alumno_Media o2) {
		return o1.getMedia()-o2.getMedia();
	}
}
