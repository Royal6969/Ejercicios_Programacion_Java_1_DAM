package Ejer_8_Publicacion;

public class Libro extends Publicacion implements Prestable{
	
	//ATRIBUTOS
	private boolean prestado; //no poner T/F hasta llegar al constructor 

	//CONSTRUCTOR Vac�o
	public Libro(String t�tulo, int a�oPublicaci�n) {
		super(t�tulo, a�oPublicaci�n);
		this.prestado = false; //y aqu� le meto el valor a prestado
	}

	//CONSTRUCTOR Lleno .......................................... //Los libros, cuando se crean, no est�n prestados.
	//public Libro(String t�tulo, int a�oPublicaci�n, boolean prestado) {
		//super(t�tulo, a�oPublicaci�n);
		//this.prestado = prestado;
	//}
	
	//GETTER Y SETTER
	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	//To String
	@Override
	public String toString() {
		if(prestado) {
			return "Libro [prestado "+super.toString(); //OJO, quitar el corchete y poner el super.ToString;
		}else {
			return "Libro [NO prestado "+super.toString(); //OJO, quitar el corchete y poner el super.ToString;
		}
	}

//esto cuando cuando pongo arriba el "implements x" me salta un fallo y su soluci�n crea todo esto... pero le tengo que a�adir cosas
	//pista para hacer estsos m�todos... son las 3 caras del boolean!!
	@Override
	public void prestar() {
		// TODO Auto-generated method stub	
		System.out.println("Aqu� tiene su libro!");
		this.setPrestado(true);
	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		System.out.println("Gracias por devolver el libro");
		this.setPrestado(false);
	}

	@Override
	public void prestado() {
		// TODO Auto-generated method stub
		System.out.println("Este libro ya se encuentra prestado a alguien");
	}

	

	
	
}
