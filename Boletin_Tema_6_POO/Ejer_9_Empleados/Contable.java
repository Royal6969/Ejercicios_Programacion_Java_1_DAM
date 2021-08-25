package Ejer_9_Empleados;

public class Contable extends Empleado{
	
	//ATRUBUTOS
	private int asientoHora;

	//CONSRUCTOR lleno
	public Contable(String nombre, String cedula, int edad, boolean casado, double salario, int asientoHora) {
		super(nombre, cedula, edad, casado, salario);
		this.asientoHora = asientoHora;
	}

	//CONSTRUCTOR vacio
	public Contable(String nombre, String cedula, int edad, boolean casado, double salario) {
		super(nombre, cedula, edad, casado, salario);
	}

	//GETTER Y SETTER
	public int getAsientoHora() {
		return asientoHora;
	}

	public void setAsientoHora(int asientoHora) {
		this.asientoHora = asientoHora;
	}

	//TO String
	@Override
	public String toString() {
		return super.toString()+"Contable [asientoHora=" + asientoHora + "]";
	}

	

}
