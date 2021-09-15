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
public interface Escalable {

	//M�TODOS
	public void escalar(double factorEscala);
}
