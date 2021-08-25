package Ejer_6_Socio;

public abstract class Persona {
	
	/*6. Crear un proyecto para organizar a un conjunto de personas que se apuntan a una asociación. 
	 * De cada persona interesa saber sus datos básicos: NIF, nombre completo y fecha de nacimiento. 
	 * Cuando cada nuevo socio se da de alta, se le asigna un código de asociado único 
	 * y se anota la fecha de alta (usar la clase de java Gregorian Calendar); de forma automática. 
	 * Crear un menú con las siguientes opciones:
	 * 1. Alta de socio (pedir datos: nif, nombre y fecha de nacimiento (crear una clase Fecha propia: dia, mes y año)).
	 * 2. Modificación de fecha de nacimiento (pedir el número de socio).
	 * 3. Listado completo.
	 * 4. Listado completo ordenado según el nombre.
	 * 5. Listado completo ordenado según la fecha de nacimiento.
	 * 6. Salir
	 */
	
	//ATRIBUTOS
	private int nif;
	private String nombre;
	private Fecha cumpleaños = new Fecha(); //OJO, el vacio
	
	//CONSTRUCTOR
	public Persona(int nif, String nombre, Fecha cumpleaños) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.cumpleaños = cumpleaños;
	}

	//GETTER Y SETTER
	public int getNif() {
		return nif;
	}

	public void setNif(int nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Fecha getCumpleaños() {
		return cumpleaños;
	}

	public void setCumpleaños(Fecha cumpleaños) {
		this.cumpleaños = cumpleaños;
	}

	//To String
	@Override
	public String toString() {
		return "Persona [nif=" + nif + ", nombre=" + nombre + ", cumpleaños=" + cumpleaños + "]";
	}
	
}
