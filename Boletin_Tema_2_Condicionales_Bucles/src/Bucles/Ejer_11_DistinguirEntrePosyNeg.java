package Bucles;

import java.util.Scanner;

public class Ejer_11_DistinguirEntrePosyNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//11. Escribe un programa que lea una lista de diez n�meros 
		//y determine cu�ntos son positivos, y cu�ntos son negativos.
		
		Scanner sc = new Scanner(System.in);
		
		int num; 
		int pos = 0;
		int neg = 0;
		
		for(int i=0; i<10; i++) {
			
			System.out.println("Introduzca un n�mero ");
			num = sc.nextInt();
			
			if(num<0) {
				neg++;
				}
			else {
				pos++;
				}
		}
		System.out.println("Hay " +pos+ " n�meros positivos y " +neg+ " n�meros negativos");
	}

}
