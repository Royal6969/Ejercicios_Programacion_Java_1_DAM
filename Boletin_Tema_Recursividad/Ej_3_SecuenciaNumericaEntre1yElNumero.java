package Recursividad;

import java.util.Scanner;

public class Ej_3_SecuenciaNumericaEntre1yElNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3. Leer un número positivo y mostrar la secuencia numérica entre 1 y dicho número.
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Introduzca un número para saber todos los que hay antes");
		num = sc.nextInt();
		
		secuencia(num);
	}
	 public static void secuencia(int num) {
		 
		 if(num==1) {//ojo que es el contrario de lo que está entrando, el 1 será el final
			 System.out.print("1 ");
		 
		 }else {
			 secuencia(num-1);
			 System.out.print(num+" ");
		 }
	 }

}
