package Ejer_10_Ipunto;

/*10. Para construir este proyecto:
 * A. Defina una interfaz que denominará Ipunto con los siguientes métodos públicos:
 * 
 * a. mover que devuelve void y recibirá dos valores en doble precisión
 * b. mover que devuelve void y recibirá un Ipunto
 * c. borrar que devuelve void y no recibirá ningún parámetro.
 * d. getX y getY que devuelven double.
 * e. setX y setY que reciben un double y devuelven void.
 * f. distancia que recibe un objeto Ipunto y devuelve un double.
 * g. distanciaorigen sin parámetros. Devuelve un double.
 * h. imprime que devuelve void y no recibirá ningún parámetro.
 */

public interface Ipunto { //como estoy en una interfaz no hace falta poner public
	
	void mover(double x, double y);
	void mover(Punto punto);
	void borrar();
	
	double getX();
	double getY();
	
	void setX(double x);
	void setY(double y);
	
	double distancia(Punto punto);
	double distanciaOrigen();
	void imprimir();
	
	
}

