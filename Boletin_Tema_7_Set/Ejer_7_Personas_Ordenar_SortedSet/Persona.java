package Ejer_7_Personas_Ordenar_SortedSet;

/*
 * 7. Clase Persona (nombre, apellidos y edad); ordenación natural por apellido, nombre y edad; 
 * igualdad especificada por los tres campos). 
 * Establecer un segundo criterio de ordenación por edad. 
 * Se pide probar la creación de un SortedSet utilizando los 4 constructores siguientes: 
 * 
 * a. TreeSet()
 * b. TreeSet(Collection c)
 * c. Treset(Comparator c)
 * d. TreeSet(SortetSet s)
 */

public class Persona implements Comparable<Persona>{

	//ATRIBUTOS
	private String nombre;
	private String apellido;
	private int edad;
	
	//CONSTRUCTOR Lleno
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	//CONSTRUCTOR Vacío
	public Persona() {
		super();
	}

	//GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//To String
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

	@Override
	public int compareTo(Persona Personaje) { //ordenación natural
		// TODO Auto-generated method stub
		
		if(this.nombre.equalsIgnoreCase(Personaje.nombre)) {
			
			if(this.apellido.equalsIgnoreCase(Personaje.apellido)) {
				
				return this.edad - Personaje.edad; //como es un int, se hace la resta esta ... si fuera un string sería con el compareTo
			}else {
				return this.apellido.compareToIgnoreCase(Personaje.apellido);
			}
		}else {
			return this.nombre.compareToIgnoreCase(Personaje.nombre);
		}
	}
	
	
	
}
