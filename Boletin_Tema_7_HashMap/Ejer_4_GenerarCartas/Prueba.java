package Ejer_4_GenerarCartas;

import java.util.HashMap;
import java.util.Iterator;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> puntuacion = new HashMap<String, Integer>();
		
		puntuacion.put("as", 11);
		puntuacion.put("tres", 10);
		puntuacion.put("sota", 2);
		puntuacion.put("caballo", 3);
		puntuacion.put("rey", 4);
		
		////////////////////////////////////////////////////////////////
		
		Lista_Cartas cards = new Lista_Cartas();
		
		for(int i=0; i<5; i++) {
			
			Cartas c = new Cartas();
			
			cards.getObjeto().add(c);
			
			System.out.println(c);
		}
		puntuacion(puntuacion, cards);
		
	}
	//MÉTODOS
	public static void puntuacion(HashMap<String,Integer>puntuacion, Lista_Cartas cards) {
		
		int contador = 0;
		
		for(int i=0; i<cards.getObjeto().size(); i++) {

	        Iterator<String> it = puntuacion.keySet().iterator();
	        
	        while(it.hasNext()){
	        	
	        String obj =it.next();
	        //System.out.println(obj);
	        	if(cards.getObjeto().get(i).getNumero().equalsIgnoreCase(obj)) {
	        		contador += puntuacion.get(obj); //esto es lo que va acumulando la puntuacion que ha salido
	        	}
	        }
		}
		System.out.println("Tu puntuación es: "+contador);
	}

}
