package Ejer_10_Punto;
/*
 * C. Defina una interfaz que denominará Ipixel, que herede los métodos de la interfaz Ipunto y que
cuente además con los siguientes métodos públicos

a. borrar que devuelve void y no recibirá ningún parámetro.
b. cambiarcolor que recibe un entero y devuelve void.
c. imprime que devuelve void y no recibirá ningún parámetro
 */
public interface Ipixel extends Ipunto{ //el extends para heredar 
	
	public void borrar ();
	public void cambiarColor (int num1);
	public void imprimirCoordenadas ();
}
