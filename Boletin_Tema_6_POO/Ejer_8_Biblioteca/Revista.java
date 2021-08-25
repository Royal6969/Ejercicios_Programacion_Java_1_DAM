package Ejer_8_Biblioteca;

public class Revista extends Publicacion {
	  private int numero;

	  public Revista(String isbn, String titulo, int año, int numero) {
	    super(isbn, titulo, año);
	    this.numero = numero;
	  }
	}
