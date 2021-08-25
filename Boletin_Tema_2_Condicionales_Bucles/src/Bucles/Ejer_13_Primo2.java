package Bucles;

import java.util.Scanner;

public class Ejer_13_Primo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escribe un programa que diga si un n�mero introducido por teclado es o no primo. 
		//Un n�mero primo es aquel que s�lo es divisible entre �l mismo y la unidad.
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		boolean primo = true;
		int i; //contador de division
		
		System.out.println("Introduzca un n�mero para ver si es primo o no ");
		
		num = sc.nextInt();
		i=num-1;
		
		while(i>1 && primo==true) {
			if (num%i==0) { //si el resto es 0 entonces no es primo
				primo=false;
			}
			else {
				i--;
				}
			}
			
		if (primo==true) {
			System.out.println("El n�mero " +num+ " es primo");
			}
		else {
			System.out.println("El n�mero " +num+ " no es primo");
		}
		
	}

}
