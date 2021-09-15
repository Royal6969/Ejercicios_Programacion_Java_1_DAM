package Ejer_14_UnirEnLista_ElementosComunes;

import java.util.ArrayList;

public class Lista_Elementos {

	//ATRIBUTOS
	ArrayList<Elemento> lista_elementos = new ArrayList<Elemento>();

	//CONSTRUCTOR Vacio
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
