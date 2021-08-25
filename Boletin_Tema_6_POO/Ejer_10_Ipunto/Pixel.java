package Ejer_10_Ipunto;

/*
 * D. Cree una clase Pixel que extienda la clase Punto anterior y que implemente el interfaz IPixel, 
 * añadiendo un atributo privado de tipo entero que denominaremos color. 
 * Los métodos propios de la clase Pixel serán:
 * 
 * a. Un constructor sin parámetros que pondrá a 0 todos los atributos.
 * b. Un constructor con parámetros que reciba un Punto y un entero para el color.
 * c. Un método imprime que redefina el método de la clase Punto escribiendo además el color.
 * d. Un método borrar que redefina el de la clase Punto poniendo el color a 0.
 * e. Un método cambiarcolor que cambie el color al valor que se le pasa como argumento.
 * ¿Qué cambios deberá hacer en los atributos Punto?
 * 
 * Haga un programa principal para probar todos los métodos construidos, 
 * tanto para la clase Punto, como para la clase Pixel. 
 * Compruebe cómo se pueden invocar los métodos de la clase Punto desde objetos de la clase Pixel.
 */

public class Pixel extends Punto implements Ipixel{

	//ATRIBUTO
	private int color;

	//a) CONSTRUCTOR 
	public Pixel(double x, double y) { //vacio significa que sin el atributo color
		super(x, y);
		this.color = 0;
		this.setX(0);
		this.setY(0);
	}

	//b) CONSTRUCTOR
	public Pixel(Punto punto, int color) {
		super(); //y se borra lo que estaba aqui dentro del super
		this.setX(punto.getX());
		this.setY(punto.getY());
		this.color = color;
	}

	//c)
	public void imprimir() {
		System.out.println("( "+this.getX()+" , "+this.getY()+" ) y el color es "+this.color);
	}
	
	public void borrar() { //no entra nada
		this.color = 0;
		this.setX(0);
		this.setY(0);
	}
	
	public void cambiarColor(int color) {
		this.color = color;
	}

}
