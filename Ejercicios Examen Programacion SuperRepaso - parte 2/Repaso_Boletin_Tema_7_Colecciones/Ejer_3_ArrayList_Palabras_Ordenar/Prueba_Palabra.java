package Ejer_3_ArrayList_Palabras_Ordenar;

import java.util.Scanner;

public class Prueba_Palabra {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista_Palabras palabras = new Lista_Palabras();
		String p1;
		
		//para rellenar 
		for(int i=0; i<3; i++) {
			System.out.println((i+1)+". Introduzca una palabra");
			p1 = sc.next();
			palabras.getLista_palabras().add(new Palabra(p1));
		}
		//para mostrar
		for(int i=0; i<palabras.getLista_palabras().size(); i++) {
			System.out.print(palabras.getLista_palabras().get(i).getPalabra()+"\t");
		}
		//para ordenar
		System.out.println();
		palabras.ordenarPalabras();
		System.out.println();
		//para volver a mostrar
		for(int i=0; i<palabras.getLista_palabras().size(); i++) {
			System.out.print(palabras.getLista_palabras().get(i).getPalabra()+"\t");
		}
	}

}
