package Cubos;

import java.util.Scanner;

public class Prueba_Cubo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//Cubo miCubito = new Cubo//aqui pulsar el ctrl+espacio
		Cubo miCubito = new Cubo(5, 3, "gris", "metal", true);
		Cubo laCubitera = new Cubo(8, 2);
		
		System.out.println("Cubo 1");
		System.out.println(miCubito);
		
		System.out.println("Cubo 2");
		System.out.println(laCubitera);
		
		miCubito.setContenido(4); //he cambiado el contenido por 4 en vez de 3
		
		System.out.println("Cubo 1");
		System.out.println(miCubito);
		
		miCubito.pasarAgua(2, laCubitera);
		
		System.out.println("Cubo 1");
		System.out.println(miCubito);
		
		//---------------------------------------
		
		System.out.println("Cubo 2");
		System.out.println(laCubitera);
		
	}

}
