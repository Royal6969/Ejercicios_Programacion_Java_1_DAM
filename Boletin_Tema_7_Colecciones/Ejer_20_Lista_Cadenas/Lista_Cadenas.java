package Ejer_20_Lista_Cadenas;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 20. Implementar una lista de Cadena, que funcione como una cola de palabras. 
 * Menú de operaciones: 
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
	ArrayList<Cadena> Lista_Cadenas = new ArrayList<Cadena>();

	//CONSTRUCTOR Lleno
	public Lista_Cadenas(ArrayList<Cadena> lista_Cadenas) {
		super();
		Lista_Cadenas = lista_Cadenas;
	}

	//CONSTRUCTOR Vacío
	public Lista_Cadenas() {
		super();
	}

	//GETTER Y SETTER
	public ArrayList<Cadena> getLista_Cadenas() {
		return Lista_Cadenas;
	}

	public void setLista_Cadenas(ArrayList<Cadena> lista_Cadenas) {
		Lista_Cadenas = lista_Cadenas;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Cadenas [Lista_Cadenas=" + Lista_Cadenas + "]";
	}
	
	//MÉTODOS
	public void insertarCadena() {
		
		Cadena x = new Cadena();
		
		x = x.darAltaCadena();
		
		Lista_Cadenas.add(x);
	}
	
	public void eliminarCadenas() {
		
		Scanner sc = new Scanner(System.in);
		boolean encontrado = false;
		int codigo;
		System.out.println("Introduzca el código del Cadena que quiere eliminar");
		codigo = sc.nextInt();
		
		for(int i=0; i<Lista_Cadenas.size() && encontrado == false; i++) {
			if(Lista_Cadenas.get(i).getCodigo() == codigo) {
				Lista_Cadenas.remove(i);
				encontrado = true;
			}
		}
		if(encontrado==false) {
			System.out.println("Ese código no pertenece a ningún Cadena de la lista");
		}
	}
	
	public void listarCadenas() {
		
		for(int i=0; i<Lista_Cadenas.size(); i++) { //recorrer al revés para mostrar smp el primero (último añadido) en forma de pila
			System.out.println(Lista_Cadenas.get(i).toString());
		}
	}
}
