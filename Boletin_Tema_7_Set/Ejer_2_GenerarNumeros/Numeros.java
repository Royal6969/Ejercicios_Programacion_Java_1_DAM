package Ejer_2_GenerarNumeros;

import java.util.HashSet;
import java.util.Set;

/*
 * 2. Generar 20 números, con rango entre 5 y 55, sin repeticiones.
 */

public class Numeros {

	public static void main(String[] args) {
		
		int num;
		
		Set<Integer> generador = new HashSet<Integer>();

		for(int i=0; i<20; i++) {
			num = (int)(Math.random()*(55-5)+5);
			generador.add(num);
		}
		
		System.out.println(generador.toString());
	}
	
	
	
	
	
}
