package Recursividad;

import java.util.Scanner;

public class Ejer_9_BusquedaBinariaRecursiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//9. Búsqueda Binaria Recursiva
		
		Scanner sc = new Scanner(System.in);
		
		int[]Vector = {1,3,5,7,9,8,6,4,2,10};
		//int posicion = 0;  
		//Podria declarar el indice aqui, pero por eficiencia, se crea en el parentesis del mismo metodo abajo
		mostrarVectorRecursivo(Vector, 0);
		System.out.println();
		
		int num;
		System.out.println("¿De qué número del Vector quiere hacer su búsqueda Binaria?");
		num = sc.nextInt();
		
		int posNum = posicionElementoRecursivo(Vector, num, 0);
		System.out.println("El número "+num+" se encuentra en la posición "+(posNum+1)); //un +1 para que la posicion sea humana
		
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
	public static int posicionElementoRecursivo(int[]Vector, int num, int posicion) {
		
		if(posicion==Vector.length) {
			return -1;
		}
		
		else if(Vector[posicion]==num) {
			return posicion;
		
		}else {
			return posicionElementoRecursivo(Vector, num, posicion+1);
		}
	}
	
	

}
