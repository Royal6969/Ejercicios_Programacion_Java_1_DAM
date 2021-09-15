package Repaso_Métodos;

import java.util.Scanner;

public class Ejer_2_Funciones_Arrays_Matriz {

/*
 * 2. Crea una biblioteca de funciones para arrays bidimensionales (de dos 
dimensiones) de números enteros que contenga las siguientes funciones:
1. generaArrayBiInt: Genera un array de tamaño n x m con números aleatorios 
cuyo intervalo (mínimo y máximo) se indica como parámetro.
2. filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como parámetro.
3. columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se pasa como 
parámetro.
4. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array con dos 
elementos) de la primera ocurrencia de un número dentro de un array 
bidimensional. Si el número no se encuentra en el array, la función devuelve el 
array {-1, -1}.
5. esPuntoDeSilla: Dice si un número es o no punto de silla, es decir, mínimo en su 
fila y máximo en su columna.
6. diagonal: Devuelve un array que contiene una de las diagonales del array 
bidimensional que se pasa como parámetro. Se pasan como parámetros fila, 
columna y dirección. La fila y la columna determinan el número que marcará las 
dos posibles diagonales dentro del array. La dirección es una cadena de caracteres
que puede ser “nose” o “neso”. La cadena “nose” indica que se elige la diagonal 
que va del noroeste hacia el sureste, mientras que la cadena “neso” indica que se 
elige la diagonal que va del noreste hacia el suroeste.
 */
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int filas, columnas;
		System.out.println("Introduzca nº de filas para la matriz");
		filas = sc.nextInt();
		System.out.println("Introduzca nº de columnas para la matriz");
		columnas = sc.nextInt();
		int[][] matriz = new int[filas][columnas];
		
		int min, max;
		System.out.println("Introduzca el min intervalo para los números");
		min = sc.nextInt();
		System.out.println("Introduzca el max intervalo para los números");
		max = sc.nextInt();
		generaArrayBiInt(matriz, filas, columnas, min, max);
		
		int[] aux1 = new int [filas];
		System.out.println("¿Qué fila desea consultar?");
		filas = sc.nextInt();
		filas--;
		aux1 = filaDeArrayBiInt(matriz, filas);
		
		int[] aux2 = new int [columnas];
		System.out.println("¿Qué columna desea consultar?");
		columnas = sc.nextInt();
		columnas--;
		aux2 =columnaDeArrayBiInt(matriz, columnas);
		
		int num;
		System.out.println("¿De qué número quiere conocer su posición? (coordenadas)");
		num = sc.nextInt();
		coordenadasEnArrayBiInt(matriz, num);
		
		System.out.println("¿Cuáles son las coordenadas del número? (fila, columna)");
		filas = sc.nextInt();
		filas--;
		columnas = sc.nextInt();
		columnas--;
		esPuntoDeSilla(matriz, filas, columnas);
	}
	//1. generaArrayBiInt: Genera un array de tamaño n x m con números aleatorios 
	//cuyo intervalo (mínimo y máximo) se indica como parámetro.
	public static void generaArrayBiInt(int[][] matriz, int filas, int columnas, int min, int max) {
		for(int i=0; i<filas; i++) {
			for(int j=0; j<columnas; j++) {
				matriz[i][j] = (int)(Math.random()*(max-min+1)+min);
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	//2. filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como parámetro.
	public static int[] filaDeArrayBiInt(int[][] matriz, int filas) {
		int[] aux1 = new int [matriz.length];
		int pos = 0;
		
		for(int j=0; j<matriz[filas].length; j++) {
			//System.out.println(matriz[filas][j]+"\t");
			aux1[pos] = matriz[filas][j];
			System.out.println(aux1[pos]+"\t");
		}
		System.out.println();
		return aux1;
	}
	//3. columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se pasa como parámetro.
	public static int[] columnaDeArrayBiInt(int[][] matriz, int columnas) {
		int[] aux2 = new int [matriz.length];
		int pos = 0;
		
		for(int i=0; i<matriz.length; i++) {
			//System.out.println(matriz[filas][j]+"\t");
			aux2[pos] = matriz[i][columnas];
			System.out.println(aux2[pos]+"\t");
		}
		System.out.println();
		return aux2;
	}
	//4. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array con dos elementos) 
	//de la primera ocurrencia de un número dentro de un array bidimensional. 
	//Si el número no se encuentra en el array, la función devuelve el array {-1, -1}.
	public static void coordenadasEnArrayBiInt(int[][] matriz, int num) {
		boolean encontrado = false;
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j] == num && encontrado == false) {
					encontrado = true;
					System.out.println("La posición del número "+num+" es la ["+(i+1)+"]["+(j+1)+"]");
				}
				if(encontrado==false) {
					System.out.println("No se ha encontrado el número en la matriz");
				}
			}
		}
	}
	//5. esPuntoDeSilla: Dice si un número es o no punto de silla, es decir, 
	//mínimo en su fila y máximo en su columna.
	public static void esPuntoDeSilla(int[][] matriz, int filas, int columnas) {
		boolean esSilla = true;
		
		for(int j=0; j<matriz[filas].length && esSilla==true; j++) {
			if(matriz[filas][columnas] > matriz[filas][j]) {
				esSilla = false;
				System.out.println("El número "+matriz[filas][columnas]+" NO es silla");
			}
		}
		if(esSilla == true) {
			for(int i=0; i<matriz.length && esSilla == true; i++) {
				if(matriz[filas][columnas] < matriz[i][columnas]) {
					esSilla = false;
					System.out.println("El número "+matriz[filas][columnas]+" NO es silla");
				}
			}
		}
		if(esSilla == true) {
			System.out.println("El número "+matriz[filas][columnas]+" SI es silla");
		}
	}
}
