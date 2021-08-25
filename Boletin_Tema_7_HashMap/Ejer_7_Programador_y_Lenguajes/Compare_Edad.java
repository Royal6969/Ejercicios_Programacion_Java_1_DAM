package Ejer_7_Programador_y_Lenguajes;

import java.util.Comparator;

public class Compare_Edad implements Comparator<Programador>{ //para otro tipo de ordenación diferente

	//Implement method
	@Override
	public int compare(Programador p1, Programador p2) {
		
		return p1.getEdad() - p2.getEdad();
	} 

}
