package Ejer_10_Ipunto_Internet;

//Defina una interfaz que denomir� Ipunto
public interface Ipunto {
	
	//mover que devuelve void y recibir� dos valores en doble precisi�n.
	void mover(double valor1,double valor2); 
	
	//Mover que devuelve void y recibir� un Ipunto
	void Mover (Ipunto valorIpunto);
	
	//Borrar que devuelve void y no recibir� ning�n par�metro.
	void borrar();
	
	//getX y getY que devuelven dobule
	double getX();
	double getY();
	
	//setX y setY que reciben un doble y devuelven void.
	void setX(double valorX);
	void setY(double valorY);
}
