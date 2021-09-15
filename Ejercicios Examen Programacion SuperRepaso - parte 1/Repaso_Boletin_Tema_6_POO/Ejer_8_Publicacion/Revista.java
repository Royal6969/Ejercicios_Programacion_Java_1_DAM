package Ejer_8_Publicacion;

public class Revista extends Publicacion{

	//ATRIBUTOS
	private int num;

	//CONSTRUCTOR Vacio
	public Revista(String título, int añoPublicación) {
		super(título, añoPublicación);
	}

	//CONSTRUCTOR lleno
	public Revista(String título, int añoPublicación, int num) {
		super(título, añoPublicación);
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
