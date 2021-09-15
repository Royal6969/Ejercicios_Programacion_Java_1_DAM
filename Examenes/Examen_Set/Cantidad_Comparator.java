package Examen_Set;

import java.util.Comparator;

public class Cantidad_Comparator implements Comparator<Producto>{

	@Override
	public int compare(Producto producto1, Producto producto2) {
		return producto1.getCantidad() - producto2.getCantidad();
	}

}
