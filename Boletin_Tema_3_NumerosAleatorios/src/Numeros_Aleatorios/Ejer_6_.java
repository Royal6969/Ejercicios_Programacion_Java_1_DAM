package Numeros_Aleatorios;

public class Ejer_6_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escribe un programa que simule la tirada de dos dados. 
		//El programa deberá continuar tirando los dados una y otra vez 
		//hasta que en alguna tirada los dos dados tengan el mismo valor.
		
		int dado1;
		int dado2;
		
		do {
			dado1 = (int)(Math.random()*6+1);
			dado2 = (int)(Math.random()*6+1);
			System.out.println("El valor de un dado es " +dado1+ " y el del otro dado es " +dado2);
	
		}while(dado1!=dado2); //condicion volver a hacer
		
		//aqui ya salí del bucle
			System.out.println("¡Al fin los dados son iguales!");

	}

}
