package Ejer_5_Alumno_Idiomas;
/*
 * 5. Dados tres conjuntos con los alumnos aprobados respectivamente 
 * en un examen del idioma ingl�s, el franc�s y el alem�n. 
 * 
 * Se pide implementar un m�todo que devuelva un array con los tres conjuntos siguientes:
 * a. candidatos que superaron la prueba de ingl�s y otra m�s.
 * b. candidatos que superaron al menos dos idiomas.
 * c. candidatos que superaron s�lo un examen
 */
public class Alumno {

	//ATRIBUTOS
	private String nombre; //como el enunciado no dice nada de atributos intu�mos el m�s sencillo

	//CONSTRUCTOR Vac�o
	public Alumno() {
		super();
	}

	//CONSTRUCTOR lleno
	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}

	//GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//To String
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + "]";
	}
}
