package Ejer_10_Punto;
/*
 * A. Defina una interfaz que denominar� Ipunto con los siguientes m�todos p�blicos:

a. mover que devuelve void y recibir� dos valores en doble precisi�n
b. mover que devuelve void y recibir� un Ipunto
c. borrar que devuelve void y no recibir� ning�n par�metro.
d. getX y getY que devuelven double.
e. setX y setY que reciben un double y devuelven void.
f. distancia que recibe un objeto Ipunto y devuelve un double.
g. distanciaorigen sin par�metros. Devuelve un double.
h. imprime que devuelve void y no recibir� ning�n par�metro.
 */
public interface Ipunto {

	public void mover_v1 (double num1, double num2);
	public void mover_v2 (Punto punto); //por que aqui va en vd un Punto?? //el enunciado en vd est� mal
	public void borrar ();
	public double getX ();
	public double getY ();
	public void setX (double x);
	public void setY (double y);
	public double distancia (Punto punto); //por que aqui va en vd un Punto?? //el enunciado en vd est� mal
	public double distanciaOrigen ();
	public void imprimirCoordenadas ();
}
