package Ej_2_ExcepcionDeRango;

/*
 * 2. Lanzar una excepcion cuando el usuario introduce un valor fuera de un rango establecido por el usuario. 
 * Se utilizará un método void rango(int) que comprobará esta condición tras
 * recibir el valor introducido por el usuario. Crear una clase: IntervaloException.
*/

public class ExcepcionDeRango extends Exception{

	ExcepcionDeRango(){
		
		super("Este valor está fuera del rango permitido");
	}
}
