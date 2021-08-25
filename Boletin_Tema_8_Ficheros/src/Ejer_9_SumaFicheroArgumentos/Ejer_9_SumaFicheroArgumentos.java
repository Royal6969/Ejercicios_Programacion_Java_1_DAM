package Ejer_9_SumaFicheroArgumentos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejer_9_SumaFicheroArgumentos {

/*
 *  Crea un fichero y nómbralo numeros.txt e introduce los siguientes números (es importante 
que estén separados por un salto de línea para que el programa funcione bien):
25
100
44
17
6
8
A continuación, pasa como argumento: numeros.txt
Aparecerá el siguiente resultado: La media es 33.333333333333336
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File directorio = new File(args[0]);
		double suma = 0;
		double contador = 0;
		
		FileReader fl;
		try {
			fl = new FileReader(directorio);
			
			BufferedReader br = new BufferedReader(fl);
			
			String linea = br.readLine();
			
			while(linea != null) {
				contador ++;
				System.out.println(linea);
				
				suma += Double.parseDouble(linea); //aqui la línea se ha ocnvertido en un número
				linea = br.readLine(); //pasar a la siguiente línea
			}
			br.close();
			double media = suma/contador;
			System.out.println("La media de los números es: "+media);
			
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} //sale un error, darle a la opcion de create surround try/catch
		
		
	}

}
