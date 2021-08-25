package Metodos;

public class Ejer_7_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Implementar un método que permita buscar la primera ocurrencia 
		//de un elemento entero en un vector ordenado: algoritmo de la búsqueda dicotómica.

		int[]Array = {1,2,3,4,5,6,7,8,9,10};
		int num = 5;
		int posicion;
		
		for(int i=0; i<Array.length; i++) {
			System.out.print(Array[i]+" ");
		}
		System.out.println();
		
		posicion = busquedaDicotomica(num, Array);
		System.out.println("La posición del número buscado es: "+(posicion+1));
		
	}
	public static int busquedaDicotomica(int num, int[]Array) {
		
		boolean salir = true;
		int inf = Array[0]; 
		int sup = Array[Array.length-1];  
		int centro = 0;
		
			//Búsqueda DICOTÓMICA ---- (para que funcione tiene que estar ordenado)
			while(inf<=sup && salir==true){
			     centro=(sup+inf)/2;
			    
			     if(Array[centro]==num) {
			    	 salir=false;
			     }else if(num<Array[centro]){
			        sup=centro-1;
			     }else {
			       inf=centro+1;
			     }
			   }
			  
			if(salir==true) {
			   centro=-1;
			}
		return centro;
	}

}
