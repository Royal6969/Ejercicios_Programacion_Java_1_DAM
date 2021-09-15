package Repaso_M�todos;

public class Ejer_7_BusquedaPrimeraOcurrencia_VectorOrdenado_BusquedaDicot�mica {

/*
 * 7. Implementar un m�todo que permita buscar la primera ocurrencia de un elemento entero 
 * en un vector ordenado: algoritmo de la b�squeda dicot�mica.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vector = new int[10];
		int num = 5; //el n�mero del que voy a buscar su 1� ocurrencia
		int pos; //para recoger la posic�n de la 1� ocurrencia encontrada
		
		for(int i=0; i<vector.length; i++) {
			vector[i] = i;
			System.out.print(vector[i]+"\t");
		}
		System.out.println();
		
		pos = buscarPrimeraOcurrencia(vector, num);
		System.out.println(pos);
	}
	public static int buscarPrimeraOcurrencia(int[] vector, int num) {
		//la b�squeda dicot�mica se suele hacer con las variables "inferior", "superior" y "centro" dici�ndoles de antemano las posiciones que tienen
		int inferior = vector[0];
		int superior = vector[vector.length-1];
		int centro = 0;
		boolean salir = false;
		
		//B�squeda DICOT�MICA ---- (para que funcione tiene que estar ordenado)
		while(inferior <= superior && salir == false) { //mientras se parta de que el inferior sea menor qu eel superior (l�gico)...
			centro = (inferior + superior) / 2; //el centro se situar� en la mitad
			//posibilidades
			if(vector[centro] == num) { //si el n�mero del centro del array es el n�mero que se est� buscando...
				salir = true; //activamos el boolean y salimos antes del bucle IF
			}else if(num < vector[centro]) { //si el n�mero que buscamos es menor que el n�mero del centro del array
				superior = centro-1; //el superior se situar�a justo antes del centro
			}else { //si el n�mero que buscamos es mayor que el n�mero del centro del array
				superior = centro+1; //el superior se situar�a justo dps del centro
			}
		}
		if(salir == false) { //si no se ha encontrado el n�mero 
			centro = -1; //devolvemos un valor t�pcio de FALSE 
		}
		return centro; 
	}

}
