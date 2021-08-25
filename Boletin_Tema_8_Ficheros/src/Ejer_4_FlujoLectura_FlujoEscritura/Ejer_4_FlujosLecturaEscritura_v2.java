package Ejer_4_FlujoLectura_FlujoEscritura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejer_4_FlujosLecturaEscritura_v2 {

/*
 * 4. Dados dos flujos de lectura y uno de escritura. 
 * Observa que se declaran en total tres manejadores de fichero (dos para lectura y uno para escritura). 
 * El programa va leyendo, de forma alterna, una línea de cada fichero 
 * - una línea de fichero1.txt y otra línea de fichero2.txt - 
 * mientras queden líneas por leer en alguno de los ficheros; 
 * y al mismo tiempo va guardando esas líneas en otro fichero con nombre mezcla.txt 
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			FileWriter  fw1 = new FileWriter("mezcla.txt", false); //elegir el "file file boolean append"
			//si no tengo ya creado el archivo "fichero1.txt", se crea ahora
			PrintWriter pw = new PrintWriter(fw1); // elegir el file file
			
			///////////////////////////////////////////////
			
			String palabra;
			
			//Scanner sc = new Scanner(System.in);
			File dato1 = new File("fichero1.txt");
			
			FileReader fr1 = new FileReader(dato1);
			
			BufferedReader br1 = new BufferedReader(fr1);
			
			String linea1 = br1.readLine();
			
			///////////////////////////////////////////////
			
			File dato2 = new File("fichero2.txt");
			
			FileReader fr2 = new FileReader(dato2);
			
			BufferedReader br2 = new BufferedReader(fr2);
			
			String linea2 = br2.readLine();
			
			//////////////////////////////////////////////
			
			while(linea1 != null || linea2 != null) {
				System.out.print(linea1+" "+linea2); //esto hace que smp tenga que salir el null de la 4º frase que no está creada de linea1
				System.out.println();
				
				//palabra = linea1+" "+linea2; //al estar concatenado , no me libro de que en la consola salaga un null de linea1 de que falta una 4º frase
				
				if(linea1 != null) {
					//pw.println(palabra); //String x //si aqui hubiera puesto pw.println(linea1) y así con lo demas... saldrían una debajo de otra... por el LN
					pw.print(linea1+" ");
				}
				if(linea2 != null) {
					pw.println(linea2);
				}
				
				linea1 = br1.readLine();
				linea2 = br2.readLine();
			}
			
			/////////////////////////////////////////////
			
			br1.close();
			br2.close();
			
			pw.close();
			
		}catch(IOException ex){
			System.out.println(ex.getMessage());
		}
	}

}
