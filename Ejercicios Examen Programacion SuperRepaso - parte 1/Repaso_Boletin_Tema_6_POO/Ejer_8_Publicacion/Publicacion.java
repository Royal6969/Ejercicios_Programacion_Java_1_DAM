package Ejer_8_Publicacion;
/*
 * /*
 * 8. Escribe un programa para una biblioteca que contenga libros y revistas.
 Las características comunes que se almacenan tanto para las revistas como para los libros son el
código, el título, y el año de publicación. Estas tres características se pasan por parámetro en el
momento de crear los objetos. El código será un identificador de tipo entero, único para cada publicación.
Se asignará automáticamente este valor a cada publicación, en el momento de su alta.
 Los libros tienen además un atributo prestado. Los libros, cuando se crean, no están prestados.
 Las revistas tienen un número. En el momento de crear. En el momento de crear las revistas se pasa el
número por parámetro. Tanto las revistas como los libros deben tener (aparte de los constructores) un método toString() que
devuelve el valor de todos los atributos en una cadena de caracteres. También tienen un método que
devuelve el año de publicación, y otro el código.
 Para prevenir posibles cambios en el programa se tiene que implementar una interfaz Prestable con los
métodos prestar(), devolver() y prestado. La clase Libro implementa esta interfaz
Implementar una superclase Publicacion con tres atributos. Un constructor con los tres atributos. Getters
y setters. ToString() que devuelva estos tres atributos concatenados en forma de cadena. Las clases
Libro y Revista; ídem. Una interfaz Prestable que declara los métodos indicados sin implementarlos. La
clase Libro los implementa.
Se pide realizar un proyecto que permita realizar las siguientes opciones:
1- ALTA DE REVISTA
2- ALTA DE LIBRO
3- PRESTAR UN LIBRO
4- DEVOLVER UN LIBRO
5- LISTADO COMPLETO
6- LISTADO DE REVISTAS MOSTRANDO NÚMERO TOTAL DE REVISTAS
7- LISTADO ORDENADO DE LIBROS MOSTRANDO SI ESTÁ O NO PRESTADO
8- SALIR
 */
public abstract class Publicacion {
	
	//ATRIBUTOS
	private static int ncod = 0; //static hace único al atributo
	private int codigo; 
	private String título;
	private int añoPublicación;
	
	//CONSTRUCTOR Vacío 
	//public Publicacion() {
		//super();
	//}

	//CONSTRUCTOR Lleno
	public Publicacion(String título, int añoPublicación) {
		super();
		//this.codigo = codigo; //tmb quitar los sets de codigo y ncodigo, y aquí modificar el constructor lleno
		this.codigo = ncod;  
		ncod++;
		this.título = título;
		this.añoPublicación = añoPublicación;
	}

	//GETTER Y SETTER
	public static int getNcod() {
		return ncod;
	}

	//public static void setNcod(int ncod) {
		//Publicacion.ncod = ncod;
	//}

	public int getCodigo() {
		return codigo;
	}

	//public void setCodigo(int codigo) {
		//this.codigo = codigo;
	//}

	public String getTítulo() {
		return título;
	}

	public void setTítulo(String título) {
		this.título = título;
	}

	public int getAñoPublicación() {
		return añoPublicación;
	}

	public void setAñoPublicación(int añoPublicación) {
		this.añoPublicación = añoPublicación;
	}

	//To String
	@Override
	public String toString() {
		//return "Publicacion [codigo=" + codigo + ", título=" + título + ", añoPublicación=" + añoPublicación + "]";
		return " codigo=" + codigo + ", título=" + título + ", añoPublicación=" + añoPublicación + "]";
	}
	
	
}
