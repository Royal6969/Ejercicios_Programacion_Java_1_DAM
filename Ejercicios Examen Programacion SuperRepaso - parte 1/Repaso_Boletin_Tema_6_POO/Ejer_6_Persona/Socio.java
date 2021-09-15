package Ejer_6_Persona;
/*
 *  * Cuando cada nuevo socio se da de alta, 
 * se le asigna un código de asociado único y se anota la fecha de alta
 * (usar la clase de java Gregorian Calendar); de forma automática. 
 */

import java.util.GregorianCalendar; //importado automáticamente al pulsar Ctrl+\s con GregorianCalendar

public class Socio extends Persona{

	//ATRIBUTOS
	private int id; 
	private static int nSocio = 0; //se suele inicializar en 0 para cuando se meta en un array
	private GregorianCalendar fechaAlta;
	
	//CONSTRUCTOR vacío
	public Socio(int nif, String nombre, Fecha nacimiento) {
		super(nif, nombre, nacimiento);
		this.id = Socio.nSocio; //asignando nSocio unico
		Socio.nSocio++; //asignando nSocio unico (ampliando secuencia)
		this.fechaAlta = new GregorianCalendar(GregorianCalendar.getInstance().getTimeZone()); //fecha automatica
	}	
	//en la classe padre, si ya hay un constructor vacío, hay que hacer el constructor lleno de la clase hija a mano,
	//por tanto si la clase padre no tiene un constructor vacio en la padre no hace falta hacerlo en la hija
	//por lo que es mejor no crearlo en la clase padre hasta que no sea realmente necesario
	//un C.V. se ve que se necesita cuando vamos a "Prueba_x" o cuando creo algún método donde sea
	public Socio(int nif, String nombre, Fecha nacimiento, int id, GregorianCalendar fechaAlta) {
		super(nif, nombre, nacimiento);
		this.id = id; 
		this.fechaAlta = fechaAlta;
	}	
	
	//GETTER Y SETTER
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getnSocio() {
		return nSocio;
	}

	public static void setnSocio(int nSocio) {
		Socio.nSocio = nSocio;
	}

	public GregorianCalendar getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(GregorianCalendar fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	//To String
	@Override
	public String toString() {
		return "Socio ["
				+ "id=" + id 
				+ ", fechaAlta=" 
				//+ fechaAlta //peligroso
				+ fechaAlta.get(GregorianCalendar.YEAR) + " " 
				+ fechaAlta.get(GregorianCalendar.MONTH) + " " 
				+ fechaAlta.get(GregorianCalendar.DAY_OF_MONTH) 
				+ 
				//"]";
				" "+ super.toString();
	}
	
	
}
