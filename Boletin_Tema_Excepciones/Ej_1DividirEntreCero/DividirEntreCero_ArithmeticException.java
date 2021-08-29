package Ej_1DividirEntreCero;

//1. Capturar ArithmeticException, al intentar dividir un número cualquiera entre cero.

public class DividirEntreCero_ArithmeticException extends Exception{
	
	DividirEntreCero_ArithmeticException(){
		
		super("No se puede dividir entre cero");
	}
}
