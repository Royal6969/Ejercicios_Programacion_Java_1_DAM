package Ejer_2_Diccionario_Traduccion_InglesEspa�ol;
import java.util.HashMap;
import java.util.Scanner;
/*
 * 2. Crea un mini-diccionario espa�ol-ingl�s que contenga, al menos, 20 palabras (con su correspondiente traducci�n). 
 * Utiliza un objeto de la clase HashMap para almacenar las parejas de palabras. 
 * El programa pedir� una palabra en espa�ol y dar� la correspondiente traducci�n en ingl�s
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
		System.out.println("Introduzca una palabra para ver su traducci�n al ingl�s");
		palabra = sc.next();
		
		if(diccionario.containsKey(palabra)) { //lo 1� es comprobar si la palabra existe en nuestro diccionario
			System.out.println(diccionario.get(palabra));
		
		}else {
			System.out.println("Esta palabra no se encuentra en el diccionario");
		}
		
	}

}
