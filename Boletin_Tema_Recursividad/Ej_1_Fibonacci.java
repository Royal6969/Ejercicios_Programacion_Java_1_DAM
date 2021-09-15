package Recursividad;

import java.util.Scanner;

public class Ej_1_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Obtener el n�mero de fibonacci de un t�rmino le�do desde teclado. 
		//Fib(0)=0 
		//Fib(1)=1 
		//Fib(n)=Fib(n-1)+Fib(n-2)

		Scanner sc = new Scanner(System.in);
	
		int num;
		
		System.out.println("Introduzca un n�mero para Fibonacci");
		num = sc.nextInt();
		
		num = fibonacci(num);
		System.out.println("El fibonacci del n�mero es "+num);
		
	}
	public static int fibonacci(int num) {
		
		if(num==0) {
			return 0;
		
		}else if(num==1) {
			return 1;
		
		}else {
			return (fibonacci(num-1)+fibonacci(num-2));
		}
	}
}
