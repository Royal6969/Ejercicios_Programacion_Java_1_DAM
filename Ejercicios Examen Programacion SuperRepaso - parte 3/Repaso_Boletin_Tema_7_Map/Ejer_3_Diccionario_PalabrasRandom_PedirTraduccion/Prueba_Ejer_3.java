package Ejer_3_Diccionario_PalabrasRandom_PedirTraduccion;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
/*
 * 3. Realiza un programa que escoja al azar 5 palabras en español del mini diccionario del ejercicio anterior. 
 * El programa irá pidiendo que el usuario teclee la traducción al inglés de cada una de las palabras 
 * y comprobará si son correctas.
 * Al final, el programa deberá mostrar cuántas respuestas son válidas y cuántas erróneas.
 */
public class Prueba_Ejer_3 {
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
		
		//necesitamos un String, un contador de ____, y un par más de contadores para los aciertos y los errores 
		String respuesta;
		int correctas = 0;
		int incorrectas = 0;
		int contador = 0;
		
		for(int i=0; i<5; i++) { //1º un FOR para cuántas rondas vamos a jugar
			int opcion = (int)(Math.random()*10); //porque hay 10 palabras
			
			//ahora hay que recorrer el HashMap con un Iterator!
			Iterator<String> iterator = diccionario.keySet().iterator(); //qué hace el keySet??
			while(iterator.hasNext()) { 
				String palabra = iterator.next();
			
				if(contador == opcion) {
					System.out.println("Cuál es la traducción de "+palabra);
					respuesta = sc.next();
				
					if(respuesta.equalsIgnoreCase(diccionario.get(palabra))) { //si la respuesta es igual a una palabra del diccionario
						System.out.println("Correcto, has acertado !!");
						correctas ++;
					}else {
						System.out.println("Oh no, lo siento, has fallado...");
						incorrectas ++;
					}
				}
				contador ++; //cuenta el nº de vueltas del iterator (caso aleatorio)
			}
			contador = 0;
		}
		System.out.println("Has certado "+correctas+" palabras, pero has has fallado "+incorrectas+" palabras");
	}

}
