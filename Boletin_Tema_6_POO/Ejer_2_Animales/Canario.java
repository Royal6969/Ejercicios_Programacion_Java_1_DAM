package Ejer_2_Animales;

public class Canario extends Ave{
	private String tamaño;

	public Canario(String sexo, int plumas, String tamaño) {
		super(sexo, plumas);
		this.tamaño = tamaño;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Canario [tamaño=" + tamaño + "]";
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

