package Ejer_10_SustituirTabuladores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejer_10_SustituirTabuladores {

/*
 * 10. Programa que sustituye los tabuladores de un fichero de texto, por dos espacios en blanco.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File directorio = new File("Ejer_9_Tabuladores.txt");
		
		FileReader fr;
		
		try {
			fr = new FileReader(directorio);
			
			BufferedReader br = new BufferedReader(fr); 
			
			String linea = br.readLine();
			
			boolean salir = false; //esto ha sido solo para este ejercicio
			
			while(linea != null &&salir==false) {
				String new_line;
				
				new_line = sustituirTabuladores(linea);
				
				System.out.println(new_line);
				br.readLine();
				salir = true;
			}
			
			br.close(); //tener en cuenta qu eel br es estático, y lo suyo e scerrarlo
			
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}
	//MÉTODOS
	public static String sustituirTabuladores(String linea) {
		
		String new_line;
		
		if(linea.contains("\t")) {
			
			new_line = linea.replaceAll("\t", "  ");
		
		}else {
			new_line = linea;
		}
		
		return new_line;
	}

}
