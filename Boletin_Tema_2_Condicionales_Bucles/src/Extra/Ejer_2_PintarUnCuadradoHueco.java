package Extra;

import java.util.Scanner;

public class Ejer_2_PintarUnCuadradoHueco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el largo del lado del cuadrado ");
		int lado = sc.nextInt();
		
		if(lado>=0 && lado<=50) {
			
			for(int i=0; i<lado; i++) { //linea superior
				System.out.print(" *");//importante quitar el LN
				//OJO el detalle del espacio antes del * para que quede bn cuadradito luego
			}
			System.out.println(); //para hacer un salto hacia la siguiente fila
			
			for(int i=0; i<lado-2; i++) { //para el centro del cuadrado (EL HUECO) 
										   //ponemos lado-2 para que respete los * del lado izquiero y el derecho
				System.out.print(" *");//OJO el detalle del espacio antes del * para que quede bn cuadradito luego
				for(int j=0; j<lado-2; j++) {
					System.out.print(" ");
				}
				System.out.println("   *");//OJO el detalle del espacio antes del * para que quede bn cuadradito luego
			}

			for(int i=0; i<lado; i++) { //linea inferior
				System.out.print(" *");//importante quitar el LN
				//OJO el detalle del espacio antes del * para que quede bn cuadradito luego
			}
		}else {System.out.println("Error, introduzca un largo para el lado del cuadrado de entre 0 y 50");}
	}

}
