package Recursividad;

import java.util.Scanner;

public class Ej_3_SecuenciaNumericaEntre1yElNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3. Leer un n�mero positivo y mostrar la secuencia num�rica entre 1 y dicho n�mero.
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Introduzca un n�mero para saber todos los que hay antes");
		num = sc.nextInt();
		
		secuencia(num);
	}
	 public static void secuencia(int num) {
		 
		 if(num==1) {//ojo que es el contrario de lo que est� entrando, el 1 ser� el final
			 System.out.print("1 ");
		 
		 }else {
			 secuencia(num-1);
			 System.out.print(num+" ");
		 }
	 }

}
