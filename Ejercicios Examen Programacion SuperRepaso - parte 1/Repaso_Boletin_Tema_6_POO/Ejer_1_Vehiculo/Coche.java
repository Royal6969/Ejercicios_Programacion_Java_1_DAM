package Ejer_1_Vehiculo;

public class Coche extends Vehiculo{

	//ATRIBUTOS
	
	//Constructor from superclass
	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coche(int kilometrosRecorridos) {
		super(kilometrosRecorridos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Coche ["+super.toString();
	}

	//MÉTODOS
	public void quemaRueda() {
		System.out.println("surmanito mírame");
	}
}
