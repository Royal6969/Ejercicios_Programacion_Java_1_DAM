package Ejer_10_ComparadorLongitud;

import java.util.Comparator;

/*
 * 10. Implemente una clase llamada comparadorLongitud 
 * donde se defina como criterio de comparación entre dos cadenas su longitud. 
 * En el caso de que dos cadenas tengan la misma longitud 
 * el orden será el orden natural de los objetos de la clase String. 
 * 
 * En el método main del ejercicio anterior, 
 * cree un nuevo conjunto ordenado según este comparador llamado nuevodiccionario 
 * donde se añaden todas las palabras del diccionario anterior 
 * y algunas nuevas pedidas mediante teclado, utilizando añadirPalabras. 
 * 
 * Imprimir en la pantalla el nuevo diccionario para ver como queda ordenado según el nuevo orden. 
 * Imprima además el comparador usado.
 */

public class Comparador_Longitud implements Comparator<String>{

	public int compare(String a, String b) {
		
		if(a.length() == b.length()) {
			return a.compareTo(b);
		}else {
			return a.length() - b.length();
		}
	}
}
