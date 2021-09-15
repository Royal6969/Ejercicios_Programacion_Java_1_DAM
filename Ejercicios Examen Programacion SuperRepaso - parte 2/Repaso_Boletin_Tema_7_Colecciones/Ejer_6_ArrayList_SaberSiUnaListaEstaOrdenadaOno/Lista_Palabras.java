package Ejer_6_ArrayList_SaberSiUnaListaEstaOrdenadaOno;

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
	public void insertaEnOrden(String p2) { //si el enunciado dice que le pasa una lista ordenada como parametro...
		boolean salir = false;
		
		for (int i=0; i<this.getLista_palabras().size() && salir==false; i++){
			//aquí viene ahor ael filtro para que se introduzca la palabra en lista ya ordenada
			if(p2.compareToIgnoreCase(this.getLista_palabras().get(i).getPalabra()) < 0) {
				this.getLista_palabras().add(i, new Palabra(p2)); //por qué es tan importante poner el index i aqui?
				salir = true;
			}
		}
	}
	public boolean estaOrdenada() {
		boolean ordenada = false;
		
		for(int i=0; i<this.getLista_palabras().size() && ordenada==false; i++){
			//ahora aquí viene el filtro
			if(this.getLista_palabras().get(i).getPalabra().compareToIgnoreCase(this.getLista_palabras().get(i+1).getPalabra()) <=0) {
				ordenada = true;
			}
		}
		
		return ordenada;
	}
	
}
