package Repaso_Examen;

import java.util.Scanner;

public class Ejer_1_MatrizSumarFilasColumnas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Escribe un programa que pida 20 números enteros
		//Estos de se deben introducir en un array de 4 filas por 5 columnas.
		//El programa mostrará las sumas parciales de filas y columnas 
		//igual que si de una hoja de cálculo se tratara.
		//La suma total debe aparecer en la esquina inferior derecha.
		
		Scanner sc = new Scanner(System.in);
		
		int[][]Matriz = new int[4][5];
		int suma = 0;
		int total = 0;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("["+(i+1)+"]["+(j+1)+"] Introduzca un número");
				Matriz[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(Matriz[i][j]+"\t");
				suma += Matriz[i][j];
			}
			System.out.println(suma);
			total += suma;
			suma = 0;
		}
		for(int j=0; j<5; j++) {
			for(int i=0; i<4; i++) {
				suma += Matriz[i][j];
			}
			System.out.print(suma+"\t");
			total += suma;
			suma=0;
		}
		System.out.println(total);
	}

}
