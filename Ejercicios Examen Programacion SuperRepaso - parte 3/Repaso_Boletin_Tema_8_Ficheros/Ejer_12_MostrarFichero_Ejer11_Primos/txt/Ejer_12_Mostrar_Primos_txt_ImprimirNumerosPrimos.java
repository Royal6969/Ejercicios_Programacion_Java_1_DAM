package Ejer_12_MostrarFichero_Ejer11_Primos.txt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 12.-Realiza un programa que lea el fichero creado en el ejercicio anterior 
 * y que muestre los números por pantalla.
 */
public class Ejer_12_Mostrar_Primos_txt_ImprimirNumerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
/*combo1*/	File primos = new File("primos.dat"); //identifica al archivo
/*combo1*/	FileReader fileReader = new FileReader(primos); //lee el archivo
/*combo1*/	BufferedReader bufferedReader = new BufferedReader(fileReader); //traduce el archivo
/*combo1*/	String linea = bufferedReader.readLine(); //guardamos cada linea en una variable y vamos saltando de linea

			while(linea != null) {
				System.out.println(linea);
				linea = bufferedReader.readLine(); //antes de cerrar el while es importante volver a leer la linea
			}
			bufferedReader.close();
			fileReader.close();
		
		} catch (IOException exception) {
			System.out.println(exception.getMessage());
		}
	}

}
