package Ejer_8_SumarNumeros_ArgumentosParametros_MostrarSuma;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejer_8_SumarNumeros_MostrarSuma_ArgumentosParametros {
/*
 * 8.-Programa en el que se suman todos los argumentos que se pasan como parámetros al void 
 * y se muestra por pantalla el resultado de la suma.
 */
	public static void main(String[] argumento) { //aquí voy a cambiar el args0 por, por ejemplo, el nombre del fichero que le vaya a pasar
		// TODO Auto-generated method stub

		
		try {
			int suma = 0;
			
			File numeros_v2 = new File(argumento[0]);
			FileReader fileReader;
			fileReader = new FileReader(numeros_v2);
			BufferedReader bufferedreader = new BufferedReader(fileReader);
			String linea = bufferedreader.readLine();
			
			while(linea != null) {
				suma += Integer.parseInt(linea); 
				linea = bufferedreader.readLine();
			}
			System.out.println(suma);
			bufferedreader.close();
				
		} catch (IOException exception) {
			System.out.println(exception.getMessage());
		}
		
	}

}
