package Ejer_4_Palabras_Ejer2_v2;

/* 
 * 4. Construye un método calculaInversa que devuelva invertida una lista pasada como parámetro. 
 * Añade esta opción al ejercicio 3.
 * 
 * 3. Realiza un programa equivalente al ejercicio 1 pero en esta ocasión, 
 * el programa debe manipular palabras en lugar de números. 
 * Añadir la opción de ordenar
 *
 * Ejer 1:
 * Realiza un programa que introduzca 20 valores aleatorios (entre 0 y 100) en un ArrayList 
 * y que luego calcule la suma, la media, el máximo y el mínimo de esos números. 
 */

public class Palabras_v2 implements Comparable<Palabras_v2>{

	//ATRIBUTOS
	private String palabra;

	//CONSTRUCTOR
	public Palabras_v2(String palabra) {
		super();
		this.palabra = palabra;
	}

	//GETTER Y SETTER
	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	//To String
	@Override
	public String toString() {
		return "Palabras [palabra=" + palabra + "]";
	}
	
	//Metodo
	public int compareTo(Palabras_v2 palabra) {
		return this.palabra.compareTo(palabra.getPalabra()); 
	}
}
