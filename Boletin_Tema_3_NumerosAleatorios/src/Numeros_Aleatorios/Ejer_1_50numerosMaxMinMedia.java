package Numeros_Aleatorios;

import java.util.Scanner;

public class Ejer_1_50numerosMaxMinMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Muestra 50 n�meros enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios. 
		//Muestra tambi�n el m�ximo, el m�nimo y la media de esos n�meros.
		
		Scanner sc = new Scanner(System.in);
		
		int num; 
		int min = 199; //esto ve su l�gica luego en su If
		int max = 100;
		int suma = 0;
		int media;
		
		for(int i=1; i<=50; i++) { //hago un bucle FOR para mostrar por pantalla los 50 n�meros entre 100 y 199
			
			num = (int) (Math.random()*100+100); //el n�mero generado hay que "castearlo" y transformarlo a un n�mero entero (INT) y "multiplicarlo" por el l�mite 100 y el m�nimo del rango que es 100
			System.out.print(num+ " "); //para el espacio entre n�meros
			suma+=num; //para que se vayan sumando los n�meros que se generan para hacer la media dps
			
			if(num<min) {//hab�amos declarado el min y max al rev�s para poder hacer esto bn
				min = num;//importante poner min= a lo que sea porque de poner num= a, no sale lo mismo...
			}
			if(num>max) {//el numero mas alto que 100 es el max y el m�s bajo de 199 el min
				max = num;
			}
			
		}// est� todo dentro del bucle For
		
		media = suma/50;
		
		System.out.println("");//incluyo aqu� salto de l�nea ya que lo anterior era seguido todo por quitar el LN del syso anterior
		System.out.println("El n�mero m�nimo es " +min+ " y el n�mero m�ximo es " +max);
		System.out.println("La media de los n�meros es " +media);
	}

}
