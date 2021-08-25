package Metodos;

public class Ejer_5_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea la función de manejo de arrays que tenga la siguiente cabecera 
		//y que haga lo que se especifica en los comentarios (puedes incluirla en tu propia biblioteca de rutinas):
		//public int[] filtraCon7(int x[])
		//Devuelve un array con todos los números que contienen el 7 (por ej. 7, 27, 782)
		//que se encuentren en otro array que se pasa como parámetro. 
		//El tamaño del array que se devuelve será menor o igual al que se pasa como parámetro. 
		//Utiliza esta función en un programa para comprobar que funcionan bien. 
		//Para que el ejercicio resulte más fácil, las repeticiones de números que contienen 7 se conservan; 
		//es decir, si en el array x el número 875 se repite 3 veces, 
		//en el array devuelto también estará repetido 3 veces. 
		//Si no existe ningún número que contiene 7 en el array x, se devuelve un array con el número -1 como único elemento.
	
		int[]Array = {70, 120, 587, 600, 1490, 1587, 2000, 2007, 3999, 7000};
		int[]Vector = new int[Array.length];
		Vector = filtraCon7(Array);
		
		if(Vector[0]==0) {
			Vector[0]=-1;
			System.out.println(Vector[0]);
		
		}else {
		
			for(int i=0; i<Vector.length; i++) {
				if(Vector[i]==0) {
					System.out.println("");
				}else {
					System.out.print(Vector[i]+" ");
				}
			}
		}
		
	}
	public static int[] filtraCon7(int[]Array) {
		
		boolean encontrado = false;
		int[]Vector = new int[Array.length];
		int AUX = 0;
		int posicion = 0;
		
		for(int i=0; i<Array.length; i++) {
			AUX=Array[i];
			encontrado=false;
			
			while(AUX>0 && encontrado==false) {
				if(AUX%10==7) {
					encontrado=true;
					Vector[posicion]=Array[i];
					posicion++;
				}
				AUX/=10;
			}
		}
		return Vector;
	}

}
