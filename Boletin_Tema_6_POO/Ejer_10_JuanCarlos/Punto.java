package Ejer_10_JuanCarlos;

public class Punto implements IPunto{
/*	Un constructor sin parámetros que defina el punto (0,0).
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
	formato ( x , y )*/
	
	private double x,y;
	private static Punto origen;
	
	
	public Punto() {
		super();
		this.origen=new Punto(0,0);
	}


	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}


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


	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	public void borrar() {
		this.x=0;
		this.y=0;
	}
	public void mover(double num, double num1) {
		this.x=num;
		this.y=num1;
	}
	public void mover(Punto punto) {
		this.x=punto.getX();
		this.y=punto.getY();
	}
	public double distancia(Punto punto) {
		double sol;
		
		sol=Math.sqrt(Math.pow((punto.getX())-(this.x), 2) + Math.pow((punto.getY())-(this.y), 2));
		return sol;
	}
	public void cambiaorigen(Punto punto) {
		Punto.origen=new Punto(punto.getX(),punto.getY());
	}
	public double distanciaorigen() {
		double sol;
		
		sol=this.distancia(Punto.origen);
		return sol;
	}
	public void imprime() {
		System.out.println("( "+this.x+" "+this.y+" )");
	}
}
