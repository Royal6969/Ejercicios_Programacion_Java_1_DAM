package Ej_3_Excepcion_MenuArrays;

public class Excepcion2_TamExcedidoException extends Exception{

	Excepcion2_TamExcedidoException(){
		
		super("El n�mero m�ximo de Nombres es 6, asi que te has pasado insertando tantos nombres");
	}
}
