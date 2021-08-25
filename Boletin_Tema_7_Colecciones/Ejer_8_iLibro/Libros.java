package Ejer_8_iLibro;

public class Libros implements iLibro{ 

	//ATRIBUTOS
	private String titulo;
	private int numPaginas;
	private String[] autores;
	private String editorial;
	
	//CONSTRUCTOR LLENO
	public Libros(String titulo, int numPaginas, String[] autores, String editorial) {
		super();
		this.titulo = titulo;
		this.numPaginas = numPaginas;
		this.autores = autores;
		this.editorial = editorial;
	}

	//CONSTRUCTOR VACÍO
	public Libros() {
		super();
	}

	//GETTER Y SETTER
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public String[] getAutores() {
		return autores;
	}

	public void setAutores(String[] autores) {
		this.autores = autores;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	//To String
	@Override
	public String toString() {
		return "Libros [titulo=" + titulo + ", numPaginas=" + numPaginas + ", autores=" + autores + ", editorial="
				+ editorial + "]";
	}

	
	
}
