package Ejer_10_JuanCarlos;

public class Pixel extends Punto implements IPixel{
	private int color;

	public Pixel(double x, double y) {
		super(x, y);
		this.setX(0);
		this.setY(0);
		this.color=0;
	}

	public Pixel(Punto punto, int color) {
		super();
		this.setX(punto.getX());
		this.setY(punto.getY());
		this.color=color;
	}
	

	
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	
	
	public void imprime() {
		System.out.println("( "+this.getX()+" "+this.getY()+" ) "+this.color);
	}
	
	public void borrar() {
		this.setX(0);
		this.setY(0);
		this.color=0;
	}
	public void cambiacolor(int num) {
		this.color=num;
	}
	/*
	a. Un constructor sin par�metros que pondr� a 0 todos los atributos.
	b. Un constructor con par�metros que reciba un Punto y un entero para el color.
	c. Un m�todo imprime que redefina el m�todo de la clase Punto escribiendo adem�s el
	color.
	d. Un m�todo borrar que redefina el de la clase Punto poniendo el color a 0.
	e. Un m�todo cambiarcolor que cambie el color al valor que se le pasa como argumento.
	�Qu� cambios deber� hacer en los atributos Punto?
	.*/
}
