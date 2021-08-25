package Condicionales;

import java.util.Scanner;

public class Ejer_6_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Después de preguntar qué día de la semana fue el día uno, y pedir un nº cualquiera del mes;
		//mostrar por pantalla qué día de la semana es dicho nº. 
		//Ejemplo: si el día 1 fue martes, dado el día 4, la salida será VIERNES. 
	
		Scanner sc = new Scanner(System.in);
		
		int Dia1;
		int DiaMes;
		int ContDia;
		int ContDiaMes;
		
		System.out.println("Que dia de la semana fue el pasado día 1  ??");
		Dia1 = sc.nextInt();
		System.out.println("Introduzca un numero de dia del mes para saber en que dia cae ");
		DiaMes = sc.nextInt();
		
		ContDiaMes = DiaMes+Dia1; //para saber que dia empezó el mes (dia de la semana)
		ContDia = ContDiaMes%7; //porque ahora el dia 0 será sabado
		
		
		switch(ContDia) { //le pongo tal día al case como el dia que haya usado como ejemplo para precalcular en sucio
		
		case 0:
			
		case 1:
			
		case 2:
			
		case 3: 
			System.out.println("El día " +DiaMes+ " es martes");
			break;
		}
	}

}
