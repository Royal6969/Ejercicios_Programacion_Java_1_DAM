package Ejer_5_Profesor;

public class Profesor extends Persona{

	//ATRIBUTOS//
	private String idProfesor;

	//CONSTRUCTOR
	public Profesor(String nombre, String apellidos, int edad) {
		super(nombre, apellidos, edad);
	}

	//CONSTRUCTOR FULL
	public Profesor(String nombre, String apellidos, int edad, String idProfesor) {
		super(nombre, apellidos, edad);
		this.idProfesor = idProfesor;
	}

	//GETTER Y SETTER
	public String getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}

	//TO String
	@Override
	public String toString() {
		return super.toString()+"Profesor [idProfesor=" + idProfesor + "]"; //aqui habia que añadir el super.toString()
	}

}
