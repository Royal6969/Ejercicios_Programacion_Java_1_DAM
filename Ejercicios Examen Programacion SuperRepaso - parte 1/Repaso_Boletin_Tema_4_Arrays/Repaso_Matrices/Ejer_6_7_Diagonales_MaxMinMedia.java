package Repaso_Matrices;

public class Ejer_6_7_Diagonales_MaxMinMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[10][10];
		int[] diagonalPrincipal = new int[10];
		int[] diagonalInversa = new int[10];
		int min = 999;
		int max = -999;
		int suma = 0;
		int media = 0;
		
		//rellenar matriz
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				matriz[i][j] = (int)(Math.random()*(200-100)+100);
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
		
		//capturar diagonal principal
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(i==j) {
					diagonalPrincipal[i] = matriz[i][j];
				}
			}
			System.out.println();
		}
		//mostrar diagonal principal
		System.out.println("Diagonal principal");
		for(int i=0; i<10; i++) {
			System.out.print(diagonalPrincipal[i]+"\t");
			
			//max/min diagonal principal
			if(diagonalPrincipal[i] > max) {
				max = diagonalPrincipal[i];
			}
			if(diagonalPrincipal[i] < min) {
				min = diagonalPrincipal[i];
			}
			//media diagonal principal
			suma += diagonalPrincipal[i];
		}
		media = suma/diagonalPrincipal.length;
		System.out.println();
		System.out.println("El número máximo de la diagonal principal es: "+max);
		System.out.println("El número mínimo de la diagonal principal es: "+min);
		System.out.println("La suma de los números de la diagonal principal es: "+suma);
		System.out.println("La media de los números de la diagonal principal es: "+media);
		min = 999;
		max = -999;
		suma = 0;
		media = 0;
		
		//capturar diagonal inversa
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(i==(matriz[i].length-1)-j) { //no entiendo esto
					diagonalInversa[i] = matriz[i][j];
				}
			}
			System.out.println();
		}
		//mostrar diagonal inversa
		System.out.println("Diagonal inversa");
		for(int i=0; i<10; i++) {
			System.out.print(diagonalInversa[i]+"\t");
			
			//max/min diagonal inversa
			if(diagonalInversa[i] > max) {
				max = diagonalInversa[i];
			}
			if(diagonalInversa[i] < min) {
				min = diagonalInversa[i];
			}
			//media diagonal inversa
			suma += diagonalInversa[i];
		}
		media = suma/diagonalInversa.length;
		System.out.println();
		System.out.println("El número máximo de la diagonal inversa es: "+max);
		System.out.println("El número mínimo de la diagonal inversa es: "+min);
		System.out.println("La suma de los números de la diagonal inversa es: "+suma);
		System.out.println("La media de los números de la diagonal inversa es: "+media);
	}

}
