package Practica_Inicial;

import java.util.Scanner;

public class LLenarUnArray_PedirDatosAlUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int CantidadNum;
		System.out.print("�Cu�ntos n�meros va a introducir? ");
		CantidadNum = sc.nextInt();
		
		int[] numeros = new int [CantidadNum];
		
		System.out.println("Ahora vamos a meter los n�meros");
		for(int i=0; i<CantidadNum; i++) {
			System.out.print((i+1)+ " Introduzca el n�mero "); //lo del (i+1) es un truco de est�tica, a modo de lista numerada, empezando desde (1.)
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("Los n�meros guardados son");
		for(int i=0; i<CantidadNum; i++) {
			System.out.println(numeros[i]+ " ");
		}
	}

}
