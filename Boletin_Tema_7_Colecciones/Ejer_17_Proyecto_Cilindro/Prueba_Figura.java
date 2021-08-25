package Ejer_17_Proyecto_Cilindro;

import java.util.Scanner;

/* 
 * 17. PROYECTO CILINDRO:
A. Clase Punto (atributos double: x e y; void trasladar(double,double) ;double distancia())
B. Clase Circulo (atributos Punto centro y double radio:)
C. Clase Cuadrado (atributos Punto puntoInicial, int lado y float inclinación)
D. Clase Cilindro (atributos Circulo base y double altura)
La clase abstracta FiguraGeometrica implementa la interfaz DosDimensiones, ya que cualquier
figura tiene una posición en el plano.
Punto hereda de FiguraGeometrica, con lo que implícitamente implementa DosDimensiones,
pero además implementa Movible.
Circulo implementa Movible y Escalable, pero no Rotable.
Cuadrado implementa Movible, Escalable y Rotable.ROTAR RESPECTO AL ORIGEN: 90º (-y,x) 180º (-x,-y) 270º (y,-x) 360º (x,y)
 */

public class Prueba_Figura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		Punto x = new Punto(10, 20);
		Punto y = new Punto(30, 40);
		
		Circulo cc1 = new Circulo(x, 20);
		
		Cilindro cl1 = new Cilindro(cc1, 15.5);
		
		Cuadrado cd1 = new Cuadrado(x, 20, 35);
		
		double distancia;
		
		System.out.println(x);
		x.trasladar(50, 60);
		System.out.println(x);
		
		distancia = x.distancia(y);
		System.out.println(distancia);
		
		System.out.println(cc1);
		cc1.escalar(35);
		System.out.println(cc1);
		
		System.out.println(cd1);
		cd1.escalar(45);
		cd1.girar(65);
		System.out.println(cd1);
	}

}
