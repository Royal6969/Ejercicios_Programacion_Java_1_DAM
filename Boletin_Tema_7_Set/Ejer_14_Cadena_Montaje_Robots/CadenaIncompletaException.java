package Ejer_14_Cadena_Montaje_Robots;

public class CadenaIncompletaException extends Exception{

	public CadenaIncompletaException(String excepcion) {
		super("Será sustituida por: "+excepcion);
	}
}
