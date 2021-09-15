package Ejer_4_JuegoBrisca_GenerarCartas_ContarSumarPuntuacion;
import java.util.ArrayList;
/*
 * 4. Escribe un programa que genere una secuencia de 5 cartas de la baraja española 
 * y que sume los puntos según el juego de la brisca. 
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
 * Tienes 26 puntos
 */
public class Lista_Cartas {

	//ATRIBUTOS
	ArrayList<Carta> lista_cartas = new ArrayList<Carta>();

	//CONSTRUCTOR vacío
	public Lista_Cartas() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Lista_Cartas(ArrayList<Carta> lista_cartas) {
		super();
		this.lista_cartas = lista_cartas;
	}

	//GETTER Y SETTER
	public ArrayList<Carta> getLista_cartas() {
		return lista_cartas;
	}

	public void setLista_cartas(ArrayList<Carta> lista_cartas) {
		this.lista_cartas = lista_cartas;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Cartas [lista_cartas=" + lista_cartas + "]";
	}
	
	
}
