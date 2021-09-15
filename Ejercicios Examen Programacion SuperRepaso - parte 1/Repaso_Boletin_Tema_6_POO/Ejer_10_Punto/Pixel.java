package Ejer_10_Punto;
/*
 * D. Cree una clase Pixel que extienda la clase Punto anterior y que implemente el interfaz IPixel,
añadiendo un atributo privado de tipo entero que denominaremos color. 
Los métodos propios de la clase Pixel serán:

a. Un constructor sin parámetros que pondrá a 0 todos los atributos.
b. Un constructor con parámetros que reciba un Punto y un entero para el color.
c. Un método imprime que redefina el método de la clase Punto escribiendo además el color.
d. Un método borrar que redefina el de la clase Punto poniendo el color a 0.
e. Un método cambiarcolor que cambie el color al valor que se le pasa como argumento.
 */
public class Pixel extends Punto implements Ipixel{

	//añadiendo un atributo privado de tipo entero que denominaremos color.
	private int color;

	//a. Un constructor sin parámetros que pondrá a 0 todos los atributos.
	public Pixel() { //si dice sin parámetros... como esque en la solucion si recibe double x y double y??
		super();
		this.setX(0);
		this.setY(0);
		//this.setOrigen(getOrigen()); este sobra
		this.color = 0;
	}
	
	//b. Un constructor con parámetros que reciba un Punto y un entero para el color.
	public Pixel(Punto punto, int color) { //era generando el CONSTRUCTOR Lleno y añadiendo cositas
		//super();
		this.setX(punto.getX());
		this.setY(punto.getY());
		this.color = color;
		//por qué aqui en la solucion se setean las coordenadas del punto?? si no dice nada de hacer eso...
	}
	
	//c. Un método imprime que redefina el método de la clase Punto escribiendo además el color.
	public void imprimirCoordenadas() {
		System.out.println("("+this.getX()+", "+this.getY()+") con color: "+this.color);
	}
	
	//d. Un método borrar que redefina el de la clase Punto poniendo el color a 0.
	public void borrar() {
		this.setX(0); 
		this.setY(0);
		this.color = 0;
	}
	
	//e. Un método cambiarcolor que cambie el color al valor que se le pasa como argumento.
	public void cambiarColor(int num1) {
		this.color = num1;
	}
}
