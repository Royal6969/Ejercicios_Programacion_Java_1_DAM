package Arrays_de_1_Dimension;

import java.util.Scanner;

public class Ejer_9_OrdenarColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//9. Escribe un programa que pida 7 palabras y las almacene en un Array.
		//A continuación, las palabras correspondientes a colores se deben almacenar al comienzo
		//y las que no son colores a continuación. Puedes utilizar tantos Arrays auxiliares como quieras.
		//Los colores que conoce el programa deben de estar en otro Array y son los siguietes:
		//verde, rojo, azul, amarillo, naranja, rosa, negro, blanco, morado.
		
		Scanner sc = new Scanner(System.in);
		
		String[] palabras = new String[7];
		String[] colores = {"verde","rojo","azul","amarillo","naranja","rosa","negro","blanco","morado"};
		String[] AUX = new String[7];
		int PosAUX = 0; //contador para la posición del AUX
		boolean encontrado = false;
		
		for(int i=0; i<7; i++) {
			System.out.println("Introduzca una palabra");
			palabras[i] = sc.next(); 
		}
		for(int i=0; i<7; i++) {
			encontrado=false;
			for(int j=0; j<colores.length && encontrado==false; j++) {
				if(palabras[i].equals(colores[j])) {
					AUX[PosAUX] = colores[j];
				encontrado=true;
				PosAUX++;
				}
			}
		}
		for(int i=0; i<7; i++) {
			encontrado=false;
			for(int j=0; j<colores.length && encontrado==false; j++) {
				if(!palabras[i].equals(colores[j])) {
					AUX[PosAUX] = palabras[i]; //este ejercicio no va a caer en el examen porque ni EVA sabe hacerlo funcionar
				encontrado=true;
				PosAUX++;
				}
			}
		}
	}

}
