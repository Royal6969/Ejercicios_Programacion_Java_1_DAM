package Repaso_Métodos;

public class Ejer_6_InsertarNum_enVectorYaOrdenado {

/*
 * 6. Implementar un método que permita insertar un elemento entero en un vector ordenado
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vector = new int[10]; //lo creo de 10 posiciones por ejemplo
		int num = 5; //el número que voy a insertar es el 5
		
		for(int i=0; i<vector.length-1; i++) { //pongo el -1 para dejar la última posición libre al generarlo
			vector[i] = i; //se va rellenando con su misma secuencia de recorrido
		}
		insertarElemento(vector, num);
		
		for(int i=0; i<vector.length; i++) {
			System.out.print(vector[i]+"\t");
		}
	}
	public static void insertarElemento(int[] vector, int num) {
		boolean encontrado = false;
		
		if(num > vector[vector.length-2]) { //si el número que estoy metiendo es mayor que el penúltimo número del array 
			//(recordar que la última casilla está vacía asi que miro la penúltima)
			vector[vector.length-1] = num; //pues en la última casilla meto el núemro nuevo
			encontrado = true; //activamos el boolean porque se ha encontrado para salir antes del IF
		}
		//si no se hubiera encontrado a la derecha del todo... hace falta un FOR para el resto de posibilidades de insercción
		for(int i=0; i<vector.length && encontrado == false; i++) {
			//tanto si inserto por la izquierda o por en medio, tengo que rotar los números a la derecha
			if(num < vector[i]) { //smp que el número sea más pequeño que el número por el que va el array habrá que rotar a la derecha...
				for(int j=vector.length-1; j>i; j--) { //en ese momento se comienza a recorrer el array desde el final a dónde se ha encontrado que es número e smás pequeño que el número por el que va del array
					vector[j] = vector[j-1]; //se rota un número hacia la derecha (se ordenan de menor a mayor)
				}
				vector[i] = num; //y en el número de la posición encontrada será colocado el número que insertamos
				encontrado = true; // se activa el boolean para salir antes del bucle IF
			}
		}
	}

}
