package Ejer_8_ConjuntoNumeros_Tail_Head_Sub;

import java.util.SortedSet;
import java.util.TreeSet;

/*
 * 8. Crear un conjunto ordenado de 10 números enteros (orden natural) 
 * y probar los métodos siguientes:
 * 
 * a. tailSet
 * b. headSet
 * c. subSet
 */

public class Prueba_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortedSet<Integer> Lista_Numeros = new TreeSet<Integer>();
		
		Lista_Numeros.add(1);
		Lista_Numeros.add(2);
		Lista_Numeros.add(3);
		Lista_Numeros.add(4);
		Lista_Numeros.add(5);
		Lista_Numeros.add(6);
		Lista_Numeros.add(7);
		Lista_Numeros.add(8);
		Lista_Numeros.add(9);
		Lista_Numeros.add(10);
		
		System.out.println(Lista_Numeros.tailSet(8));
		System.out.println();
		System.out.println(Lista_Numeros.headSet(3));
		System.out.println();
		System.out.println(Lista_Numeros.subSet(4, 7));
		System.out.println();
	}

}
