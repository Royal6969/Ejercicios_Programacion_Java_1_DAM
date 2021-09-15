package Ejer_14_UnirEnLista_ElementosComunes;
/*
 * 12. Eliminar elementos repetidos de una lista de nodos de tipo Entero.
 */
/*
 * 14. Dadas dos listas de elementos de tipo Entero, obtener una sóla con todos los elementos
que están en ambas sin repetir.
 */
public class Elemento {

	//ATRIBUTOS
	private int num;

	//CONSTRUCTOR Vacio
	public Elemento() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Elemento(int num) {
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
		return "Elemento [num=" + num + "]";
	}
	
	
}
