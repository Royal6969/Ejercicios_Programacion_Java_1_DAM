package Extra;

import java.util.Scanner;

public class Ejer_4_PintarUnRectanguloHueco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un valor para la altura del rectángulo ");
		int altura = sc.nextInt();
		
		System.out.print("Introduzca un valor para el ancho del rectángulo ");
		int ancho = sc.nextInt();
		
		if(altura>2 && ancho>2) {
			for(int i=1; i<=ancho; i++) {
				System.out.print("*");
			}
			for(int i=2; i<ancho; i++) {
				System.out.println();
				System.out.print("*");
				for(int j=2; j<ancho; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println("");
			
			for(int i=1; i<=ancho; i++) {
				System.out.print("*");
			}
		}else {System.out.println("Error, debe introducir valores superiores a 2");}
	}

}
