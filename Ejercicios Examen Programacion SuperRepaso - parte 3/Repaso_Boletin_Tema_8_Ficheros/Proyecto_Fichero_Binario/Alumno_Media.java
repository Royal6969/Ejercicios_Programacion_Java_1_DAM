package Proyecto_Fichero_Binario;

import java.io.Serializable;

public class Alumno_Media implements Serializable{

	//Atributos
	private String nombre;
	private String ape;
	private int media;
	private Fecha fechanac;
	
	
	//Constructor vacio
	public Alumno_Media() {
		super();
	}
	
	//Constructor lleno
	public Alumno_Media(String nombre, String ape, int media) {
		super();
		this.nombre = nombre;
		this.ape = ape;
		this.media = media;
		this.fechanac = new Fecha(00,00,0000);
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	//Getter y Setter
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApe() {
		return ape;
	}

	public void setApe(String ape) {
		this.ape = ape;
	}

	public int getMedia() {
		return media;
	}

	public void setMedia(int media) {
		this.media = media;
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
		return "AlumnoMedia [nombre=" + nombre + ", ape=" + ape + ", media=" + media + ", fechanac=" + fechanac + "]";
	}
}
