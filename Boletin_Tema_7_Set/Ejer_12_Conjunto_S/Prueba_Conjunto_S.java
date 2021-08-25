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
		int tama�o, comunes;
		
		pruebaConjunto1.a�adir("hadios");
		pruebaConjunto1.a�adir("hello");
		pruebaConjunto1.a�adir("zeta");
		
		tama�o = pruebaConjunto1.tama�o();
		System.out.println(tama�o);
		
		if(pruebaConjunto1.esVacio()) {
			System.out.println("El conjunto est� vac�o");
		}else {
			System.out.println("El conjunto est� lleno");
		}
		
		pruebaConjunto2.a�adir("aloha");
		pruebaConjunto2.a�adir("medium");
		pruebaConjunto2.a�adir("zeta");
		
		comunes = pruebaConjunto1.comunes(pruebaConjunto2);
		System.out.println(comunes);
		
		list1 = pruebaConjunto1.aLista();
		System.out.println(list1);
		
		pruebaConjunto3 = Conjunto_S.examen(pruebaConjunto1);
		System.out.println(pruebaConjunto3);
	}

}
