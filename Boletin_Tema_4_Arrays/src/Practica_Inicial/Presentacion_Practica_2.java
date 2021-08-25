package Practica_Inicial;

import java.util.Scanner;

public class Presentacion_Practica_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double[] nota = new double [4];
		
		System.out.println("introduzca la nota de los 4 exámenes para saber la media");
		for(int i=0; i<4; i++) {
			System.out.println("Nota del examen nº "+(i+1)+": ");
			nota[i] = sc.nextDouble();
			
			System.out.println("Las notas son: ");
			double suma = 0;
			
			for(int j=0; j<4; j++) {
				suma+=nota[i];
				
			}
			System.out.println("La media es: "+suma/4); //el /4 ahorra declarar la variable MEDIA y hacer su cálculo
			No me salee bn
		}
	}

}
