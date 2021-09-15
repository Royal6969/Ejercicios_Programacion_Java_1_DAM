package Repaso_Vectores;

import java.util.Scanner;

public class Ejer_9_Colores_Izquierda__NoColores_Derecha {

static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] palabras = new String[7];
		String[] aux = new String[7];
		String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
		int pos = 0;
		boolean encontrado = false;
		
		System.out.println("Los colores son:");
		System.out.println("verde, rojo, azul, amarillo, naranja, rosa, negro, blanco, morado");
		System.out.println();
		System.out.println("Vamos a rellenar el array de 7 posiciones");
		
		for(int i=0; i<palabras.length; i++) {
			System.out.println((i+1)+". Introduzca una palabra");
			palabras[i] = sc.next();
		}
		for(int i=0; i<palabras.length; i++) {
			encontrado = false;
			for(int j=0; j<colores.length && encontrado==false; j++) {
				if(palabras[i].equals(colores[j])) {
					aux[pos] = colores[j];
					encontrado = true;
					pos++;
				}
			}
		}
		for(int i=0; i<palabras.length; i++) {
			encontrado = false;
			for(int j=0; j<colores.length && encontrado==false; j++) {
				if(palabras[i].equals(colores[j])) {
					encontrado = true;
				}
			}
			if(encontrado==false) {
				aux[pos] = palabras[i];
				pos++;
			}
		}
		for(int i=0; i<aux.length; i++) {
			System.out.print(aux[i]+"\t");
		}
	}

}
