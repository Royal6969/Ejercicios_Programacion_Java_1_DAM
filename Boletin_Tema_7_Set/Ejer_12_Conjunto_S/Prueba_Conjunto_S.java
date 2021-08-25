package Ejer_12_Conjunto_S;

import java.util.ArrayList;
import java.util.List;

public class Prueba_Conjunto_S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conjunto_S pruebaConjunto1 = new Conjunto_S();
		Conjunto_S pruebaConjunto2 = new Conjunto_S();
		Conjunto_S pruebaConjunto3 = new Conjunto_S();
		List<String> list1 = new ArrayList<String>();
		int tamaño, comunes;
		
		pruebaConjunto1.añadir("hadios");
		pruebaConjunto1.añadir("hello");
		pruebaConjunto1.añadir("zeta");
		
		tamaño = pruebaConjunto1.tamaño();
		System.out.println(tamaño);
		
		if(pruebaConjunto1.esVacio()) {
			System.out.println("El conjunto está vacío");
		}else {
			System.out.println("El conjunto está lleno");
		}
		
		pruebaConjunto2.añadir("aloha");
		pruebaConjunto2.añadir("medium");
		pruebaConjunto2.añadir("zeta");
		
		comunes = pruebaConjunto1.comunes(pruebaConjunto2);
		System.out.println(comunes);
		
		list1 = pruebaConjunto1.aLista();
		System.out.println(list1);
		
		pruebaConjunto3 = Conjunto_S.examen(pruebaConjunto1);
		System.out.println(pruebaConjunto3);
	}

}
