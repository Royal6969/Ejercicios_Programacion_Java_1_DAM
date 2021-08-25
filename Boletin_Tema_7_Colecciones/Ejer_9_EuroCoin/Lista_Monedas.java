package Ejer_9_EuroCoin;

import java.util.ArrayList;

/*
 * 9. La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa un
 * botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda anteriormente generada 
 * - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25 céntimos, 50 céntimos, 1 euro o 2 euros 
 * - o bien coincide la posición – cara o cruz. 
 * Simula, mediante un programa, la generación de 6 monedas aleatorias siguiendo la pauta correcta. 
 * Cada moneda generada debe ser una instancia de la clase Moneda 
 * y la secuencia se debe ir almacenando en una lista.
 */

public class Lista_Monedas {

	//ATRIBUTO
	//ArrayList<Elemento> listaElemento=new ArrayList<Elemento> ();
	ArrayList<Moneda> objeto = new ArrayList<Moneda>();

	//CONSTRUCTOR LLENO
	public Lista_Monedas(ArrayList<Moneda> objeto) {
		super();
		this.objeto = objeto;
	}

	//CONSTRUCTOR VACÍO
	public Lista_Monedas() {
		super();
	}

	//GETTER Y SETTER
	public ArrayList<Moneda> getObjeto() {
		return objeto;
	}

	public void setObjeto(ArrayList<Moneda> objeto) {
		this.objeto = objeto;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Monedas [objeto=" + objeto + "]";
	}
	
	//METODOS
	public void generarMoneda() {
		
		//cara o cruz
		String posicion = Moneda.getPos()[(int)(Math.random()*2)];
		//1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25 céntimos, 50 céntimos, 1 euro o 2 euros
		String cantidad = Moneda.getCant()[(int)(Math.random()*8)]; 
		Moneda a = new Moneda(posicion, cantidad);
		this.objeto.add(a);
	}
	public void generarRestoMonedas() {
		
		int numero;
		numero = (int)(Math.random()*2); //con esto me va a salir un 0 o un 1
	
		String cantidad, posicion, posAUX;
		
		if(numero == 0) {
			cantidad = this.objeto.get(this.objeto.size()-1).getCantidad();
			posAUX = this.objeto.get(this.objeto.size()-1).getPosicion();
			
			posicion = Moneda.getPos()[(int)(Math.random()*2)];
			
			while(posicion==posAUX) {
				posicion = Moneda.getPos()[(int)(Math.random()*2)];
			}
			Moneda x = new Moneda(posicion, cantidad);
			
			this.objeto.add(x);
		
		}else {
			posicion = this.objeto.get(this.objeto.size()-1).getPosicion();
			posAUX = this.objeto.get(this.objeto.size()-1).getCantidad();
			
			cantidad = Moneda.getCant()[(int)(Math.random()*8)];
			
			while(cantidad==posAUX) {
				cantidad = Moneda.getCant()[(int)(Math.random()*8)];
			}
			Moneda x = new Moneda(posicion, cantidad);
			
			this.objeto.add(x);
		}
	}
}
