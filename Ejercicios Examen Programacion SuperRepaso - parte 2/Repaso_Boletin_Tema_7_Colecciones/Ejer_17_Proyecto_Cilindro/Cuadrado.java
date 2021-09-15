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
public class Cuadrado implements Movile, Escalable, Rotable{

	//ATRIBUTOS
	private int lado;
	private int inclinacion;
	private Punto puntoInicial; //wtf??
	
	//CONSTRUCTOR Vacío
	public Cuadrado() {
		super();
	}

	//CONSTRUCTOR lleno
	public Cuadrado(int lado, int inclinacion, Punto puntoInicial) {
		super();
		this.lado = lado;
		this.inclinacion = inclinacion;
		this.puntoInicial = puntoInicial;
	}

	//GETTER Y SETTER
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public int getInclinacion() {
		return inclinacion;
	}

	public void setInclinacion(int inclinacion) {
		this.inclinacion = inclinacion;
	}

	public Punto getPuntoInicial() {
		return puntoInicial;
	}

	public void setPuntoInicial(Punto puntoInicial) {
		this.puntoInicial = puntoInicial;
	}
	
	@Override
	public void setX(double x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setY(double y) {
		// TODO Auto-generated method stub
		
	}

	//To String
	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", inclinacion=" + inclinacion + ", puntoInicial=" + puntoInicial + "]";
	}

	//add unimplements methods
	@Override
	public void girar(double angulo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void escalar(double factorEscala) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
