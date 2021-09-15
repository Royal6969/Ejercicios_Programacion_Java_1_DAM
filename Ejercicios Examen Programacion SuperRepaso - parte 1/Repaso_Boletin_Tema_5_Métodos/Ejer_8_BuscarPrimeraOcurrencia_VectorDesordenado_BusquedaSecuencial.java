package Repaso_Métodos;

public class Ejer_8_BuscarPrimeraOcurrencia_VectorDesordenado_BusquedaSecuencial {

/*
 * 8. Implementar un método que permita buscar la primera ocurrencia de un elemento entero 
 * en un vector desordenado: algoritmo de búsqueda secuencial.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vector = new int[10];
		int num = 5; //el número del que voy a buscar su 1º ocurrencia
		int pos; //para recoger la posicón de la 1º ocurrencia encontrada
		
		for(int i=0; i<vector.length; i++) {
			vector[i] = i+1;
			System.out.print(vector[i]+"\t");
		}
		System.out.println();
		
		pos = buscarPrimeraOcurrencia(vector, num);
		System.out.println(pos+1);
	}
	public static int buscarPrimeraOcurrencia(int[] vector, int num) {
		int pos = -1; //típica variable de la posición con el valor negativo a modo FALSE
		boolean encontrado = false;
		
		for(int i=0; i<vector.length && encontrado == false; i++) {
			if(vector[i] == num) {
				pos = i;
				encontrado = true;
			}
		}
		return pos;
	}

}
