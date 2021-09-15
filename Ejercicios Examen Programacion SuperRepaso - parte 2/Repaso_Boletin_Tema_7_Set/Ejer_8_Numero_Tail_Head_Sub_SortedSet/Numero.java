package Ejer_8_Numero_Tail_Head_Sub_SortedSet;
/*
 * 8. Crear un conjunto ordenado de 10 números enteros (orden natural) y probar los métodos siguientes:
 * a. tailSet
 * b. headSet
 * c. subSet
 */
public class Numero implements Comparable<Numero>{

	//ATRIBUTOS
	private int num;

	public Numero() {
		super();
	}

	public Numero(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Numero [num=" + num + "]";
	}

	@Override
	public int compareTo(Numero num) {
		return this.getNum() - num.getNum();
	}
	
	
}
