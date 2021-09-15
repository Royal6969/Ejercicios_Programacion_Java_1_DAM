package Ejer_7_Persona_OrdenacionNatural_SortedSet;
/*
 * 7. Clase Persona (nombre, apellidos y edad); ordenación natural por apellido, nombre y edad; 
 * igualdad especificada por los tres campos). 
 * Establecer un segundo criterio de ordenación por edad. 
 * 
 * Se pide probar la creación de un SortedSet utilizando los 4 constructores siguientes:
 * a. TreeSet()
 * b. TreeSet(Collection c)
 * c. Treset(Comparator c)
 * d. TreeSet(SortetSet s)
 */
public class Persona implements Comparable<Persona>{ //ordenación natural por apellido, nombre y edad;

	//ATRIBUTOS
	private String nombre;
	private String apellidos;
	private int edad;
	
	//CONSTRUCTOR Vacío
	public Persona() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	//GETTER Y SETTER
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

	//To String
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

	/*
	 * ordenación natural por apellido, nombre y edad; 
	 * (igualdad especificada por los tres campos). 
	 * Establecer un segundo criterio de ordenación por edad. 
	 */
	@Override
	public int compareTo(Persona persona) {
		// TODO Auto-generated method stub
		if(this.getNombre().equalsIgnoreCase(persona.getNombre())) {
			if(this.getApellidos().equalsIgnoreCase(persona.getApellidos())) {
				return this.getEdad() - persona.getEdad(); //como es un int, se hace la resta esta... si fuera un string sería con el compareTo
			
			}else {
				return this.getApellidos().compareToIgnoreCase(persona.getApellidos());
			}
		
		}else {
			return this.getNombre().compareToIgnoreCase(persona.getNombre());
		}
		
	}

}
