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

public class Circulo extends FiguraGeometrica implements Movile, Escalable{

	//ATRIBUTOS
	private Punto centro;
	private double radio;
	
	//CONSTRUCTOR Lleno
	public Circulo(Punto centro, double radio) {
		super();
		this.centro = centro;
		this.radio = radio;
	}

	//CONSTRUCTOR Vacío
	public Circulo() {
		super();
	}

	//GETTER Y SETTER
	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	//Eclipse me crea automaticamente estos otros getters y setters
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
	
	//To String
	@Override
	public String toString() {
		return "Circulo [centro=" + centro + ", radio=" + radio + "]";
	}
	
	//MÉTODOS
	@Override
	public void escalar(float factorEscala) {
		
		this.centro.setX(this.getCentro().getX() * factorEscala);
		this.centro.setY(this.getCentro().getY() * factorEscala);
	}

}
