package Ejer_8_iLibro;

import java.util.ArrayList;

/* 
 * Implementar dos funciones en el main:
 * a. func1: dada una lista de libros, devuelva el número de libros que tienen al  menos 300 páginas 
 * y a lo sumo 4 autores: int func1(List)
 * b. func2: dada una lista de libros, devuelva verdadero si existe al menos un  libro anónimo: 
 * boolean func2(List).
 * La clase Libro implementa ILibro. 
 * Crear una lista de libros en el main, y probar ambas funciones.
 * 
 */

public class Lista_Libros {

	//ATRIBUTO
	//ArrayList<Elemento> listaElemento=new ArrayList<Elemento> ();
	ArrayList<Libros> objeto = new ArrayList<Libros>();

	//CONSTRUCTOR LLENO
	public Lista_Libros(ArrayList<Libros> objeto) {
		super();
		this.objeto = objeto;
	}
	
	//CONSTRUCTOR VACÍO
	public Lista_Libros() {
		super();
	}

	//GETTER Y SETTER
	public ArrayList<Libros> getObjeto() {
		return objeto;
	}

	public void setObjeto(ArrayList<Libros> objeto) {
		this.objeto = objeto;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Libros [objeto=" + objeto + "]";
	}

	//MÉTODOS
	public int librosGrandes() {
		int contador = 0;
		
		for(int i=0; i<this.objeto.size(); i++) {
			if(this.objeto.get(i).getNumPaginas() >= 300 && this.objeto.get(i).getAutores().length <= 4) { //ojito con el lenght de los autores, que es un array!
				contador++;
			}
		}
		
		return contador;
	}
	
	public boolean librosAnonimos() {
		boolean anonimo = false;
		
		for(int i=0; i<this.objeto.size() && anonimo==false; i++) {
			for(int j=0; j<this.objeto.get(i).getAutores().length && anonimo==false; j++) {
				if(this.objeto.get(i).getAutores()[j].equalsIgnoreCase("anonimo")) {
					anonimo = true;
				}
			}
		}
		return anonimo;
	}

}
