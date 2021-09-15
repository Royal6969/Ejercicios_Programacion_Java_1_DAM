package Repaso_Métodos;

public class Ejer_9_RotarVectorNvecesHaciaLaDerecha {

/*
 * 9. Implementar un método que permita rotar un vector de 10 números enteros, n posiciones hacia la derecha. 
 * El valor n se leerá mediante teclado.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vector = new int[10];
		int num = 1;
		
		for(int i=0; i<vector.length; i++) {
			vector[i] = i;
			System.out.print(vector[i]+"\t");
		}
		System.out.println();
		rotaDerechaArrayInt(vector, num);
	}
	static void rotaDerechaArrayInt(int[] vector, int num) {
        int aux;
        
        for(int i=0; i<num; i++) {
            aux = vector[vector.length-1];
            for(int j=vector.length-1; j>0; j--) {
                vector[j] = vector[j-1];
            }
            vector[0] = aux;
        }
        for(int i=0; i<vector.length; i++) {
            System.out.print(vector[i]+"\t");
        }
        System.out.println();
    }

}
