package Ejer_18_Proyecto_Medicamento;
/*
 * C. Clase ExcepcionPrecioMenorCero: al dar de alta un medicamento, 
 * saltar� dicha excepci�n si el precio es negativo.
 */
public class ExcepcionPrecioMenorCero extends Exception{ //extend Exception 

	// m�todos modificadores
	public void ExcepcionPrecioMenorCero(String mensaje) {
		System.out.println("Excepci�n encontrada");
	}
}
