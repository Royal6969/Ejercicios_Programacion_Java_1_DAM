package Ejer_2_Animales;

public class Canario extends Ave{
	private String tama�o;

	public Canario(String sexo, int plumas, String tama�o) {
		super(sexo, plumas);
		this.tama�o = tama�o;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Canario [tama�o=" + tama�o + "]";
	}
	
	
	public void cantar() {
		System.out.println("Pio pio");
	}
	public void saltar() {
		System.out.println("Yupii");
	}
	public void hogar() {
		System.out.println("Mi casa en el arbol es preciosa");
	}
}

