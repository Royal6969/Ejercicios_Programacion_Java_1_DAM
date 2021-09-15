package Ejer_8_iLibro;
import java.util.ArrayList;
/*
Implementar dos funciones en el main:
a. func1: dada una lista de libros, devuelva el número de libros 
que tienen al menos 300 páginas y a lo sumo 4 autores: int func1(List)
b. func2: dada una lista de libros, devuelva verdadero si existe 
al menos un libro anónimo: boolean func2(List).
La clase Libro implementa ILibro. 
Crear una lista de libros en el main, y probar ambas funciones.
 */
public class Lista_Libros {

	//ATRIBUTOS
	ArrayList<Libro> lista_libros = new ArrayList<Libro>();

	//CONSTRUCTOR Vacío
	public Lista_Libros() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Lista_Libros(ArrayList<Libro> lista_libros) {
		super();
		this.lista_libros = lista_libros;
	}

	//GETTER Y SETTER
	public ArrayList<Libro> getLista_libros() {
		return lista_libros;
	}

	public void setLista_libros(ArrayList<Libro> lista_libros) {
		this.lista_libros = lista_libros;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Libros [lista_libros=" + lista_libros + "]";
	}
	
	//MÉTODOS
	/* a. func1: dada una lista de libros, devuelva el número de libros 
	 * que tienen al menos 300 páginas y a lo sumo 4 autores: int func1(List)
	 */
	public int librosGrandes() {
		int numLibros = 0;
		
		for(int i=0; i<this.getLista_libros().size(); i++) {
			if(this.getLista_libros().get(i).getNumPaginas() >= 300 && this.getLista_libros().get(i).getAutores().length <= 4) {
				numLibros ++;
			}
		}
		return numLibros;
	}
	/* b. func2: dada una lista de libros, devuelva verdadero si existe 
	 * al menos un libro anónimo: boolean func2(List).
	 */
	public boolean esLibroAnonimo() {
		boolean anonimo = false;
		
		for(int i=0; i<this.getLista_libros().size() && anonimo==false; i++) { 
			for(int j=0; j<this.getLista_libros().get(i).getAutores().length && anonimo==false; j++) {
				if(this.getLista_libros().get(i).getAutores() == null || this.getLista_libros().get(i).getAutores()[j].equalsIgnoreCase("anonimo")) {
					anonimo = true;
				}
			}
		}
		return anonimo;
	}
}
