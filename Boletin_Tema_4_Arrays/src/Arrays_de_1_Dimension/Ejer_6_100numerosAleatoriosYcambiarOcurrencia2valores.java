package Arrays_de_1_Dimension;

import java.util.Scanner;

public class Ejer_6_100numerosAleatoriosYcambiarOcurrencia2valores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//6. Escribe un programa que genere 100 números aleatorios del 0 al 20 
		//y que los muestre por pantalla separados con espacios.
		//El programa pedirá entonces por teclado dos valores y a continuación 
		//cambiará todas las ocurrencias del primer valor por el segundo en la lista generada anteriormente.
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		
		int[] nums = new int[100];
		
		for(int i=0; i<100; i++) { //del 0 al 99 hay 100 numeros
			nums[i] = (int) (Math.random()*21);
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		System.out.println("Introduzca el 1º número");
		num1 = sc.nextInt();
		System.out.println("¿Por qué número quiere cambiar el 1º número?");
		num2 = sc.nextInt();
		
		for(int i=0; i<100; i++) {
			if(num1==nums[i]) {
				nums[i]=num2;
			}
			System.out.print(nums[i]+" ");
		}
	}

}
