package Practica_Inicial;

public class Practica_Clase_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vector = new int[10]; //cuando no nos digan tama�o, presumimos el 10 de tama�o
		
		//listar elemntos aqui
		
		for(int i=0; i<vector.length; i++) {
			vector[i] = i;
		}
		for(int i=0; i<vector.length; i++) {
			System.out.println("Elemento "+i+" es"+vector[i]);
			
			
		}
	}

}
