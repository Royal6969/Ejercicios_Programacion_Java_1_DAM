package Recursividad;

import java.util.Scanner;

public class Ejer_7_ConvertirDecimalEnBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//7. Escribir un número decimal en binario.
		//a. Caso Base si n<2 el binario es él mismo, luego: escribir n.
		//b. Si n>=2, en binario es el resultado de la división entera entre n y 2, 
		//seguido del resto de dividir n entre 2.
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Introduzca un número decimal para pasarlo a binario");
		num = sc.nextInt();
		
		convertirBinario(num);
	}
	public static void convertirBinario(int num) {
		
		if(num<2) {
			System.out.print(num);
			
		}else {
			convertirBinario(num/2);
			System.out.print(num%2);
		}
	}

}
