package Arrays_de_1_Dimension;

import java.util.Scanner;

public class Ejer_10_INVESTIGAR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//10. INVESTIGAR:
		//Escribe un programa que rellene aleatoriamente un Array de 10 enteros.
		//Pedir un número al usuario y decir si está o no está.
		//Realizar una búsqueda secuencial; en la que se ha de recorrer el Array completo.
		//Posteriormente ordenar el Array y volver a pedir otro número al usuario para decir si está o no está
		//Realizar una búsqueda dicotómica o binaria, en la que NO se ha de recorrer el Array completo.
		
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
		System.out.println("Se han generado 10 números aleatorios entre 0 y 10");
		
		System.out.println("Introduzca un número para ver si está entre los 10 generados");
		num = sc.nextInt();
		
			for(int i=0; i<10 && salir==true; i++) {
				if(num==nums[i]) {
					salir=false;
				}
			}
		
			//Método burbuja
			
			for(int i=0; i<(10-1); i++) {
			//como el Metodo burbuja compara el número de una posición con el número de la siguiente
			//al llegar a la penúltima posición ya estaríamos comparando el último número del Array
			//con lo que no hace falta llegar hasta la última posición, y por eso, la posición(última)-1
				for(int j=0; j<(10-1); j++) {
				//este otro For sirve para ir haciendo los intercambios (en caso de detectar que el siguiente número sea mayor)
					if(nums[j]>nums[j+1]) { //if(numero actual>numero siguiente)
						AUX = nums[j]; //al auxiliar le damos el valor del número actual
						nums[j] = nums[j+1];// y al núemro actual le damos el valor del número siguiente
						nums[j+1] = AUX;//finalmente al número siguiente le damos el valor que metimos en el auxiliar (el número actual!!)
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
			
			//Búsqueda DICOTÓMICA
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
	
		System.out.println("Su número se ha encontrado entre los 10 generados");
		System.out.print(num+ " - ");
	}

}
