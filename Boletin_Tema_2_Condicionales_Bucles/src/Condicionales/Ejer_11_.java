package Condicionales;

import java.util.Scanner;

public class Ejer_11_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calcular las soluciones de una ecuación de segundo grado (ax2+bx+c=0). 
		//Si la raíz cuadradada es de una cantidad positiva: 
		//((-b+raiz(b*b-4*a*c))/2*a); y en caso contrario: ((-b)/2*a+ raiz(abs((b*b-4*a*c)/2*a))i). Ídem con resta
		
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
		
		x=b*b-4*a*c; //formula raiz cuadrada de ecuacion de 2º grado
		
		if(x>=0) {
			 x = ((-b+Math.sqrt(b*b-4*a*c))/2*a);
			 System.out.println("La 1º solución es " +x);
			 x = ((-b-Math.sqrt(b*b-4*a*c))/2*a); //cambio el + por un - para hacer la raiz version negativa
			 System.out.println("La 2º solución es " +x);
		}else { //no hace falta especificarlo
			x=((-b)/2*a+ Math.sqrt(Math.abs((b*b-4*a*c)/2*a)));
			System.out.println("La 1º solución es " +x);
			x=((-b)/2*a- Math.sqrt(Math.abs((b*b-4*a*c)/2*a)));//cambio el + por un - para hacer la raiz version negativa
			System.out.println("La 2º solución es " +x);
		}
	}

}
