package Ejer_6_EstaOrdenada_Ejer2_v4;

import java.util.Scanner;

public class Prueba_Ejer_6 {

	/*
	 * 6. Construye un m�todo estaOrdenada que dada una lista como par�metro de entrada, 
	 * devuelva verdadero si la lista est� en orden y falso si la lista est� desordenada.
	 *
	 * 5. Construye un m�todo insertaEnOrden, que a�ade a una lista ordenada pasada como par�metro, 
	 * un nuevo elemento, que tambi�n se pasa como par�metro. 
	 * De forma que la lista siga estando ordenada.
	 *
	 * 4. Construye un m�todo calculaInversa que devuelva invertida una lista pasada como par�metro. 
	 * A�ade esta opci�n al ejercicio 3.
	 * 
	 * 3. Realiza un programa equivalente al ejercicio 1 pero en esta ocasi�n, 
	 * el programa debe manipular palabras en lugar de n�meros. 
	 * A�adir la opci�n de ordenar
	 *
	 * Ejer 1:
	 * Realiza un programa que introduzca 20 valores aleatorios (entre 0 y 100) en un ArrayList 
	 * y que luego calcule la suma, la media, el m�ximo y el m�nimo de esos n�meros. 
	 */

static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista_Palabras_v4 palabras = new Lista_Palabras_v4();
		String word;
		
		for(int i=0; i<4; i++) { //voy a pedir 4 palabras para tmp hacer demasiado tedioso las pruebas (play)
			System.out.println((i+1)+" Introduzca una palabra");
			word = sc.next();
			palabras.getObjeto().add(new Palabras_v4(word));
		}
		System.out.println();
		
		//para mostrar
		for(int i=0; i<palabras.getObjeto().size(); i++) {
			System.out.print(palabras.getObjeto().get(i).getPalabra()+" ");
		}
		System.out.println();
		
		palabras.ordenarPalabras();
		
		//para mostrar ahora el resultado de haber ordenado las palabras
		for(int i=0; i<palabras.getObjeto().size(); i++) {
			System.out.print(palabras.getObjeto().get(i).getPalabra()+" ");
		}
		System.out.println();
		
		//para mostrar ahora el resultado AL REV�S
		palabras.calculaInversa();
		
		System.out.println("Introduce la palabra que quieres insertar en el Array List");
		word = sc.next();
		palabras.insertarEnOrden(word);
		
		if(palabras.estaOrdenada()) {
			System.out.println("El Array List est� ordenado");
		
		}else {
			System.out.println("El Array List est� DESORDENADO");
		}
	}

}
