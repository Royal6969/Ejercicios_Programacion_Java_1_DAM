package Ejer_9_EuroCoin;
/*
 * 9. La máquina Eurocoin genera una moneda de curso legal 
cada vez que se pulsa un botón siguiendo la siguiente pauta: 
o bien coincide el valor con la moneda anteriormente generada 
- 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25 céntimos, 50 céntimos, 1 euro o 2 euros 
- o bien coincide la posición – cara o cruz. 
Simula, mediante un programa, la generación de 6 monedas aleatorias siguiendo la pauta correcta. 
Cada moneda generada debe ser una instancia de la clase Moneda 
y la secuencia se debe ir almacenando en una lista.
Ejemplo:
2 céntimos – cara
2 céntimos – cruz
50 céntimos – cruz
1 euro – cruz
1 euro – cara
10 céntimos – cara
 */

import java.util.ArrayList;

public class Lista_Monedas {

	//ATRIBUTOS
	ArrayList<Moneda> lista_monedas = new ArrayList<Moneda>();

	//CONSTRUCTOR Vacío
	public Lista_Monedas() {
		super();
	}

	//CONSTRUCTOR lleno
	public Lista_Monedas(ArrayList<Moneda> lista_monedas) {
		super();
		this.lista_monedas = lista_monedas;
	}

	//GETTER Y SETTER
	public ArrayList<Moneda> getLista_monedas() {
		return lista_monedas;
	}

	public void setLista_monedas(ArrayList<Moneda> lista_monedas) {
		this.lista_monedas = lista_monedas;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Monedas [lista_monedas=" + lista_monedas + "]";
	}
	
	//MÉTODOS
	public void generarMoneda(){
		//generar cara o cruz
		String lado;
		lado = Moneda.getLado()[(int)(Math.random()*2)];
		
		//generar valores
		String valor;
		valor = Moneda.getValor()[(int)(Math.random()*8)];
		
		this.getLista_monedas().add(new Moneda(lado, valor));
	}
	public void generarRestoMonedas() {
		int num;
		num = (int)(Math.random()*2); //esto me va a generar un num de entre 0-1
		
		String valor = null; 
		String lado = null; 
		String aux = null;
		
		if(num == 0) { //no entiendo a partir de aqui todo este IF/ELSE
			valor = this.getLista_monedas().get(this.getLista_monedas().size()-1).getCantidad();
			aux = this.getLista_monedas().get(this.getLista_monedas().size()-1).getPosicion();
			
			lado = Moneda.getLado()[(int)(Math.random()*2)];
			
			while(lado == aux) {
				lado = Moneda.getLado()[(int)(Math.random()*2)];
			}
			
			Moneda moneda = new Moneda(valor, lado);
			this.getLista_monedas().add(moneda);
		
		}else {
			valor = this.getLista_monedas().get(this.getLista_monedas().size()-1).getCantidad();
			aux = this.getLista_monedas().get(this.getLista_monedas().size()-1).getPosicion();
			
			valor = Moneda.getValor()[(int)(Math.random()*8)];
			
			while(valor == aux) {
				valor = Moneda.getValor()[(int)(Math.random()*8)];
			}
			
			Moneda moneda = new Moneda(valor, lado);
			this.getLista_monedas().add(moneda);
		}
	}
	
}
