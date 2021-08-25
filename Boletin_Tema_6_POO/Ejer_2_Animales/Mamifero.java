package Ejer_2_Animales;

public class Mamifero extends Animal{
	
	private int altura;


	public Mamifero(String sexo, int altura) {
		super(sexo);
		this.altura = altura;
	}

	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}


	@Override
	public String toString() {
		return "Mamifero [altura=" + altura + "]";
	}
	
	public void reir() {
		System.out.println("jajajajaja");
	}
	public void pelear() {
		System.out.println("Nadie me ganara");
	}
	public void cazar() {
		System.out.println("Hoy atrapare algo bueno");
	}

}

