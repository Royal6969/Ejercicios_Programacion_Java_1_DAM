package Aviones;

public class Motor extends Avion {

	private int nTurbina;

	//CONSTRUCTOR//
	public Motor(int idAvion, String modeloAvion, int nPasajero, int nTurbina) {
		super(idAvion, modeloAvion, nPasajero);
		this.nTurbina = nTurbina;
	}

	//GETTER Y SETTER
	public int getnTurbina() {
		return nTurbina;
	}

	public void setnTurbina(int nTurbina) {
		this.nTurbina = nTurbina;
	}

	//TO String
	@Override
	public String toString() {
		return super.toString()+"Motor [nTurbina=" + nTurbina + "]";
	}
	
}
