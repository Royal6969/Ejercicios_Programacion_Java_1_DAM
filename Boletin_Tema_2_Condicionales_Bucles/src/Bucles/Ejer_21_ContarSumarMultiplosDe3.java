package Bucles;

import java.util.Scanner;

public class Ejer_21_ContarSumarMultiplosDe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número ");
		int num = sc.nextInt();
		
		int cont1 = num;
		int cont2 = 0;
		int suma = 0;

	
		while(cont1>1) {
			if(num%3==0) {
				System.out.println(" "+num);
				cont2++;
				suma+=num;
				}
			cont1--;
			num--;
		}
		System.out.println("El total de números es " +cont2+ " y la suma de los números es " +suma);
		
		
	}

}
