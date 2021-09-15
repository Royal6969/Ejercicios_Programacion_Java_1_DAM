package Ejer_13_DividirEnListasDePositivosYnegativos;
/*
 * 12. Eliminar elementos repetidos de una lista de nodos de tipo Entero.
 */

import java.util.ArrayList;

public class Lista_Elementos {

	//ATRIBUTO
	ArrayList<Elemento> lista_elementos = new ArrayList<Elemento>();

	//CONSTRUCTOR Vacío
	public Lista_Elementos() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Lista_Elementos(ArrayList<Elemento> lista_elementos) {
		super();
		this.lista_elementos = lista_elementos;
	}

	//GETTER Y SETTER
	public ArrayList<Elemento> getLista_elementos() {
		return lista_elementos;
	}

	public void setLista_elementos(ArrayList<Elemento> lista_elementos) {
		this.lista_elementos = lista_elementos;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Elementos [lista_elementos=" + lista_elementos + "]";
	}
	
	
}
