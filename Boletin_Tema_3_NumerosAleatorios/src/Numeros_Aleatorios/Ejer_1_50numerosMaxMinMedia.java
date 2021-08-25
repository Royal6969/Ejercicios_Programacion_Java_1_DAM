package Numeros_Aleatorios;

import java.util.Scanner;

public class Ejer_1_50numerosMaxMinMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios. 
		//Muestra también el máximo, el mínimo y la media de esos números.
		
		Scanner sc = new Scanner(System.in);
		
		int num; 
		int min = 199; //esto ve su lógica luego en su If
		int max = 100;
		int suma = 0;
		int media;
		
		for(int i=1; i<=50; i++) { //hago un bucle FOR para mostrar por pantalla los 50 números entre 100 y 199
			
			num = (int) (Math.random()*100+100); //el número generado hay que "castearlo" y transformarlo a un número entero (INT) y "multiplicarlo" por el límite 100 y el mínimo del rango que es 100
			System.out.print(num+ " "); //para el espacio entre números
			suma+=num; //para que se vayan sumando los números que se generan para hacer la media dps
			
			if(num<min) {//habíamos declarado el min y max al revés para poder hacer esto bn
				min = num;//importante poner min= a lo que sea porque de poner num= a, no sale lo mismo...
			}
			if(num>max) {//el numero mas alto que 100 es el max y el más bajo de 199 el min
				max = num;
			}
			
		}// está todo dentro del bucle For
		
		media = suma/50;
		
		System.out.println("");//incluyo aquí salto de línea ya que lo anterior era seguido todo por quitar el LN del syso anterior
		System.out.println("El número mínimo es " +min+ " y el número máximo es " +max);
		System.out.println("La media de los números es " +media);
	}

}
