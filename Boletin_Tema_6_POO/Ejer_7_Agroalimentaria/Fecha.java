package Ejer_7_Agroalimentaria;

public class Fecha {
	
private int a�o,mes,dia;

	
	public Fecha(int a�o, int mes, int dia) {
		super();
		this.a�o = a�o;
		this.mes = mes;
		this.dia = dia;
	}

	
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


	@Override
	public String toString() {
		return " a�o=" + a�o + ", mes=" + mes + ", dia=" + dia + " ";
	}

}
