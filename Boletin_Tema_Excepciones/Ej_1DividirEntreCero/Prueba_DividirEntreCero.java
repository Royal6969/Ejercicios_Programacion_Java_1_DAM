package Ej_1DividirEntreCero;

public class Prueba_DividirEntreCero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dividendo = 3;
		double divisor = 0;
		double resultado;
		
		try {
			if(divisor==0) {
				throw new DividirEntreCero_ArithmeticException();
			}else {
				resultado = dividendo/divisor;
			}
		}catch(DividirEntreCero_ArithmeticException e) {
			System.out.println(e.toString());
		}
	}

}
