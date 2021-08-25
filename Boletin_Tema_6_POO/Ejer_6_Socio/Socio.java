package Ejer_6_Socio;

import java.util.GregorianCalendar;

public class Socio extends Persona{
	
	//ATRIBUTOS
	private int id = 0; //el inicializarlo lo dijo Eva
	private GregorianCalendar fechaAlta;
	private static int nSocios = 0; //0 porque empiezas en la posicion 0 del Array
	
	//Constructor vacío ........ Vacio porque el ID lo voy a modificar y la FechaAlta se pone automática con el GregorianCalendar
	public Socio(int nif, String nombre, Fecha cumpleaños) {
		super(nif, nombre, cumpleaños); //Ojo y ahora debajo del super...
		this.id = Socio.nSocios; //el ID será igual a la enumeración del socio por el que se va creando en el Array
		Socio.nSocios++; 
		
		this.fechaAlta = new GregorianCalendar(GregorianCalendar.getInstance().getTimeZone());
	}

	//GETTER Y SETTER
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public GregorianCalendar getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(GregorianCalendar fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public static int getnSocios() {
		return nSocios;
	}

	public static void setnSocios(int nSocios) {
		Socio.nSocios = nSocios;
	}

	//To String
	@Override
	public String toString() {
		return super.toString()+ "Socio [id=" + id + ", fechaAlta=" + fechaAlta.get(GregorianCalendar.YEAR) + " " + fechaAlta.get(GregorianCalendar.MONTH) + " " + fechaAlta.get(GregorianCalendar.DAY_OF_MONTH) + "]";
	}
	
	
	
}
