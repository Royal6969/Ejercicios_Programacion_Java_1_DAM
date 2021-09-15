package Proyecto_Fichero_Binario;

import java.util.Comparator;

public class NomApe_Comparator implements Comparator<Alumno> {
	@Override
		public int compare(Alumno o1, Alumno o2) {
			int resultado = (o1.getApe().compareTo(o2.getApe()));
			if (resultado != 0) {
				return resultado;
			}
			return (o1.getNombre().compareTo(o2.getNombre()));
		}
}
