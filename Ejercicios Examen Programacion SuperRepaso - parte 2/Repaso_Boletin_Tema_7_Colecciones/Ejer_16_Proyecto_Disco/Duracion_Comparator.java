package Ejer_16_Proyecto_Disco;

import java.util.Comparator;

public class Duracion_Comparator implements Comparator<Disco>{

	@Override
	public int compare(Disco disco1, Disco disco2) {
		return disco1.getDuracion() - disco2.getDuracion();
	}

}
