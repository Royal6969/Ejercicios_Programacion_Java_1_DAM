package Ejer_16_Proyecto_Disco;

import java.util.Scanner;

/*
 * 6. ENUNCIADO PROYECTO DISCO
Menú de opciones:
1. Insertar nuevo disco, según su codigo, que es único
2. Listado ordenado según autor
3. Listado agrupado por género, mostrando el número de discos de cada género
4. Listado por duración
5. Eliminar un disco según su código
6. Salir
Clases:
- Disco
- LDisco: insertaDisco, eliminaDisco, listadoAutor, listadoDuracion,listadoGenero.
- PruebaDisco
- GeneroComparator
- DuracionComparator
 */

public class Disco implements Comparable<Disco>{

	//ATRIBUTOS
	private String codDisco;
	private String titulo;
	private String autor;
	private String genero;
	private int duracion;
	
	//CONSTRUCTOR Lleno
	public Disco(String codDisco, String autor, String genero, int duracion) {
		super();
		this.codDisco = codDisco;
		this.autor = autor;
		this.genero = genero;
		this.duracion = duracion;
	}

	//CONSTRUCTOR vacío
	public Disco() {
		super();
	}

	//GETTER Y SETTER
	public String getCodDisco() {
		return codDisco;
	}

	public void setCodDisco(String codDisco) {
		this.codDisco = codDisco;
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
		return "Disco [codDisco=" + codDisco + ", titulo=" + titulo + ", autor=" + autor + ", genero=" + genero
				+ ", duracion=" + duracion + "]";
	}
	
	//METODOS
	public int compareTo(Disco cd) {
		
		return (this.getAutor().compareToIgnoreCase(cd.getAutor()));
	}
	
	public void pedirDatos() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el código");
		this.codDisco = sc.next();
		System.out.println("Introduzca el título");
		this.titulo = sc.next();
		System.out.println("Introduzca el autor");
		this.autor = sc.next();
		System.out.println("Introduzca el género");
		this.genero = sc.next();
		System.out.println("Introduzca la duración");
		this.duracion = sc.nextInt();
	}
}
