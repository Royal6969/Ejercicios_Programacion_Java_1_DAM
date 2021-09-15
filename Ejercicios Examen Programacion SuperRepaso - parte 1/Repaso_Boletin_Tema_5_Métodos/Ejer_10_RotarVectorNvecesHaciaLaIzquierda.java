package Repaso_Métodos;

public class Ejer_10_RotarVectorNvecesHaciaLaIzquierda {

/*
 * 10. Implementar un método que permita rotar un vector de 10 números enteros, n posiciones hacia la izquierda. 
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
		rotaIzquierdaArrayInt(vector, num);
	}
	static void rotaIzquierdaArrayInt(int[] vector, int num) {
        int aux;
        
        for(int i=0; i<num; i++) {
            aux = vector[0];
            for(int j=0; j<vector.length-1; j++) {
                vector[j] = vector[j+1];
            }
            vector[vector.length-1] = aux;
        }
        for(int i=0; i<vector.length; i++) {
            System.out.print(vector[i]+"\t");
        }
        System.out.println();
    }
}
