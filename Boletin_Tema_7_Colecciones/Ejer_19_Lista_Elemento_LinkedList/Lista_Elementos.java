package Ejer_19_Lista_Elemento_LinkedList;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 19. Implementar una lista de Elemento, que funcione como una pila de palabras. 
 * Men� de operaciones: 
 * 
 * insertar un elemento (apilar), 
 * eliminar una palabra (desapilar), 
 * listar. 
 * 
 * El funcionamiento de una pila consiste en insertar y eliminar el elemento que est� en la cima
 */

public class Lista_Elementos {

	//ATRIBUTOS
	ArrayList<Elemento> Lista_Elementos = new ArrayList<Elemento>();

	//CONSTRUCTOR Lleno
	public Lista_Elementos(ArrayList<Elemento> lista_Elementos) {
		super();
		Lista_Elementos = lista_Elementos;
	}

	//CONSTRUCTOR Vac�o
	public Lista_Elementos() {
		super();
	}

	//GETTER Y SETTER
	public ArrayList<Elemento> getLista_Elementos() {
		return Lista_Elementos;
	}

	public void setLista_Elementos(ArrayList<Elemento> lista_Elementos) {
		Lista_Elementos = lista_Elementos;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Elementos [Lista_Elementos=" + Lista_Elementos + "]";
	}
	
	//M�TODOS
	public void insertarElemento() {
		
		Elemento x = new Elemento();
		
		x = x.darAltaElemento();
		
		Lista_Elementos.add(x);
	}
	
	public void eliminarElementos() {
		
		Scanner sc = new Scanner(System.in);
		boolean encontrado = false;
		int codigo;
		System.out.println("Introduzca el c�digo del Elemento que quiere eliminar");
		codigo = sc.nextInt();
		
		for(int i=0; i<Lista_Elementos.size() && encontrado == false; i++) {
			if(Lista_Elementos.get(i).getCodigo() == codigo) {
				Lista_Elementos.remove(i);
				encontrado = true;
			}
		}
		if(encontrado==false) {
			System.out.println("Ese c�digo no pertenece a ning�n Elemento de la lista");
		}
	}
	
	public void listarElementos() {
		
		for(int i=Lista_Elementos.size()-1; i>=0; i--) { //recorrer al rev�s para mostrar smp el primero (�ltimo a�adido) en forma de pila
			System.out.println(Lista_Elementos.get(i).toString());
		}
	}
}
