package Ejer_7_ArrayList_MatrizDinamica;

import java.util.ArrayList;

public class Lista_Numeros {

	ArrayList<Numero> lista_numeros = new ArrayList<Numero>();

	public Lista_Numeros() {
		super();
	}

	public Lista_Numeros(ArrayList<Numero> lista_numeros) {
		super();
		this.lista_numeros = lista_numeros;
	}

	public ArrayList<Numero> getLista_numeros() {
		return lista_numeros;
	}

	public void setLista_numeros(ArrayList<Numero> lista_numeros) {
		this.lista_numeros = lista_numeros;
	}

	@Override
	public String toString() {
		return "Lista_Numeros [lista_numeros=" + lista_numeros + "]";
	}
	
	
}
