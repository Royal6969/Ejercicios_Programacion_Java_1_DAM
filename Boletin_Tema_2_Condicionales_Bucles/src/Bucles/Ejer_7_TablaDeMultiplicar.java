package Bucles;

import java.util.Scanner;

public class Ejer_7_TablaDeMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//7. Muestra la tabla de multiplicar de un número introducido por teclado.

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduzca un número para ver su tabla de multiplicar ");
		num = sc.nextInt();
		
		for(int i=0; i<=10; i++) {
			
			System.out.println(num+ " x " +i+ " = " +num*i);
			
			}
	
	}

}
