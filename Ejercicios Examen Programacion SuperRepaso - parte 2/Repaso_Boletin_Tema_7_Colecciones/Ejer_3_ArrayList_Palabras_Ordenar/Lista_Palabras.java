package Ejer_3_ArrayList_Palabras_Ordenar;

import java.util.ArrayList;
import java.util.Collections;

public class Lista_Palabras {

	//ATRIBUTO
	ArrayList<Palabra> lista_palabras = new ArrayList<Palabra>();

	//CONSTRUCTOR Vacío
	public Lista_Palabras() {
		super();
	}

	//CONSRUCTOR Lleno
	public Lista_Palabras(ArrayList<Palabra> lista_palabras) {
		super();
		this.lista_palabras = lista_palabras;
	}

	//GETTER Y SETTER
	public ArrayList<Palabra> getLista_palabras() {
		return lista_palabras;
	}

	public void setLista_palabras(ArrayList<Palabra> lista_palabras) {
		this.lista_palabras = lista_palabras;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Palabras [lista_palabras=" + lista_palabras + "]";
	}
	
	//MÉTODOS
	public void ordenarPalabras() {
		Collections.sort(this.getLista_palabras());
	}
	
}
