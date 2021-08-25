package Numeros_Aleatorios;

import java.util.Scanner;

public class Ejer_2_JuegoAdivinarNumero5intentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escribe un programa que piense un número al azar entre 0 y 100. 
		//El usuario debe adivinarlo y tiene para ello 5 oportunidades. 
		//Después de cada intento fallido, 
		//el programa dirá cuántas oportunidades quedan 
		//y si el número introducido es menor o mayor que el número secreto.
		
		System.out.println("Este programa genera un número secreto entre 0 y 100");
		Scanner sc = new Scanner(System.in);
		
		int num;
		int intento;
		int IntentosRestantes; //en realidad esta no hace falta porque se puede hacer con la j
		boolean salir = false;
			
			num = (int) (Math.random()*101); //para incluir el numero 0 se multiplica por 101 en vez de 100 (y el +1 no se pondría)
			
			for(int j=1; j<=5 && !salir; j++) { //el !salir significa lo mismo que salir==false
				System.out.println("Trate de advivinar el número! ");
				intento = sc.nextInt();
				
				if(num == intento) {
					salir=true;
					System.out.println("¡Has adivinado el número! ... su número era " +num);
				
				}else if(intento<num) {
					System.out.println("El número secreto es más alto que su intento ");
					IntentosRestantes = 5-j;
					System.out.println("Quedan " +IntentosRestantes+ " intentos restantes");
				
				}else {
					System.out.println("El número secreto es más bajo que su intento ");
					IntentosRestantes = 5-j;
					System.out.println("Quedan " +IntentosRestantes+ " intentos restantes");
				}
			}//como se haria para poner un game over y restart??
			
				if(salir==false) {
					System.out.println("Game over");
				}
	}

}
