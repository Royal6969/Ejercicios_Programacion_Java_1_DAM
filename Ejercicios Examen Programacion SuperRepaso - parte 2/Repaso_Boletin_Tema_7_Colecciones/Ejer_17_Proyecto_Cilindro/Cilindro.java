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
public class Cilindro extends FiguraGeometrica{ //esta herencia nos la tenemos que intuir nosotros... toda figura viene de una geométrica

	//ATRIBUTOS
	private Circulo base;
	private double altura;
	
	//CONSTRUCTOR Vacío
	public Cilindro() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Cilindro(Circulo base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	//GETTER y SETTER
	public Circulo getBase() {
		return base;
	}

	public void setBase(Circulo base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	//To String
	@Override
	public String toString() {
		return "Cilindro [base=" + base + ", altura=" + altura + "]";
	}
	
	
}
