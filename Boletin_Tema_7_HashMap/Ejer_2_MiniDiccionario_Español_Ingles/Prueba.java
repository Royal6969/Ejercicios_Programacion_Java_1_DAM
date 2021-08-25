package Ejer_2_MiniDiccionario_Español_Ingles;

import java.util.HashMap;
import java.util.Scanner;

public class Prueba {

static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> diccionario = new HashMap<String, String>();
		
		diccionario.put("hola", "hello");
		diccionario.put("perro", "dog");
		diccionario.put("gato", "cat");
		diccionario.put("antes", "before");
		diccionario.put("que", "what");
		diccionario.put("pantalla", "screen");
		diccionario.put("teclado", "keyboard");
		diccionario.put("raton", "mouse");
		diccionario.put("mochila", "bag");
		diccionario.put("puerta", "door");
		diccionario.put("clase", "class");
		diccionario.put("coche", "car");
		diccionario.put("pantalones", "trousers");
		diccionario.put("sombrero", "hat");
		diccionario.put("escaleras", "stairs");
		diccionario.put("mesa", "table");
		diccionario.put("silla", "chair");
		diccionario.put("hermano", "brother");
		diccionario.put("hermana", "sister");
		diccionario.put("padre", "father");
		diccionario.put("madre", "mother");
		
		String palabra;
		System.out.println("Introduzca una palabra");
		palabra = sc.next();
		
		if(diccionario.containsKey(palabra)) {
			System.out.println(diccionario.get(palabra));
		
		}else {
			System.out.println("Esta palabra no está en el diccionario");
		}
		
	}

}
