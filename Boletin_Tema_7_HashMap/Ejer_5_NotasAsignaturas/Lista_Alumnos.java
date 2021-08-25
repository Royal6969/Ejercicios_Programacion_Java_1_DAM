package Ejer_5_NotasAsignaturas;

import java.util.ArrayList;

public class Lista_Alumnos {

	//ATRIBUTOS
	private ArrayList<Alumno> Lista_Alumnos = new ArrayList<Alumno>();

	//CONSTRUCTOR Lleno
	public Lista_Alumnos(ArrayList<Alumno> lista_Alumnos) {
		super();
		Lista_Alumnos = lista_Alumnos;
	}

	//CONSTRUCTOR Vacío
	public Lista_Alumnos() {
		super();
	}

	//GETTER Y SETTER
	public ArrayList<Alumno> getLista_Alumnos() {
		return Lista_Alumnos;
	}

	public void setLista_Alumnos(ArrayList<Alumno> lista_Alumnos) {
		Lista_Alumnos = lista_Alumnos;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Alumnos [Lista_Alumnos=" + Lista_Alumnos + "]";
	}
	
	
}
