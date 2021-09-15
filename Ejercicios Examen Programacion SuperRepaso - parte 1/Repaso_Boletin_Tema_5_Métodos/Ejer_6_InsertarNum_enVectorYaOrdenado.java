package Repaso_M�todos;

public class Ejer_6_InsertarNum_enVectorYaOrdenado {

/*
 * 6. Implementar un m�todo que permita insertar un elemento entero en un vector ordenado
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vector = new int[10]; //lo creo de 10 posiciones por ejemplo
		int num = 5; //el n�mero que voy a insertar es el 5
		
		for(int i=0; i<vector.length-1; i++) { //pongo el -1 para dejar la �ltima posici�n libre al generarlo
			vector[i] = i; //se va rellenando con su misma secuencia de recorrido
		}
		insertarElemento(vector, num);
		
		for(int i=0; i<vector.length; i++) {
			System.out.print(vector[i]+"\t");
		}
	}
	public static void insertarElemento(int[] vector, int num) {
		boolean encontrado = false;
		
		if(num > vector[vector.length-2]) { //si el n�mero que estoy metiendo es mayor que el pen�ltimo n�mero del array 
			//(recordar que la �ltima casilla est� vac�a asi que miro la pen�ltima)
			vector[vector.length-1] = num; //pues en la �ltima casilla meto el n�emro nuevo
			encontrado = true; //activamos el boolean porque se ha encontrado para salir antes del IF
		}
		//si no se hubiera encontrado a la derecha del todo... hace falta un FOR para el resto de posibilidades de insercci�n
		for(int i=0; i<vector.length && encontrado == false; i++) {
			//tanto si inserto por la izquierda o por en medio, tengo que rotar los n�meros a la derecha
			if(num < vector[i]) { //smp que el n�mero sea m�s peque�o que el n�mero por el que va el array habr� que rotar a la derecha...
				for(int j=vector.length-1; j>i; j--) { //en ese momento se comienza a recorrer el array desde el final a d�nde se ha encontrado que es n�mero e sm�s peque�o que el n�mero por el que va del array
					vector[j] = vector[j-1]; //se rota un n�mero hacia la derecha (se ordenan de menor a mayor)
				}
				vector[i] = num; //y en el n�mero de la posici�n encontrada ser� colocado el n�mero que insertamos
				encontrado = true; // se activa el boolean para salir antes del bucle IF
			}
		}
	}

}
