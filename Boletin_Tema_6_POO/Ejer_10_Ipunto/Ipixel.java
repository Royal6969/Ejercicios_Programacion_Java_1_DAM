package Ejer_10_Ipunto;
/*
* C. Defina una interfaz que denominar� Ipixel, que herede los m�todos de la interfaz Ipunto 
* y que cuente adem�s con los siguientes m�todos p�blicos
* 
* a. borrar que devuelve void y no recibir� ning�n par�metro.
* b. cambiarcolor que recibe un entero y devuelve void.
* c. imprime que devuelve void y no recibir� ning�n par�metro
*/

public interface Ipixel extends Ipunto{
	
	void borrar();
	void cambiarColor(int color);
	void imprimir();
}
