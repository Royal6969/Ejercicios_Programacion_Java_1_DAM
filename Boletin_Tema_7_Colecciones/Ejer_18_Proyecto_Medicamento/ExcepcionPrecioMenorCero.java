package Ejer_18_Proyecto_Medicamento;

/*
 * C. Clase ExcepcionPrecioMenorCero: al dar de alta un medicamento, 
 * saltará dicha excepción si el precio es negativo.
 */

public class ExcepcionPrecioMenorCero extends Exception{

	public void ExcepcionPrecioMenorCero(String mensaje) {
		System.out.println("Excepción encontrada");
	}

}
