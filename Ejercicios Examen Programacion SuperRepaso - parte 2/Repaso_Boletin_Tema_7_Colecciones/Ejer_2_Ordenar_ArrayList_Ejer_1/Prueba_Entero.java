package Ejer_2_Ordenar_ArrayList_Ejer_1;

import java.util.Scanner;

/*
 * 1. Realiza un programa que introduzca 20 valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos números. 
Crear una clase Entero con un atributo de tipo int
 */
public class Prueba_Entero {

static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista_Enteros enteros = new Lista_Enteros();
		int suma = 0;
		double media = 0;
		int num;
		
		for(int i=0; i<20; i++) { //el FOR para generar y rellenar
			num = (int)(Math.random()*(100-0+1)+0);
			enteros.getLista_enteros().add(new Entero(num)); //así se introducen los valores en ArrayList
		}
		for(int i=0; i<enteros.getLista_enteros().size(); i++) {
			System.out.print(enteros.getLista_enteros().get(i).getNum()+"\t");
		}
		System.out.println();
		System.out.println();
		
		suma = enteros.sumar();
		System.out.println(suma);
		System.out.println();
		
		media = enteros.media();
		System.out.println(media);
		System.out.println();
		
		enteros.minmax();
		System.out.println();
		
		for(int i=0; i<enteros.getLista_enteros().size(); i++) {
			System.out.print(enteros.getLista_enteros().get(i).getNum()+"\t");
		}
		enteros.ordenarEnteros();
		System.out.println();
		
		for(int i=0; i<enteros.getLista_enteros().size(); i++) {
			System.out.print(enteros.getLista_enteros().get(i).getNum()+"\t");
		}
	}

}
