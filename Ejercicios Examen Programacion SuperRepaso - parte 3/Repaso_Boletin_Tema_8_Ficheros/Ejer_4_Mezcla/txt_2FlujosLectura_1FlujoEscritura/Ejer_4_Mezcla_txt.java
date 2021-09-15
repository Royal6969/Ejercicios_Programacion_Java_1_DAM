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
public class Ejer_4_Mezcla_txt {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//lo 1º será crear el archivo mezcla.txt donde se irán guaradndo las líneas que se van leyendo
/*combo1*/	FileWriter fileWriter = new FileWriter("mezcla.txt", false); //FileWriter crea el archivo automaticamente y le dice a Eclipse que es un archivo de escritura
/*combo1*/	PrintWriter printWriter = new PrintWriter(fileWriter);
/*combo1*/	String frase;
			
/*combo2*/	File fichero1 = new File("fichero1.txt");
/*combo2*/  FileReader fileReader1 = new FileReader(fichero1);
/*combo2*/  BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
/*combo2*/  String linea1 = bufferedReader1.readLine();
		
/*combo2*/  File fichero2 = new File("fichero2.txt");
/*combo2*/  FileReader fileReader2 = new FileReader(fichero2);
/*combo2*/  BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
/*combo2*/  String linea2 = bufferedReader1.readLine();

			while(linea1 != null || linea2 != null) {
				System.out.println(linea1+" - "+linea2);
				System.out.println();
				
				frase = linea1+" - "+linea2;
				
				if(linea1 != null || linea2 != null) {
					printWriter.print(frase);
				}
				linea1 = bufferedReader1.readLine(); //para que la linea1 pase a la siguiente línea
				linea2 = bufferedReader2.readLine(); //para que la linea2 pase a la siguiente línea
			}
			bufferedReader1.close(); //cerrar el bufferedReader1
			bufferedReader2.close(); //cerrar el bufferedReader2
			printWriter.close(); //tmb hay que cerrar el printWriter
		
		} catch (IOException exception) {
			System.out.println(exception.getMessage());
		}
	}

}
