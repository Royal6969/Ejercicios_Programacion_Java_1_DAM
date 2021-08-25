package Ejer_5_Profesor;

public class ProfesorTitular extends Profesor{

	//CONSTRUCTORES con la opcion de la superclass
	
	public ProfesorTitular(String nombre, String apellidos, int edad, String idProfesor) {
		super(nombre, apellidos, edad, idProfesor);
		// TODO Auto-generated constructor stub
	}

	public ProfesorTitular(String nombre, String apellidos, int edad) {
		super(nombre, apellidos, edad);
		// TODO Auto-generated constructor stub
	}

	//To String
	@Override
	public String toString() { //añadir el super.toString
		return super.toString()+ "ProfesorTitular []";
	}

	

		
}



	

