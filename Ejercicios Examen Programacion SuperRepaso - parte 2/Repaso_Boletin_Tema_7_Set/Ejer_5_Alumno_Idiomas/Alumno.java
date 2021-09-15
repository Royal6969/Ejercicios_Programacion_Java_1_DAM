package Ejer_5_Alumno_Idiomas;
/*
 * 5. Dados tres conjuntos con los alumnos aprobados respectivamente 
 * en un examen del idioma inglés, el francés y el alemán. 
 * 
 * Se pide implementar un método que devuelva un array con los tres conjuntos siguientes:
 * a. candidatos que superaron la prueba de inglés y otra más.
 * b. candidatos que superaron al menos dos idiomas.
 * c. candidatos que superaron sólo un examen
 */
public class Alumno {

	//ATRIBUTOS
	private String nombre; //como el enunciado no dice nada de atributos intuímos el más sencillo

	//CONSTRUCTOR Vacío
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
