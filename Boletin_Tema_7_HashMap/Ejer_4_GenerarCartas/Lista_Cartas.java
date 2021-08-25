package Ejer_4_GenerarCartas;

import java.util.ArrayList;

/*10. Realiza un programa que escoja al azar 10 cartas de la baraja española (10 objetos de
la clase Carta ). Emplea un objeto de la clase ArrayList para almacenarlas y asegúrate
de que no se repite ninguna. La clase Carta tendrá los siguientes atributos:
private static String[] n = {"as", "dos", "tres", "cuatro", "cinco",
"seis", "siete", "sota", "caballo", "rey"};
private static String[] p = {"bastos", "copas", "espadas", "oros"};
private String numero;
private String palo;
Y un constructor vacío, donde se generará aleatoriamente el valor de
sus atributos numero y palo.
*/

public class Lista_Cartas {

	//ATRIBUTO
	//ArrayList<Elemento> listaElemento=new ArrayList<Elemento> ();
	ArrayList<Cartas> objeto = new ArrayList<Cartas>();

	//CONSTRUCTOR LLENO
	public Lista_Cartas(ArrayList<Cartas> objeto) {
		super();
		this.objeto = objeto;
	}

	//CONSTRUCTOR VACÍO
	public Lista_Cartas() {
		super();
	}

	//GETTER Y SETTER
	public ArrayList<Cartas> getObjeto() {
		return objeto;
	}

	public void setObjeto(ArrayList<Cartas> objeto) {
		this.objeto = objeto;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Cartas [objeto=" + objeto + "]";
	}
	
	//MÉTODOS
	public void noSeRepitenCartas() {
		boolean repetido = false;
		
		Cartas c;
		
		do {
			repetido=false;
			
			c = new Cartas();
			
			for(int i=0; i<this.objeto.size() && repetido==false; i++) {
				if(this.objeto.get(i).getNumero().equalsIgnoreCase(c.getNumero()) && this.objeto.get(i).getPalo().equalsIgnoreCase(c.getPalo())) {       
					repetido=true;
				}
			}
		
		}while(repetido==true);
		
		this.objeto.add(c);
		
		System.out.println(c);
	}

	
}
