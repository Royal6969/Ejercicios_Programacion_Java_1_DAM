package Ejer_1_Prueba.txt;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejer_1_Fichero_txt {

/*
 * 1. Crear un fichero de texto llamado prueba.txt, introduciendo su contenido línea a línea por teclado. 
 * Guardar línea a línea. Una vez guardado, mostrar su contenido por pantalla.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			FileWriter  fw = new FileWriter("prueba.txt", true); //elegir el "file file boolean append"
			//si no tengo ya creado el archivo "prueba.txt", se crea ahora manualmente
			
			PrintWriter pw = new PrintWriter(fw); // elegir el file file
			
			String palabra;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduzca una palabra");
			palabra = sc.next();
			
			pw.println(palabra);
			pw.close();
			
			File dato = new File("prueba.txt");
			
			FileReader fr = new FileReader(dato);
			
			BufferedReader br = new BufferedReader(fr);
			
			String linea = br.readLine();
			
			while(linea != null) {
				System.out.println(linea);
				
				linea = br.readLine();
			}
			br.close();
			
		}catch(IOException ex){
			System.out.println(ex.getMessage());
		}
	}

}
