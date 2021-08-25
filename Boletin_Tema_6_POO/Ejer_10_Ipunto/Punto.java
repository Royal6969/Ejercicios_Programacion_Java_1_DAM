package Ejer_10_Ipunto;

/* B. Construya una clase Punto que implemente la interfaz Ipunto y tenga dos atributos protegidos de
* tipo double denominados x e y (las coordenadas del punto), y un atributo estático protegido
* llamado origen de tipo Punto con los valores 0 y 0. La clase Punto implementará los siguientes métodos:
* 
* a. Un constructor sin parámetros que defina el punto (0,0).
* b. Un constructor que reciba dos valores de tipo double para cada atributo.
* c. Un método borrar que ponga a 0 los dos atributos.
* d. Un método mover que dado los dos valores pasados como parámetros cambie los atributos x e y.
* e. Un método denominado mover que cambie las coordenadas del Punto que invoca por las de un Punto pasado como argumento.
* f. Un método distancia que calcule la distancia entre el Punto que invoca y otro que es pasado como argumento. 
* Utilice el método sqrt de la clase Math.
* g. Un método estático cambiarorigen que cambie el atributo origen por el punto que se le pasa como argumento.
* h. Un método distanciaorigen que calcula la distancia al origen utilizando el método distancia.
* i. Un método imprime que saca por pantalla los valores de los atributos con el siguiente formato ( x , y )
*/	
public class Punto implements Ipunto{
	
	//ATRIBUTOS 
	private double x;
	private double y;
	private static Punto origen; //los valores van al constructor
	
	//CONSTRUCTOR
	public Punto(double x, double y) { //este se deja como tal aparece
		super();
		this.x = x;
		this.y = y;
	}

	//METODO a)
	public Punto() { //este es el vacio
		super();
		this.origen = new Punto(0,0); //OJO
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

	//TO String que no sirve porque al final me pide un To String especifico
/*	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
*/
	//METODOS
	
	public void borrar() { //no entra nada
		this.x = 0;
		this.y = 0;
	}
	
	public void mover(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void mover(Punto punto) {
		this.x = punto.getX();
		this.y = punto.getY();
	}
	
	public double distancia(Punto punto) {
		double distancia;
		distancia = Math.sqrt(Math.pow((punto.getX())-(this.x), 2) + Math.pow((punto.getY())-(this.y), 2));
        return distancia;
        //el this es el objeto que llama al objeto distancia y el punto getX es el objeto punto que le he metido como parametro
	}
	
	public static void cambiarOrigen(Punto punto) {
		//para los atributos estaticos, teniamos que llamar a su propia clases
		Punto.origen = new Punto(punto.getX(), punto.getY());
	}
	
	public double distanciaOrigen() {
		double distancia;
		
		distancia = this.distancia(Punto.origen);
		
		return distancia;
	}
	
	public void imprimir() {
		System.out.println("( "+this.x+" , "+this.y+" )");
	}
	
}
