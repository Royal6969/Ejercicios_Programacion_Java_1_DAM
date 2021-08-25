package Arrays_de_1_Dimension;

import java.util.Scanner;

public class Ejer_10_INVESTIGAR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//10. INVESTIGAR:
		//Escribe un programa que rellene aleatoriamente un Array de 10 enteros.
		//Pedir un n�mero al usuario y decir si est� o no est�.
		//Realizar una b�squeda secuencial; en la que se ha de recorrer el Array completo.
		//Posteriormente ordenar el Array y volver a pedir otro n�mero al usuario para decir si est� o no est�
		//Realizar una b�squeda dicot�mica o binaria, en la que NO se ha de recorrer el Array completo.
		
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[10];
		int num;
		boolean salir=true;
		int AUX;
		
		int n = nums.length;
		int centro,inf=0,sup=n-1;
		
		for(int i=0; i<10; i++) {
			nums[i] = (int)(Math.random()*11);
			//System.out.print(nums[i]+ " - "); NO HAY QUE MOSTRARLO
		}
		System.out.println("Se han generado 10 n�meros aleatorios entre 0 y 10");
		
		System.out.println("Introduzca un n�mero para ver si est� entre los 10 generados");
		num = sc.nextInt();
		
			for(int i=0; i<10 && salir==true; i++) {
				if(num==nums[i]) {
					salir=false;
				}
			}
		
			//M�todo burbuja
			
			for(int i=0; i<(10-1); i++) {
			//como el Metodo burbuja compara el n�mero de una posici�n con el n�mero de la siguiente
			//al llegar a la pen�ltima posici�n ya estar�amos comparando el �ltimo n�mero del Array
			//con lo que no hace falta llegar hasta la �ltima posici�n, y por eso, la posici�n(�ltima)-1
				for(int j=0; j<(10-1); j++) {
				//este otro For sirve para ir haciendo los intercambios (en caso de detectar que el siguiente n�mero sea mayor)
					if(nums[j]>nums[j+1]) { //if(numero actual>numero siguiente)
						AUX = nums[j]; //al auxiliar le damos el valor del n�mero actual
						nums[j] = nums[j+1];// y al n�emro actual le damos el valor del n�mero siguiente
						nums[j+1] = AUX;//finalmente al n�mero siguiente le damos el valor que metimos en el auxiliar (el n�mero actual!!)
					}
				}
			}
			//ahora para mostrar el Array ordenado (ascendente)
			System.out.println("El Array ordenado de forma ascendente es: ");
			for(int i=0; i<10; i++) {
			System.out.print(nums[i]+ " ");
			}
			
			//ahora para mostrar el Array ordenado (descendente)
			System.out.println("El Array ordenado de forma descendiente es: ");
			for(int i=9; i>=0; i--) {
			System.out.print(nums[i]+ " "); 
			}
			
		while(salir==true) {
			
			//B�squeda DICOT�MICA
			while(inf<=sup && salir==true){
			     centro=(sup+inf)/2;
			     if(nums[centro]==num) {
			    	 salir=false;
			     }else if(num<nums[centro]){
			        sup=centro-1;
			     }
			     else {
			       inf=centro+1;
			     }
			   }
			   if(salir==true) {
			   System.out.println("No has acertado");
			   }
			 
		}
	
		System.out.println("Su n�mero se ha encontrado entre los 10 generados");
		System.out.print(num+ " - ");
	}

}
