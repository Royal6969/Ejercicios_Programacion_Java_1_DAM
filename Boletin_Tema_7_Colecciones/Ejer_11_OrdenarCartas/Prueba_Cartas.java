package Ejer_11_OrdenarCartas;

public class Prueba_Cartas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista_Cartas cards = new Lista_Cartas();
		
		Cartas c = new Cartas();
		
		cards.getObjeto().add(c);
		
		System.out.println(c);
		
		for(int i=0; i<9; i++) {
			cards.noSeRepitenCartas();
		}
		
		System.out.println();
		
		cards.ordenarCartas();
		
		
	}

}
