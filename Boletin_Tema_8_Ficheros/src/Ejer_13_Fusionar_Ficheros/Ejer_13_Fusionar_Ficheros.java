package Ejer_13_Fusionar_Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejer_13_Fusionar_Ficheros {

/*
 * 13.-Escribe un programa que guarde en un fichero el contenido de otros dos ficheros, 
 * de tal forma que en el fichero resultante aparezcan las líneas 
 * de  los primeros dos ficheros fusiondas y en el mismo orden.
 * Los nombres de los dos ficheros de entrada y el nombre del fichero destino 
 * se deben pasar como argumentos en la línea de comandos. 
 * Hay que tener en cuenta que los ficheros de donde se van cogiendo las líneas 
 * pueden tener tamaños diferentes. 
 * Las líneas de ambos ficheros de origen están ordenadas ascendentemente. 
 * En caso de líneas comunes entre ambos ficheros de origen, 
 * se copiará sólo una línea en el fichero destino.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			FileWriter  fw1 = new FileWriter("fusion.txt", false); //elegir el "file file boolean append"
			//si no tengo ya creado el archivo "fichero1_Ejer13.txt", se crea ahora
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
				//System.out.print(linea1+" "+linea2);
				System.out.println(linea1);
				System.out.println(linea2);
				System.out.println();
				
				//palabra = linea1+" "+linea2; //al estar concatenado , no me libro de que en la consola salaga un null de linea1 de que falta una 4º frase
				
				if(linea1 != null) {
					//pw.println(palabra); //String x //si aqui hubiera puesto pw.println(linea1) y así con lo demas... saldrían una debajo de otra... por el LN
					pw.println(linea1);
				}
				if(linea2 != null && linea2.compareToIgnoreCase(linea1)!=0) { //eclipse devuelve un 0 si son iguales y 1 si son diferentes
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
