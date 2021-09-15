package Ejer_1_Vehiculo;

public class Bicicleta extends Vehiculo{

	public Bicicleta() {
		super();
		// TODO Auto-generated constructor stub
	}
	//como no tiene atributos... este constructor venia de pulsar...
	//from superclass
	public Bicicleta(int kilometrosRecorridos) {
		super(kilometrosRecorridos);
		// TODO Auto-generated constructor stub
	}
	
	//no hay getter ni setter
	
	@Override
	public String toString() {
		return "Bicicleta ["+super.toString();
	}
	//MÉTODOS
	public void hacerCaballito() {
		System.out.println("Estoy haciendo el caballito!");
	}
	
}
