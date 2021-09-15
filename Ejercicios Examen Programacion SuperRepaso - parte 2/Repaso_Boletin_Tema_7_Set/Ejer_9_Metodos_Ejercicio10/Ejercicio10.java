package Ejer_9_Metodos_Ejercicio10;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * 9. Implemente una clase llamada Ejercicio10 que tenga los m�todos siguientes:
 * 
 * a. Un m�todo a�adirPalabras que reciba como par�metro un conjunto ordenado 
 * y a�ada cadenas a este conjunto. 
 * Las cadenas se leer�n por teclado y el bucle 
 * estar� controlado por una variable booleana tambi�n le�da por teclado.
 * 
 * b. Un m�todo mostrarSubconjunto que reciba un conjunto ordenado de objetos de la clase String como par�metro 
 * y muestre en la pantalla el subconjunto de cadenas comprendidas entre dos cadenas le�das por el teclado. 
 * Para poder mostrar el subconjunto, la cadena primera tiene que ser menor que la segunda, 
 * si no, se eleva una excepci�n de tipo IllegalArgumentException que se debe capturar.
 * 
 * c. Un m�todo mayoresOigualesQue que reciba un conjunto ordenado de objetos de la clase String como par�metro 
 * y muestre en la pantalla las cadenas del conjunto mayores o iguales a una cadena le�da por el teclado.
 * 
 * d. Un m�todo menoresQue que reciba un conjunto ordenado de objetos de la clase String como par�metro 
 * y muestre en la pantalla las cadenas del conjunto menores estrictamente que una cadena le�da por el teclado.
 * 
 * e. Un m�todo main en el que se cree un conjunto ordenado llamado diccionario 
 * y se prueben los m�todos anteriores. 
 * Adem�s mu�strese en la pantalla el tama�o del diccionario, 
 * la primera y �ltima cadena del diccionario 
 * y el comparador con el que est�n ordenadas las cadenas que forman parte de �l.
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
				A�adirPalabras(palabras);
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
/* a. Un m�todo a�adirPalabras que reciba como par�metro un conjunto ordenado y a�ada cadenas a este conjunto. 
 * Las cadenas se leer�n por teclado y el bucle 
 * estar� controlado por una variable booleana tambi�n le�da por teclado. */
	public static void A�adirPalabras(SortedSet<String> palabras) {
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
/* b. Un m�todo mostrarSubconjunto que reciba un conjunto ordenado de objetos de la clase String como par�metro 
 * y muestre en la pantalla el subconjunto de cadenas comprendidas entre dos cadenas le�das por el teclado. 
 * Para poder mostrar el subconjunto, la cadena primera tiene que ser menor que la segunda, 
 * si no, se eleva una excepci�n de tipo IllegalArgumentException que se debe capturar. */
	public static void mostrarSubconjunto(SortedSet<String> palabras) {
		String palabra1, palabra2;
		System.out.println("Introduzca una palabra del conjunto");
		palabra1 = sc.next();
		System.out.println("Introduzca otra palabra del conjunto");
		palabra2 = sc.next();
		
		//como hay que capturar una excepci�n, aqu� viene un TRY/CATCH como una casa de grande
		//pero OJO, como dice que la palabra1 tiene que ser menos que la palabra2, hay que crear la clase del COMPARATOR antes!!
		try {
			
			if(palabra1.compareToIgnoreCase(palabra2) > 0) { //es decir, que fuesen iguales
				//throw new exception; //aqu� me doy cuenta de que antes debo crear la clase Exception, y la debo crear porque el enunciado dice "que se eleva" y si se eleva, esque vendr� desde otra clase...
				throw new Palabras_Exception();
			}else {
				System.out.println(palabras.subSet(palabra1, palabra2));
			}
		}catch(Palabras_Exception exception) {
			System.out.println(exception.toString());
		}
	}
/* c. Un m�todo mayoresOigualesQue que reciba un conjunto ordenado de objetos de la clase String como par�metro 
 * y muestre en la pantalla las cadenas del conjunto mayores o iguales a una cadena le�da por el teclado. */
	public static void mayoresOigualesQue(SortedSet<String> palabras) {
		String palabra;
		System.out.println("Introduzca una palabra para ver las palabras del conjunto que son mayores que ella");
		palabra = sc.next();
		
		//yo aqu� mi 1� idea fue la de hacer un Iterator para recorrer y mostrar, pero es m�s f�cil buscar las coincidencias...
		if(palabras.contains(palabra)) {
			System.out.println(palabras.tailSet(palabra)); //PISTA: como el conjunto de palabras ya est� ordenado porque es un SortedSet... eso quiere decir que si pongo tailSet(palabra) mostrar� las palabras siguientes hasta el final, las cuales ser�n m�s grandes que la palabra buscada
		}else {
			System.out.println("Esa palabra no se encuentra en el conjunto de palabras");
		}
	}
/* d. Un m�todo menoresQue que reciba un conjunto ordenado de objetos de la clase String como par�metro 
 * y muestre en la pantalla las cadenas del conjunto menores estrictamente que una cadena le�da por el teclado. */
	public static void menoresQue(SortedSet<String> palabras) {
		String palabra;
		System.out.println("Introduzca una palabra para ver las palabras del conjunto que son mayores que ella");
		palabra = sc.next();
		
		//yo aqu� mi 1� idea fue la de hacer un Iterator para recorrer y mostrar, pero es m�s f�cil buscar las coincidencias...
		if(palabras.contains(palabra)) {
			System.out.println(palabras.headSet(palabra)); //PISTA: como el conjunto de palabras ya est� ordenado porque es un SortedSet... eso quiere decir que si pongo headSet(palabra) mostrar� las palabras desde el principio hasta la palabra introducida, las cuales ser�n m�s peque�as que la palabra buscada
		}else {
			System.out.println("Esa palabra no se encuentra en el conjunto de palabras");
		}
	}
/* e. Un m�todo main en el que se cree un conjunto ordenado llamado diccionario 
 * y se prueben los m�todos anteriores. 
 * Adem�s mu�strese en la pantalla el tama�o del diccionario, 
 * la primera y �ltima cadena del diccionario 
 * y el comparador con el que est�n ordenadas las cadenas que forman parte de �l. */
	//probado y hecho en el main
	
	public static void showMenu() {
		System.out.println("Introduzca una opci�n del men�");
		System.out.println("1. m�todo a�adirPalabras");
		System.out.println("2. m�todo mostrarSubconjunto");
		System.out.println("3. m�todo mayoresOigualesQue");
		System.out.println("4. m�todo menoresQue");
		System.out.println("0. Salir");
	}
}
