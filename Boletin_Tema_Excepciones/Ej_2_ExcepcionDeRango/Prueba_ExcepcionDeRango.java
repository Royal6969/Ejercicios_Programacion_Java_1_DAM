package Ej_2_ExcepcionDeRango;

public class Prueba_ExcepcionDeRango {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = -2;
		int min = 0;
		int max = 10;
		
		rango(num, min, max);
	}
	
	public static void rango(int num, int min, int max) {
		
		try {
			if(num>=min && num<=max) {
				System.out.println(num);
			}else {
				throw new ExcepcionDeRango();
			}
		}catch(ExcepcionDeRango e) {
			System.out.println(e.toString());
		}
	}

}
