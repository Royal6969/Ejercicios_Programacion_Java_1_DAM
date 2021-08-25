package Ejer_17_Sopa_de_Letras_Horizontal;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejer_17_Sopa_de_Letras_Horizontal {
/*
 *  17.- SOPA DE LETRAS: cargar desde un fichero de texto un tablero con 5 palabras escondidas 
 *  entre 8 filas y 8 columnas de caractereres. 
 *  Mostrarla y comenzar el juego, preguntando al usuario por las palabras escondidas; 
 *  el usuario escogerá fila y columna de comienzo de cada palabra 
 *  y el programará verificará si es correcto o no. 
 *  Solo se contempla la horizontalidad.
 */
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

////////////////////////////// guardar fichero en Array & mostrarlo /////////////////////////////////
		FileReader fr;
		
		try {
			fr = new FileReader(args[0]);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			
			String[] sopaLetras = new String[8];
			int contador = 0;
			
			while(linea != null) {		
				sopaLetras[contador] = linea;
				linea = br.readLine();
				contador++; //para que se guarde la linea en su sitio correspondiente
			}
			
			for(int i=0; i<sopaLetras.length; i++) {
				for(int j=0; j<sopaLetras[0].length(); j++) { //para recorrer la columna hasta abajo del todo
					System.out.print(sopaLetras[i].charAt(j)+" "); //sigue a [i] porque esta sopa de letras caza horizontal
				}
				System.out.println();
			}
			
			inicializarJuego(sopaLetras);
////////////////////////////////////////////////////////////////////////////////////////////////
			
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(ex.getMessage());
		}
		
	}

	//MÉTODOS
	public static void inicializarJuego(String[] sopaLetras) {
		
		int chances = 0;
		String[] palabras = {"pera", "uva", "fresa", "kiwi", "sandia"};
		String palabra;
		boolean salir = false;
		int tamaño = 0;
		
		
			try {
				do {
					FileReader fr;
					fr = new FileReader(palabras[0]);
				
					BufferedReader br = new BufferedReader(fr);
					String linea = br.readLine();
					
					System.out.println("Introduzca una palabra encontrada");
					palabra = sc.next();
					
					for(int i=0; i<palabras.length; i++) {
						if(palabras[i].equalsIgnoreCase(palabra)) {
							while(linea != null && salir==false) {
								while((tamaño = linea.indexOf(palabra)) != -1) {
									linea = linea.substring(tamaño+palabra.length());
									salir = true;
								}
							}
						}
					}
					if(salir==true) {
						System.out.println("has encontrado una palabra!!");
					
					}else {
						System.out.println("Has fallado...te quedan "+(3-chances));
					}
				
				}while(chances<3);
				
			} catch (IOException ex) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(ex.getMessage());
			}
			
	}
	
}
