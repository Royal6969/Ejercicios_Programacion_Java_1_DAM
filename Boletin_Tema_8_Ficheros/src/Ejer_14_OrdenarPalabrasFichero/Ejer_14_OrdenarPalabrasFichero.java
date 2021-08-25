package Ejer_14_OrdenarPalabrasFichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Ejer_14_OrdenarPalabrasFichero {

/*
 *  14.-Realiza un programa que sea capaz de ordenar alfabéticamente las palabras contenidas en un fichero de texto. 
 *  El nombre del fichero que contiene las palabras se debe pasar como argumento en la línea de comandos. 
 *  El nombre del fichero resultado debe ser el mismo que el original añadiendo la coletilla sort, 
 *  por ejemplo palabras_sort.txt . 
 *  Suponemos que cada palabra ocupa una línea.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			FileReader fr1 = new FileReader(args[0]);

			BufferedReader br1 = new BufferedReader(fr1);
			
			String linea1 = br1.readLine();
			
			ArrayList<String> list = new ArrayList<String>();
			
			while(linea1 != null) {
				list.add(linea1);
				
				linea1 = br1.readLine(); //pasar a la siguiente línea
			}
			br1.close();
			Collections.sort(list); //esto lo ordena alfabéticamente
			
			FileWriter  fw1 = new FileWriter("Ejer_14_resultado.txt", true); //elegir el "file file boolean append"
			PrintWriter pw = new PrintWriter(fw1); // elegir el file file
			
			String resultado;
			
			for(int i=0; i<list.size(); i++) {
				resultado = list.get(i);
				System.out.println(resultado);
				
				pw.println(resultado);
			}
			pw.close();
			
		}catch(IOException ex){
			System.out.println(ex.getMessage());
		}
	}

}
