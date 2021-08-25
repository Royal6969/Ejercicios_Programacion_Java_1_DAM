package Ejer_16_OcurrenciasPalabrasEnFichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejer_16_OcurrenciasPalabrasEnFichero {

/*
 *  16.-Realiza un programa que diga cuántas ocurrencias de una palabra hay en un fichero. 
 *  Tanto el nombre del fichero como la palabra se deben pasar como argumentos en la línea de comandos.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader fr = new FileReader(args[0]);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			
			int contador = 0;
			int i = 0;
			
			while(linea != null) { //por cada una de las lineas voy a mirar que en esa linea que la palabra esté dentro
				while((i = linea.indexOf(args[1])) != -1) { //igualar la i numericamente a la posicion 0 de donde esta la palabra, si no se encuentra la palabra devuleve -1
					linea = linea.substring(i+args[1].length()); //de la linea solo se coge un trocito, que empieza tras la palara buscada
					contador++;
				}
				linea = br.readLine(); //para que pasa a lal siguiente linea
			}
			br.close();
			
			System.out.println("La palabra "+args[1]+" aparece "+contador+" veces.");
		
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(ex.getMessage());
		}
		
	}

}
