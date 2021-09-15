package Ejer_2_Diccionario_Traduccion_InglesEspañol;
import java.util.HashMap;
import java.util.Scanner;
/*
 * 2. Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras (con su correspondiente traducción). 
 * Utiliza un objeto de la clase HashMap para almacenar las parejas de palabras. 
 * El programa pedirá una palabra en español y dará la correspondiente traducción en inglés
 */
public class Prueba_Ejer_2 {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> diccionario = new HashMap<String, String>();
		
		diccionario.put("perro", "dog");
		diccionario.put("gato", "cat");
		diccionario.put("pajaro", "bird");
		diccionario.put("raton", "mouse");
		diccionario.put("elefante", "elephant");
		diccionario.put("silla", "chair");
		diccionario.put("ordenador", "computer");
		diccionario.put("mesa", "table");
		diccionario.put("lapiz", "pencil");
		diccionario.put("teclado", "keyboard");
		
		String palabra;
		System.out.println("Introduzca una palabra para ver su traducción al inglés");
		palabra = sc.next();
		
		if(diccionario.containsKey(palabra)) { //lo 1º es comprobar si la palabra existe en nuestro diccionario
			System.out.println(diccionario.get(palabra));
		
		}else {
			System.out.println("Esta palabra no se encuentra en el diccionario");
		}
		
	}

}
