package Ejer_5_AlumnosEnAsignaturas;
/*
 * 5. Crear un mapa, que debe contener 
 * como clave: el nombre de una asignatura (las asignaturas son las siguientes: PROGRAMACI�N, LM y BD) 
 * y como dato: una lista de cinco alumnos que la cursan con sus notas (clase Alumno: nomApe y nota). 
 * Una vez creado este mapa, listarlo por asignatura (EN ORDEN ASCENDENTE DE NOMBRE Y APELLIDOS DE ALUMNO).
 * 
 * DATOS DE ENTRADA: 
 * 
 * Para PROGRAMACI�N: 
 * Rub�n Hern�ndez,5; 
 * Susana N��ez,7; 
 * Elena Ruiz,6; 
 * Guillermo Caro,8; 
 * Tania Falero,5. 
 * 
 * Para LM: 
 * Hern�n Barco,7;
 * Vicente Guerra, 6; 
 * Carmen Vega,8; 
 * Bel�n Cuesta,5; 
 * Bert�n Blades,7. 
 * 
 * Para BD: 
 * Alejandro Ortiz,5; 
 * Daniel N��ez,8; 
 * Valeria Fern�ndez, 4;
 * Agust�n Soler, 9; 
 * Emilio Jerez,3.
 * 
 * A continuaci�n, a los profesores de estas asignaturas les toca el gordo de navidad 
 * y deciden poner un cinco a todos los alumnos suspensos. 
 * Cambia las calificaciones correspondientes y lista de nuevo el mapa.
 * 
 * Crear tres clases: Alumno, ListAlumno y Principal.
 */

import java.util.ArrayList;
import java.util.HashMap;

public class Lista_Alumnos {

	//ATRIBUTOS //esto es lo que NO hay que hacer ...
	//HashMap<String, Integer> notasProgramacion = new HashMap<String, Integer>();
	//HashMap<String, Integer> notasLMSGI = new HashMap<String, Integer>();
	//HashMap<String, Integer> notasBBDD = new HashMap<String, Integer>();
	
	//el enfoque es el siguiente:
	//y como dato: una lista de cinco alumnos que la cursan
	//ATRIBUTOS
	ArrayList<Alumno> lista_alumnos = new ArrayList<Alumno>();

	//CONSTRUCTOR Vac�o
	public Lista_Alumnos() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Lista_Alumnos(ArrayList<Alumno> lista_alumnos) {
		super();
		this.lista_alumnos = lista_alumnos;
	}

	//GETTER Y SETTER
	public ArrayList<Alumno> getLista_alumnos() {
		return lista_alumnos;
	}

	public void setLista_alumnos(ArrayList<Alumno> lista_alumnos) {
		this.lista_alumnos = lista_alumnos;
	}

	//To String
	@Override
	public String toString() {
		return "lista_alumnos " + lista_alumnos + "\n";
	}
	
}
