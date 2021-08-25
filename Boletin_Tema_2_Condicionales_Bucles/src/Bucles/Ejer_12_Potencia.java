package Bucles;

import java.util.Scanner;

public class Ejer_12_Potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//12.Escribe un programa que pida una base y un exponente (entero positivo) 
		//y que calcule la potencia.

		Scanner sc = new Scanner(System.in);
		
		int base;
		int exponente;
		int resultado = 1; //¿Por qué =1??
		
		System.out.println("Intruzca un número como base ");
		base = sc.nextInt();
		
		System.out.println("Introduzca un exponente para elevarlo");
		exponente = sc.nextInt();
		
		if(exponente == 0 ) {
			resultado=1;
		}
		if(exponente > 0) {
			for(int i=0; i<exponente; i++) { //
				resultado*=base;			//
			}
		}
		if(exponente < 0) {
			for(int i=0; i< -exponente; i++) {
				resultado*=base;
			}
			//resultado= 1/resultado;
		}
		System.out.println(base+ " ^ " +exponente+ " = " +resultado);
		
	}

}
