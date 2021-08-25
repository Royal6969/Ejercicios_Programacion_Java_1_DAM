package Arrays_de_2_Dimensiones;

public class Ejer_4_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Realiza un programa que rellene un array de 6 filas x 10 columnas
		 * con numeros enteros positivos comprendidos entre el 0 y el 1000 (ambos incluidos).
		 * A continuación, el programa deberá dar la posición tanto del maximo como del minimo
		 * (se sobreentiende que los numeros son generados aleatoriamente*/
		
		int[][] matriz = new int[6][10];
		int max = -9999; // RECUERDA: el maximo se iguala desde abajo
		int min = 9999; //RECUERDA: el minimo se iguala desde arriba
		
		//para recorrer los numeros (filas y columnas) de la matriz
		for(int i=0; i<6; i++) { //este para recorrer las FILAS
			for(int j=0; j<10; j++) { //este para recorrer las COLUMNAS
				matriz[i][j] = (int) (Math.random()*1001);//(numero maximo-numero inicial)+numero inicial
			
				if(matriz[i][j]<min) {//si el numero de la matriz es menor que el minimo
					min = matriz[i][j];
				}
				if(matriz[i][j]>max) {
					max = matriz[i][j];
				}
			}
		}
		//para recorrer los numeros (filas y columnas) de la matriz
		for(int i=0; i<6; i++) { //este para recorrer las FILAS
			for(int j=0; j<10; j++) { //este para recorrer las COLUMNAS
				System.out.print(matriz[i][j]+"  ");//ACUERDATE DE QUITAR EL LN 
			}
			System.out.println();//para saltar y crear la siguiente fila debajo de la anterior
		}
		System.out.println();
		
		//para recorrer los numeros (filas y columnas) de la matriz
		for(int i=0; i<6; i++) { //este para recorrer las FILAS
			for(int j=0; j<10; j++) { //este para recorrer las COLUMNAS
				if(max == matriz[i][j]) {
					System.out.println("El número máximo está en la posición: "+(i+1)+" "+(j+1));
				}
				if(min == matriz[i][j]) {
					System.out.println("El número mínimo está en la posición: "+(i+1)+" "+(j+1));
				}
			}	
		}
	}

}
