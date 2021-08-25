package Ejer_7_Programador_y_Lenguajes;

public class Fecha {

	//ATRIBUTOS
	int dia;
	int mes;
	int a�o;
	
	//CONSTRUCTOR Lleno
	public Fecha(int dia, int mes, int a�o) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}

	//CONSTRUCTOR Vac�o
	public Fecha() {
		super();
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
