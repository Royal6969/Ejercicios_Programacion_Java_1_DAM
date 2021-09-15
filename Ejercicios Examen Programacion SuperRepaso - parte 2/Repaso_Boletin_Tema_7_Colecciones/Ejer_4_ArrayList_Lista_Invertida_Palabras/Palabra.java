package Ejer_4_ArrayList_Lista_Invertida_Palabras;
/*
 * 1. Realiza un programa que introduzca 20 valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos números. 
Crear una clase Entero con un atributo de tipo int
 */
/*
 * 3. Realiza un programa equivalente al ejercicio 1 pero en esta ocasión, 
 * el programa debe manipular palabras en lugar de números. Añadir la opción de ordenar.
 */
/*
 * 4. Construye un método calculaInversa que devuelva invertida una lista pasada como parámetro. 
 * Añade esta opción al ejercicio 3.
 */
public class Palabra implements Comparable<Palabra>{

	//ATRIBUTOS
	private String palabra;

	//CONSTRUCTOR vacío
	public Palabra() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Palabra(String palabra) {
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
		return "Palabra [palabra=" + palabra + "]";
	}

	@Override
	public int compareTo(Palabra palabra) {
		// TODO Auto-generated method stub
		return this.palabra.compareTo(palabra.getPalabra());
	}
	
	
}
