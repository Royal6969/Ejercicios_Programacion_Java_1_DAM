package Ejer_11_Carta_OrdenarPorPalo;
/*
 * 10. Realiza un programa que escoja al azar 10 cartas de la baraja espa�ola (10 objetos de la clase Carta). 
 * Emplea un objeto de la clase ArrayList para almacenarlas y aseg�rate de que no se repite ninguna. 
 * La clase Carta tendr� los siguientes atributos:
 * private static String[] n = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
 * private static String[] p = {"bastos", "copas", "espadas", "oros"};
 * private String numero;
 * private String palo;
 * Y un constructor vac�o, donde se generar� aleatoriamente el valor de sus atributos numero y palo.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Lista_Cartas {

	//ATRIBUTOS
	ArrayList<Carta> lista_cartas = new ArrayList<Carta>();

	//CONSTRUCTOR vac�o
	public Lista_Cartas() {
		super();
	}

	//CONSTRUCTOR lleno
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

	//M�TODOS
	public void noSeRepiteNinguna() {
		boolean repetido = false;
		Carta carta;
		do {
			carta = new Carta(); //creamos un objeto carta de la clase Carta
			repetido = false; //entra con el boolean como se devclar�
			
			for(int i=0; i<this.getLista_cartas().size() && repetido == false; i++) {
				if(this.getLista_cartas().get(i).getNumero().equalsIgnoreCase(carta.getNumero()) && this.getLista_cartas().get(i).getPalo().equalsIgnoreCase(carta.getPalo())) {
					repetido = true;
				}
			}
			
		}while(repetido == true);
		
		this.getLista_cartas().add(carta);
		System.out.println(carta);
	}
	//ordenar
	public void ordenarCartas() {
		Collections.sort(this.getLista_cartas());
	}
	
	//imprimir
	public void imprimir() {
		for(int i=0; i<this.getLista_cartas().size(); i++) {
			System.out.println(this.getLista_cartas().get(i)+"\t");
		}
	}
	
}
