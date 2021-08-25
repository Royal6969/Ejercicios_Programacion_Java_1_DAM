package Ejer_2_Animales;

public class Ave extends Animal{

	private int plumas;

	
	public Ave(String sexo, int plumas) {
		super(sexo);
		this.plumas = plumas;
	}

	
	public int getPlumas() {
		return plumas;
	}
	public void setPlumas(int plumas) {
		this.plumas = plumas;
	}


	@Override
	public String toString() {
		return "Ave [plumas=" + plumas + "]";
	}
	
	
	public void volar() {
		System.out.println("Que bonito es volar");
	}
	public void ba�arse() {
		System.out.println("El agua es lo mejor");
	}
	public void so�ar() {
		System.out.println("Que dulce sue�o");
	}
}

