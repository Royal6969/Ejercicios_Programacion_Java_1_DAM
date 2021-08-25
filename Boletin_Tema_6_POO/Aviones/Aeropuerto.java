package Aviones;

public class Aeropuerto {

	//ATRIBUTOS//
	private int id;
	private String nombre;
	private String ciudad;
	
	//CONSTRUCTOR//
	public Aeropuerto(int id, String nombre, String ciudad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ciudad = ciudad;
	}

	//GETTER Y SETTER//
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	//TO String
	@Override
	public String toString() {
		return "\nAeropuerto [id=" + id + ", nombre=" + nombre + ", ciudad=" + ciudad + "]";
	}

	
	
}
