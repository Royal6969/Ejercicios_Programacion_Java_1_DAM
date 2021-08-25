package Condicionales;

import java.util.Scanner;

public class Ejer_16_PirámideApuntando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado
		//que podrá ser una letra, un número o un símbolo como *, +,-, $, &, etc. 
		//El programa debe permitir al usuario mediante un menú elegir 
		//si el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Este programa pintará una pirámide, la cual su pico apuntará hacia donde usted decida");
		System.out.println("¿Qué carácter del teclado desea para rellenar la pirámide?");
		String c = sc.next();
		
		System.out.println("¿Hacia donde quiere que apunte el pico de la pirámide?");
		System.out.println("Pulse 1 para apuntar hacia arriba");
		System.out.println("Pulse 2 para apuntar hacia abajo");
		System.out.println("Pulse 3 para apuntar hacia la derecha");
		System.out.println("Pulse 4 para apuntar hacia la izquierda");
		int dirección = sc.nextInt();
		
		switch(dirección) { //no está diseñado muy bn la piramide pero se entiende el concepto
		
		case 1:
			System.out.println("   "+c);
			System.out.println("  "+c+c);
			System.out.println(" "+c+c+c);
			System.out.println(""+c+c+c+c+c);
			System.out.println(c+c+c+c+c+c+c);
			break;
			
		case 2:
			System.out.println(c+c+c+c+c+c+c);
	        System.out.println(""+c+c+c+c+c);
	        System.out.println("  "+c+c+c);
	        System.out.println("   "+c+c);
	        System.out.println("    "+c);
	        break;

		case 3:
			System.out.println(c);
	        System.out.println(c+" "+c);
	        System.out.println(c+" "+c+" "+c);
	        System.out.println(c+" "+c);
	        System.out.println(c);
	        break;
	        
		case 4:
			System.out.println("    "+c);
			System.out.println(" "+c+" "+c);
			System.out.println(c+" "+c+" "+c);
			System.out.println(" "+c+" "+c);
			System.out.println("    "+c);
			break;
		}

		
	}

}
