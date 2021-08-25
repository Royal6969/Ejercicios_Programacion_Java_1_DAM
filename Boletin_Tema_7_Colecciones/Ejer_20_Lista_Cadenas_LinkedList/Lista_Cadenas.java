package Ejer_20_Lista_Cadenas_LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * 20. Implementar una lista de Cadena, que funcione como una cola de palabras. 
 * Men� de operaciones: 
 * 
 * insertar un Cadena (encolar), 
 * eliminar una palabra (desencolar), 
 * listar. 
 * 
 * El funcionamiento de una cola consiste en insertar por un extremo de la lista 
 * y eliminar por el otro extremo de la lista.
 */

public class Lista_Cadenas {

	//ATRIBUTOS
	LinkedList<Cadena> Lista_Cadenas = new LinkedList<Cadena>();

	//CONSTRUCTOR Lleno
	public Lista_Cadenas(LinkedList<Cadena> lista_Cadenas) {
		super();
		Lista_Cadenas = lista_Cadenas;
	}

	//CONSTRUCTOR Vac�o
	public Lista_Cadenas() {
		super();
	}

	//GETTER Y SETTER
	public LinkedList<Cadena> getLista_Cadenas() {
		return Lista_Cadenas;
	}

	public void setLista_Cadenas(LinkedList<Cadena> lista_Cadenas) {
		Lista_Cadenas = lista_Cadenas;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Cadenas [Lista_Cadenas=" + Lista_Cadenas + "]";
	}
	
	//M�TODOS
	public void insertarCadena() {
		
		Cadena x = new Cadena();
		
		x = x.darAltaCadena();
		
		Lista_Cadenas.addLast(x); //en este ejercicio probamos a�adir por la cola 
		//LinkedList tiene la funci�n de addFirst o addLast
	}
	
	public void eliminarCadenas() {
		
		Lista_Cadenas.removeFirst(); //ojo que tmb lo tiene en remove first o last
	}
	
	public void listarCadenas() {
		
		for(int i=0; i<Lista_Cadenas.size(); i++) { //recorrer al rev�s para mostrar smp el primero (�ltimo a�adido) en forma de pila
			System.out.println(Lista_Cadenas.get(i).toString());
		}
	}
}
