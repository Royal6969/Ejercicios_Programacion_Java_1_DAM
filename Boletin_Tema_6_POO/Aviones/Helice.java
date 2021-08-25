package Aviones;

public class Helice extends Avion {

	//ATRIBUTOS//
	private String modeloMotor;

	//CONSRUCTOR//
	public Helice(int idAvion, String modeloAvion, int nPasajero, String modeloMotor) {
		super(idAvion, modeloAvion, nPasajero);
		this.modeloMotor = modeloMotor;
	}

	//GETTER Y SETTER
	public String getModeloMotor() {
		return modeloMotor;
	}

	public void setModeloMotor(String modeloMotor) {
		this.modeloMotor = modeloMotor;
	}

	//TO String
	@Override
	public String toString() {
		//para enlazar el to String de Avion con el de Helice
		return super.toString()+"Helice [modeloMotor=" + modeloMotor + "]";
	}
	
	

	
}
