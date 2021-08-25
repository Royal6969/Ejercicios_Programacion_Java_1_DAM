package Ejer_1_AleatoriosSumaMediaMaxMin;

public class Numeros {

	//ATRIBUTOS
	private int num;

	//CONSTRUCTOR
	public Numeros(int num) {
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

	//TO String
	@Override
	public String toString() {
		return "Numeros [num=" + num + "]";
	}
	
	
}
