package Ejer_17_Proyecto_Cilindro;
/*
 * 17. PROYECTO CILINDRO:
 * 
 * A. Clase Punto (atributos int: x e y; void trasladar(double,double) ;double distancia())
 * B. Clase Circulo (atributos Punto centro y double radio:)
 * C. Clase Cuadrado (atributos Punto puntoInicial, int lado y float inclinaci�n)
 * D. Clase Cilindro (atributos Circulo base y double altura)
 * 
 * La clase abstracta FiguraGeometrica implementa la interfaz DosDimensiones, 
 * ya que cualquier figura tiene una posici�n en el plano.
 * Punto hereda de FiguraGeometrica, con lo que impl�citamente implementa DosDimensiones, pero adem�s implementa Movible.
 * Circulo implementa Movible y Escalable, pero no Rotable.
 * Cuadrado implementa Movible, Escalable y Rotable.
 * ROTAR RESPECTO AL ORIGEN: 90� (-y,x) 180� (-x,-y) 270� (y,-x) 360� (x,y)
 */
public class Punto extends FiguraGeometrica implements DosDimensiones, Movile{

	
	//CONSTRUCTOR vacio HEREDADO
	public Punto() {
		super();
		// TODO Auto-generated constructor stub
	}

	//CONSTRUCTOR Lleno HEREDADO
	public Punto(double x, double y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	//M�TODOS
	public void trasladar() { //se tiene que deducir qeu impl�citamente es setear las coordenadas
		this.setX(x);
		this.setY(y);
	}
		
	public double distancia(Punto punto) { //este es buscarlo en Google... hab�a una f�rmula de la distancia...
		double distancia;
		//double formula = ((this.getX() - punto.getX()) * ((this.getX() - punto.getX())) + ((this.getY() - punto.getY())) * ((this.getY() - punto.getY())));
		double formula = Math.pow((punto.getX() - this.getX()), 2) + Math.pow((punto.getY() - this.getY()), 2);
		
		distancia = Math.sqrt(formula);
			
		System.out.println("La distancia entre dos punto es:");
		return distancia;
	}
}
