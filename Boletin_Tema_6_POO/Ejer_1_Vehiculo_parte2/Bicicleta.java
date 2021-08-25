package Ejer_1_Vehiculo_parte2;

public class Bicicleta extends Vehiculo {
	public Bicicleta() {
		super();
	}
	public Bicicleta(int kilometrosRecorridos) {
		super(kilometrosRecorridos);
	}

	
	
	@Override
	public String toString() {
		return "Es una bicicleta "+super.toString();
	}
	
	public void caballito() {
		System.out.println("Mira voy con una rueda");
	}
	
}

