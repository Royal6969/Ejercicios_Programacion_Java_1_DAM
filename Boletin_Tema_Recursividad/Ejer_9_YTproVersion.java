package Recursividad;

import java.util.Scanner;

public class Ejer_9_YTproVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[]Vector = {1,2,3,4,5,6,7,8,9,10};
		int num;
		int posicion = -1;
		int primero = 0;
		int ultimo = Vector.length-1;
		
		mostrarVectorRecursivo(Vector, 0);
		System.out.println();
		
		System.out.println("¿De qué número del Vector quiere hacer su búsqueda Binaria?");
		num = sc.nextInt();
		
		posicion = busquedaBinariaRecursiva(Vector, num, primero, ultimo);
		
		if(posicion==-1) {//si la posicion no cambió de su valor original, esque el num no estaba en el Vector
			System.out.println("El número "+num+" no se encuentra en el Vector");
		
		}else {
			System.out.println("El número "+num+" se encuentra en la posición "+posicion);
		}
	}
	public static void mostrarVectorRecursivo(int[]Vector, int posicion) { 
		
		//Forma rara
		/*if(posicion!=Vector.length) {
			System.out.print(Vector[posicion]+" ");
			mostrarVectorRecursivo(Vector, posicion+1);
		}*/
		
		//Forma normal
		if(posicion==Vector.length-1) {
			System.out.print(Vector[posicion]+" ");
		
		}else {
			System.out.print(Vector[posicion]+" ");
			mostrarVectorRecursivo(Vector, posicion+1); //el +1 es lo mas importante
		}
	}
	public static int busquedaBinariaRecursiva(int[]Vector, int num, int primero, int ultimo) {
		
		int centro;
		
		if(primero>ultimo) {
			System.out.println("El número no está en el Vector");
			return -1;
		
		}else {
			centro = (primero+ultimo)/2;
		
			if(num<Vector[centro]) {
				return busquedaBinariaRecursiva(Vector, num, centro+1, ultimo);
			
			}else {
				return centro+1;
			}
		}
	}
}
