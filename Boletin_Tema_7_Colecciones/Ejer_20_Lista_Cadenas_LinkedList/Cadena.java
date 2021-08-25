package Ejer_20_Lista_Cadenas_LinkedList;

import java.util.Scanner;

/*
 * 20. Implementar una lista de Cadena, que funcione como una cola de palabras. 
 * Menú de operaciones: 
 * 
 * insertar un elemento (encolar), 
 * eliminar una palabra (desencolar), 
 * listar. 
 * 
 * El funcionamiento de una cola consiste en insertar por un extremo de la lista 
 * y eliminar por el otro extremo de la lista.
 */

public class Cadena {

	//ATRIBUTOS
	private int codigo;

	//CONSTRUCTOR Lleno
	public Cadena(int codigo) {
		super();
		this.codigo = codigo;
	}

	//CONSTRUCTOR Vacío
	public Cadena() {
		super();
	}

	//GETTER Y SETTER
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	//To String
	@Override
	public String toString() {
		return "Elemento [codigo=" + codigo + "]";
	}
	
	//MÉTODOS
	public Cadena darAltaCadena() {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		System.out.println("Introduzca un código para la nueva Cadena");
		codigo = sc.nextInt();
		
		Cadena newElemento = new Cadena(codigo);
		
		return newElemento;
	}
}
