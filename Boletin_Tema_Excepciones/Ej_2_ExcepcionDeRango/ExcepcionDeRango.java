package Ej_2_ExcepcionDeRango;

/*
 * 2. Lanzar una excepcion cuando el usuario introduce un valor fuera de un rango establecido por el usuario. 
 * Se utilizar� un m�todo void rango(int) que comprobar� esta condici�n tras
 * recibir el valor introducido por el usuario. Crear una clase: IntervaloException.
*/

public class ExcepcionDeRango extends Exception{

	ExcepcionDeRango(){
		
		super("Este valor est� fuera del rango permitido");
	}
}
