package Recursividad;

import java.util.Scanner;

public class Ejer_5_EsPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//5. Calcular si un número es par.
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Introduzca un número para saber si es par o no");
		num = sc.nextInt();
		
		num = esPar(num);
		
		if(num==0) {
			System.out.println("Es par");
		
		}else {
			System.out.println("Es impar");
		}
	}
	public static int esPar(int num) {
		
		if(num==0) {
			return 0;
		
		}else if (num==1){
			return 1;
		
		}else {
			return esPar(num-2);
		}
	}

}

		boleean fin = esPar()
				
		if(fin==true) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}

		boolean esPar (int num) {
			if(num==0) {
				return true;
			}else if(num==1) {
				return false;
			}else {
				return (esPar(num-2));
			}
		}
