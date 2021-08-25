package Practica_Inicial;

import java.util.Scanner;

public class LLenarUnArray_PedirDatosAlUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int CantidadNum;
		System.out.print("¿Cuántos números va a introducir? ");
		CantidadNum = sc.nextInt();
		
		int[] numeros = new int [CantidadNum];
		
		System.out.println("Ahora vamos a meter los números");
		for(int i=0; i<CantidadNum; i++) {
			System.out.print((i+1)+ " Introduzca el número "); //lo del (i+1) es un truco de estética, a modo de lista numerada, empezando desde (1.)
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("Los números guardados son");
		for(int i=0; i<CantidadNum; i++) {
			System.out.println(numeros[i]+ " ");
		}
	}

}
