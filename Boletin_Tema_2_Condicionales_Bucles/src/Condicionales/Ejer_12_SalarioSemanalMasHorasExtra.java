package Condicionales;

import java.util.Scanner;

public class Ejer_12_SalarioSemanalMasHorasExtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que
		//las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la
		//hora 41, se pagan a 16 euros la hora.
		
		Scanner sc = new Scanner(System.in);
		
		int horas;
		int sueldo;
		
		System.out.print("Introduzca el número de horas trabajadas ");
		horas = sc.nextInt();
		
		if(horas<40) {
			sueldo=horas*12;
			}else {sueldo=(40*12)+((horas-40)*16);}
		
		System.out.println("El sueldo semanal del trabajador es " +sueldo+"€");
	}

}
