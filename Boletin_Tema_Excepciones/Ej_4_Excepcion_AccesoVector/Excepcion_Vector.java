package Ej_4_Excepcion_AccesoVector;

//4. Intentar acceder al elemento de índice 80 de un vector de 10 enteros, 
//capturando la excepción correspondiente y emitiendo un mensaje por consola.

public class Excepcion_Vector extends Exception{
	
	Excepcion_Vector(){
		
		super("Imposible acceder a esta posición. El array solo tiene 10 números");
	}

}
