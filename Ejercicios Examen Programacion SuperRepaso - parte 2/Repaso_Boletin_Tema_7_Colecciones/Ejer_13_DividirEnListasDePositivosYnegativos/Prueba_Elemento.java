package Ejer_13_DividirEnListasDePositivosYnegativos;

import java.util.ArrayList;

/*
 * 12. Eliminar elementos repetidos de una lista de nodos de tipo Elemento.
 */
public class Prueba_Elemento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista_Elementos numeros = new Lista_Elementos();
		
		Elemento num1 = new Elemento(1);
		Elemento num2 = new Elemento(-2);
		Elemento num3 = new Elemento(3);
		Elemento num4 = new Elemento(-5);
		Elemento num5 = new Elemento(2);
		Elemento num6 = new Elemento(-6);
		Elemento num7 = new Elemento(7);
		Elemento num8 = new Elemento(-5);
		
		numeros.getLista_elementos().add(num1);
		numeros.getLista_elementos().add(num2);
		numeros.getLista_elementos().add(num3);
		numeros.getLista_elementos().add(num5);
		numeros.getLista_elementos().add(num2);
		numeros.getLista_elementos().add(num6);
		numeros.getLista_elementos().add(num7);
		numeros.getLista_elementos().add(num5);
		
		System.out.println("Lista original de los números");
		imprimirListado(numeros);
		System.out.println();
		divisionSublistasPosNeg(numeros);
		
		
	}
	//MÉTODOS
	//para imprimir
	public static void imprimirListado(Lista_Elementos numeros) {
		for(int i=0; i<numeros.getLista_elementos().size(); i++) {
			System.out.print(numeros.getLista_elementos().get(i).getNum()+"\t");
		}
		System.out.println();
	}
	//para eliminar repetidos
	public static void divisionSublistasPosNeg(Lista_Elementos numeros) {
		//para separar en sublistas, lo 1º será crear otros dos ArrayList auxiliares
		Lista_Elementos positivos = new Lista_Elementos();
		Lista_Elementos negativos = new Lista_Elementos();
		
		for(int i=0; i<numeros.getLista_elementos().size(); i++) {
			int num;
			num = numeros.getLista_elementos().get(i).getNum();
			
			if(num >= 0) {
				Elemento nPositivo = new Elemento(num); 
				positivos.getLista_elementos().add(nPositivo);
			}else {
				Elemento nNegativo = new Elemento(num);
				negativos.getLista_elementos().add(nNegativo);
			}
		}
		System.out.println();
		imprimirListado(positivos);
		System.out.println();
		imprimirListado(negativos);
		System.out.println();
	}

}
