package Ejer_16_ContarOcurrenciasDeUnaPalabra;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/*
 *  16.-Realiza un programa que diga cuántas ocurrencias de una palabra hay en un fichero. 
 *  Tanto el nombre del fichero como la palabra se deben pasar como argumentos en la línea de comandos.
 */
public class Ejer_16_ContarOcurrencias {

	public static void main(String[] ejer16) {
		// TODO Auto-generated method stub

		try {
			File ejer_16 = new File(ejer16[0]);
			FileReader fileReader = new FileReader(ejer_16);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String linea = bufferedReader.readLine();
			
			int numOcurrencias = 0;
			int posicion = 0; //necesitamos un auxiliar como posicion de inicio 
			
			while(linea != null) {
				posicion = linea.indexOf(ejer16[1]);
				while((posicion != -1)) { //igualar la posicion numericamente a la posicion 0 de donde esta la palabra, si no se encuentra la palabra devuleve -1
					
					linea = linea.substring(posicion+ejer16[1].length()); 
					numOcurrencias ++;
					posicion = linea.indexOf(ejer16[1]);
				}
				linea = bufferedReader.readLine();
			}
			bufferedReader.close();
			System.out.println("La palabra "+ejer16[1]+" aparece "+numOcurrencias+" veces.");
			
		} catch (IOException exception) {
			System.out.println(exception.getMessage());
		}
		
		
	}

}
