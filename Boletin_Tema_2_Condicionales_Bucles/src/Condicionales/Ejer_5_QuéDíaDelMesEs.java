package Condicionales;

import java.util.Scanner;

public class Ejer_5_QuéDíaDelMesEs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Después de leer el nº de un día del mes, decir qué día de la semana es, 
		//suponiendo que el día uno es lunes. Ejemplo: dado el día 4, la salida será JUEVES.
		
		Scanner sc = new Scanner(System.in);
		
		int dia;
		int ContDia;
		
		System.out.println("Qué día del mes es hoy??");
		dia = sc.nextInt();
		
		ContDia=dia%7;
			
		switch(ContDia) {
		
		case 0: //OJO empieza en 0 para el domingo, porque divide entre 7
			System.out.println("El día " +dia+ " es Domingo");
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
