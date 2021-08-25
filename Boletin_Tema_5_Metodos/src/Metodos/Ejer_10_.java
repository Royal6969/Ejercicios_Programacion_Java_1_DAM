package Metodos;

import java.util.Scanner;

public class Ejer_10_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Implementar un método que permita rotar un vector de 10 números enteros, 
		//(n) posiciones hacia la izquierda. 
		//El valor n se leerá mediante teclado.
		
		Scanner sc = new Scanner(System.in);
		
		int[]Vector = {1,2,3,4,5,6,7,8,9,10};
		int rotar;
		
		for(int i=0; i<Vector.length; i++) {
			System.out.print(Vector[i]+" ");
		}
		System.out.println();
		
		System.out.println("¿Cuántas posiciones quiere rotar el Vector hacia la izquierda?");
		rotar = sc.nextInt();
		rotaIzquierdaArrayInt(rotar, Vector);
	}
	static void rotaIzquierdaArrayInt(int rotar, int[]Vector) {
		
		int AUX = 0;
		
		for(int i=0; i<rotar; i++) {
			AUX = Vector[0];
			
			for(int j=0; j<Vector.length-1; j++) {
				Vector[j]=Vector[j+1];
			}
			Vector[Vector.length-1]=AUX;
		}
		for(int i=0; i<Vector.length; i++) {
			System.out.print(Vector[i]+" ");
		}
		System.out.println();
	}

}
