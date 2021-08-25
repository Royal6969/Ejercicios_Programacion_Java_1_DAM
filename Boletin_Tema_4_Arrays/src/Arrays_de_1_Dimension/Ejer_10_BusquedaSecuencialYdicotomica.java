package Arrays_de_1_Dimension;

import java.util.Scanner;

public class Ejer_10_BusquedaSecuencialYdicotomica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[10];
		int num;
		
		System.out.println("Este programa crea 10 números aleatorios");
		
		for(int i=0; i<10; i++) {
			nums[i] = (int)Math.random()*101;
		}
		System.out.println("Escriba un número para comprobar si es uno de los generados");
		num=sc.nextInt();
		
		
		
	}

}
