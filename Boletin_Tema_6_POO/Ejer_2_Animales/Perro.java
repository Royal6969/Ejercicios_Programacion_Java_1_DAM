package Ejer_2_Animales;

public class Perro extends Mamifero{
	private int huesos;

	public Perro(String sexo, int altura, int huesos) {
		super(sexo, altura);
		this.huesos = huesos;
	}

	public int getHuesos() {
		return huesos;
	}

	public void setHuesos(int huesos) {
		this.huesos = huesos;
	}

	@Override
	public String toString() {
		return "Perro [huesos=" + huesos + "]";
	}
	
	public void esconder() {
		System.out.println("Escondo huesos");
	}
	public void habla() {
		System.out.println("Guau");
	}
	public void lamer() {
		System.out.println("Sabes bien");
	}

}

