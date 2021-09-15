package Repaso_Vectores;

import java.util.Scanner;

public class Ejer_6_Cambiar_Ocurrencias {

static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = new int[100];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random()*21);
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		
		int num1 = 0;
		int num2 = 0;
		System.out.println("Introduzca un primer número que esté en el Array para cambiarlo por otro");
		num1 = sc.nextInt();
		System.out.println("Introduzca otro número para cambiarlo por el primero que introdujo");
		num2 = sc.nextInt();
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == num1) {
				nums[i] = num2;
			}
			System.out.print(nums[i]+" ");
		}
		
	}

}
