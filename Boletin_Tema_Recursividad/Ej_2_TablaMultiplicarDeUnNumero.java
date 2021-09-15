package Recursividad;

import java.util.Scanner;

public class Ej_2_TablaMultiplicarDeUnNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2. Leer un número y mostrar su tabla de multiplicar.
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int n = 0;
		System.out.println("¿De qué número quiere saber su tabla de multiplicar?");
		num = sc.nextInt();
		
		tablaMultiplicar(0, num);
		
	}
	public static void tablaMultiplicar(int n, int num){
		
		if(n==10) {
			
			System.out.println(num*n);
			
		}else {
			System.out.println(num*n);
			tablaMultiplicar(n+1, num);
		}
	}

}
