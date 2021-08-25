package Ejer_17_Proyecto_Cilindro;

/* 
 * 17. PROYECTO CILINDRO:
A. Clase Punto (atributos double: x e y; void trasladar(double,double) ;double distancia())
B. Clase Circulo (atributos Punto centro y double radio:)
C. Clase Cuadrado (atributos Punto puntoInicial, int lado y float inclinaci�n)
D. Clase Cilindro (atributos Circulo base y double altura)
La clase abstracta FiguraGeometrica implementa la interfaz DosDimensiones, ya que cualquier
figura tiene una posici�n en el plano.
Punto hereda de FiguraGeometrica, con lo que impl�citamente implementa DosDimensiones,
pero adem�s implementa Movible.
Circulo implementa Movible y Escalable, pero no Rotable.
Cuadrado implementa Movible, Escalable y Rotable.ROTAR RESPECTO AL ORIGEN: 90� (-y,x) 180� (-x,-y) 270� (y,-x) 360� (x,y)
 */

public class Punto extends FiguraGeometrica implements Movile{

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setX(double x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setY(double y) {
		// TODO Auto-generated method stub
		
	}

	//ATRIBUTOS
	//ya los hereda de la otra
	
	//CONSTRUCTOR
	public Punto(int x, int y) {
		super(x, y);
	}
	
	public Punto() {
		super();
	}
	
	//aqui no hay To String
	
	//M�TODOS
	public void trasladar(double x, double y) {
		
		this.setX(x);
		this.setY(y);
	}
	
	public double distancia(Punto punto) { 
		
		double distancia;
		double operacion = (((this.getX() - punto.getX()) * (this.getX() - punto.getX())) + ((this.getY() - punto.getY()) * (this.getY() - punto.getY())));
		
		distancia = Math.sqrt(operacion);
		System.out.println("La distancia entre los dos puntos es: ");
		
		return distancia; 
	}
}
