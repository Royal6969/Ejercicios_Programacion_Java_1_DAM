package Arrays_de_1_Dimension;

import java.util.Scanner;

public class Ejer_2_Leer10numerosAlReves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2. Escribe un programa que lea 10 n�meros por teclado 
		//y que luego los muestre en orden inverso, es decir,
		//el primero que se introduce es el �ltimo en mostrarse y viceversa
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Este programa leer� 10 n�meros que usted introduzca y los mostrar� al rev�s");
		int[] num = new int[10];
		
		for(int i=0; i<10; i++) {
			System.out.println((i+1)+" Introduzca un n�mero");
			num[i] = sc.nextInt();
		}
			System.out.println("Los n�meros guardados son");
			for(int i=9; i>=0; i--) {
				System.out.print(num[i]+ " ");
		}
	}

}
