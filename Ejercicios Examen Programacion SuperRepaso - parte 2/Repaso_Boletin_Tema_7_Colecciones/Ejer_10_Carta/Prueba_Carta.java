package Ejer_10_Carta;

public class Prueba_Carta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista_Cartas lista_cartas = new Lista_Cartas();
		
		Carta carta = new Carta();
		
		lista_cartas.getLista_cartas().add(carta);
		
		for(int i=0; i<9; i++) {
			lista_cartas.noSeRepiteNinguna(); //por que no se generan todas las cartas y se queda ne ejecucion??
		}
		
	}

}
