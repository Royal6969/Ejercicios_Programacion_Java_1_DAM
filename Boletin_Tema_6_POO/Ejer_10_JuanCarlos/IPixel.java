package Ejer_10_JuanCarlos;

public interface IPixel extends IPunto{
	/*a. borrar que devuelve void y no recibir� ning�n par�metro.
	b. cambiarcolor que recibe un entero y devuelve void.
	c. imprime que devuelve void y no recibir� ning�n par�metro
*/
	void borrar();
	void cambiacolor(int num);
	void imprime();
}
