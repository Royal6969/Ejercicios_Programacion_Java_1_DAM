package Ejer_10_Ampliacion_Ejer_9;

import java.util.Comparator;

public class Comparador_Longitud_Palabras implements Comparator<String>{ //OJO, que aquí no le pongo Comparator<Ejercicio10> sino Comparator<String>

	//@Override
	//public int compare(Ejercicio10 args0, Ejercicio10 args1) { //predeterminadamente me genera esto pero hay que decirle qu elo que le entra es un String, no la clase Ejercicio10, y así poder poner en el if(palabras.length)
		// TODO Auto-generated method stub
		//return 0;
	//}

	public int compare(String palabra1, String palabra2) {
		// TODO Auto-generated method stub
		if(palabra1.length() == palabra2.length()) {
			return palabra1.compareToIgnoreCase(palabra2);
		}else {
			return palabra1.length() - palabra2.length();
		}
	}
}
