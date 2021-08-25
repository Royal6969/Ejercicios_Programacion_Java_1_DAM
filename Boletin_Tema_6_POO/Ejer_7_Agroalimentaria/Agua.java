package Ejer_7_Agroalimentaria;

public class Agua extends Congelados{
	
	private int nsal;

	public Agua(Fecha caducidad, Fecha envasado, int nlote, String pais, int temperatura, int nsal) {
		super(caducidad, envasado, nlote, pais, temperatura);
		this.nsal = nsal;
	}

	
	public int getNsal() {
		return nsal;
	}
	public void setNsal(int nsal) {
		this.nsal = nsal;
	}


	@Override
	public String toString() {
		return "Producto congelado con agua nsal=" + nsal + " "+super.toString();
	}

}
