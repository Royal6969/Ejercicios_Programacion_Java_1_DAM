package Ejer_16_Proyecto_Disco;

import java.util.Scanner;

/*
 * 6. ENUNCIADO PROYECTO DISCO
Men� de opciones:
1. Insertar nuevo disco, seg�n su codigo, que es �nico
2. Listado ordenado seg�n autor
3. Listado agrupado por g�nero, mostrando el n�mero de discos de cada g�nero
4. Listado por duraci�n
5. Eliminar un disco seg�n su c�digo
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

	//CONSTRUCTOR vac�o
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
		
		System.out.println("Introduzca el c�digo");
		this.codDisco = sc.next();
		System.out.println("Introduzca el t�tulo");
		this.titulo = sc.next();
		System.out.println("Introduzca el autor");
		this.autor = sc.next();
		System.out.println("Introduzca el g�nero");
		this.genero = sc.next();
		System.out.println("Introduzca la duraci�n");
		this.duracion = sc.nextInt();
	}
}
