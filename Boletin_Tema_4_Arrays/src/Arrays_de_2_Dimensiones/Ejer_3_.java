package Arrays_de_2_Dimensiones;

public class Ejer_3_ {

	public static void main(String[] args) throws InterruptedException { //esto hace los SLEEPS
		// TODO Auto-generated method stub

		//3. Modifica el programa anterior de tal forma que las sumas parciales y la suma total
		//aparezcan en la pantalla con un pequeño retardo
		//dando la impresión de que el ordenador se queda (pensando) antes de mostrar los números.
		
		int[][] matriz = new int[4][5]; //Filas y columnas
		int suma = 0;
		int total = 0;
		
		//para recorrer los numeros (filas y columnas) de la matriz
		for(int i=0; i<4; i++) { //este para recorrer las FILAS
			for(int j=0; j<5; j++) { //este para recorrer las COLUMNAS
				matriz[i][j] = (int) (Math.random()*(1000-100)+100);//(numero maximo-numero inicial)+numero inicial
			}
		}
		//el resto del ejercicio es exactamente igual que el anterior Ejer 1
		
		//para la SUMA de las FILAS
		for(int i=0; i<4; i++) { //este para recorrer las FILAS
			for(int j=0; j<5; j++) { //este para recorrer las COLUMNAS
				System.out.print(matriz[i][j]+" - "); //para mostrar la matriz que se ha creado conjunto a las sumas
				suma += matriz[i][j]; //con el contador SUMA se van sumando los numeros de cada posicion que recorre
				}//cuando ya acabe de recorrer una fila, sin el LN del syso anterior, se muestra la suma al final de cada fila
			Thread.sleep(1000);
			System.out.println(suma); //para mostrar las sumas EN LAS FILAS //este si lleva LN para saltar a la siguiente
			total += suma; //para ir acumulando las sumas de las filas en el contador TOTAL
			suma = 0; //para resetear el contador SUMA
			}
		
		//para la SUMA de las COLUMNAS
		for(int j=0; j<5; j++) { //ahora primero recorremos las columas 
			for(int i=0; i<4; i++) { //y dps recorremos las filas
				suma += matriz[i][j];//con el contador SUMA se van sumando los numeros de cada posicion que recorre VERTICAlMENTE
			}//una vez fuera del FOR de las filas....
			Thread.sleep(1000);
			System.out.print(suma+"  "); //para crear una fila debajo del todo que sean las sumas de cada columna
			total += suma;//para ir acumulando las sumas de las columnas en el contador TOTAL
			suma = 0; //para resetear el contador SUMA
		}
		Thread.sleep(1000);
		System.out.println(total); //La casilla que queda, coincide con el final de la diagonal
	}

}
