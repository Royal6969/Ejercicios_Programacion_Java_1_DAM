package Ejer_4_Mezcla.txt_2FlujosLectura_1FlujoEscritura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 *  4. Dados dos flujos de lectura y uno de escritura. 
 *  Observa que se declaran en total tres manejadores de fichero (dos para lectura y uno para escritura). 
 *  El programa va leyendo, de forma alterna, una línea de cada fichero 
 *  - una línea de fichero1.txt y otra línea de fichero2.txt 
 *  - mientras queden líneas por leer en alguno de los ficheros; 
 *  y al mismo tiempo va guardando esas líneas en otro fichero con nombre mezcla.txt 
 */
public class Ejer_4_Mezcla_txt_v2 {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//1º vamos a generar automaticamente el archivo "mezcla_v2.txt"
			FileWriter fileWriter = new FileWriter("mezcla_v2.txt", false);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			String linea;
			
			//2º vamos a crear manualmente en el workspace los fichero1.txt y fichero2.txt y meteremos 4 frases dentro de cada uno
			//para el fichero1.txt
			File fichero1 = new File("fichero1.txt"); //identifica al archivo
			FileReader fileReader1 = new FileReader(fichero1); //lee el archivo
			BufferedReader bufferedReader1 = new BufferedReader(fileReader1); //traduce el archivo
			String linea1 = bufferedReader1.readLine(); //declaramos la linea que se va a ir leyendo del archivo y la inicializamos
			
			//para el fichero2.txt
			File fichero2 = new File("fichero2.txt");
			FileReader fileReader2 = new FileReader(fichero2);
			BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
			String linea2 = bufferedReader2.readLine();
			
			//3º hacer el while y la funcionalidad del programa en sí
			while(linea1 != null || linea2 != null) { //mientras sea distinto de null ...
				System.out.println(linea1+" - "+linea2); //concatena una linea del fichero1 con una linea del fichero2
				System.out.println(); //dejamos una pequeña separación por estética
				
				if(linea1 != null) {
					printWriter.print(linea1);
				}
				if(linea2 != null) {
					printWriter.print(linea2);
				}
				linea1 = bufferedReader1.readLine();
				linea2 = bufferedReader2.readLine();
			}
			bufferedReader1.close();
			bufferedReader2.close();
			printWriter.close();
		
		} catch (IOException exception) {
			System.out.println(exception.getMessage()); 
		}
		
	}

}
