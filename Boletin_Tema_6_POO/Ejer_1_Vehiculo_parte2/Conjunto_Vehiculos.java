package Ejer_1_Vehiculo_parte2;

import java.util.Arrays;

public class Conjunto_Vehiculos {
	
	private Vehiculo[] conjvehiculo=new Vehiculo[10];
	private int cont=0;
	

	public Conjunto_Vehiculos(Vehiculo[] conjvehiculo, int cont) {
		super();
		this.conjvehiculo = conjvehiculo;
		this.cont = cont;
	}
	
	public Conjunto_Vehiculos() {
		super();
	}
	
	
	public Vehiculo[] getConjvehiculo() {
		return conjvehiculo;
	}
	public void setConjvehiculo(Vehiculo[] conjvehiculo) {
		this.conjvehiculo = conjvehiculo;
	}

	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}


	@Override
	public String toString() {
		return "Conjunto_Vehiculos [Conjunto_Vehiculos=" + Arrays.toString(conjvehiculo) + ", cont=" + cont + "]";
	}

}

