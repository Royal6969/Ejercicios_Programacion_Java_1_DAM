package Ejer_3_MiniDiccionario_AlAzar;

import java.util.HashMap;
import java.util.Iterator;
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
		
		int contador = 0;
		int correctas = 0;
		int incorrectas = 0;
		String respuesta;
		
		//para recorrer un map fijándonos en el valor de la posición ...
		
		for(int i=0; i<5; i++) {
			
			int opcion = (int)(Math.random()*21); //21 palabras

	        Iterator<String> it = diccionario.keySet().iterator();
	        
	        while(it.hasNext()){
	        
	        String obj = it.next();
	        
	        if(contador == opcion) {
	        	System.out.println("¿Cuál es la traducción de "+obj+"?");
	        	respuesta = sc.next();
	        	
	        	if(respuesta.equalsIgnoreCase(diccionario.get(obj))) {
	        		System.out.println("Correcto!!");
	        		correctas ++;
	        	
	        	}else {
	        		System.out.println("Ohh, incorrecto!!");
	        		incorrectas ++;
	        	}
	        }
	        contador++;
	        }
	        contador = 0;
		}
		//////////////////////////////////////////////////////////////////////
		
		System.out.println("Has acertado "+correctas+" y has fallado "+incorrectas);
	}

}
