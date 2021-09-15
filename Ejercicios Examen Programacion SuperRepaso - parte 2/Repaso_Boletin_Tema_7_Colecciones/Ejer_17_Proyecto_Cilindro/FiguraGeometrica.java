package Ejer_17_Proyecto_Cilindro;
/*
 * 17. PROYECTO CILINDRO:
 * 
 * A. Clase Punto (atributos int: x e y; void trasladar(double,double) ;double distancia())
 * B. Clase Circulo (atributos Punto centro y double radio:)
 * C. Clase Cuadrado (atributos Punto puntoInicial, int lado y float inclinación)
 * D. Clase Cilindro (atributos Circulo base y double altura)
 * 
 * La clase abstracta FiguraGeometrica implementa la interfaz DosDimensiones, 
 * ya que cualquier figura tiene una posición en el plano.
 * Punto hereda de FiguraGeometrica, con lo que implícitamente implementa DosDimensiones, pero además implementa Movible.
 * Circulo implementa Movible y Escalable, pero no Rotable.
 * Cuadrado implementa Movible, Escalable y Rotable.
 * ROTAR RESPECTO AL ORIGEN: 90º (-y,x) 180º (-x,-y) 270º (y,-x) 360º (x,y)
 */
public abstract class FiguraGeometrica implements DosDimensiones{

	//Punto hereda de FiguraGeometrica, con lo que implícitamente implementa DosDimensiones
	//si en DosDimensiones había dos atributos de punto x y punto y...
	
	//ATRIBUTOS
	protected double x, y; //pongo protected porque en el esquema del boletin aparece el signo #

	//CONSTRUCTOR Vacío
	public FiguraGeometrica() {
		super();
	}

	//CONSTRUCTOR Lleno
	public FiguraGeometrica(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	//GETTER Y SETTER
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	//To String
	@Override
	public String toString() {
		return "FiguraGeometrica [x=" + x + ", y=" + y + "]";
	}
	
	
}
