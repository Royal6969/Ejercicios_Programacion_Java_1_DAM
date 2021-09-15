package Ejer_8_iLibro;
/*
 * . Dada la siguiente interface:
public interface ILibro{
public String getTitulo();
public int getNumPaginas();public String[] getAutores();
public String getEditorial();
public void setTitulo(String t);
public void setNumPaginas(int nP);
public void setAutores(String[] a);
public void setEditorial(String e);
}
*/
public interface iLibro {

	public String getTitulo();
	public int getNumPaginas();
	public String[] getAutores();
	public String getEditorial();
	public void setTitulo(String t);
	public void setNumPaginas(int nP);
	public void setAutores(String[] a);
	public void setEditorial(String e);
} //no dice nada de los atributos de la clase libro... pero si nos fijamos en los GETTER y SETTEr podemos sacarlos...

