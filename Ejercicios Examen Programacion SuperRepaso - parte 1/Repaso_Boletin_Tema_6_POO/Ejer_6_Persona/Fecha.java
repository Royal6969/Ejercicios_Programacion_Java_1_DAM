package Ejer_6_Persona;

public class Fecha {

	//ATRIBUTOS
	private int dia, mes, a�o;

	//CONSTRUCTOR Vac�o
	public Fecha() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Fecha(int dia, int mes, int a�o) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	//To String
	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", a�o=" + a�o + "]";
	}
}
