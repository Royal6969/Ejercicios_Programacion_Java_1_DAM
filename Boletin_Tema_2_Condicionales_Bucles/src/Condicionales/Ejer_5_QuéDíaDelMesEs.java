package Condicionales;

import java.util.Scanner;

public class Ejer_5_Qu�D�aDelMesEs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Despu�s de leer el n� de un d�a del mes, decir qu� d�a de la semana es, 
		//suponiendo que el d�a uno es lunes. Ejemplo: dado el d�a 4, la salida ser� JUEVES.
		
		Scanner sc = new Scanner(System.in);
		
		int dia;
		int ContDia;
		
		System.out.println("Qu� d�a del mes es hoy??");
		dia = sc.nextInt();
		
		ContDia=dia%7;
			
		switch(ContDia) {
		
		case 0: //OJO empieza en 0 para el domingo, porque divide entre 7
			System.out.println("El d�a " +dia+ " es Domingo");
			break;
			
		case 1: 
			System.out.println("Lunes");
			break;
			
		case 2: 
			System.out.println("Martes");
			break;
			
		case 3:
			System.out.println("Miercoles");
			break;
			
		case 4: 
			System.out.println("Jueves");
			break;
			
		case 5:
			System.out.println("Viernes");
			break;
			
		case 6:
			System.out.println("Sabado");
			break;
			
		//No hace falta default porque ninguna posibilidad se escapa
		}
		
	}

	
}
