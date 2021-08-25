package Ejer_9_EuroCoin;

public class Prueba_Moneda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista_Monedas coins = new Lista_Monedas();
		
		coins.generarMoneda();
		
		for(int i=0; i<5; i++) {
			coins.generarRestoMonedas();
			System.out.println(coins.getObjeto().get(i));
		}
	}

}
