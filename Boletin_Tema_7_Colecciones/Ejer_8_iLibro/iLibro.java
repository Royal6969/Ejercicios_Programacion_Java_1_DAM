package Ejer_8_iLibro;

/*. Dada la siguiente interface:
 * public interface ILibro{
 * public String getTitulo();
 * public int getNumPaginas();
 * public String[] getAutores();
 * public String getEditorial();
 * public void setTitulo(String t);
 * public void setNumPaginas(int nP);
 * public void setAutores(String[] a);
 * public void setEditorial(String e);
 * }
 * 
 * Implementar dos funciones en el main:
 * a. func1: dada una lista de libros, devuelva el número de libros que tienen al  menos 300 páginas 
 * y a lo sumo 4 autores: int func1(List)
 * b. func2: dada una lista de libros, devuelva verdadero si existe al menos un  libro anónimo: 
 * boolean func2(List).La clase Libro implementa ILibro. 
 * Crear una lista de libros en el main, y probar ambas funciones.
 * 
 */

public interface iLibro{ //pista para la clase Libros, los getters son los atributos de Libros

	public String getTitulo(); 
	public int getNumPaginas();
	public String[] getAutores();
	public String getEditorial();
	public void setTitulo(String t);
	public void setNumPaginas(int nP);
	public void setAutores(String[] a);
	public void setEditorial(String e);
}
