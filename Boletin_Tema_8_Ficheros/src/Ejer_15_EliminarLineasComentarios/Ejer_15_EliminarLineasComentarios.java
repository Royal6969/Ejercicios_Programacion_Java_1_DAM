package Ejer_15_EliminarLineasComentarios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejer_15_EliminarLineasComentarios {

/*
 * 15.-Escribe un programa capaz de quitar los comentarios de un programa de Java. 
 * Los nombres de los dos archivos: codentrada.txt y codsalida.txt.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader fr = new FileReader("codentrada.txt");
			
			BufferedReader br = new BufferedReader(fr);
			
			String linea = br.readLine();
			
			FileWriter fw = new FileWriter("codsalida.txt", true);
			PrintWriter pr = new PrintWriter(fw);
			
			while(linea != null) {
				
				if(linea.contains("//")) {
					linea = br.readLine();
				
				}else {
					pr.println(linea);
					
					linea = br.readLine();
				}
			}
			br.close();
			pr.close();
		
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(ex.getMessage());
		}
		
	}

}
