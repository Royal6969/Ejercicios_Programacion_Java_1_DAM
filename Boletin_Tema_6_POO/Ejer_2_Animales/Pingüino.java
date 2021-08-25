package Ejer_2_Animales;

public class Pingüino extends Ave{
	private int huevos;

	public Pingüino(String sexo, int plumas, int huevos) {
		super(sexo, plumas);
		this.huevos = huevos;
	}

	
	public int getHuevos() {
		return huevos;
	}
	public void setHuevos(int huevos) {
		this.huevos = huevos;
	}


	@Override
	public String toString() {
		return "Pinguino [huevos=" + huevos + "]";
	}
	
	
	public void volar() {
		System.out.println("No puedo");
	}
	public void deslizarse() {
		System.out.println("Un tobogaan");
	}
	public void crias() {
		System.out.println("Debo cuidar mis hijos");
	}
}

