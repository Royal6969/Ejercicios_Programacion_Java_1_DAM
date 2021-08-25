package Ejer_1_Vehiculo_parte1;

public class Coche extends Vehiculo{
	
	public Coche(int kilometrosRecorridos) {
		super(kilometrosRecorridos);
		
	}
	public Coche() {
		super();
		

	}
	@Override
	public String toString() {
		return "Es un coche"+super.toString();
	}
	public void quemarueda() {
		System.out.println("Mira ese humooo");
	}
	
}
