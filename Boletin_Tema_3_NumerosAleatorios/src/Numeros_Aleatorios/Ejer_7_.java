package Numeros_Aleatorios;

public class Ejer_7_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Sinestesio y Casilda van a pintar los tres dormitorios de su casa, 
		//quieren sustituir el color blanco por colores más alegres. 
		//Realiza un programa que genere de forma aleatoria una secuencia de tres colores aleatorios (uno para cada dormitorio) 
		//de tal forma que no se repita ninguno. 
		//Los colores entre los que debe elegir el programa son los siguientes: 
		//rojo, azul, verde, amarillo, violeta y naranja.
		
		int dor1;
		int dor2;
		int dor3;
		
		do {
			dor1 = (int)(Math.random()*6);
			dor2 = (int)(Math.random()*6);
			dor3 = (int)(Math.random()*6);
			
		}while(dor1==dor2 || dor1==dor3 || dor2==dor3);
		
		//ya he salido del bucle
		
		switch(dor1) { 
		
		case 0: //empieza en el 0 porque en el Math.Random no sumé nada
			System.out.println("Rojo");
			break;
			
		case 1:
			System.out.println("Azul");
			break;
			
		case 2: 
			System.out.println("verde");
			break;
			
		case 3:
			System.out.println("Amarillo");
			break;
			
		case 4:
			System.out.println("Violeta");
			break;
			
		case 5:
			System.out.println("Naranja");
			break;
			
		default: //este no hace falta porque ya estaba todo contemplado
			break;
			
		}
		
		switch(dor2) { 
		
		case 0: //empieza en el 0 porque en el Math.Random no sumé nada
			System.out.println("Rojo");
			break;
			
		case 1:
			System.out.println("Azul");
			break;
			
		case 2: 
			System.out.println("verde");
			break;
			
		case 3:
			System.out.println("Amarillo");
			break;
			
		case 4:
			System.out.println("Violeta");
			break;
			
		case 5:
			System.out.println("Naranja");
			break;
			
		default: //este no hace falta porque ya estaba todo contemplado
			break;
			
		}
		
		switch(dor3) { 
		
		case 0: //empieza en el 0 porque en el Math.Random no sumé nada
			System.out.println("Rojo");
			break;
			
		case 1:
			System.out.println("Azul");
			break;
			
		case 2: 
			System.out.println("verde");
			break;
			
		case 3:
			System.out.println("Amarillo");
			break;
			
		case 4:
			System.out.println("Violeta");
			break;
			
		case 5:
			System.out.println("Naranja");
			break;
			
		default: //este no hace falta porque ya estaba todo contemplado
			break;
			
		}
		
		System.out.println("Genial, los dormitorios tienen colores diferentes");
	}

}
