package Ejer_8_Biblioteca;

public class Revista extends Publicacion {
	  private int numero;

	  public Revista(String isbn, String titulo, int a�o, int numero) {
	    super(isbn, titulo, a�o);
	    this.numero = numero;
	  }
	}
