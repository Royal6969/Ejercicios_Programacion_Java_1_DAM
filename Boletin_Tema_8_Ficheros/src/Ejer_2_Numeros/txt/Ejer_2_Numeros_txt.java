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
 * 2. Aplicaci�n que pide por teclado un nombre de fichero. 
 * Previamente en ese fichero (por ejemplo numeros.txt) habremos introducido una serie de n�meros, a raz�n de uno por l�nea.
 * Se podr�an leer tambi�n los n�meros si estuvieran separados por comas o espacios 
 * aunque ser�a un poco m�s complicado (no mucho m�s). 
 * Los n�meros pueden contener decimales ya que se van a leer como double. 
 * Cada n�mero que se lee del fichero se va sumando de tal forma que 
 * la suma total estar� contenida en la variable suma; 
 * a la par se va llevando la cuenta de los elementos que se van leyendo en la variable i. 
 * Finalmente, dividiendo la suma total entre el n�mero de elementos 
 * obtenemos la media aritm�tica de los n�meros contenidos en el fichero.
 */
	
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String titulo;
		int contador = 0;
		int suma = 0;
		
		try{
			System.out.println("Introduzca un t�tulo para el fichero");
			titulo = sc.next();
			titulo += ".txt"; //para a�adirle la extension autom�ticamente
			
			File dato = new File(titulo);
			
			FileReader fr = new FileReader(dato);
			
			BufferedReader br = new BufferedReader(fr);
			
			String linea = br.readLine(); //Los n�meros pueden contener decimales ya que se van a leer como double.
			
			while(linea != null) {
				contador ++;
				System.out.println(linea);
				
				suma += Integer.parseInt(linea); //aqui la l�nea se ha ocnvertido en un n�mero
				linea = br.readLine();
			}
			System.out.println();
			System.out.println("La suma de las l�neas es: "+suma);
			System.out.println();
			
			System.out.println("Y la media de los n�meros es: "+suma/contador);
			
			br.close();
			
		}catch(IOException ex){
			System.out.println(ex.getMessage());
		}
	}

}
