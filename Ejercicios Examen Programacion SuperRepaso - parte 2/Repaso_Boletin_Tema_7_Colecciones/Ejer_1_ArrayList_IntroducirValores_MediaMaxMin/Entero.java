package Ejer_1_ArrayList_IntroducirValores_MediaMaxMin;
/*
 * 1. Realiza un programa que introduzca 20 valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos números. 
Crear una clase Entero con un atributo de tipo int
 */
public class Entero {

	//ATRIBUTOS
	private int num;

	//CONSTRUCTOR Vacio
	public Entero() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Entero(int num) {
		super();
		this.num = num;
	}

	//GETTER Y SETTER
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	//To String
	@Override
	public String toString() {
		return "Entero [num=" + num + "]";
	}

	
	
}
