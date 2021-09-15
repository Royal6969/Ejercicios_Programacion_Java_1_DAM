package Ejer_2_GenerarNumerosSinRepetir;
/*
 * 2. Generar 20 números, con rango entre 5 y 55, sin repeticiones.
 */
import java.util.HashSet;
import java.util.Set;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num; //el número que vamos a generar y a meter en el hashSet
		
		Set<Integer> numeros = new HashSet<Integer>(); //creo el set tipo HashSet
		
		for(int i=0; i<20; i++) {
			num = (int)(Math.random()*(55-5+1)+5);
			numeros.add(num); //tiene el .add() como los ArrayList
		}
		System.out.println(numeros.toString()); //con el toString se imprimen fácilmente
	}

}
