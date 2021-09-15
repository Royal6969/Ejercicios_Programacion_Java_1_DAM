package Proyecto_Fichero_Binario;

import java.io.Serializable;

public class Alumno implements Serializable{

	//Atributos
	private String nombre;
	private String ape;
	private int nota1;
	private int nota2;
	private int nota3;
	private Fecha fechanac;
		
	//Constructor vacío
	public Alumno() {
		super();
	}
	
	//Constructor lleno
	public Alumno(String nom, String ape, int not1,int not2,int not3) {
		super();
		this.nombre=nom;
		this.ape=ape;
		this.nota1=not1;
		this.nota2=not2;
		this.nota3=not3;
		this.fechanac=new Fecha(00,00,0000);
	}
		
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApe() {
		return ape;
	}

	public void setApe(String ape) {
		this.ape = ape;
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	public int getNota3() {
		return nota3;
	}

	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}

	public Fecha getFechanac() {
		return fechanac;
	}

	public void setFechanac(Fecha fechanac) {
		this.fechanac = fechanac;
	}

	//toString
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", ape=" + ape + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3="
				+ nota3 + ", fechanac=" + fechanac + "]";
	}
}
