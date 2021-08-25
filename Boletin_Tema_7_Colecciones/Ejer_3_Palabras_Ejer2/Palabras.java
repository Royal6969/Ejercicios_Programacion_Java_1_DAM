package Ejer_3_Palabras_Ejer2;

/* 3. Realiza un programa equivalente al ejercicio 1 pero en esta ocasión, 
 * el programa debe manipular palabras en lugar de números. 
 * Añadir la opción de ordenar
 */

/* Ejer 1:
 * Realiza un programa que introduzca 20 valores aleatorios (entre 0 y 100) en un ArrayList 
 * y que luego calcule la suma, la media, el máximo y el mínimo de esos números.
 */

public class Palabras implements Comparable<Palabras>{

	//ATRIBUTOS
	private String palabra;

	//CONSTRUCTOR
	public Palabras(String palabra) {
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
	public int compareTo(Palabras palabra) {
		return this.palabra.compareTo(palabra.getPalabra()); //esto está bn??
	}
}
