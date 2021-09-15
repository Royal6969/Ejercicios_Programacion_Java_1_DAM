package Examen_ArrayList;

import java.util.Scanner;

public class Cancion implements iCancion{

	//ATRIBUTOS
	private String nombre;
	private String interprete;
	private Genero genero; //aqui me doy cuenta de que tengo que crear la clase genero que es una clase enum
	private Duracion duracion;
	private int año;
	private int calificacion;
	private double precio;
	
	//CONSTRUCTOR Vacío
	public Cancion() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Cancion(String nombre, String interprete, Genero genero, Duracion duracion, int año, int calificacion,
			double precio) throws Excepcion_Nombre {
		super();
		if(nombre == null) {
			throw new Excepcion_Nombre();
		}
		this.nombre = nombre;
		this.interprete = interprete;
		this.genero = genero;
		this.duracion = duracion;
		this.año = año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
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
				+ duracion + ", año=" + año + ", calificacion=" + calificacion + ", precio=" + precio + "]";
	}
	
	//CompareTo
	@Override
	public int compareTo(Cancion cancion) {
		return this.getInterprete().compareToIgnoreCase(cancion.getInterprete());
	}
	
	//MÉTODOS
	public Cancion pedirDatos() throws Excepcion_Nombre{
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el nombre de la canción");
		this.nombre = sc.next();
		System.out.println("Introduzca el intérprete de la canción");
		this.interprete = sc.next();
		System.out.println("Introduzca el género de la canción");
		int opcion1;
		System.out.println("Seleccione el género de la canción");
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
			System.out.println("Eso no er< una opcion de género...");
			break;
		}
		int opcion2;
		System.out.println("Seleccione una duración para la canción");
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
			System.out.println("Eso no era una opcion de duración...");
			break;
		}
		System.out.println("Introduzca el año de la canción");
		año = sc.nextInt();
		System.out.println("Introduzca la calificación de la canción");
		calificacion = sc.nextInt();
		System.out.println("Introduzca el precio de la canción");
		precio = sc.nextDouble();
		
		Cancion cancion = new Cancion(nombre, interprete, genero, duracion, año, calificacion, precio);
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
