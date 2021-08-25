package Condicionales;

import java.util.Scanner;

public class Ejer_7_NotaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Leer tres notas y calcular su media. A continuación mostrar la nota del boletín
		//correspondiente (insuficiente, suficiente, bien, notable o sobresaliente).
		
		Scanner sc = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double media;
		
		System.out.println("Este programa realizará la media de 3 notas");
		System.out.print("Introduzca la 1º nota ");
		nota1 = sc.nextDouble();
		System.out.print("Introduzca la 2º nota ");
		nota2 = sc.nextDouble();
		System.out.print("Introduzca la 3º nota ");
		nota3 = sc.nextDouble();
		
		media=(nota1+nota2+nota3)/3;
		
		System.out.println("La nota media es " +media);
		
		if(media<5) {
			System.out.println("Insuficiente");
			}
		if(media >5 && media <=6) {
			System.out.println("Suficiente");
			}
		if(media >6 && media <=7) {
			System.out.println("Bien");
			}
		if(media >7 && media <=8) {
			System.out.println("Notable");
			}
		if(media >8 && media<=9) {
			System.out.println("Notable alto");
			}
		if(media >9 && media <=10) {
			System.out.println("Sobresaliente");
		}
	}

}
