package Ejer_10_Punto;
import java.util.Scanner;
public class Prueba_Punto {
static Scanner sc = new Scanner(System.in);
/*
 * ¿Qué cambios deberá hacer en los atributos Punto?

Haga un programa principal para probar todos los métodos construidos, tanto para la
clase Punto, como para la clase Pixel. Compruebe cómo se pueden invocar los métodos
de la clase Punto desde objetos de la clase Pixel
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Punto p1 = new Punto(2, 2);
		Punto p2 = new Punto(10, 10);
		Pixel p3 = new Pixel(p1, 1);
		Pixel p4 = new Pixel(p2, 2);

		double distancia = 0;
		
		p1.imprimirCoordenadas();
		p1.mover_v1(4, 4);
		p1.imprimirCoordenadas();
		p1.mover_v2(p2);
		p1.imprimirCoordenadas();
		distancia = p1.distanciaOrigen();
		System.out.println(distancia);
		System.out.println();
		
		p1.borrar();
		p1.imprimirCoordenadas();
		System.out.println();
		
		p1.imprimirCoordenadas();
		p2.imprimirCoordenadas();
		distancia = p2.distancia(p1);
		System.out.println(distancia);
		System.out.println();
		
		p3.imprimirCoordenadas();
		p3.cambiarColor(2);
		p4.imprimirCoordenadas();
		p4.borrar();
		p4.imprimirCoordenadas();
	}

}
