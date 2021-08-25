package Ejer_2_Numeros.txt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejer_2_Numeros_txt {

/*
 * 2. Aplicación que pide por teclado un nombre de fichero. 
 * Previamente en ese fichero (por ejemplo numeros.txt) habremos introducido una serie de números, a razón de uno por línea.
 * Se podrían leer también los números si estuvieran separados por comas o espacios 
 * aunque sería un poco más complicado (no mucho más). 
 * Los números pueden contener decimales ya que se van a leer como double. 
 * Cada número que se lee del fichero se va sumando de tal forma que 
 * la suma total estará contenida en la variable suma; 
 * a la par se va llevando la cuenta de los elementos que se van leyendo en la variable i. 
 * Finalmente, dividiendo la suma total entre el número de elementos 
 * obtenemos la media aritmética de los números contenidos en el fichero.
 */
	
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String titulo;
		int contador = 0;
		int suma = 0;
		
		try{
			System.out.println("Introduzca un título para el fichero");
			titulo = sc.next();
			titulo += ".txt"; //para añadirle la extension automáticamente
			
			File dato = new File(titulo);
			
			FileReader fr = new FileReader(dato);
			
			BufferedReader br = new BufferedReader(fr);
			
			String linea = br.readLine(); //Los números pueden contener decimales ya que se van a leer como double.
			
			while(linea != null) {
				contador ++;
				System.out.println(linea);
				
				suma += Integer.parseInt(linea); //aqui la línea se ha ocnvertido en un número
				linea = br.readLine();
			}
			System.out.println();
			System.out.println("La suma de las líneas es: "+suma);
			System.out.println();
			
			System.out.println("Y la media de los números es: "+suma/contador);
			
			br.close();
			
		}catch(IOException ex){
			System.out.println(ex.getMessage());
		}
	}

}
