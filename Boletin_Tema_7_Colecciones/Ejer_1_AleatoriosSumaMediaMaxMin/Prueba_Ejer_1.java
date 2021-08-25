package Ejer_1_AleatoriosSumaMediaMaxMin;

import java.util.ArrayList;

import Ejemplo_1_ArrayList_de_Objetos.Elemento;

public class Prueba_Ejer_1 {

/*1. Realiza un programa que introduzca 20 valores aleatorios (entre 0 y 100) en un ArrayList 
 * y que luego calcule la suma, la media, el máximo y el mínimo de esos números.
*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lista_Numeros numeros = new Lista_Numeros();
		int num;
		int suma = 0;
		double media = 0;
		
		//numeros.getObjeto().add(new Numeros(int num));
		
		for(int i=0; i<20; i++) {
			num = (int)(Math.random()*(100-0)+0);
			numeros.getObjeto().add(new Numeros(num));
		}
		for(int i=0; i<numeros.getObjeto().size(); i++) {
			System.out.print(numeros.getObjeto().get(i)+" ");
		}
		System.out.println();
		
		suma = numeros.sumarNumeros();
		System.out.println(suma);
		
		media = numeros.mediaNumeros();
		System.out.println(media);
		
		numeros.rangoNumeros();
		System.out.println();
	}

}
