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
public class Alumno implements Comparable<Alumno>{ //listarlo por asignatura (EN ORDEN ASCENDENTE DE NOMBRE Y APELLIDOS DE ALUMNO).

	//ATRIBUTOS
	private String nomApe;
	private int nota;
	
	//CONSTRUCTOR Vac�o
	public Alumno() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Alumno(String nomApe, int nota) {
		super();
		this.nomApe = nomApe;
		this.nota = nota;
	}

	//GETTER Y SETTER
	public String getNomApe() {
		return nomApe;
	}

	public void setNomApe(String nomApe) {
		this.nomApe = nomApe;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	//To String
	@Override
	public String toString() {
		return "\n"+ nomApe + ", " + nota + "\n";
	}

	@Override
	public int compareTo(Alumno alumno) { //listarlo por asignatura (EN ORDEN ASCENDENTE DE NOMBRE Y APELLIDOS DE ALUMNO).
		// TODO Auto-generated method stub
		return this.getNomApe().compareToIgnoreCase(alumno.getNomApe()); //uso del compareTo para cuando son Strings
	}
	
	
}
