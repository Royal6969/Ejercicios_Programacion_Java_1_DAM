package Ejer_6_Socio;

public class Fecha {

	//ATRIBUTAS
	private int dia, mes, año;

	//CONSTRUCTOR vacio para la fecha en Persona
	public Fecha() {
		super();
	}
	
	//CONSTRUCTOR LLENO para la fecha en Socio
	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	//GETTER Y SETTER
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	//To String
	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", año=" + año + "]";
	}
}
