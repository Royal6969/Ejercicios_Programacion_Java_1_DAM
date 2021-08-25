package Metodos;

import java.util.Scanner;

public class Ejer_9_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Implementar un método que permita rotar un vector de 10 números enteros, 
		//(n) posiciones hacia la derecha. 
		//El valor (n) se leerá mediante teclado.
		
		Scanner sc = new Scanner(System.in);
		
		int[]Vector = {1,2,3,4,5,6,7,8,9,10}; 
		int rotar;
		
		for(int i=0; i<Vector.length; i++) {
			System.out.print(Vector[i]+" ");
		}
		System.out.println();
		
		System.out.println("¿Cuántas posiciones quiere rotar el Vector hacia la derecha?");
		rotar = sc.nextInt();
		rotaDerechaArrayInt(rotar, Vector);
		
	}
	static void rotaDerechaArrayInt(int rotar, int[]Vector) {
		
		int AUX;
		
		for(int i=0; i<rotar; i++) {
			AUX = Vector[Vector.length-1];
			
			for(int j=Vector.length-1; j>0; j--) {
				Vector[j]=Vector[j-1];
			}
			Vector[0]=AUX;
		}
		for(int i=0; i<Vector.length; i++) {
			System.out.print(Vector[i]+" ");
		}
		System.out.println();
	}

}
