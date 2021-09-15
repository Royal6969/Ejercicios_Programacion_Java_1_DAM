package Ejer_2_Ordenar_ArrayList_Ejer_1;
/*
 * 1. Realiza un programa que introduzca 20 valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el m�ximo y el m�nimo de esos n�meros. 
Crear una clase Entero con un atributo de tipo int
 */
/*
 * 2. Escribe un m�todo que ordene dicha colecci�n de n�meros enteros.
 */
public class Entero implements Comparable<Entero>{

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

	@Override
	public int compareTo(Entero num) {
		// TODO Auto-generated method stub
		return this.getNum() - num.getNum();
		//esto devuelve un 0, <0, >0
	}

	
	
}
