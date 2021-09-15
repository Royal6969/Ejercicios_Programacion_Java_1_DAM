package Ejer_6_Persona;

public class Fecha {

	//ATRIBUTOS
	private int dia, mes, año;

	//CONSTRUCTOR Vacío
	public Fecha() {
		super();
	}

	//CONSTRUCTOR Lleno
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
