package Ejer_8_Publicacion;

public class Libro extends Publicacion implements Prestable{
	
	//ATRIBUTOS
	private boolean prestado; //no poner T/F hasta llegar al constructor 

	//CONSTRUCTOR Vacío
	public Libro(String título, int añoPublicación) {
		super(título, añoPublicación);
		this.prestado = false; //y aquí le meto el valor a prestado
	}

	//CONSTRUCTOR Lleno .......................................... //Los libros, cuando se crean, no están prestados.
	//public Libro(String título, int añoPublicación, boolean prestado) {
		//super(título, añoPublicación);
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

//esto cuando cuando pongo arriba el "implements x" me salta un fallo y su solución crea todo esto... pero le tengo que añadir cosas
	//pista para hacer estsos métodos... son las 3 caras del boolean!!
	@Override
	public void prestar() {
		// TODO Auto-generated method stub	
		System.out.println("Aquí tiene su libro!");
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
