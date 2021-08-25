package Ejer_19_Lista_Elemento;

import java.util.Scanner;

/*
 * 19. Implementar una lista de Elemento, que funcione como una pila de palabras. 
 * Men� de operaciones: 
 * 
 * insertar un elemento (apilar), 
 * eliminar una palabra (desapilar), 
 * listar. 
 * 
 * El funcionamiento de una pila consiste en insertar y eliminar el elemento que est� en la cima
 */

public class Elemento {

	//ATRIBUTOS
	private int codigo;

	//CONSTRUCTOR Lleno
	public Elemento(int codigo) {
		super();
		this.codigo = codigo;
	}

	//CONSTRUCTOR Vac�o
	public Elemento() {
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
	
	//M�TODOS
	public Elemento darAltaElemento() {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		System.out.println("Introduzca un c�digo para el nuevo elemento");
		codigo = sc.nextInt();
		
		Elemento newElemento = new Elemento(codigo);
		
		return newElemento;
	}
	
}
