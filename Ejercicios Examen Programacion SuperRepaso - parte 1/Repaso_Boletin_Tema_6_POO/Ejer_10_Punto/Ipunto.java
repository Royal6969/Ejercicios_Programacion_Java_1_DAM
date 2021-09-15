package Ejer_10_Punto;
/*
 * A. Defina una interfaz que denominará Ipunto con los siguientes métodos públicos:

a. mover que devuelve void y recibirá dos valores en doble precisión
b. mover que devuelve void y recibirá un Ipunto
c. borrar que devuelve void y no recibirá ningún parámetro.
d. getX y getY que devuelven double.
e. setX y setY que reciben un double y devuelven void.
f. distancia que recibe un objeto Ipunto y devuelve un double.
g. distanciaorigen sin parámetros. Devuelve un double.
h. imprime que devuelve void y no recibirá ningún parámetro.
 */
public interface Ipunto {

	public void mover_v1 (double num1, double num2);
	public void mover_v2 (Punto punto); //por que aqui va en vd un Punto?? //el enunciado en vd está mal
	public void borrar ();
	public double getX ();
	public double getY ();
	public void setX (double x);
	public void setY (double y);
	public double distancia (Punto punto); //por que aqui va en vd un Punto?? //el enunciado en vd está mal
	public double distanciaOrigen ();
	public void imprimirCoordenadas ();
}
