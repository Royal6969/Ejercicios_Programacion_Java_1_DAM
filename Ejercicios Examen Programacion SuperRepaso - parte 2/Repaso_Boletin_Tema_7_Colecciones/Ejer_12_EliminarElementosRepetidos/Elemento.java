package Ejer_12_EliminarElementosRepetidos;
/*
 * 12. Eliminar elementos repetidos de una lista de nodos de tipo Entero.
 */
public class Elemento {

	//ATRIBUTOS
	private int num;

	//CONSTRUCTOR vacío 
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
