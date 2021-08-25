package Numeros_Aleatorios;

public class Ejer_5_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el
		//código ascii entre el 32 y el 126. 
		//Puedes hacer casting con (char) para convertir un entero en un carácter
		
		char caracter;
		
		for(int i=0; i<=1000; i++) { //esto es para las lineas inundando la pantalla
			
			for(int j=0; j<=1000; j++) {
				
				caracter = (char)(Math.random()*94+32); //126-32=94 y sumo 32 para empezar por ahí
				System.out.print(caracter);
			}
			System.out.println("");
		}
	}

}
