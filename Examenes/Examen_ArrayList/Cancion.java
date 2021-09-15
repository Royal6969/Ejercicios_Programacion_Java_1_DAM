package Examen_ArrayList;

import java.util.Scanner;

public class Cancion implements iCancion{

	//ATRIBUTOS
	private String nombre;
	private String interprete;
	private Genero genero; //aqui me doy cuenta de que tengo que crear la clase genero que es una clase enum
	private Duracion duracion;
	private int a�o;
	private int calificacion;
	private double precio;
	
	//CONSTRUCTOR Vac�o
	public Cancion() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Cancion(String nombre, String interprete, Genero genero, Duracion duracion, int a�o, int calificacion,
			double precio) throws Excepcion_Nombre {
		super();
		if(nombre == null) {
			throw new Excepcion_Nombre();
		}
		this.nombre = nombre;
		this.interprete = interprete;
		this.genero = genero;
		this.duracion = duracion;
		this.a�o = a�o;
		this.calificacion = calificacion;
		this.precio = precio;
	}

	//GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getInterprete() {
		return interprete;
	}

	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Duracion getDuracion() {
		return duracion;
	}

	public void setDuracion(Duracion duracion) {
		this.duracion = duracion;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	//To String
	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", interprete=" + interprete + ", genero=" + genero + ", duracion="
				+ duracion + ", a�o=" + a�o + ", calificacion=" + calificacion + ", precio=" + precio + "]";
	}
	
	//CompareTo
	@Override
	public int compareTo(Cancion cancion) {
		return this.getInterprete().compareToIgnoreCase(cancion.getInterprete());
	}
	
	//M�TODOS
	public Cancion pedirDatos() throws Excepcion_Nombre{
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el nombre de la canci�n");
		this.nombre = sc.next();
		System.out.println("Introduzca el int�rprete de la canci�n");
		this.interprete = sc.next();
		System.out.println("Introduzca el g�nero de la canci�n");
		int opcion1;
		System.out.println("Seleccione el g�nero de la canci�n");
		System.out.println("1. Rock");
		System.out.println("2. Jazz");
		System.out.println("3. Pop");
		System.out.println("4. Reggaeton");
		System.out.println("5. Trap");
		opcion1 = sc.nextInt();
		switch(opcion1) {
		case 1:
			this.genero = genero.rock;
			break;
		case 2:
			this.genero = genero.jazz;
			break;
		case 3:
			this.genero = genero.pop;
			break;
		case 4:
			this.genero = genero.reggaeton;
			break;
		case 5:
			this.genero = genero.trap;
			break;
		default:
			System.out.println("Eso no er< una opcion de g�nero...");
			break;
		}
		int opcion2;
		System.out.println("Seleccione una duraci�n para la canci�n");
		System.out.println("1. Long Play");
		System.out.println("2. Extended Play");
		System.out.println("3. Single Play");
		opcion2 = sc.nextInt();
		switch(opcion2) {
		case 1:
			this.duracion = duracion.lp;
			break;
		case 2:
			this.duracion = duracion.ep;
			break;
		case 3:
			this.duracion = duracion.single;
			break;
		default:
			System.out.println("Eso no era una opcion de duraci�n...");
			break;
		}
		System.out.println("Introduzca el a�o de la canci�n");
		a�o = sc.nextInt();
		System.out.println("Introduzca la calificaci�n de la canci�n");
		calificacion = sc.nextInt();
		System.out.println("Introduzca el precio de la canci�n");
		precio = sc.nextDouble();
		
		Cancion cancion = new Cancion(nombre, interprete, genero, duracion, a�o, calificacion, precio);
		return cancion;
	}

	//redefinir el equals
	public boolean equals(Cancion cancion) {
		boolean sonIguales = false;
		
		if(this.getNombre().equalsIgnoreCase(cancion.getNombre())
				&&	this.getInterprete().equalsIgnoreCase(cancion.getInterprete())) 
		{
			sonIguales = true;
		}
		
		return sonIguales;
	}

	
	
	
}
