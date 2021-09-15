package Ejer_17_SopaDeLetras_Horizontal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/*
 * 17.- SOPA DE LETRAS: cargar desde un fichero de texto 
 * un tablero con 5 palabras escondidas entre 8 filas y 8 columnas de caractereres. 
 * Mostrarla y comenzar el juego, preguntando al usuario por las palabras escondidas; 
 * el usuario escogerá fila y columna de comienzo de cada palabra 
 * y el programará verificará si es correcto o no. 
 * Solo se contempla la horizontalidad.
 */
public class Ejer_17_SopaDeLetras_Horizontal {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] ejer_17_txt) {
		// TODO Auto-generated method stub

		try {
			File sopa = new File(ejer_17_txt[0]); //identificamos el fichero.txt
			FileReader fileReader = new FileReader(sopa); //leemos el fichero
			BufferedReader bufferedReader = new BufferedReader(fileReader); //traduzco el fichero
			String linea = bufferedReader.readLine(); //declaro variable para poder guardar cada linea del fichero	
			String[] sopaDeLetras = new String[8]; //creo un array de string de tamaño [8] porque hay 8 lineas en el fichero
			int posicion = 0; //necesitamos una variable auxiliar para manejar la posicion dentro del array de String
			
			while(linea != null) {
				sopaDeLetras[posicion] = linea; //la posición del array será la línea por la que vaya el while
				linea = bufferedReader.readLine(); //leemos y traducimos la siguiente línea
				posicion ++; //avanzamos hacia la siguiente posicion del array, es decir, hacia la siguiente linea
			}
			for(int i=0; i<sopaDeLetras.length; i++) { //recorremos cada linea del fichero...
				System.out.println(sopaDeLetras[i]+" ");
			}
			//aquí me doy cuenta de que tengo que crear un método para que inicialice el juego y llamarlo aquí
			juegoSopaDeLetras(sopaDeLetras, ejer_17_txt);
			
		} catch (IOException excepcion) {
			System.out.println(excepcion.getMessage());
		}
		
	}
	///////////////////////// MÉTODOS /////////////////////////
	
	public static void juegoSopaDeLetras(String[] sopaDeLetras, String[] ejer_17_txt) {
		int fallos = 0; //declaro un contador para las oportunidades que tiene el jugador
		String[] respuestas = {"perro", "uva", "fresa", "kiwi", "sandia"}; //declaro un array de String con las palabras ocultas de respuesta
		String palabra; //declaro una variable para guardar la respuesta del jugador 
		int posicion = 0;
		
		
			try {
				do {
					FileReader fileReader = new FileReader(ejer_17_txt[0]); //leemos la 1º posicion del array de respuestas
					BufferedReader bufferedReader = new BufferedReader(fileReader); //traducimos esa posición
					String linea = bufferedReader.readLine(); //declaramos una variable para guardar cada linea y la inicializamos para que pueda pasar a la siguiente línea
					
					System.out.println("Introduzca una palabra de la sopa de letras"); 
					palabra = sc.next(); 
					
					boolean salir = false;
					for(int i=0; i<respuestas.length; i++) { //recorremos el array de las respuestas 
						if(respuestas[i].equalsIgnoreCase(palabra)) { //ponemos un filtro por si la respuesta por la que va es igual que la palabra que ha dado el jugador
							while(linea != null && salir == false) { //mientras que la siguiente posición no sea null
								while((posicion = linea.indexOf(palabra)) != -1) {
									linea = linea.substring(posicion + palabra.length());
									salir = true;
								}
							}
						}
					}
					if(salir == true) {
						System.out.println("Has encontrado una palabra");
					}else {
						fallos ++;
						System.out.println("Has fallado... tienes 3 intentos y ya vas por el "+fallos+"º intento");
					}
				}while(fallos<4);
				
			} catch (IOException excepcion) {
				System.out.println(excepcion.getMessage());
			}
		
		
	
	}
}
