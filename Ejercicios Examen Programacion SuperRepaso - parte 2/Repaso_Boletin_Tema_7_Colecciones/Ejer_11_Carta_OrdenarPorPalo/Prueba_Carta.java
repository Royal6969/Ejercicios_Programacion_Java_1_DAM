package Ejer_11_Carta_OrdenarPorPalo;

public class Prueba_Carta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista_Cartas lista_cartas = new Lista_Cartas();
		
		Carta carta = new Carta();
		
		lista_cartas.getLista_cartas().add(carta);
		
		for(int i=0; i<9; i++) {
			lista_cartas.noSeRepiteNinguna(); 
			//lista_cartas.getLista_cartas().add(carta);
		}
		//System.out.println("Listado de cartas");
		//lista_cartas.imprimir();
		lista_cartas.ordenarCartas();
		System.out.println();
		lista_cartas.imprimir();
	}

}
