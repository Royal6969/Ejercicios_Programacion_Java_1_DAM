package Ejer_5_Profesor;

public abstract class Persona { //persona es padre supremo, no lo ves?
	
/*5. Crear la clase Profesor (identificador de profesor y dos constructores) 
 * que hereda de Persona (nombre, apellidos y edad), 
 * y que a su vez puede ser ProfesorInterino ( atributo fecha de comienzo de interinidad de tipo Calendar 
 * y dos constructores que invocan a la clase Profesor: 
 * uno con todos los atributos y otro con la fecha de comienzo de interinidad) o ProfesorTitular. 
 * Probarlo en una clase test.
*/
	
	//ATRIBUTOS//
	private String nombre;
	private String apellidos;
	private int edad;

	//Constructor lleno tal como sale solo
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//TO String
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}
	
	
}
