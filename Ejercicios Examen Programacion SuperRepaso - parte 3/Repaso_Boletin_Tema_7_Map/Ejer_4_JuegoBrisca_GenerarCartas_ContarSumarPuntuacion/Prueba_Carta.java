package Ejer_4_JuegoBrisca_GenerarCartas_ContarSumarPuntuacion;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
/*
 * 4. Escribe un programa que genere una secuencia de 5 cartas de la baraja española 
 * y que sume los valores según el juego de la brisca. 
 * El valor de las cartas se debe guardar en una estructura HashMap que debe contener parejas
 * (figura, valor), por ejemplo (“caballo”, 3). 
 * El valor de las cartas es el siguiente: 
 * as-->11, tres-->10, sota-->2, caballo-->3, rey-->4; el resto de cartas no vale nada.
 * La secuencia de cartas debe ser una estructura de la clase ArrayList que contiene objetos de la clase Carta.
 * Ejemplo:
 * as de oros
 * cinco de bastos
 * caballo de espadas
 * sota de copas
 * tres de oros
 * Tienes 26 valores
 */
public class Prueba_Carta {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//El valor de las cartas se debe guardar en una estructura HashMap que debe contener parejas
		HashMap<String, Integer> valores = new HashMap<String, Integer>();
		
		valores.put("as", 11);
		valores.put("tres", 10);
		valores.put("sota", 2);
		valores.put("caballo", 3);
		valores.put("rey", 4);
		
		//La secuencia de cartas debe ser una estructura de la clase ArrayList que contiene objetos de la clase Carta.
		Lista_Cartas cartas = new Lista_Cartas();
		//ahora generar una secuencia de 5 cartas
		for(int i=0; i<5; i++) {
			Carta carta = new Carta(); //creamos la carta
			cartas.getLista_cartas().add(carta); //añadimos la carta 
			System.out.println(carta); //mostramos la carta
		}
		//aquí hay que hacer antes el método para sumar las puntuaciones y ponerlo aquí
		System.out.println();
		puntuacion_v2(valores, cartas);
	}
	///////////////////////////////// este metodo no funciona //////////////////////////
	public static void puntuacion(HashMap<String, Integer> valores, Lista_Cartas cartas) {
		
		int puntuacion = 0;
		
		for(int i=0; i<cartas.getLista_cartas().size(); i++) { //1º recorremos las posiciones con cada carta
			Carta carta = cartas.getLista_cartas().get(i);
			String carta2=carta.getNumero();
			puntuacion += valores.get(carta2);
		}
		System.out.println("Tu puntuación es: "+puntuacion);
	}//////////////////////////////////////////////////////////////////////////////////
	public static void puntuacion_v2(HashMap<String, Integer> valores, Lista_Cartas cartas) {
		int puntuacion = 0; 
		
		for(int i=0; i<cartas.getLista_cartas().size(); i++) { //1º recorremos las posiciones con cada carta
			//Iterator<String> iterator = cartas.getLista_cartas().iterator();
			Iterator<String> iterator = valores.keySet().iterator();
			while(iterator.hasNext()) {
				String carta = iterator.next();
				//System.out.println(carta); no es necesario mostrarlo aquí
				if(cartas.getLista_cartas().get(i).getNumero().equalsIgnoreCase(carta)) {
					puntuacion += valores.get(carta);
				}
			}
		}
		System.out.println(puntuacion);	
	}
	public static void imprimir(HashMap<String, Integer> valores) {
		Iterator iterator = valores.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, String> punto = (Map.Entry<String, String>)iterator.next();
			System.out.print("clave: "+punto.getKey()+"\t");
			System.out.print("valor: "+punto.getValue()+"\t");
		}
		System.out.println();
	}

}
