package Ejer_3_Palabras_Ejer2;

import java.util.ArrayList;
import java.util.Collections;

/* 3. Realiza un programa equivalente al ejercicio 1 pero en esta ocasi�n, 
 * el programa debe manipular palabras en lugar de n�meros. 
 * A�adir la opci�n de ordenar
 */

/* Ejer 1:
 * Realiza un programa que introduzca 20 valores aleatorios (entre 0 y 100) en un ArrayList 
 * y que luego calcule la suma, la media, el m�ximo y el m�nimo de esos n�meros.
 */

public class Lista_Palabras {

	//ATRIBUTO
	//ArrayList<Elemento> listaElemento=new ArrayList<Elemento> ();
	ArrayList<Palabras> objeto = new ArrayList<Palabras>();

	//CONSTRUCTOR lleno
	public Lista_Palabras(ArrayList<Palabras> objeto) {
		super();
		this.objeto = objeto;
	}

	//CONSTRUCTOR vac�o
	public Lista_Palabras() {
		super();
	}

	//GETTER Y SETTER
	public ArrayList<Palabras> getObjeto() {
		return objeto;
	}

	public void setObjeto(ArrayList<Palabras> objeto) {
		this.objeto = objeto;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Palabras [objeto=" + objeto + "]";
	}
	
	//M�TODOS
	public void ordenarPalabras() {
		Collections.sort(this.getObjeto());
	}
}
