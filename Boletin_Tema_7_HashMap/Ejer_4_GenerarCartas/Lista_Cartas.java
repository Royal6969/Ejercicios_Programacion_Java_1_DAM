package Ejer_4_GenerarCartas;

import java.util.ArrayList;

/*10. Realiza un programa que escoja al azar 10 cartas de la baraja espa�ola (10 objetos de
la clase Carta ). Emplea un objeto de la clase ArrayList para almacenarlas y aseg�rate
de que no se repite ninguna. La clase Carta tendr� los siguientes atributos:
private static String[] n = {"as", "dos", "tres", "cuatro", "cinco",
"seis", "siete", "sota", "caballo", "rey"};
private static String[] p = {"bastos", "copas", "espadas", "oros"};
private String numero;
private String palo;
Y un constructor vac�o, donde se generar� aleatoriamente el valor de
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

	//CONSTRUCTOR VAC�O
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
	
	//M�TODOS
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
