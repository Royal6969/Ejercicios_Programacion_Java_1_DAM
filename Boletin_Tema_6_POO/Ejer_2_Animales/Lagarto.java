package Ejer_2_Animales;

public class Lagarto extends Animal{
	private int comida;

	public Lagarto(String sexo, int comida) {
		super(sexo);
		this.comida = comida;
	}

	
	public int getComida() {
		return comida;
	}
	public void setComida(int comida) {
		this.comida = comida;
	}


	@Override
	public String toString() {
		return "Lagarto [comida=" + comida + "]";
	}
	
	
	public void trepar() {
		System.out.println("Voy por la pared");
	}
	public void moscas() {
		System.out.println("En la luz hay comida");
	}
	public void cola() {
		System.out.println("Perdi mi cola");
	}
}

