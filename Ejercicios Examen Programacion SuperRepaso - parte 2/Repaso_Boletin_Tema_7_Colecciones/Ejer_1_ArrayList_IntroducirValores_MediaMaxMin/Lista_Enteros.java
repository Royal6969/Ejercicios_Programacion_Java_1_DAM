package Ejer_1_ArrayList_IntroducirValores_MediaMaxMin;
import java.util.ArrayList;
/*
 * 1. Realiza un programa que introduzca 20 valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos números. 
Crear una clase Entero con un atributo de tipo int
 */
public class Lista_Enteros {

	//ATRIBUTO
	ArrayList<Entero> lista_enteros = new ArrayList<Entero>();

	//CONSTRUCTOR Vacío
	public Lista_Enteros() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Lista_Enteros(ArrayList<Entero> lista_enteros) {
		super();
		this.lista_enteros = lista_enteros;
	}

	//GETTER Y SETTER
	public ArrayList<Entero> getLista_enteros() {
		return lista_enteros;
	}

	public void setLista_enteros(ArrayList<Entero> lista_enteros) {
		this.lista_enteros = lista_enteros;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Enteros [lista_enteros=" + lista_enteros + "]";
	}
	
	//MÉTODOS
	public int sumar() {
		int suma = 0;
		
		for(int i=0; i<this.getLista_enteros().size(); i++) { //a partir de aquí acostumbramos a usar el this.get para que se obtengan bn los valores aunque el método se llame desde otra clase distinta a ésta
			suma += this.getLista_enteros().get(i).getNum(); //hay que especificar smp lo que se manipula
		}
		
		return suma;
	}
	public double media() {
		double media = 0;
		int suma = 0;
		
		for(int i=0; i<this.getLista_enteros().size(); i++) { //a partir de aquí acostumbramos a usar el this.get para que se obtengan bn los valores aunque el método se llame desde otra clase distinta a ésta
			suma += this.getLista_enteros().get(i).getNum(); //hay que especificar smp lo que se manipula
		}
		media = suma/this.getLista_enteros().size();
		
		return media;
	}
	public void minmax() {
		int min = 999999;
		int max = -999999;
		
		for(int i=0; i<this.getLista_enteros().size(); i++) {
			if(this.getLista_enteros().get(i).getNum() < min) {
				min = this.getLista_enteros().get(i).getNum();
			}
			if(this.getLista_enteros().get(i).getNum() > max) {
				max = this.getLista_enteros().get(i).getNum();
			}
		}
		System.out.println("El mínimo es el "+min+" y el máximo es el "+max);
	}
	
}
