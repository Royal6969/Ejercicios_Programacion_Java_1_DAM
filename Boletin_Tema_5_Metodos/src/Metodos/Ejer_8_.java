package Metodos;

public class Ejer_8_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Implementar un método que permita buscar la primera ocurrencia de un elemento entero en un vector desordenado: 
		//algoritmo de búsqueda secuencial.
		
		int[]Vector = {1,3,5,7,9,8,6,4,2};
		int posicion;
		int num = 9;
		
		for(int i=0; i<Vector.length; i++) {
			System.out.print(Vector[i]+" \t");
		}
		System.out.println();
		System.out.println();
		
		posicion = busquedaSecuencial(num, Vector);
		System.out.println("La posición del número buscado es: "+(posicion+1));
		
	}
	public static int busquedaSecuencial(int num, int[]Vector) {
		
		int posicion = -1; //de base un -1 para que si no se encuentra devuelva el -1
		boolean encontrado = false;
		
		for(int i=0; i<Vector.length && encontrado==false; i++) {
			if(Vector[i]==num) {
				encontrado=true;
				posicion = i;
			}
		}
			return posicion;
	}

}
