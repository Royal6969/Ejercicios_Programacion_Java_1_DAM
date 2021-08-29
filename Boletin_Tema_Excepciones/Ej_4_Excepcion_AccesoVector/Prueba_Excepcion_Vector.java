package Ej_4_Excepcion_AccesoVector;

import java.util.Scanner;

public class Prueba_Excepcion_Vector {
	
static Scanner sc = new Scanner(System.in);

//4. Intentar acceder al elemento de índice 80 de un vector de 10 enteros, 
//capturando la excepción correspondiente y emitiendo un mensaje por consola.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vector = {1,2,3,4,5,6,7,8,9,10};
		
	}
	public static void accederPosicion(int[] vector) {
		
		int posicion;
		System.out.println("Indique a que posición del Array quiere acceder para ver su valor");
		posicion = sc.nextInt();
		
		try {
			if(posicion<vector.length) {
				System.out.println(vector[posicion]);
			}else {
				throw new Excepcion_Vector();
			}
		
		}catch (Excepcion_Vector e) {
			System.out.println(e.toString());
		}
	}

}
