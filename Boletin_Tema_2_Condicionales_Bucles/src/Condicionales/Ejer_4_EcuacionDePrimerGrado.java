package Condicionales;

import java.util.Scanner;

public class Ejer_4_EcuacionDePrimerGrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Resoluci�n de una ecuaci�n de primer grado: ax+b=0. 
		//Siendo a y b los datos de entrada, la posibles soluciones son:
		// Si a<>0 x=-b/a
		//		 Si a=0 y b<>0 soluci�n imposible
		//		 Si a=0 y b=0 soluci�n indeterminada
		
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double x;
		
		System.out.println("Escriba el valor para (a)");
		a = sc.nextDouble();
		System.out.println("Ahora escriba el valor para (b)");
		b = sc.nextDouble();
		
		if(a!=0) {
			x=-b/a;
			System.out.println("La soluci�n es " +x);
	
		}else if (b!=0){ //se sobreentiende que a=0
			System.out.println("La soluci�n es imposible");
		}else {// la ultima opcion que queda, el else va solo
			//se sobreentiende que la b=0
			System.out.println("La soluci�n es indeterminda");
		}
	}

}
