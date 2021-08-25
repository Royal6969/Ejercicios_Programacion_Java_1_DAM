package Ejemplo_1_ArrayList_de_Objetos;

public class Elemento {

	//ATRIBUTOS
	int id;
	String nombre;
	
	//CONSTRUCTOR
	public Elemento(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	//GETTER Y SETTER
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

	//To String
	@Override
	public String toString() {
		return "Elemento [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	
}
