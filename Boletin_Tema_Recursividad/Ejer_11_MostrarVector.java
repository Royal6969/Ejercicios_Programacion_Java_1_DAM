package Recursividad;

public class Ejer_11_MostrarVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//10. Mostrar los elementos de un vector
		
		int[]Vector = {1,3,5,7,9,8,6,4,2,10};
		mostrarVectorRecursivo(Vector, 0);
		
	}
	public static void mostrarVectorRecursivo(int[]Vector, int posicion) { 
		
		//Forma rara
		/*if(posicion!=Vector.length) {
			System.out.print(Vector[posicion]+" ");
			mostrarVectorRecursivo(Vector, posicion+1);
		}*/
		
		//Forma normal
		if(posicion==Vector.length-1) {
			System.out.print(Vector[posicion]+" ");
		
		}else {
			System.out.print(Vector[posicion]+" ");
			mostrarVectorRecursivo(Vector, posicion+1); //el +1 es lo mas importante
		}
	}
}
