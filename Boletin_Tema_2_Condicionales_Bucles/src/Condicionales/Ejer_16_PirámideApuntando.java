package Condicionales;

import java.util.Scanner;

public class Ejer_16_Pir�mideApuntando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Escribe un programa que pinte una pir�mide rellena con un car�cter introducido por teclado
		//que podr� ser una letra, un n�mero o un s�mbolo como *, +,-, $, &, etc. 
		//El programa debe permitir al usuario mediante un men� elegir 
		//si el v�rtice de la pir�mide est� apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Este programa pintar� una pir�mide, la cual su pico apuntar� hacia donde usted decida");
		System.out.println("�Qu� car�cter del teclado desea para rellenar la pir�mide?");
		String c = sc.next();
		
		System.out.println("�Hacia donde quiere que apunte el pico de la pir�mide?");
		System.out.println("Pulse 1 para apuntar hacia arriba");
		System.out.println("Pulse 2 para apuntar hacia abajo");
		System.out.println("Pulse 3 para apuntar hacia la derecha");
		System.out.println("Pulse 4 para apuntar hacia la izquierda");
		int direcci�n = sc.nextInt();
		
		switch(direcci�n) { //no est� dise�ado muy bn la piramide pero se entiende el concepto
		
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
