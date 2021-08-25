package Ejer_10_JuanCarlos;

public interface IPunto {
	/*a. mover que devuelve void y recibir� dos valores en doble precisi�n
	b. mover que devuelve void y recibir� un Ipunto
	c. borrar que devuelve void y no recibir� ning�n par�metro.
	d. getX y getY que devuelven double.
	e. setX y setY que reciben un double y devuelven void.
	f. distancia que recibe un objeto Ipunto y devuelve un double.
	g. distanciaorigen sin par�metros. Devuelve un double.
	h. imprime que devuelve void y no recibir� ning�n par�metro.
*/
	void mover(double num, double num1);
	void mover(Punto punto);
	void borrar();
	double getX();
	double getY();
	void setX(double x);
	void setY(double y);
	double distancia(Punto punto);
	double distanciaorigen();
	void imprime();
}
