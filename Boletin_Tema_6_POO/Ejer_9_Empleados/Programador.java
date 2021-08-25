package Ejer_9_Empleados;

public class Programador extends Empleado{

	//ATRIBUTOS
	private int linCodHora;
	private String lenguaje;
	
	//CONSRUCTOR
	public Programador(String nombre, String cedula, int edad, boolean casado, double salario, int linCodHora,
			String lenguaje) {
		super(nombre, cedula, edad, casado, salario);
		this.linCodHora = linCodHora;
		this.lenguaje = lenguaje;
	}

	//CONSTRUCTOR vacio
	public Programador(String nombre, String cedula, int edad, boolean casado, double salario) {
		super(nombre, cedula, edad, casado, salario);
	}

	//GETTER Y SETTER
	public int getLinCodHora() {
		return linCodHora;
	}

	public void setLinCodHora(int linCodHora) {
		this.linCodHora = linCodHora;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	//TO String
	@Override
	public String toString() {
		return super.toString()+"Programador [linCodHora=" + linCodHora + ", lenguaje=" + lenguaje + "]";
	}
	
	
	
}
