package Ejer_8_Publicacion;
/*
 * /*
 * 8. Escribe un programa para una biblioteca que contenga libros y revistas.
 Las caracter�sticas comunes que se almacenan tanto para las revistas como para los libros son el
c�digo, el t�tulo, y el a�o de publicaci�n. Estas tres caracter�sticas se pasan por par�metro en el
momento de crear los objetos. El c�digo ser� un identificador de tipo entero, �nico para cada publicaci�n.
Se asignar� autom�ticamente este valor a cada publicaci�n, en el momento de su alta.
 Los libros tienen adem�s un atributo prestado. Los libros, cuando se crean, no est�n prestados.
 Las revistas tienen un n�mero. En el momento de crear. En el momento de crear las revistas se pasa el
n�mero por par�metro. Tanto las revistas como los libros deben tener (aparte de los constructores) un m�todo toString() que
devuelve el valor de todos los atributos en una cadena de caracteres. Tambi�n tienen un m�todo que
devuelve el a�o de publicaci�n, y otro el c�digo.
 Para prevenir posibles cambios en el programa se tiene que implementar una interfaz Prestable con los
m�todos prestar(), devolver() y prestado. La clase Libro implementa esta interfaz
Implementar una superclase Publicacion con tres atributos. Un constructor con los tres atributos. Getters
y setters. ToString() que devuelva estos tres atributos concatenados en forma de cadena. Las clases
Libro y Revista; �dem. Una interfaz Prestable que declara los m�todos indicados sin implementarlos. La
clase Libro los implementa.
Se pide realizar un proyecto que permita realizar las siguientes opciones:
1- ALTA DE REVISTA
2- ALTA DE LIBRO
3- PRESTAR UN LIBRO
4- DEVOLVER UN LIBRO
5- LISTADO COMPLETO
6- LISTADO DE REVISTAS MOSTRANDO N�MERO TOTAL DE REVISTAS
7- LISTADO ORDENADO DE LIBROS MOSTRANDO SI EST� O NO PRESTADO
8- SALIR
 */
public abstract class Publicacion {
	
	//ATRIBUTOS
	private static int ncod = 0; //static hace �nico al atributo
	private int codigo; 
	private String t�tulo;
	private int a�oPublicaci�n;
	
	//CONSTRUCTOR Vac�o 
	//public Publicacion() {
		//super();
	//}

	//CONSTRUCTOR Lleno
	public Publicacion(String t�tulo, int a�oPublicaci�n) {
		super();
		//this.codigo = codigo; //tmb quitar los sets de codigo y ncodigo, y aqu� modificar el constructor lleno
		this.codigo = ncod;  
		ncod++;
		this.t�tulo = t�tulo;
		this.a�oPublicaci�n = a�oPublicaci�n;
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

	public String getT�tulo() {
		return t�tulo;
	}

	public void setT�tulo(String t�tulo) {
		this.t�tulo = t�tulo;
	}

	public int getA�oPublicaci�n() {
		return a�oPublicaci�n;
	}

	public void setA�oPublicaci�n(int a�oPublicaci�n) {
		this.a�oPublicaci�n = a�oPublicaci�n;
	}

	//To String
	@Override
	public String toString() {
		//return "Publicacion [codigo=" + codigo + ", t�tulo=" + t�tulo + ", a�oPublicaci�n=" + a�oPublicaci�n + "]";
		return " codigo=" + codigo + ", t�tulo=" + t�tulo + ", a�oPublicaci�n=" + a�oPublicaci�n + "]";
	}
	
	
}
