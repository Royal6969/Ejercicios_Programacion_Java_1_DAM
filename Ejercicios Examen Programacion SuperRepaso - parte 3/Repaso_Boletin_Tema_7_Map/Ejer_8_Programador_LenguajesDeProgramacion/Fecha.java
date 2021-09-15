package Ejer_8_Programador_LenguajesDeProgramacion;

public class Fecha {

	//ATRIBUTOS
	int año;
	int mes;
	int dia;
	
	//CONSTRUCTOR Vacío
	public Fecha() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Fecha(int año, int mes, int dia) {
		super();
		this.año = año;
		this.mes = mes;
		this.dia = dia;
	}

	//GETTER Y SETTER
	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
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
		return "Fecha [año=" + año + ", mes=" + mes + ", dia=" + dia + "]";
	}
	
	
}
