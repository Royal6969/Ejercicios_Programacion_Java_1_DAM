package Condicionales;

import java.util.Scanner;

public class Ejer_6_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Despu�s de preguntar qu� d�a de la semana fue el d�a uno, y pedir un n� cualquiera del mes;
		//mostrar por pantalla qu� d�a de la semana es dicho n�. 
		//Ejemplo: si el d�a 1 fue martes, dado el d�a 4, la salida ser� VIERNES. 
	
		Scanner sc = new Scanner(System.in);
		
		int Dia1;
		int DiaMes;
		int ContDia;
		int ContDiaMes;
		
		System.out.println("Que dia de la semana fue el pasado d�a 1  ??");
		Dia1 = sc.nextInt();
		System.out.println("Introduzca un numero de dia del mes para saber en que dia cae ");
		DiaMes = sc.nextInt();
		
		ContDiaMes = DiaMes+Dia1; //para saber que dia empez� el mes (dia de la semana)
		ContDia = ContDiaMes%7; //porque ahora el dia 0 ser� sabado
		
		
		switch(ContDia) { //le pongo tal d�a al case como el dia que haya usado como ejemplo para precalcular en sucio
		
		case 0:
			
		case 1:
			
		case 2:
			
		case 3: 
			System.out.println("El d�a " +DiaMes+ " es martes");
			break;
		}
	}

}
