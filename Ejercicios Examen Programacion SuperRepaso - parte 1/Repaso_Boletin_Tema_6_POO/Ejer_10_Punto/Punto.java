package Ejer_10_Punto;

/*
 * B. Construya una clase Punto que implemente la interfaz Ipunto y tenga dos atributos protegidos de
tipo double denominados x e y (las coordenadas del punto), y un atributo estático protegido
llamado origen de tipo Punto con los valores 0 y 0. La clase Punto implementará los siguientes métodos:

a. Un constructor sin parámetros que defina el punto (0,0).
b. Un constructor que reciba dos valores de tipo double para cada atributo.
c. Un método borrar que ponga a 0 los dos atributos.
d. Un método mover que dado los dos valores pasados como parámetros cambie los
atributos x e y.
e. Un método denominado mover que cambie las coordenadas del Punto que invoca por
las de un Punto pasado como argumento.
f. Un método distancia que calcule la distancia entre el Punto que invoca y otro que es
pasado como argumento. Utilice el método sqrt de la clase Math.
g. Un método estático cambiarorigen que cambie el atributo origen por el punto que se le
pasa como argumento.
h. Un método distanciaorigen que calcula la distancia al origen utilizando el método
distancia.
i. Un método imprime que saca por pantalla los valores de los atributos con el siguiente
formato ( x , y )
 */
public class Punto implements Ipunto{

	//ATRIBUTOS
	private double x; 
	private double y;
	private static Punto origen;
	
	//CONSTRUCTOR Vacío
	 //a. Un constructor sin parámetros que defina el punto (0,0).
	public Punto() {
		super();
		this.origen = new Punto(0,0); 
	}

	//b. Un constructor que reciba dos valores de tipo double para cada atributo.
	public Punto(double x, double y) { //se trataba del CONSTRUCTOR Lleno
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

	public static Punto getOrigen() {
		return origen;
	}

	public static void setOrigen(Punto origen) {
		Punto.origen = origen;
	}

	//To String
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	//MÉTODOS
	//c. Un método borrar que ponga a 0 los dos atributos.
	public void borrar() {
		this.x = 0;
		this.y = 0;
	}
	
	//d. Un método mover que dado los dos valores pasados como parámetros cambie los atributos x e y.
	public void mover_v1(double num1, double num2) {
		this.x = num1;
		this.y = num2;
	}
	
	//e. Un método denominado mover que cambie las coordenadas del Punto que invoca por las de un Punto pasado como argumento.
	public void mover_v2(Punto punto) {
		this.x = punto.getX();
		this.y = punto.getY();
	}
	
	//f. Un método distancia que calcule la distancia entre el Punto que invoca 
	//y otro que es pasado como argumento. Utilice el método sqrt de la clase Math.
	public double distancia(Punto punto) {
		double distancia = 0;
		//esta fórmula hay que buscarla por Google
		distancia = Math.sqrt(Math.pow((punto.getX())-(this.x), 2) + Math.pow((punto.getY())-(this.y), 2));
		
		return distancia;
	}
	//g. Un método estático cambiarorigen que cambie el atributo origen por el punto que se le pasa como argumento.
	public static void cambiarOrigen(Punto punto) {
		Punto.origen = new Punto (punto.getX(), punto.getY()); //no entiendo bn esto
	}
	
	//h. Un método distanciaorigen que calcula la distancia al origen utilizando el método distancia.
	public double distanciaOrigen() {
		double distancia = 0;
		
		distancia = this.distancia(Punto.origen); //no entiendo bn lo del (Punto.origen);
		
		return distancia;
	}
	
	//i. Un método imprime que saca por pantalla los valores de los atributos con el siguiente formato (x, y)
	public void imprimirCoordenadas() {
		System.out.println("("+this.x+", "+this.y+")");
	}

}
