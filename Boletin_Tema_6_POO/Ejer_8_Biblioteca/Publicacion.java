package Ejer_8_Biblioteca;

public class Publicacion {

	//ATRIBUTOS
	
	private String isbn;
	private String titulo;
	private int a�o;
	
	//CONSTRUCTOR

	public Publicacion(String isbn, String titulo, int a�o) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.a�o = a�o;
	}

	//GETTER Y SETTER
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	//TO String

	@Override
	public String toString() {
		return "Publicacion [isbn=" + isbn + ", titulo=" + titulo + ", a�o=" + a�o + "]";
	}
	
	
	
	
	
}
