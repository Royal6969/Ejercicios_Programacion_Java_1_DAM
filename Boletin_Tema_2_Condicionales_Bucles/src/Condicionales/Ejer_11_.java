package Condicionales;

import java.util.Scanner;

public class Ejer_11_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calcular las soluciones de una ecuaci�n de segundo grado (ax2+bx+c=0). 
		//Si la ra�z cuadradada es de una cantidad positiva: 
		//((-b+raiz(b*b-4*a*c))/2*a); y en caso contrario: ((-b)/2*a+ raiz(abs((b*b-4*a*c)/2*a))i). �dem con resta
		
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double x;
		
		System.out.println("Introduzca un valor para (a) ");
		a = sc.nextDouble();
		System.out.println("Introduzca un valor para (b) ");
		b = sc.nextDouble();
		System.out.println("Introduzca un valor para (c) ");
		c = sc.nextDouble();
		
		x=b*b-4*a*c; //formula raiz cuadrada de ecuacion de 2� grado
		
		if(x>=0) {
			 x = ((-b+Math.sqrt(b*b-4*a*c))/2*a);
			 System.out.println("La 1� soluci�n es " +x);
			 x = ((-b-Math.sqrt(b*b-4*a*c))/2*a); //cambio el + por un - para hacer la raiz version negativa
			 System.out.println("La 2� soluci�n es " +x);
		}else { //no hace falta especificarlo
			x=((-b)/2*a+ Math.sqrt(Math.abs((b*b-4*a*c)/2*a)));
			System.out.println("La 1� soluci�n es " +x);
			x=((-b)/2*a- Math.sqrt(Math.abs((b*b-4*a*c)/2*a)));//cambio el + por un - para hacer la raiz version negativa
			System.out.println("La 2� soluci�n es " +x);
		}
	}

}
