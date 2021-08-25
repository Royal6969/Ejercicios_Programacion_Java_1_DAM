package Aviones;

import java.util.Arrays;

public class Vuelo {

	//ATRIBUTOS//
	private Aeropuerto[] conjuntoAeropuertos;
	private Avion avion;
	
	//CONSTRUCTOR//
	public Vuelo(Aeropuerto[] conjuntoAeropuertos, Avion avion) {
		super();
		this.conjuntoAeropuertos = conjuntoAeropuertos;
		this.avion = avion;
	}

	//GETTER Y SETTER//
	public Aeropuerto[] getConjuntoAeropuertos() {
		return conjuntoAeropuertos;
	}

	public void setConjuntoAeropuertos(Aeropuerto[] conjuntoAeropuertos) {
		this.conjuntoAeropuertos = conjuntoAeropuertos;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion Avion) {
		this.avion = avion;
	}

	//TO String
	@Override
	public String toString() {
		return "Vuelo [conjuntoAeropuertos=" + Arrays.toString(conjuntoAeropuertos) + ", \nAvion=" + avion + "]";
	}
	
	
	
}
