package Ejer_10_JuanCarlos;

public interface IPixel extends IPunto{
	/*a. borrar que devuelve void y no recibirá ningún parámetro.
	b. cambiarcolor que recibe un entero y devuelve void.
	c. imprime que devuelve void y no recibirá ningún parámetro
*/
	void borrar();
	void cambiacolor(int num);
	void imprime();
}
