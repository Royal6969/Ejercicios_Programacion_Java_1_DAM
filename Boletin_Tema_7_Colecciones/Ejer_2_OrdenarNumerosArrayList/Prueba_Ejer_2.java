package Ejer_2_OrdenarNumerosArrayList;

import java.util.Scanner;

public class Prueba_Ejer_2 {

static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista_Numeros numeros = new Lista_Numeros();
		int num;
		
		for(int i=0; i<10; i++) {
			System.out.println((i+1)+" Introduzca un número");
			num = sc.nextInt();
			numeros.getObjeto().add(new Numeros(num));
		}
		System.out.println();
		
		//para mostrar
		for(int i=0; i<numeros.getObjeto().size(); i++) {
			System.out.print(numeros.getObjeto().get(i).getNum()+" ");
		}
		System.out.println();
		
		numeros.ordenarNumeros();
		
		for(int i=0; i<numeros.getObjeto().size(); i++) {
			System.out.print(numeros.getObjeto().get(i).getNum()+" ");
		}
		System.out.println();
	}

}
