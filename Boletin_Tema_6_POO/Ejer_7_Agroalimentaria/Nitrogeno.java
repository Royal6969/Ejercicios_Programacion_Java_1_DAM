package Ejer_7_Agroalimentaria;

public class Nitrogeno extends Congelados{
	
	private String metodo;
	private int segexpuesto;
	
	
	public Nitrogeno(Fecha caducidad, Fecha envasado, int nlote, String pais, int temperatura, String metodo,
			int segexpuesto) {
		super(caducidad, envasado, nlote, pais, temperatura);
		this.metodo = metodo;
		this.segexpuesto = segexpuesto;
	}


	public String getMetodo() {
		return metodo;
	}
	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public int getSegexpuesto() {
		return segexpuesto;
	}
	public void setSegexpuesto(int segexpuesto) {
		this.segexpuesto = segexpuesto;
	}


	@Override
	public String toString() {
		return "Producto congelado con nitrogeno metodo=" + metodo + ", segexpuesto=" + 
		segexpuesto + " "+super.toString();
	}

}
