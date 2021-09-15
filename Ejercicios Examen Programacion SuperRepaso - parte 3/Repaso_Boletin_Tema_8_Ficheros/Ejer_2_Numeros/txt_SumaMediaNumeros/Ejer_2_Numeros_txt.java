package Ejer_2_Numeros.txt_SumaMediaNumeros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/*
 *  2.-Aplicaci�n que pide por teclado un nombre de fichero. 
 *  Previamente en ese fichero (por ejemplo numeros.txt) 
 *  habremos introducido una serie de n�meros, a raz�n de uno por l�nea. 
 *  Se podr�an leer tambi�n los n�meros si estuvieran separados por comas o espacios aunque ser�a un poco m�s complicado (no mucho m�s). 
 *  Los n�meros pueden contener decimales ya que se van a leer como double. 
 *  Cada n�mero que se lee del fichero se va sumando 
 *  de tal forma que la suma total estar� contenida en la variable suma; 
 *  a la par se va llevando la cuenta de los elementos que se van leyendo en la variable i. 
 *  Finalmente, dividiendo la suma total entre el n�mero de elementos 
 *  obtenemos la media aritm�tica de los n�meros contenidos en el fichero.
 */
public class Ejer_2_Numeros_txt {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//en este ejercicio tal como me dice, yo he creado de antemno el archivo.txt y le he metido los numeros

		//declaramos las variables del titulo del archivo.txt, la suma, y el contador
		String titulo;
		double suma = 0;
		double contador = 0;
		
		try {
			//Aplicaci�n que pide por teclado un nombre de fichero.
			System.out.println("Introduzca un titulo para el nuevo archivo de texto");
			titulo = sc.next();
			titulo += ".txt"; //para a�adirle automaticamente la extensi�n .txt
			
/*combo1*/	File dato = new File(titulo); //File sirve para abrir ficheros, decirle a Eclipse que tipo de variable es
/*combo1*/	FileReader fileReader = new FileReader(dato); //para decirle a Eclipse que es un archivo de lectura, para que lo pueda leer
/*combo1*/	BufferedReader bufferedReader = new BufferedReader(fileReader); //para que se pueda mostrar por pantalla, esto lo traduce a nosotros
			
/*combo2*/	String linea = 	bufferedReader.readLine();
/*combo2*/	while(linea != null) {
				contador ++;
				System.out.println(linea);
				
				suma += Integer.parseInt(linea); //OJITO al truquito... que lo que va leyendo son String! y tengo que ir sumando los numeros
				linea = bufferedReader.readLine(); //para que siga pasando a la siguiente l�nea
			}
			System.out.println();
			System.out.println("La suma de los n�meros es: "+suma);
			System.out.println();
			System.out.println("Y la media de todos los n�meros es :"+suma/contador);
			bufferedReader.close(); //cuando acabe de hacer el ejercicio, cerrar el buffered!!
			
			
		} catch (IOException exception) {
			System.out.println(exception.getMessage());
		}
		
		sc.close();
	}

}
