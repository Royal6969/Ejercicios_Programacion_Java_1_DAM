package Ejer_8_Biblioteca;

public class Publicacion {

	//ATRIBUTOS
	
	private String isbn;
	private String titulo;
	private int año;
	
	//CONSTRUCTOR

	public Publicacion(String isbn, String titulo, int año) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.año = año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	//TO String

	@Override
	public String toString() {
		return "Publicacion [isbn=" + isbn + ", titulo=" + titulo + ", año=" + año + "]";
	}
	
	
	
	
	
}
