package Ejer_4_Tiempo;

public class Prueba_Tiempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tiempo t1 = new Tiempo(1, 50, 30);
		Tiempo t2 = new Tiempo(1, 20, 10);
		
		t1.sumarTiempos(t2);
		System.out.println(t1);
		
		
	}

}
