package Repaso_M�todos;

public class Ejer_8_BuscarPrimeraOcurrencia_VectorDesordenado_BusquedaSecuencial {

/*
 * 8. Implementar un m�todo que permita buscar la primera ocurrencia de un elemento entero 
 * en un vector desordenado: algoritmo de b�squeda secuencial.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vector = new int[10];
		int num = 5; //el n�mero del que voy a buscar su 1� ocurrencia
		int pos; //para recoger la posic�n de la 1� ocurrencia encontrada
		
		for(int i=0; i<vector.length; i++) {
			vector[i] = i+1;
			System.out.print(vector[i]+"\t");
		}
		System.out.println();
		
		pos = buscarPrimeraOcurrencia(vector, num);
		System.out.println(pos+1);
	}
	public static int buscarPrimeraOcurrencia(int[] vector, int num) {
		int pos = -1; //t�pica variable de la posici�n con el valor negativo a modo FALSE
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
