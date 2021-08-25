package Ejer_5_InsertarEnOrden;

/*
 * 5. Construye un m�todo insertaEnOrden, que a�ade a una lista ordenada pasada como par�metro, 
 * un nuevo elemento, que tambi�n se pasa como par�metro. 
 * De forma que la lista siga estando ordenada.
 *
 * 4. Construye un m�todo calculaInversa que devuelva invertida una lista pasada como par�metro. 
 * A�ade esta opci�n al ejercicio 3.
 * 
 * 3. Realiza un programa equivalente al ejercicio 1 pero en esta ocasi�n, 
 * el programa debe manipular palabras en lugar de n�meros. 
 * A�adir la opci�n de ordenar
 *
 * Ejer 1:
 * Realiza un programa que introduzca 20 valores aleatorios (entre 0 y 100) en un ArrayList 
 * y que luego calcule la suma, la media, el m�ximo y el m�nimo de esos n�meros. 
 */

public class Palabras_v3 implements Comparable<Palabras_v3>{

	//ATRIBUTOS
	private String palabra;

	//CONSTRUCTOR
	public Palabras_v3(String palabra) {
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
	public int compareTo(Palabras_v3 palabra) {
		return this.palabra.compareTo(palabra.getPalabra()); 
	}
	
}
