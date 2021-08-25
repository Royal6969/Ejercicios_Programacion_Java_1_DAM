package Ejer_5_Profesor;

import java.util.GregorianCalendar;

public class ProfesorInterino extends Profesor {

	//creacion del GregorianCalendar
	
	private GregorianCalendar fecha;

	//CONSTRUCTOR
	public ProfesorInterino(String nombre, String apellidos, int edad/*, GregorianCalendar fecha*/) {
		super(nombre, apellidos, edad); //el getInstance es el tiempo real y todo lo demas
		this.fecha = new GregorianCalendar(GregorianCalendar.getInstance().getTimeZone()); //desde el new me lo pasó JC
	}

	//GETTER  SETTER
	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}

	//TO String
	@Override
	public String toString() { //añadir el super.toString y cada parte me lo pasó JC, Eva lo dijo así
		return super.toString()+ "ProfesorInterino [fecha=" + fecha.get(GregorianCalendar.YEAR) + " " + fecha.get(GregorianCalendar.MONTH) + " " + fecha.get(GregorianCalendar.DAY_OF_MONTH);
	}
	
	
}
