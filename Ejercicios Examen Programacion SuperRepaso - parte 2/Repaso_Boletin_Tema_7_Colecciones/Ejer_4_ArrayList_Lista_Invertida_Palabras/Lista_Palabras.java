package Ejer_4_ArrayList_Lista_Invertida_Palabras;

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
	public void calculaInversa() { //por mucho que diga el enunciado de "devolver", esto lo voy hacer con void e imprimiendo
		for(int i=this.getLista_palabras().size()-1; i>=0; i--) {
			System.out.print(this.getLista_palabras().get(i).getPalabra()+"\t");
		}
		System.out.println();
	}
	public ArrayList<Palabra> calculaInversa_v2(){
		ArrayList<Palabra> palabras = new ArrayList<Palabra>();
		
		for(int i=this.getLista_palabras().size()-1; i>=0; i--) {
			//System.out.print(this.getLista_palabras().get(i).getPalabra()+"\t");
			//palabras.add(this.getLista_palabras().get(i).getPalabra());
			//si me da este fallo:
			//The method add(Palabra) in the type ArrayList<Palabra> is not applicable for the arguments (String)
			//esque hay que quitar el ultimo get que coge solo un valor, es decir, hay que cpger la posicion entera
			palabras.add(this.getLista_palabras().get(i));
		}
		System.out.println();
		
		return palabras;
	}
	
}
