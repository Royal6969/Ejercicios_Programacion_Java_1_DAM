package Condicionales;

import java.util.Scanner;

public class Ejer_14_Horoscopo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String horóscopo; //importante para más eficiencia
		
		System.out.println("Este programa le dirá su horóscopo a partir de su fecha de nacimiento ");
		System.out.print("Introduzca el número del mes en el que nació ");
		int mes = sc.nextInt();
		System.out.print("Introduzca el día en el que nació ");
		int día = sc.nextInt();
		
		switch(mes) { 
		
		case 1: //un case para cada mes del año, osea 12
			if(día<21) {//busco un calendario de horóscopos
				//syso "su horoscopo es capricornio" 
				//esta sería la versión tiesa de hacerlo, manual, lo suyo es poner el String Horoscopo y que al final salga el que sea 
				horóscopo="capricornio";
			}else {horóscopo="acuario";}//como a partir del 21 de septiembre es acuario pues...
			break;
			
		case 2: 
			if(día<19) {
				horóscopo="acuario";
			}else {horóscopo="piscis";}
			break;
		
		case 3:
			if(día<21) {
				horóscopo="piscis";
			}else {horóscopo="aries";}
			break;
			
		case 4:
			if(día<21) {
				horóscopo="aries";
			}else {horóscopo="tauro";}
			break;
			
		case 5:
			if(día<21) {
				horóscopo="tauro";
			}else {horóscopo="géminis";}
			break;
			
		case 6:
			if(día<22) {
				horóscopo="géminis";
			}else {horóscopo="cáncer";}
			break;
			
		case 7:
			if(día<23) {
				horóscopo="cáncer";
			}else {horóscopo="leo";}
			break;
			
		case 8:
			if(día<23) {
				horóscopo="leo";
			}else {horóscopo="virgo";}
			break;
			
		case 9:
			if(día<23) {
				horóscopo="virgo";
			}else {horóscopo="libra";}
			break;
		
		case 10:
			if(día<23) {
				horóscopo="libra";
			}else {horóscopo="escorpio";}
			break;
		
		case 11:
			if(día<23) {
				horóscopo="escorpio";
			}else {horóscopo="sagitario";}
			break;
			
		case 12:
			if(día<22) {
				horóscopo="sagitario";
			}else {horóscopo="capricornio";}
			break;
			
		default:
			horóscopo="capricornio";
			break;
		}
		
		System.out.println("Su horóscopo es " +horóscopo);
	}

}
