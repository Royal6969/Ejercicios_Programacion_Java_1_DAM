package Ejer_8_Publicacion;

public class Revista extends Publicacion{

	//ATRIBUTOS
	private int num;

	//CONSTRUCTOR Vacio
	public Revista(String t�tulo, int a�oPublicaci�n) {
		super(t�tulo, a�oPublicaci�n);
	}

	//CONSTRUCTOR lleno
	public Revista(String t�tulo, int a�oPublicaci�n, int num) {
		super(t�tulo, a�oPublicaci�n);
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
		return "Revista [num=" + num + " "+super.toString(); //OJO, quitar el corchete y poner el super.ToString;
	}
	
	
	
}
