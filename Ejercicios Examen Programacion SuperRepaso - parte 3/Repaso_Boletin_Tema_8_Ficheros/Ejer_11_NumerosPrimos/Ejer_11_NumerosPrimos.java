package Ejer_11_NumerosPrimos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejer_11_NumerosPrimos {
/*
 * 11.-Escribe un programa que guarde en un fichero con nombre primos.dat los números primos que hay entre 1 y 500.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
/*combo1*/	FileWriter fileWriter = new FileWriter("primos.dat", false);
/*combo1*/  PrintWriter printWriter = new PrintWriter(fileWriter);
			
			boolean primo = true; //vamos a iniciarlo en true, porque como voy a poner la condicion de si es Par...
			
			for(int i=1; i<500; i++) {
				 for(int j=2; j<i; j++) {
			            if (i%j == 0)
			                primo = false;
			          }
			
				if(primo == true) {
					printWriter.println(i);
					System.out.println(i);
				}
				primo = true; // por que esto aqui?
			}
			printWriter.close(); //no olvidaaaaaarrr
		
		} catch (IOException exception) {
			System.out.println(exception.getMessage());
		}
		
	}

}
