package Ejer_5_NotasAsignaturas;

public class Alumno implements Comparable<Alumno>{

	//ATRIBUTOS
	String nomape;
	int nota;
	
	//CONSTRUCTOR Lleno
	public Alumno(String nomape, int nota) {
		super();
		this.nomape = nomape;
		this.nota = nota;
	}

	//CONSTRUCTOR Vacío
	public Alumno() {
		super();
	}

	//GETTER Y SETTER
	public String getNomape() {
		return nomape;
	}

	public void setNomape(String nomape) {
		this.nomape = nomape;
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
		return "Alumno [nomape=" + nomape + ", nota=" + nota + "]";
	}

	//Override
	@Override
	public int compareTo(Alumno a) {
		
		return this.getNomape().compareToIgnoreCase(a.getNomape()); //lo de restar es solo para comparar números
	}
	
	
}
