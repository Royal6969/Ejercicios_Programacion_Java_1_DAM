package Ejer_10_Ipunto_Internet;

import java.util.Scanner;

	//Construya una clase Punto que implemente la interface Ipunto
	public class Punto implements Ipunto{
	//tenga dos atributos privados de tipo doublé denominados x e y
	private double x=0;
	private double y=0;
	
	//y un atributo estático público llamado origen de tipo Punto con los valores 0 y 0.
	public static Punto origen=new Punto();
	
	//Un constructor sin parámetros que defina el punto (0, 0)
	public Punto () {
		x=0;
		y=0;
	}
	
	//Un constructor que reciba dos valores de tipo doble para cada atributo.
	public Punto (double a, double b) {	
		x=a;
		y=b;
	}
	
	@Override
	
	//Un método borrar que ponga a 0 los dos atributos.
	public void borrar () {
		x=0;
		y=0;
	}
	
	//Un método mover que dado los valores pasados como parámetros cambie los atributos x e y.
	public void mover (double a, double b) {
		x=a;
		y=b;
	}
	
	//Un método distancia que calcule la distancia entre el Punto que invoca y otro que es pasado como argumento. Utilice el método sqrt de la clase Math.
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}

	public double distancia (Punto puntoDistancia) {
		double a = 0;
		double b = 0;
		double resultado=0;
		a=puntoDistancia.getX();
		b=puntoDistancia.getY();
		resultado= Math.sqrt((a-x)*(a-x)+(b-y)*(b-y));
		return resultado;
	}
	
	//Un método estático cambiarorigen que cambie el atributo origen por el punto que se le pasa como argumento.
	
	public static void cambiaOrigen(Punto nuevoPunto) {
		origen=nuevoPunto; 
	}
	
	//Un método distanciaorigen que calcula la distancia al origen utilizando el método distancia.
	
	public double distanciaOrigen () {
		double resultado=0; 
		resultado=distancia (origen); 
		return resultado;
	}
	
	//Un método imprime que saca por pantalla los valores de los atributos con el siguiente formato “(x, y)”
	public void imprime () {
		System.out.println("(" + x + ", " + y + ")");
	}
	
	//Una clase que implementa una interfaz debe implementar TODOS sus métodos, así que implemento el resto aquí:
	public void setX(double valorX){
		x=valorX;
	}
	
	public void setY(double valorY) {
		y=valorY;
	}
	
	public void Mover (Ipunto valorIpunto) {
		x=valorIpunto.getX();
		y=valorIpunto.getY();
	}
}
