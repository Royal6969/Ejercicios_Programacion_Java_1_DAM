package Ejer_5_Profesor;

import java.util.GregorianCalendar;

public class Prueba_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProfesorInterino jesus = new ProfesorInterino("Jesus", "Gil", 49);
		ProfesorInterino fran = new ProfesorInterino("Fran", "Sanchez", 37);
		
		ProfesorTitular eva = new ProfesorTitular("Eva", "Torres", 50);
		
		System.out.println(jesus);
		System.out.println(fran);
		System.out.println(eva);
	}

}
