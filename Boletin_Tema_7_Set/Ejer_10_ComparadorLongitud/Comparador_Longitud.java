package Ejer_10_ComparadorLongitud;

import java.util.Comparator;

/*
 * 10. Implemente una clase llamada comparadorLongitud 
 * donde se defina como criterio de comparaci�n entre dos cadenas su longitud. 
 * En el caso de que dos cadenas tengan la misma longitud 
 * el orden ser� el orden natural de los objetos de la clase String. 
 * 
 * En el m�todo main del ejercicio anterior, 
 * cree un nuevo conjunto ordenado seg�n este comparador llamado nuevodiccionario 
 * donde se a�aden todas las palabras del diccionario anterior 
 * y algunas nuevas pedidas mediante teclado, utilizando a�adirPalabras. 
 * 
 * Imprimir en la pantalla el nuevo diccionario para ver como queda ordenado seg�n el nuevo orden. 
 * Imprima adem�s el comparador usado.
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
