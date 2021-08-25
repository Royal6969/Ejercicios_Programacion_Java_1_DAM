package Ejer_11_OrdenarCartas;

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

public class Cartas implements Comparable<Cartas>{

	//ATRIBUTOS
	private static String[] n = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
	private static String[] p = {"bastos", "copas", "espadas", "oros"};
	private String numero;
	private String palo;
	
	//CONSTRUCTOR LLENO
	public Cartas(String numero, String palo) {
		//super(); no me hace falta
		this.numero = numero;
		this.palo = palo;
	}
	
	//CONSTRUCTOR VACÍO
	public Cartas() {
		//super(); no me hace falta
		this.numero = Cartas.getN() [(int)(Math.random()*10)];
		this.palo = Cartas.getP() [(int)(Math.random()*4)]; 
		
	}

	//GETTER Y SETTER
	public static String[] getN() {
		return n;
	}

	public static void setN(String[] n) {
		Cartas.n = n;
	}

	public static String[] getP() {
		return p;
	}

	public static void setP(String[] p) {
		Cartas.p = p;
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
		return "Cartas [numero=" + numero + ", palo=" + palo + "]";
	}
	
	//MÉTODOS
	public int compareTo(Cartas c) {
		
		int num1=0;
        int num2=0;
        
        if(this.getPalo() != c.getPalo()) {
        	
        	return (this.getPalo().compareToIgnoreCase(c.getPalo()));
        	
        }else {
            
        	for(int i=0; i<Cartas.getN().length; i++) {
        		
                if(this.getNumero().equalsIgnoreCase(Cartas.getN()[i])) {
                	
                    num1 = i;
                
                } if(c.getNumero().equalsIgnoreCase(Cartas.getN()[i])) {
                    
                	num2 = i;
                }
            }
            return (num1-num2);
        }
	}
}
