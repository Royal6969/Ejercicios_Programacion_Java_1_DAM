package Extra;

import java.util.Scanner;

public class Ejer_1_PintarUnCuadradoRelleno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el largo del lado del cuadrado");
		int lado = sc.nextInt();
		
		if(lado>=2 && lado<=50) { //pongamos esto como condici�n b�sica para poder dibujarlo
			for(int i=1; i<=lado; i++) { //1� contador para pintar la linea superior del cuadrado
				for(int j=1; j<=lado; j++){ //2� contador para el interior del cuadrado
					System.out.print(" *"); //le quito el LN para que no salte de l�nea y pinte seguido
											//metemos espacio+asterisco por dise�o para que no quede como un rectangulo
											//es decir, para que haya un espacio antes del * en cada columna interior
				}
				System.out.println(""); //el espacio vertical entre filas del 1� contador								  
			}
		}
		
		
	}

}
