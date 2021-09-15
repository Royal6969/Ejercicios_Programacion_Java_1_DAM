package Repaso_Métodos;

public class Ejer_7_BusquedaPrimeraOcurrencia_VectorOrdenado_BusquedaDicotómica {

/*
 * 7. Implementar un método que permita buscar la primera ocurrencia de un elemento entero 
 * en un vector ordenado: algoritmo de la búsqueda dicotómica.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vector = new int[10];
		int num = 5; //el número del que voy a buscar su 1º ocurrencia
		int pos; //para recoger la posicón de la 1º ocurrencia encontrada
		
		for(int i=0; i<vector.length; i++) {
			vector[i] = i;
			System.out.print(vector[i]+"\t");
		}
		System.out.println();
		
		pos = buscarPrimeraOcurrencia(vector, num);
		System.out.println(pos);
	}
	public static int buscarPrimeraOcurrencia(int[] vector, int num) {
		//la búsqueda dicotómica se suele hacer con las variables "inferior", "superior" y "centro" diciéndoles de antemano las posiciones que tienen
		int inferior = vector[0];
		int superior = vector[vector.length-1];
		int centro = 0;
		boolean salir = false;
		
		//Búsqueda DICOTÓMICA ---- (para que funcione tiene que estar ordenado)
		while(inferior <= superior && salir == false) { //mientras se parta de que el inferior sea menor qu eel superior (lógico)...
			centro = (inferior + superior) / 2; //el centro se situará en la mitad
			//posibilidades
			if(vector[centro] == num) { //si el número del centro del array es el número que se está buscando...
				salir = true; //activamos el boolean y salimos antes del bucle IF
			}else if(num < vector[centro]) { //si el número que buscamos es menor que el número del centro del array
				superior = centro-1; //el superior se situaría justo antes del centro
			}else { //si el número que buscamos es mayor que el número del centro del array
				superior = centro+1; //el superior se situaría justo dps del centro
			}
		}
		if(salir == false) { //si no se ha encontrado el número 
			centro = -1; //devolvemos un valor típcio de FALSE 
		}
		return centro; 
	}

}
