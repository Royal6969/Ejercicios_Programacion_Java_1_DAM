package Bucles;

import java.util.Scanner;

public class Ejer_17_PiramideHueca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//16. La pir�mide hueca
		
		Scanner sc = new Scanner(System.in);
		
		String signo;
		int altura;
		int espacioINT = 1;
		int espacioEXT = 1;
		int ancho = 1; //para saber cuando dejar de hacer la pr�mide
		
		System.out.println("Este programa crear� una pir�mide hueca ");
		System.out.println("Intruzca la altura de la pir�mide ");
		altura = sc.nextInt();
		System.out.println("Introduzca el car�cter para crear la pir�mide ");
		signo = sc.next();
		
		//dibujando en un papel, me doy cuenta de que 
		//los espacios exteriores son la altura-1
		
		espacioEXT=altura-1;
		
		while(ancho<=altura) { //este bucle es clave para que se haga cada parte de la pir�mide
			
			//para insertar los espacios exteriores...
			
			for(int i=1; i<espacioEXT; i++) {
				System.out.print(" "); //importante quitarle al print el (LN) para que no salte de l�nea solo
			}
			
			//para hacer el contorno de signos...
			
			System.out.print(signo); //el print sin (LN)
			for(int i=1; i<=espacioINT; i++) {
				System.out.println(" ");
				
			}
			System.out.println();
			if (altura>1) {
				System.out.print(signo);
			}
			altura++;
			espacioEXT--;
			espacioINT+=2;
			
		}//se cierra el while
		
		//ahora hacemos la base de la pir�mide
		
		for (int i=1; i<altura*2; i++) {
			System.out.print(signo);
		}
	}
NO ME SALEEEE
}
