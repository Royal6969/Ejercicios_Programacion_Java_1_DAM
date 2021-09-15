package Ejer_4_JuegoBrisca_GenerarCartas_ContarSumarPuntuacion;
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
public class Carta {

	//ATRIBUTOS
	private String numero;
	private String palo;
	private static String[] n = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
	private static String[] p = {"bastos", "copas", "espadas", "oros"};
	
	//CONSTRUCTOR Vacío
	public Carta() {
		//super();
		this.numero = Carta.getN()[(int)(Math.random()*10)]; //los 10 posibles números/valores 
		this.palo = Carta.getP()[(int)(Math.random()*4)]; //los 4 posibles palos 
	}

	//CONSTRUCTOR Lleno
	public Carta(String numero, String palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}

	//GETTER Y SETTER
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public static String[] getN() {
		return n;
	}

	public static void setN(String[] n) {
		Carta.n = n;
	}

	public static String[] getP() {
		return p;
	}

	public static void setP(String[] p) {
		Carta.p = p;
	}

	//To String
	@Override
	public String toString() {
		return "Carta [numero=" + numero + ", palo=" + palo + "]";
	}
	
}
