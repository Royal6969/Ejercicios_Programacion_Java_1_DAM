package Ejer_11_Carta_OrdenarPorPalo;
/*
 * 10. Realiza un programa que escoja al azar 10 cartas de la baraja española (10 objetos de la clase Carta). 
 * Emplea un objeto de la clase ArrayList para almacenarlas y asegúrate de que no se repite ninguna. 
 * La clase Carta tendrá los siguientes atributos:
 * private static String[] n = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
 * private static String[] p = {"bastos", "copas", "espadas", "oros"};
 * private String numero;
 * private String palo;
 * Y un constructor vacío, donde se generará aleatoriamente el valor de sus atributos numero y palo.
 */
public class Carta implements Comparable<Carta>{

	//ATRIBUTOS
	private static String[] n = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
	private static String[] p = {"bastos", "copas", "espadas", "oros"};
	private String numero;
	private String palo;
	
	//CONSTRUCTOR vacío
	public Carta() {
		//super(); //no hace falta??
		//OJO, cuando me dispongo a hacer esto, no puedo poner el getN... porque aun no tengo los GETTERS generados!!
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

	//To String
	@Override
	public String toString() {
		return "Carta [numero=" + numero + ", palo=" + palo + "]";
	}

	@Override
	public int compareTo(Carta carta) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;
		
		if(this.getPalo() != carta.getPalo()) {
			return (this.getPalo().compareToIgnoreCase(carta.getPalo()));
		
		}else {
			 for(int i=0; i<Carta.getN().length; i++) {
				 //if(this.getNumero().compareToIgnoreCase(Carta.getN()[i])) { no me deja con el compareTo porque no se puede convertir de int a boolean
				 if(this.getNumero().equalsIgnoreCase(Carta.getN()[i])) {
					 num1 = i;
				 
				 }else if(carta.getNumero().equalsIgnoreCase(Carta.getN()[i])) {
					 num2 = i;
				 }
			 }
				return (num1 - num2);
		}
	}
	
}
