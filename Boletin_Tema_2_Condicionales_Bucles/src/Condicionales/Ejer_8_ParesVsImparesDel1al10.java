package Condicionales;

import java.util.Scanner;

public class Ejer_8_ParesVsImparesDel1al10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Leer un n�mero entre uno y diez y visualizar si es par o impar.
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduzca un n�mero del 1 al 10");
		num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("El n�mero " +num+ " es par");
			}else {
				System.out.println("El n�mero " +num+ " es impar");
			}
	}

}
