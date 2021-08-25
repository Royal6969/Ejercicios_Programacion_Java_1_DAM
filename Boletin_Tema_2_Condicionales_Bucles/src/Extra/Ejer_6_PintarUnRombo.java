package Extra;

import java.util.Scanner;

public class Ejer_6_PintarUnRombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Introduzca el ancho del rombo ");
		int ancho = sc.nextInt();
		
		for(int i=0; i<ancho; i++) {
			for(int j=ancho-1-i; j>=0; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		for(int i=0; i<ancho; i++) {
			for(int j=0; j<=i+1; j++) {
				System.out.print(" ");
			}
			for(int j=ancho-2-i; j>=0; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}

}
