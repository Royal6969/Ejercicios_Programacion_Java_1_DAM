package Condicionales;

import java.util.Scanner;

public class Ejer_14_Horoscopo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String hor�scopo; //importante para m�s eficiencia
		
		System.out.println("Este programa le dir� su hor�scopo a partir de su fecha de nacimiento ");
		System.out.print("Introduzca el n�mero del mes en el que naci� ");
		int mes = sc.nextInt();
		System.out.print("Introduzca el d�a en el que naci� ");
		int d�a = sc.nextInt();
		
		switch(mes) { 
		
		case 1: //un case para cada mes del a�o, osea 12
			if(d�a<21) {//busco un calendario de hor�scopos
				//syso "su horoscopo es capricornio" 
				//esta ser�a la versi�n tiesa de hacerlo, manual, lo suyo es poner el String Horoscopo y que al final salga el que sea 
				hor�scopo="capricornio";
			}else {hor�scopo="acuario";}//como a partir del 21 de septiembre es acuario pues...
			break;
			
		case 2: 
			if(d�a<19) {
				hor�scopo="acuario";
			}else {hor�scopo="piscis";}
			break;
		
		case 3:
			if(d�a<21) {
				hor�scopo="piscis";
			}else {hor�scopo="aries";}
			break;
			
		case 4:
			if(d�a<21) {
				hor�scopo="aries";
			}else {hor�scopo="tauro";}
			break;
			
		case 5:
			if(d�a<21) {
				hor�scopo="tauro";
			}else {hor�scopo="g�minis";}
			break;
			
		case 6:
			if(d�a<22) {
				hor�scopo="g�minis";
			}else {hor�scopo="c�ncer";}
			break;
			
		case 7:
			if(d�a<23) {
				hor�scopo="c�ncer";
			}else {hor�scopo="leo";}
			break;
			
		case 8:
			if(d�a<23) {
				hor�scopo="leo";
			}else {hor�scopo="virgo";}
			break;
			
		case 9:
			if(d�a<23) {
				hor�scopo="virgo";
			}else {hor�scopo="libra";}
			break;
		
		case 10:
			if(d�a<23) {
				hor�scopo="libra";
			}else {hor�scopo="escorpio";}
			break;
		
		case 11:
			if(d�a<23) {
				hor�scopo="escorpio";
			}else {hor�scopo="sagitario";}
			break;
			
		case 12:
			if(d�a<22) {
				hor�scopo="sagitario";
			}else {hor�scopo="capricornio";}
			break;
			
		default:
			hor�scopo="capricornio";
			break;
		}
		
		System.out.println("Su hor�scopo es " +hor�scopo);
	}

}
