package Arrays_de_1_Dimension;

public class Ejer_8_RotarParesPrincipioImparesFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//8. Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en un Array.
		//El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del Array
		//(del 0 en adelante) y todos los números impares a las celdas restantes. 
		//Utiliza Arrays auxiliares si es necesario.
		
		int[] nums = new int[20];
		int[] AUX = new int[20];
		int par = 0;
		
		for(int i=0; i<20; i++) {
			nums[i] = (int) (Math.random()*101); 
			System.out.print(nums[i]+ " ");
		}
		for(int i=0; i<20; i++) {
			if(nums[i]%2==0) {
				AUX[par]=nums[i];//tengo que guardar en el AUX los números pares que se encuentren en el Nums[i]
				par++;
			}//aqui no puede haber else para los impares, se guardarían de nuevo sin respetar las posiciones de los pares
		}
		//ahora hay que recorrer otra vez el Array para buscar los impares
		for(int i=0; i<20; i++) {
			if(nums[i]%2!=0) {
				AUX[par]=nums[i];//el AUX par es solo un contador de posiciones, ahora nos llevaremos los impares
				par++;
			}
		}
		System.out.println();//dejar espacio desde que mostramos los números al principio
		System.out.println();
		
		//finalmente mostar por pantalla el Array AUX
		for(int i=0; i<20; i++) {
			System.out.print(AUX[i]+" ");//ahora el AUX va con el contador i porque está mostrando todo
		}
	}

}
