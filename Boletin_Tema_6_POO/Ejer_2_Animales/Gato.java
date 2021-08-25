package Ejer_2_Animales;

public class Gato extends Mamifero{
	private boolean garras;

	public Gato(String sexo, int altura, boolean garras) {
		super(sexo, altura);
		this.garras = garras;
	}

	
	public boolean isGarras() {
		return garras;
	}
	public void setGarras(boolean garras) {
		this.garras = garras;
	}


	@Override
	public String toString() {
		return "Gato [garras=" + garras + "]";
	}
	
	
	public void pesadilla() {
		System.out.println("Que mal sueño");
	}
	public void correr() {
		System.out.println("Corro muy rapido");
	}
	public void esconderse() {
		System.out.println("Me oculto");
	}
}

