package Ejer_8_Programador_LenguajesDeProgramacion;

import java.util.Comparator;

public class Comparar_Edad_Programador implements Comparator<Programador>{
	//* B. Listar todos los datos ordenados según la edad del programador
	
	@Override
	public int compare(Programador programador1, Programador programador2) {
		// TODO Auto-generated method stub
		return programador1.getEdad() - programador2.getEdad();
	} 
	
}
