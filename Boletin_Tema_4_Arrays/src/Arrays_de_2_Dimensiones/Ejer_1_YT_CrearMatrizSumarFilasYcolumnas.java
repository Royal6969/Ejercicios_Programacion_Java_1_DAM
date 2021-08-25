package Arrays_de_2_Dimensiones;

import java.util.Scanner;

public class Ejer_1_YT_CrearMatrizSumarFilasYcolumnas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Escribe un programa que pida 20 números enteros
		//Estos de se deben introducir en un array de 4 filas por 5 columnas.
		//El programa mostrará las sumas parciales de filas y columnas 
		//igual que si de una hoja de cálculo se tratara.
		//La suma total debe aparecer en la esquina inferior derecha.
		
		Scanner sc = new Scanner(System.in);
		
		//lo 1º es crear la matriz en sí, y preguntarle al usuario el nº de filas/columnas que tiene
		int matriz[][],nFilas,nColumnas;
		
		System.out.println("Introduzca el número de filas");
		nFilas = sc.nextInt();
		
		System.out.println("Introduzca el número de columnas"); 
		nColumnas = sc.nextInt();
		
		//ahora viene la 2º parte, en la cual pediremos los números de dentro de la tabla !!
		matriz = new int[nFilas][nColumnas];
		
		for(int i=0; i<nFilas; i++) {//bucle FOR para pedir los NÚMEROS de las FILAS
			for(int j=0; j<nColumnas; j++) {//bucle FOR para pedir los NÚMEROS de las COLUMNAS
				System.out.print("Matriz["+(i+1)+"]["+(j+1)+"]: ");//Para mostrar matriz al usuario
				matriz[i][j] = sc.nextInt(); //escaneo de los numeros que ha ido metiendo el usuario
			}
		}
		System.out.println();
		
		//ahora vamos a mostrar la matriz ya completa para comprobar que la suma esté bn
		System.out.print("La matriz es: ");
		System.out.println();//salto de línea por estética
		for(int i=0; i<nFilas; i++) {
			for(int j=0; j<nColumnas; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//para SUMAR las FILAS
		int sumaFilas = 0;
		
		for(int i=0; i<nFilas; i++) {
			for(int j=0; j<nColumnas; j++) {
				sumaFilas += matriz[i][j];
			}
			System.out.print("La suma de la fila ["+(i+1)+"] es: "+sumaFilas);
			System.out.println();
			sumaFilas = 0;
		}
		System.out.println();
		
		//para sumar las columnas
		int sumaColumnas = 0;
		
		for(int j=0; j<nColumnas; j++) {
			for(int i=0; i<nFilas; i++) {
				sumaColumnas += matriz[i][j];
			}
			System.out.print("La suma de la columna ["+(j+1)+"] es: "+sumaColumnas);
			System.out.println();
			sumaColumnas = 0;
		}
		System.out.println();
	}

}
