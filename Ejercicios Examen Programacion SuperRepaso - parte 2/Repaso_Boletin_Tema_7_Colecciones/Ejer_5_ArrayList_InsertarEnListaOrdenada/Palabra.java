package Ejer_5_ArrayList_InsertarEnListaOrdenada;
/*
 * 1. Realiza un programa que introduzca 20 valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el m�ximo y el m�nimo de esos n�meros. 
Crear una clase Entero con un atributo de tipo int
 */
/*
 * 3. Realiza un programa equivalente al ejercicio 1 pero en esta ocasi�n, 
 * el programa debe manipular palabras en lugar de n�meros. A�adir la opci�n de ordenar.
 */
/*
 * 5. Construye un m�todo insertaEnOrden, que a�ade a una lista ordenada pasada como par�metro, 
 * un nuevo elemento, que tambi�n se pasa como par�metro, de forma que la lista siga estando ordenada.
 */
public class Palabra implements Comparable<Palabra>{

	//ATRIBUTOS
	private String palabra;

	//CONSTRUCTOR vac�o
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
