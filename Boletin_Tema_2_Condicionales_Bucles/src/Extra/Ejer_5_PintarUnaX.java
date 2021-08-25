package Extra;

import java.util.Scanner;

public class Ejer_5_PintarUnaX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//realiza un programa que pinte un X con asteriscos
		//el programa debe pedir la altura
		//comprobar que la altura sea un número impar >=3, y en caso contrario, mostrar mensaje de error

		Scanner sc = new Scanner(System.in);
		
		
		
		int ContAltura = 1; 
		int EspaciosIzquierda = 0; //la 1º vuelta no pone espacio
		int AlturaIntro;
		int EspaciosInt;
		
		do{
			System.out.print("introduzca la altura para la X ");
			AlturaIntro = sc.nextInt();
			EspaciosInt=AlturaIntro-1;
			
		}while(AlturaIntro%2==0 || AlturaIntro<3);
		
			while(ContAltura<(AlturaIntro/2)+1) { //se le suma 1 porque al hacer la division se redonde hacia abajo el decimal
				for(int i=1; i<=EspaciosIzquierda; i++) { //los espacios de la izquierda
					System.out.print(" ");
				}
				System.out.print("*");
				for(int i=1; i<EspaciosInt; i++) {//espacios dentro de la X smp es Altura-2
					System.out.print(" ");
				}
				System.out.print("*");//para los asteriscos de la derecha
				System.out.println("");
				ContAltura++; //para salir del while en su momento
				EspaciosIzquierda++;
				EspaciosInt -=2;
			}
			EspaciosInt=0; //reiniciar
			EspaciosIzquierda=AlturaIntro/2; //para los espacios del vertice
			ContAltura=1; //reiniciar
			
			while(ContAltura<=(AlturaIntro/2)+1) { //ahora si tiene = porque estoy contando la linea del vertice
				for(int i=1; i<=EspaciosIzquierda; i++) {
					System.out.print(" ");
				}
				System.out.print("*"); //smp mínimo va a ver un asterisco
				for(int i=1; i<EspaciosInt; i++) { //empieza en 1 ahora para no joder los espacios del vertice
					System.out.print(" ");
				}
				if(ContAltura>1) { //si no estuviera este if se pondrían 2 asteriscos en el vertice
					System.out.print("*");
				}
				System.out.println("");
				ContAltura++;
				EspaciosIzquierda--; //ahora en decreciendo
				EspaciosInt+=2; //igualmente los espacios internos van aumentando
			}
	}

}
