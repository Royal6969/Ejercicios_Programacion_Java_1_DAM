package Bucles;

import java.util.Scanner;

public class Ejer_25_NumeroEnteroYsumaDigitosPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int numSC;
		int DigPar;
		int SumaPar = 0;
		int Reves = 0;
		
		System.out.print("Introduzca un n�mero ");
		numSC = sc.nextInt();
		
		while(numSC>0) {//darle la vuelta al numero
			Reves=(Reves*10)+(numSC%10); 
			numSC/=10;
		}
		System.out.print("Los n�meros pares son :");
		while(Reves>0) {
			if((Reves%10)%2==0){
				DigPar=Reves%10; //smp el %10 para coger el �ltimo d�gito
				SumaPar+=DigPar; //se va haciendo la suma
				System.out.print(DigPar);
				}
			
			Reves/=10;
			}
		System.out.println();
		
		System.out.println("La suma de las cifras pares " +SumaPar);
	}

}
