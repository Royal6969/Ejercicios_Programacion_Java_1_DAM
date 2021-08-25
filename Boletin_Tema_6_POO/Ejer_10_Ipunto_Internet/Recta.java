package Ejer_10_Ipunto_Internet;

public class Recta {

	private Punto origen;
	private Punto fin;

	  public Recta(Punto origen, Punto fin) {
	    this.origen = origen;
	    this.fin = fin;
	  }

	  @Override
	  public String toString() {
	    return "Línea formada por los puntos " + origen + " y " + fin;
	  }
	  
}
