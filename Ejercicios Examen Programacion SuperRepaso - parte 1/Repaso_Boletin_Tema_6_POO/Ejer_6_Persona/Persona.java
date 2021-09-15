package Ejer_6_Persona;
/*
 * 6. Crear un proyecto para organizar a un conjunto de personas que se apuntan a una asociación. 
 * De cada persona interesa saber sus datos básicos: nif, nombre completo y fecha de nacimiento. 
 * Cuando cada nuevo socio se da de alta, 
 * se le asigna un código de asociado único y se anota la fecha de alta
 * (usar la clase de java Gregorian Calendar); de forma automática. 
 * 
 * Crear un menú con las siguientes opciones:
 * 1. Alta de socio (pedir datos: nif, nombre y fecha de nacimiento 
 * (crear una clase Fecha propia: dia, mes y año)).
 * 2. Modificación de fecha de nacimiento (pedir el número de socio).
 * 3. Listado completo.
 * 4. Listado completo ordenado según el nombre.
 * 5. Listado completo ordenado según la fecha de nacimiento.
 * 6. Salir.
 */
public abstract class Persona {
	
	//ATRIBUTOS
	private int nif;
	private String nombre;
	//la fecha irá dps de haber creado la clase FECHA 
	private Fecha nacimiento = new Fecha(); //le doy al vacío
	
	//CONSTRUCTOR Vacío
	public Persona() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Persona(int nif, String nombre, Fecha nacimiento) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.nacimiento = nacimiento;
	}

	//GETTTER Y SETTER
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

	public Fecha getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Fecha nacimiento) {
		this.nacimiento = nacimiento;
	}

	//To String
	@Override
	public String toString() {
		return " nif=" + nif + ", nombre=" + nombre + ", nacimiento=" + nacimiento + "]";
	}

	
	
}
