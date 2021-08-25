package Bucles;

import java.util.Scanner;

public class Ejer_10_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int Fibo1 = 0;
		int Fibo2 = 1;
		int FiboAux;
		int N; //cuantas veces se repite
		
		System.out.println("Introduzca cuantos número quiere que se muestren");
		
		N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			FiboAux=Fibo1+Fibo2;
			
			System.out.println(FiboAux);
		
			Fibo1=Fibo2; //avanzan un puesto en la secuencia de sumar
			Fibo2=FiboAux; 
			}
		
	}

}
