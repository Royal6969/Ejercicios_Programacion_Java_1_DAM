package Ej_4_Excepcion_AccesoVector;

//4. Intentar acceder al elemento de �ndice 80 de un vector de 10 enteros, 
//capturando la excepci�n correspondiente y emitiendo un mensaje por consola.

public class Excepcion_Vector extends Exception{
	
	Excepcion_Vector(){
		
		super("Imposible acceder a esta posici�n. El array solo tiene 10 n�meros");
	}

}
