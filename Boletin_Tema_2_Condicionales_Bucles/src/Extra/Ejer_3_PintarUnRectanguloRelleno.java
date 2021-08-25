package Extra;

import java.util.Scanner;

public class Ejer_3_PintarUnRectanguloRelleno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un valor para la altura del rectángulo ");
		int altura = sc.nextInt();
		
		System.out.print("Introduzca un valor para el ancho del rectángulo ");
		int ancho = sc.nextInt();
		
		//ahora declaramos un par de contadores para apoyarnos luego en los bucles
		int i = 0; //contador para la altura
		int j = 0; //contador para el ancho
		
		while(i<altura) {
			while(j<ancho) {
				System.out.print(" *");//importante quitar el LN
				//OJO importante poner el espacio antes del * para que quede bn el diseño del rectangulo
				j++;//sumamos +1 cada vez al contador del ancho en su bucle para el ancho
			}
			System.out.println();//obvio hacer salto de línea de un bucle a otro para pintar las filas (alturas) correctamente
			j=0;//importante si en el bucle while del ancho, el contador j ya va aumentando, 
				//aquí lo reseteamos para que no aumente más de lo que debe
			i++;//sumamos +1 cada vez al contador de la altura en su bucle para la altura
		}
	}

}
