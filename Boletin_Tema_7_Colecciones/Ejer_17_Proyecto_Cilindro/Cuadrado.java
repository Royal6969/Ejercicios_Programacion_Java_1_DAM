package Ejer_17_Proyecto_Cilindro;

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

public class Cuadrado extends FiguraGeometrica implements Movile, Escalable, Rotable{

	//ATRIBUTOS
	private Punto puntoInicial;
	private int lado;
	private float inclinacion;
	
	//CONSTRUCTOR Lleno
	public Cuadrado(Punto puntoInicial, int lado, float inclinacion) {
		this.puntoInicial = puntoInicial;
		this.lado = lado;
		this.inclinacion = inclinacion;
	}

	//CONSTRUCTOR Vacío
	public Cuadrado(int x, int y) {
		super(x, y);
	}

	//GETTER Y SETTER
	public Punto getPuntoInicial() {
		return puntoInicial;
	}

	public void setPuntoInicial(Punto puntoInicial) {
		this.puntoInicial = puntoInicial;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public float getInclinacion() {
		return inclinacion;
	}

	public void setInclinacion(float inclinacion) {
		this.inclinacion = inclinacion;
	}

	//To STring
	@Override
	public String toString() {
		return "Cuadrado [puntoInicial=" + puntoInicial + ", lado=" + lado + ", inclinacion=" + inclinacion + "]";
	}

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
	public void girar(float angulo) {
		// TODO Auto-generated method stub
		
		this.setInclinacion(angulo);
	}

	@Override
	public void escalar(float factorEscala) {
		// TODO Auto-generated method stub
		
		this.puntoInicial.setX(this.getPuntoInicial().getX() * factorEscala);
		this.puntoInicial.setY(this.getPuntoInicial().getY() * factorEscala);
	}

	@Override
	public void setX(double x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setY(double y) {
		// TODO Auto-generated method stub
		
	}
	
	
}
