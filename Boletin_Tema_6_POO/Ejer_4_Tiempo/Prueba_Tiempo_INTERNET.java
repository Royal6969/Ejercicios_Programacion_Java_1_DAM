package Ejer_4_Tiempo;

public class Prueba_Tiempo_INTERNET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tiempo_INTERNET t1 = new Tiempo_INTERNET(8, 30, 00);
		Tiempo_INTERNET t2 = new Tiempo_INTERNET(4, 45, 15);
		Tiempo_INTERNET t3 = new Tiempo_INTERNET(5000);
		
		System.out.println(t1.suma(t2));
		System.out.println(t1.resta(t2));
		System.out.println(t3);
	}

}
