package Ejer_7_Agroalimentaria;

public class Frescos extends Productos{
	
	public Frescos(Fecha caducidad, Fecha envasado, int nlote, String pais) {
		super(caducidad, envasado, nlote, pais);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Producto fresco "+super.toString();
	}

}
