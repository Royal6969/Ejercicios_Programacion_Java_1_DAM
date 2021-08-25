package Arrays_de_1_Dimension;

import java.util.Scanner;

public class Ejer_7_8numerosSaberParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//7. Realiza un programa que pida 8 números enteros y que luego muestre esos números 
		//junto con la palabra "par" o "impar" según proceda.
		
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[8];
		
		System.out.println("Vamos a meter los 15 números");
		for(int i=0; i<8; i++) {
			System.out.println((i+1)+" Introduzca un número");
			nums[i] = sc.nextInt();	
		}
		for(int i=0; i<8; i++) {
			if(nums[i]%2==0) {
				System.out.println(nums[i]+ " par");
			}else {
				System.out.println(nums[i]+ " impar");
			}
		}
	}
}
