package Ejer_1_CrearFichero_InsertarLinea_GuardarLinea_ImprimirLinea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 *  1.-Crear un fichero de texto llamado prueba.txt, introduciendo su contenido l�nea a l�nea por teclado. 
 *  Guardar l�nea a l�nea. Una vez guardado, mostrar su contenido por pantalla.
 */
public class Ejer_1_Fichero_txt {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileWriter filewriter;
		try {
			filewriter = new FileWriter("prueba.txt", false); //elegir el "file file boolean append" //si se pone false, el archivo prueba.txt se sobreescribe tras cada nueva ejecuci�n del programa, y si se pone true no se sobreescribe
			//al principio, esto va a dar fallo... pulsar en la solucion "surround with try/catch, y a partir de aqu�, todo el ejercicio va contenido dentro del try{} 
			
			//ahora declaramos un PrintWriter
			PrintWriter printwriter = new PrintWriter(filewriter); //le pasamos el filewriter que acab�bamos de crear tmb para que lo lea
			
			//declaramos una cadena de texto (frase)
			String frase;
			System.out.println("Introduzca una frase");
			frase = sc.nextLine();
			
			//para imprimir la palabra 
			printwriter.print(frase); //seleccionar el tipo de print seg�n el tipo dato ... en este caso fue print(String)
			printwriter.close(); // y lo cerramos tras imprimir para que no se quede abierto
			
			//para crear el archivo.txt automaticamente en nuestro Workspace --> Repaso_Boletin_Tema_8_Fichero
			File prueba_txt = new File("prueba.txt"); 
			
			//para leer el archivo de prueba.txt necesitamos crear este FileReader
			FileReader filereader = new FileReader(prueba_txt);
			
			//se necesita crear un buffer que almacene el filereader
			BufferedReader bufferedreader = new BufferedReader(filereader);
			
			//creamos una cadena de texto que ser� una l�nea entera del archivo prueba.txt (la cual utilizar� el bufferedReader para ser le�da)
			String linea = bufferedreader.readLine(); 
			
			while(linea != null) { //mientras que SI existe una l�nea
				System.out.println(linea); //se imprime la l�nea
				linea = bufferedreader.readLine(); //y se lee con el buffer
			}
			
			//por �ltimo, cerramos el bufferedReader
			bufferedreader.close(); 
			
		//para el catch, borramos su contenido predeterminado y vamos a llamar a la variable con el nombre de "exception" y lanzaremos el mensaje de excepcion a trav�s de un syso
		} catch (IOException exception) {
			System.out.println(exception.getMessage());
		} 
		
	}

}
