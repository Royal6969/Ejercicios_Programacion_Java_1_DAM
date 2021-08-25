package Futbol;

public class Jugador {

	//ATRIBTOS//
	private String nombre;
	private String nacionalidad;
	private String dni;
	
	//CONSTRUCTOR//
	public Jugador(String nombre, String nacionalidad, String dni) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.dni = dni;
	}

	//GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	//TO String
	@Override
	public String toString() {
		return "\nJugador [nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", dni=" + dni + "]";
	}
	
	
	
}
