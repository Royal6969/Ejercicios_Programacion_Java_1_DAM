package Bucles;

import java.util.Scanner;

public class Ejer_1_Impar_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.println("Introduzca un n�mero ");
			num = sc.nextInt();	
			
			}while(num%2 == 0);
			System.out.println("Se acab� jaja");
	}

}
