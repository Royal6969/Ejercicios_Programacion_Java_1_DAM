package Arrays_de_2_Dimensiones;

import java.util.Scanner;

public class Ejer_1_PRO_CrearMatrizSumarFilasYcolumnas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n[][] = new int[4][5]; //Matriz para generar los números aleatorios entre 0 y 100
	    int nArray[][] = new int[6][6]; //Array Final
	    int sumaFilas = 0, sumaColumnas = 0, sumaTotal = 0;

	    //Genera los números aleatorios en 
	    for (int i=0; i<4; i++) {
	        for (int j=0; j<5; j++) {
	            n[i][j] = (int) (Math.random() * 101);
	            nArray[i][j] = n[i][j];
	        }
	    }

	    for (int j=0; j<5; j++) { //Columnas
	        System.out.print("\t Columna "+j+" ");
	    }

	    //SumaFilas
	    for (int i=0; i<5; i++) { //Filas
	        if (i==4) {
	            System.out.println("\n\n");
	        } else {
	            System.out.print("\n\nFila " + i);
	        }
	        sumaFilas = 0;
	        
	        for (int j=0; j<6; j++) { //Columnas
	            System.out.print("\t\t" + nArray[i][j]);
	            sumaFilas += nArray[i][j];
	            nArray[i][5] = sumaFilas;
	        }
	    }

	    //Suma columnas
	    for (int j=0; j<6; j++) { //Columnas
	        sumaColumnas = 0;
	        for (int i=0; i<5; i++) { //Filas
	            sumaColumnas += nArray[i][j];
	            nArray[i][5] = sumaColumnas;
	        }
	    }
	    System.out.println();
	}

}
