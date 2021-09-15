package Ejer_14_Fichero_Sort.txt_OrdenarPalabras;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
/*
 * 14.-Realiza un programa que sea capaz de ordenar alfab�ticamente las palabras contenidas en un fichero de texto. 
 * El nombre del fichero que contiene las palabras se debe pasar como argumento en la l�nea de comandos. 
 * El nombre del fichero resultado debe ser el mismo que el original a�adiendo la coletilla sort, 
 * por ejemplo palabras_sort.txt . 
 * Suponemos que cada palabra ocupa una l�nea.
 */
public class Ejer_14_Fichero_Sort_txt_OrdenarPalabras {

	public static void main(String[] palabras_txt) {
		// TODO Auto-generated method stub

		//la idea de este ejercicio esque tenemos un flujo de lectura y un flujo de escritura
		
		
		try {
			//1� preparar el archivo de lectura
			File palabras = new File(palabras_txt[0]); //identifica el archivo, que es 1� (posicion 0) en el array de Strings de "palabras_txt" que se est� pasando como par�metro en la declaraci�n del main
			FileReader fileReader = new FileReader(palabras); //lee el archivo
			BufferedReader bufferedReader = new BufferedReader(fileReader); //traduce el archivo
			String linea = bufferedReader.readLine(); //guardamos la linea en una variable que ir� saltando de linea
			
			//2� preparar el archivo de escritura
			FileWriter fileWriter = new FileWriter("Ejer_14_Palabras_Sort.txt", false);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			String lineaResultado;
			
			//3� crear un ArrayList para aplicarle el Collections.sort, una vez que hayamos guardado las palabras en �l
			ArrayList<String> lista = new ArrayList<String>();
			
			while(linea != null) {
				lista.add(linea);
				linea = bufferedReader.readLine();
			}
			bufferedReader.close(); //no olvidar cerrar el bufferedReader
			Collections.sort(lista); //ordenamos el ArrayList
			
			//4� trasladar el ArrayList ordenado al fichero de escritura de resultado
			for(int i=0; i<lista.size(); i++) { //recorremos el arrayList
				lineaResultado = lista.get(i); //vamos guardando cada palabra en la variable lineaResultado 
				System.out.println(lineaResultado); //imprimimos por la pantalla de la consola cada palabra (lineaResultado)
				printWriter.println(lineaResultado); //e imprimimos tmb en el archivo de escritura resultante cada linea para que se queden guardadas ah� tmb
			}
			printWriter.close(); //no olvidar cerrar el PriotWriter
			
		} catch (IOException exception) {
			System.out.println(exception.getMessage());
		} 
		
	}

}
