package Proyecto_Fichero_Binario;

import java.io.Serializable;

public class Fecha implements Serializable{

	//Atributos
	private int dia;
	private int mes;
	private int anio;
		
	//Constructor vacío
	public Fecha() {
		super();
	}
	
	//Constructor lleno
	public Fecha(int dia,int mes,int anio) {
		super();
		this.dia=dia;
		this.anio=anio;
		this.mes=mes;
	}

	
	//Getters y Setters
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

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	//ToString
	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}
}
