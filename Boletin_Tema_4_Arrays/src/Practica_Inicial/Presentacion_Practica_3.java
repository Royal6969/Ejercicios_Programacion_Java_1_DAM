package Practica_Inicial;

import java.util.Scanner;

public class Presentacion_Practica_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// almacenar cuatro enteros y elegir uno para mostrarlo posteriormente
		
		Scanner sc = new Scanner(System.in);
		
		int[] conjunto = new int [4];
		int cont;
		
		conjunto[0] = 55;
		conjunto[1] = 18;
		conjunto[2] = 88;
		conjunto[3] = 1;  
		// tmb se podr�a hacer ... int [] conjunto={55,18,80,1}
		
		System.out.println("�Qu� posici�n desea ver?");
		System.out.println("Introduzca una posici�n del 0 al 3");
		cont = sc.nextInt();
		
		System.out.println("El elemento de la posici�n "+cont+" es el conjunto "+conjunto[cont]);
		
		
	}

}
