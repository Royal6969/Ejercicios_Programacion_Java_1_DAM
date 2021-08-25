package Metodos;

public class Ejer_3_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea la función de manejo de arrays que tenga la siguiente cabecera 
		//y que haga lo que se especifica en los comentarios 
		//(puedes incluirla en tu propia biblioteca de rutinas):
		//public static int[] filtraPrimos(int x[]). 
		//Devuelve un array con todos los números primos que se encuentren en otro array que se pasa como parámetro. 
		//Obviamente el tamaño del array que se devuelve será menor o igual al que se pasa como parámetro.
		//Utiliza esta función en un programa para comprobar que funcionan bien. 
		//Para que el ejercicio resulte más fácil, las repeticiones de primos se conservan; es decir, 
		//si en el array x el número 13 se repite 3 veces, en el array devuelto también estará repetido 3 veces. 
		//Si no existe ningún número primo en x, se devuelve un array con el número -1 como único elemento.
	
		int[]Array = {1,2,3,4,5,6,7,8,9,10};
		int[]Vector = new int[Array.length];
		
		Vector = filtraPrimo(Array);
		System.out.println();
		mostrarSolucion(Vector);
		
	}
	//MÉTODO 1 - ES PRIMO ??
		public static boolean esPrimo(int num) {
			
			boolean primo = true;
			
			for(int i=2; i<num && primo==true; i++) {
				if(num%i==0) {
					primo=false;
				}
			}
				if(primo==true) {
					return true;
				}else {
					return false;
				}
		}
	//MÉTODO 2 - FILTRA PRIMOS
	public static int[] filtraPrimo(int[]Array) {
	
		int[]Vector = new int[Array.length]; //recreando el Vector
		int contador = 0; //para situarse en la 1º posicion del Vector
		
		for(int i=0; i<Array.length; i++) {
			if(esPrimo(Array[i])==true) {
				Vector[contador]=Array[i];
				contador++; //para ir a la siguiente posición del vector
			}
		}
		return Vector;
	}
	//MÉTODO 3 - MOSTRAR SOLUCION
	public static void mostrarSolucion(int[]Array) {
		
		if(Array[0]==0) {//si No hay ningún número Primo, SOLO se muestra un -1 en el Vector solución
			Array[0]=-1;
			System.out.println(Array[0]);
		}else {
			for(int i=0; i<Array.length; i++) {
				if(Array[i]==0) {//si no captura ningun valor de si es primo o no...
					System.out.print("");//mejor que muestre un espacio  vacio
				}else {
					System.out.print(Array[i]+" ");
				}
			}
		}
		
	}

}
