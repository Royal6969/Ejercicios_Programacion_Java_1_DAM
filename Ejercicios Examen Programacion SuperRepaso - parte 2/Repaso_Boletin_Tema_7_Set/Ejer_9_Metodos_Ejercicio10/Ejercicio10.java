package Ejer_9_Metodos_Ejercicio10;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * 9. Implemente una clase llamada Ejercicio10 que tenga los métodos siguientes:
 * 
 * a. Un método añadirPalabras que reciba como parámetro un conjunto ordenado 
 * y añada cadenas a este conjunto. 
 * Las cadenas se leerán por teclado y el bucle 
 * estará controlado por una variable booleana también leída por teclado.
 * 
 * b. Un método mostrarSubconjunto que reciba un conjunto ordenado de objetos de la clase String como parámetro 
 * y muestre en la pantalla el subconjunto de cadenas comprendidas entre dos cadenas leídas por el teclado. 
 * Para poder mostrar el subconjunto, la cadena primera tiene que ser menor que la segunda, 
 * si no, se eleva una excepción de tipo IllegalArgumentException que se debe capturar.
 * 
 * c. Un método mayoresOigualesQue que reciba un conjunto ordenado de objetos de la clase String como parámetro 
 * y muestre en la pantalla las cadenas del conjunto mayores o iguales a una cadena leída por el teclado.
 * 
 * d. Un método menoresQue que reciba un conjunto ordenado de objetos de la clase String como parámetro 
 * y muestre en la pantalla las cadenas del conjunto menores estrictamente que una cadena leída por el teclado.
 * 
 * e. Un método main en el que se cree un conjunto ordenado llamado diccionario 
 * y se prueben los métodos anteriores. 
 * Además muéstrese en la pantalla el tamaño del diccionario, 
 * la primera y última cadena del diccionario 
 * y el comparador con el que están ordenadas las cadenas que forman parte de él.
 */
public class Ejercicio10 {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortedSet<String> palabras = new TreeSet<String>();
		int opcion;
		
		do {
			showMenu();
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				AñadirPalabras(palabras);
				break;
			
			case 2:
				mostrarSubconjunto(palabras);
				break;
				
			case 3:
				mayoresOigualesQue(palabras);
				break;
			
			case 4:
				menoresQue(palabras);
				break;
				
			case 0:
				System.out.println("Gracias y hasta luego");
				break;
			}
			
		}while(opcion!=0);
	}
/* a. Un método añadirPalabras que reciba como parámetro un conjunto ordenado y añada cadenas a este conjunto. 
 * Las cadenas se leerán por teclado y el bucle 
 * estará controlado por una variable booleana también leída por teclado. */
	public static void AñadirPalabras(SortedSet<String> palabras) {
		String palabra;
		boolean salir = false;
		
		do {
			System.out.println("Introduzca una palabra (escriba [no] para salir)");
			palabra = sc.next();
			
			if(palabra.equalsIgnoreCase("no")) {
				salir = true;
			}else {
				palabras.add(palabra);
			}
		}while(salir==false);
	}
/* b. Un método mostrarSubconjunto que reciba un conjunto ordenado de objetos de la clase String como parámetro 
 * y muestre en la pantalla el subconjunto de cadenas comprendidas entre dos cadenas leídas por el teclado. 
 * Para poder mostrar el subconjunto, la cadena primera tiene que ser menor que la segunda, 
 * si no, se eleva una excepción de tipo IllegalArgumentException que se debe capturar. */
	public static void mostrarSubconjunto(SortedSet<String> palabras) {
		String palabra1, palabra2;
		System.out.println("Introduzca una palabra del conjunto");
		palabra1 = sc.next();
		System.out.println("Introduzca otra palabra del conjunto");
		palabra2 = sc.next();
		
		//como hay que capturar una excepción, aquí viene un TRY/CATCH como una casa de grande
		//pero OJO, como dice que la palabra1 tiene que ser menos que la palabra2, hay que crear la clase del COMPARATOR antes!!
		try {
			
			if(palabra1.compareToIgnoreCase(palabra2) > 0) { //es decir, que fuesen iguales
				//throw new exception; //aquí me doy cuenta de que antes debo crear la clase Exception, y la debo crear porque el enunciado dice "que se eleva" y si se eleva, esque vendrá desde otra clase...
				throw new Palabras_Exception();
			}else {
				System.out.println(palabras.subSet(palabra1, palabra2));
			}
		}catch(Palabras_Exception exception) {
			System.out.println(exception.toString());
		}
	}
/* c. Un método mayoresOigualesQue que reciba un conjunto ordenado de objetos de la clase String como parámetro 
 * y muestre en la pantalla las cadenas del conjunto mayores o iguales a una cadena leída por el teclado. */
	public static void mayoresOigualesQue(SortedSet<String> palabras) {
		String palabra;
		System.out.println("Introduzca una palabra para ver las palabras del conjunto que son mayores que ella");
		palabra = sc.next();
		
		//yo aquí mi 1º idea fue la de hacer un Iterator para recorrer y mostrar, pero es más fácil buscar las coincidencias...
		if(palabras.contains(palabra)) {
			System.out.println(palabras.tailSet(palabra)); //PISTA: como el conjunto de palabras ya está ordenado porque es un SortedSet... eso quiere decir que si pongo tailSet(palabra) mostrará las palabras siguientes hasta el final, las cuales serán más grandes que la palabra buscada
		}else {
			System.out.println("Esa palabra no se encuentra en el conjunto de palabras");
		}
	}
/* d. Un método menoresQue que reciba un conjunto ordenado de objetos de la clase String como parámetro 
 * y muestre en la pantalla las cadenas del conjunto menores estrictamente que una cadena leída por el teclado. */
	public static void menoresQue(SortedSet<String> palabras) {
		String palabra;
		System.out.println("Introduzca una palabra para ver las palabras del conjunto que son mayores que ella");
		palabra = sc.next();
		
		//yo aquí mi 1º idea fue la de hacer un Iterator para recorrer y mostrar, pero es más fácil buscar las coincidencias...
		if(palabras.contains(palabra)) {
			System.out.println(palabras.headSet(palabra)); //PISTA: como el conjunto de palabras ya está ordenado porque es un SortedSet... eso quiere decir que si pongo headSet(palabra) mostrará las palabras desde el principio hasta la palabra introducida, las cuales serán más pequeñas que la palabra buscada
		}else {
			System.out.println("Esa palabra no se encuentra en el conjunto de palabras");
		}
	}
/* e. Un método main en el que se cree un conjunto ordenado llamado diccionario 
 * y se prueben los métodos anteriores. 
 * Además muéstrese en la pantalla el tamaño del diccionario, 
 * la primera y última cadena del diccionario 
 * y el comparador con el que están ordenadas las cadenas que forman parte de él. */
	//probado y hecho en el main
	
	public static void showMenu() {
		System.out.println("Introduzca una opción del menú");
		System.out.println("1. método añadirPalabras");
		System.out.println("2. método mostrarSubconjunto");
		System.out.println("3. método mayoresOigualesQue");
		System.out.println("4. método menoresQue");
		System.out.println("0. Salir");
	}
}
