package Ej_1DividirEntreCero;

//1. Capturar ArithmeticException, al intentar dividir un n�mero cualquiera entre cero.

public class DividirEntreCero_ArithmeticException extends Exception{
	
	DividirEntreCero_ArithmeticException(){
		
		super("No se puede dividir entre cero");
	}
}
