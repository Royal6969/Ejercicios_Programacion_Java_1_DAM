package Aviones;

public abstract class Avion {

	//ATRIBUTOS//
	private int idAvion;
	private String modeloAvion;
	private int nPasajero;
	
	//CONSTRUCTOR//
	public Avion(int idAvion, String modeloAvion, int nPasajero) {
		super();
		this.idAvion = idAvion;
		this.modeloAvion = modeloAvion;
		this.nPasajero = nPasajero;
	}

	//GETTER Y SETTER
	public int getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}

	public String getModeloAvion() {
		return modeloAvion;
	}

	public void setModeloAvion(String modeloAvion) {
		this.modeloAvion = modeloAvion;
	}

	public int getnPasajero() {
		return nPasajero;
	}

	public void setnPasajero(int nPasajero) {
		this.nPasajero = nPasajero;
	}

	//TO String
	@Override
	public String toString() {
		return "Avion [idAvion=" + idAvion + ", modeloAvion=" + modeloAvion + ", nPasajero=" + nPasajero + "]";
	}
	
	
	
}
