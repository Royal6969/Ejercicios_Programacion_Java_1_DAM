package Cubos;

import java.util.Scanner;

public class Prueba_Cubo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*SUP: 10 cubos max (tamañoReal)
		 * 1. Dar alta a un cubo (con todas sus propiedades)
		 * 2. Pasar líquido de un cubo a otro
		 * 3. Listado completo
		 * 4. Listado según color (elegir un color)
		 * 5. Listado de los cubos llenos
		 * 0. Salir
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//Cubo miCubito = new Cubo//aqui pulsar el ctrl+espacio
		Cubo cuboPlaya = new Cubo(5, 3, "gris", "metal", true);
		Cubo cuboHielo = new Cubo(8, 2);
		
		
	}

}
