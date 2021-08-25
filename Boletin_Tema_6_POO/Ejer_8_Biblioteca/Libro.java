package Ejer_8_Biblioteca;

public class Libro extends Publicacion implements Prestable {
	  private boolean prestado = false;

	  public Libro(String isbn, String titulo, int año) {
	    super(isbn, titulo, año);
	  }

	  @Override
	  public void presta() {
	    if (this.prestado) {
	      System.out.println("Lo siento, ese libro ya está prestado.");
	    } else {
	      this.prestado = true;
	    }
	  }

	  @Override
	  public void devuelve() {
	    this.prestado = false;
	  }

	  @Override
	  public String toString() {
	    return super.toString() + " (" + (this.prestado ? "prestado" : "no prestado") + ")";
	  }

	  @Override
	  public boolean estaPrestado() {
	    return this.prestado;
	  }
	}
