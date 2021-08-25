package Metodos;

public class Ejer_6_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Implementar un método que permita insertar un elemento entero en un vector ordenado.
	
		int[]Array = new int[10];
		int num = 5;
		
		for(int i=0; i<Array.length-1; i++) { //-1 para dejar la ultima posicion libre
			Array[i]=i; //así se crearían del 0 al 8
		}
		insertarElemento(num, Array);
		
		for(int i=0; i<Array.length; i++) {
			System.out.print(Array[i]+" ");
		}
	}
	public static void insertarElemento(int num, int[]Array) {
		
		boolean encontrado = false;
		
		if(num>Array[Array.length-2]) { //si el número que se va a introducir es mayor que el último valor del Array (recierda que la última posicion esta vacia)
			Array[Array.length-1]=num; //en esa última posición (la vacía) se pone el número
			encontrado=true; //para parar el ejercicio 
		}
		//si no se metiera por la derecha, hace falta el FOR para las otras posibilidades de inserción
		for(int i=0; i<Array.length && encontrado==false; i++) {
			
		//tanto si inserto por la izquierda o en el medio, tengo que mover todos los número a la derecha
			if(num<Array[i]) { 
				for(int j=Array.length-1; j>i; j--) { //recorrer desde derecha(final) hasta la posición encontrada
					Array[j]=Array[j-1];//para mover a la derecha
				}
				Array[i]=num;
				encontrado=true;
			}
		}
	}

}
