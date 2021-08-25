package Bucles;

import java.util.Scanner;

public class Ejer_23_PintarUnaL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int div; //divisor
		int i = 1; //contador
		int num; //límite
		
		System.out.println("Introduzca un número");
		num = sc.nextInt();
		
		System.out.println("Introduzca otra número");
		div = sc.nextInt();
		
		while(i<=num) {
			if(i%div!=0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
