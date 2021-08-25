package Ejer_3_Frutas.txt;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejer_3_Frutas_txt {

/*
 * 3. Programa que crea un fichero de texto “frutas.txt” y luego escribe en él tres palabras, una por cada línea.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter  fw = new FileWriter("frutas.txt", true); //elegir el "file file boolean append"
			//si no tengo ya creado el archivo "frutas.txt", se crea ahora
			
			PrintWriter pw = new PrintWriter(fw); // elegir el file file
			
			String palabra1 = "hola";
			String palabra2 = "adios";
			String palabra3 = "zeta";
			
			//Scanner sc = new Scanner(System.in);
			
			pw.println(palabra1);
			pw.println(palabra2);
			pw.println(palabra3);
			pw.close();
		
		}catch(IOException ex){
			System.out.println(ex.getMessage());
		}
	}

}
