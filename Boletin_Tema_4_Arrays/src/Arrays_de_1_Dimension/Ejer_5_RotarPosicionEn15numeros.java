package Arrays_de_1_Dimension;

import java.util.Scanner;

public class Ejer_5_RotarPosicionEn15numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//5. Escribe un programa que lea 15 números por teclado y que los almacene en un Array.
		//Rota una posición todos los elementos de ese Array, es decir, 
		//el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc.
		//El número que se encuentra en la última posición debe pasar a la posición 0.
		//Finalmente, muestra el contenido del Array.
		
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[15];
		int numGuardado =0; //Para guardar el valor del último número del Array nums
		
		System.out.println("Vamos a meter los 15 números");
		for(int i=0; i<15; i++) { //bucle meter datos por teclado
			System.out.println((i+1)+" Introduzca un número");
			nums[i] = sc.nextInt();
		}
		//este bucle hace que se vaya guardando el i-1, y que vaya hacia la derecha
		for(int i=(nums.length-1); i>=0; i--) { //se empieza por el final
			if(i==(nums.length-1)) { 
				numGuardado=nums[i];//guardar numero de la derecha
			}else if(i==0) { 
				//el valor de la derecha toma el valor que era antes su izquierda
				nums[i+1] = nums[i];//toma valor guardado del Array normal
				nums[i]=numGuardado; //que la posicion 0 tome el valor guardado
			}else {
				nums[i+1]=nums[i];
			}
		}
		for(int i=0; i<15; i++) {
			System.out.print(nums[i]+ " ");//Mostrar el resultado
		}
	}
	

}
