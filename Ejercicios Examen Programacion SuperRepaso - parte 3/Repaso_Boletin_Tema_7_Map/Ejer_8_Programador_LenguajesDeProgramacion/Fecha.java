package Ejer_8_Programador_LenguajesDeProgramacion;

public class Fecha {

	//ATRIBUTOS
	int a�o;
	int mes;
	int dia;
	
	//CONSTRUCTOR Vac�o
	public Fecha() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Fecha(int a�o, int mes, int dia) {
		super();
		this.a�o = a�o;
		this.mes = mes;
		this.dia = dia;
	}

	//GETTER Y SETTER
	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	//To String
	@Override
	public String toString() {
		return "Fecha [a�o=" + a�o + ", mes=" + mes + ", dia=" + dia + "]";
	}
	
	
}
