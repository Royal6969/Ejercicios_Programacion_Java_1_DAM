package Ej_3_Excepcion_MenuArrays;

public class Excepcion1_TooLargeNameException extends Exception{

	Excepcion1_TooLargeNameException(){
		
		super("El tamaño máximo de cada nombre es 20, asi que has excedido el tamaño");
	}
	
}
