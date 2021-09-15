package Ejer_16_Proyecto_Disco;

import java.util.Scanner;

/*
 * 16. ENUNCIADO PROYECTO DISCO
 * Menú de opciones:
 * 1. Insertar nuevo disco, según su codigo, que es único
 * 2. Listado ordenado según autor
 * 3. Listado agrupado por género, mostrando el número de discos de cada género
 * 4. Listado por duración
 * 5. Eliminar un disco según su código
 * 6. Salir
 * 
 * Clases:
 * Disco
 * LDisco: insertaDisco, eliminaDisco, listadoAutor, listadoDuracion,listadoGenero.
 * PruebaDisco
 * GeneroComparator
 * DuracionComparator
 */
public class Disco implements Comparable<Disco>{

	//ATRIBUTOS
	//los podemos sacar a través del posterior menú de opciones y sus métodos
	private String codigo; //mejor poner el codigo en String
	private String titulo; //este si hay que deducirlo por lógica e intuición... todo disco tiene un título...
	private String autor;
	private String genero;
	private int duracion;
	
	//CONSTRUCTOR Vacío
	public Disco() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Disco(String codigo, String titulo, String autor, String genero, int duracion) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.duracion = duracion;
	}

	//GETTER Y SETTER
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	//To String
	@Override
	public String toString() {
		return "Disco [codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", genero=" + genero
				+ ", duracion=" + duracion + "]";
	}

	
	//MÉTODOS
	//cuando creamos un nuevo objeto, del cual tenemos que pedir los datos al usuario, ese "pedirDatos", lo creamos ese método en la clase original del objeto
	public void pedirDatosDisco() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el código del disco");
		this.codigo = sc.next();
		System.out.println("Introduzca el título del disco");
		this.titulo = sc.next();
		System.out.println("Introduzca el autor del disco");
		this.autor = sc.next();
		System.out.println("Introduzca el género del disco");
		this.genero = sc.next();
		System.out.println("Introduzca la duración del disco");
		this.duracion = sc.nextInt();
	}

	//2. Listado ordenado según autor
	//CompareTo
	@Override
	public int compareTo(Disco disco) {
		return this.getAutor().compareToIgnoreCase(disco.getAutor());
	}
	
}
