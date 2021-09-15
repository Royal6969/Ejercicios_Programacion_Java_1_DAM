package Ejer_10_SustituirTabuladoresPorEspacios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejer_10_SustituirTabuladoresPorEspacios {
/*
 * 10.-Programa que sustituye los tabuladores de un fichero de texto, por dos espacios en blanco.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
/*combo1*/	File ejer9 = new File("Ejer_9_sustitucion.txt");
/*combo1*/	FileReader fileReader = new FileReader(ejer9);
/*combo1*/	BufferedReader bufferedReader = new BufferedReader(fileReader);	
/*combo1*/	String linea = bufferedReader.readLine(); //creamos la linea y se inicializa su lectura con el buffer
			
			boolean salir = false;
			
/*combo2*/	while(linea != null && salir == false) {
				//aquí tengo que parar para crear el método que va a sustituir los tabuladores por espacios
				//una vez de vuelta...
				String nuevaLinea = sustituirTabuladores(linea); //creamos aquí una variable para recoger el resultado String del metodo, la cual será tmb "nuevaLinea"
/*combo2*/		System.out.println(nuevaLinea);
/*combo2*/		bufferedReader.readLine();
				salir = true;
			}
			bufferedReader.close(); //no olvidaaaaaaaarrrr
			
		} catch (IOException exception) {
			exception.getMessage();
		}
	}
	//MÉTODOS
	public static String sustituirTabuladores(String linea) { //OJO vamos a devolver un String (el de la linea)
		//cremaos una nueva línea en la que se guardara la linea con espacios en vez de tabulaciones
		String nuevaLinea;
		
		//ahora viene un filtro muy sencillito, el típico método contains y replaceAll de la clase String
		if(linea.contains("\t")) { //si la linea contiene el caracter \t (tabulacion)
			nuevaLinea = linea.replaceAll("\t", "\s\s"); //la nueva linea es la linea anterior habiendo sustituido la tabulacion por 2 espacios
		
		}else {
			nuevaLinea = linea; //y si no hay tabulaciones en la línea, la nueva linea es la misma linea que ya había
		}
		return nuevaLinea;
	}

}
