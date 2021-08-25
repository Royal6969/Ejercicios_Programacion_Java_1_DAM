package Ejer_19_Lista_Elemento;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * 19. Implementar una lista de Elemento, que funcione como una pila de palabras. 
 * Menú de operaciones: 
 * 
 * insertar un elemento (apilar), 
 * eliminar una palabra (desapilar), 
 * listar. 
 * 
 * El funcionamiento de una pila consiste en insertar y eliminar el elemento que está en la cima
 */

public class Lista_Elementos {

	//ATRIBUTOS
	LinkedList<Elemento> Lista_Elementos = new LinkedList<Elemento>();

	//CONSTRUCTOR Lleno
	public Lista_Elementos(LinkedList<Elemento> lista_Elementos) {
		super();
		Lista_Elementos = lista_Elementos;
	}

	//CONSTRUCTOR Vacío
	public Lista_Elementos() {
		super();
	}

	//GETTER Y SETTER
	public LinkedList<Elemento> getLista_Elementos() {
		return Lista_Elementos;
	}

	public void setLista_Elementos(LinkedList<Elemento> lista_Elementos) {
		Lista_Elementos = lista_Elementos;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Elementos [Lista_Elementos=" + Lista_Elementos + "]";
	}
	
	//MÉTODOS
	public void insertarElemento() {
		
		Elemento x = new Elemento();
		
		x = x.darAltaElemento();
		
		Lista_Elementos.addFirst(x);
	}
	
	public void eliminarElementos() {
		
		Lista_Elementos.removeLast();
	}
	
	public void listarElementos() {
		
		for(int i=0; i<Lista_Elementos.size(); i++) { 
			System.out.println(Lista_Elementos.get(i).toString());
		}
	}
}
