package Metodos;

import java.util.Scanner;

public class Ejer_2_MetodosMatrizBiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea una biblioteca de funciones para arrays bidimensionales 
		//(de dos dimensiones) de n�meros enteros que contenga las siguientes funciones:
		//1. generaArrayBiInt: Genera un array de tama�o n x m con n�meros aleatorios
		//cuyo intervalo (m�nimo y m�ximo) se indica como par�metro.
		//2. filaDeArrayBiInt: Devuelve la fila i-�sima del array que se pasa como par�metro.
		//3. columnaDeArrayBiInt: Devuelve la columna j-�sima del array que se pasa como par�metro.
		//4. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array con dos elementos) 
		//de la primera ocurrencia de un n�mero dentro de un array bidimensional. 	
		//Si el n�mero no se encuentra en el array, la funci�n devuelve el array {-1, -1}.
		//5. esPuntoDeSilla: Dice si un n�mero es o no punto de silla, 
		//es decir, m�nimo en su fila y m�ximo en su columna.
		//6. diagonal: Devuelve un array que contiene una de las diagonales del array bidimensional que se pasa como par�metro. 
		//Se pasan como par�metros fila, columna y direcci�n. 
		//La fila y la columna determinan el n�mero que marcar� las dos posibles diagonales dentro del array. 
		//La direcci�n es una cadena de caracteres que puede ser �nose� o �neso�. 
		//La cadena �nose� indica que se elige la diagonal que va del noroeste hacia el sureste, 
		//mientras que la cadena �neso� indica que se elige la diagonal que va del noreste hacia el suroeste.
	
		Scanner sc = new Scanner(System.in);
		
		int fila, columna, min, max, num;
		System.out.println("Introduzca el n�mero de filas");
		fila = sc.nextInt();
		
		System.out.println("Introduzca el n�mero de columnas");
		columna = sc.nextInt();
	
		System.out.println("Introduzca el intervalo minimo y m�ximo para generar los n�meros de la matriz");
		min = sc.nextInt();
		max = sc.nextInt();
		
		int[][]Array = new int[fila][columna];
		
		generaArrayBiInt(min, max, Array);
		
		System.out.println("�Qu� fila quiere consultar?");
		num = sc.nextInt();
		num--;
		filaDeArrayBiInt(num, Array);
		
		System.out.println("�Qu� columna quiere consultar?");
		num = sc.nextInt();
		num--;
		columnaDeArrayBiInt(num, Array);
		
		System.out.println("�De qu� n�mero quiere conocer su posici�n en la matriz?");
		num = sc.nextInt();
		coordenadasEnArrayBiInt(num, Array);
		
		System.out.println("�Cu�les son las coordenadas del n�mero? (fila, columna)");
		fila = sc.nextInt();
		fila--;
		columna = sc.nextInt();
		columna--;
		esPuntoDeSilla(fila, columna, Array);
		
		String direccion;
		System.out.println("Introduzca la direcci�n de la diagonal que se va a mostrar (nose:noroeste, neso:suroeste");
		direccion = sc.next();
		System.out.println("�Cu�les son las coordenadas del n�mero? (fila, columna)");
		fila = sc.nextInt();
		fila--;
		columna = sc.nextInt();
		columna--;
		int[]AUX = diagonal(fila, columna, direccion, Array);
		for(int i=0; i<AUX.length; i++) {
			System.out.print(AUX[i]+ " ");
		}
		
	}
	//METODO 1 - GENERAR LA MATRIZ
	static void generaArrayBiInt(int min, int max, int[][]Array) {
		
		for(int i=0; i<Array.length; i++) {
			for(int j=0; j<Array[i].length; j++) {
				Array[i][j] = (int) (Math.random()*(max-min+1)+min); //esto deber�a ir en un m�todo aparte, en el que se comprobase que el rango superior sea mayor que el inferior
				System.out.print(Array[i][j]+" \t");
			}
			System.out.println();
		}
		System.out.println();
	}
	//METODO 2 - MOSTRAR FILA
	static void filaDeArrayBiInt(int num, int[][]Array) {//en realidad habr�a que haber creado un Vector[] y devolver eso
		
		for(int j=0; j<Array[num].length; j++) {//esto es para recorrer las columnas captando los n�meros de esa fila
			System.out.print(Array[num][j]+" \t");
		}
		System.out.println();
	}
	//METODO 3 - MOSTRAR COLUMNA
	static void columnaDeArrayBiInt(int num, int[][]Array) {
		
		for(int i=0; i<Array.length; i++) {
			System.out.print(Array[i][num]+" \t");
		}
		System.out.println();
	}
	//METODO 4 - MOSTRAR POSICION (coordenadas)
	static void coordenadasEnArrayBiInt(int num, int[][]Array) {
		
		boolean encontrado = false; //este boolean es para evitar recorrer todo el c�digo (muestra el 1� resultado, por eficiencia, y que as� lo pide el enunciado!)
		
		for(int i=0; i<Array.length; i++) {
			for(int j=0; j<Array[i].length; j++) {
				if(Array[i][j]==num && encontrado==false) {
					encontrado = true;
					System.out.println("La posici�n del n�mero "+num+" es la ["+(i+1)+"]["+(j+1)+"]");
				}
			}
		}
		if(encontrado==false) {
			System.out.println("No se ha encontrado el n�mero en la matriz");
		}
	}
	//METODO 5 - PUNTO DE SILLA
	static void esPuntoDeSilla(int fila, int columna, int[][]Array) {
		
		boolean esSilla = true;
		
		for(int j=0; j<Array[fila].length && esSilla==true; j++) { //Array[fila] es recorrer una fila concreta
			if(Array[fila][columna]>Array[fila][j]) {
				esSilla = false; //porque tendr�a que ser el min en la fila
				System.out.println("El n�mero "+Array[fila][columna]+" NO es silla");
			}
		}
		if(esSilla==true) {//como se tienen que cumplir ambas condiciones para el silla... si no fuera silla con lo de antes, ya no se har�a nada mas
			for(int i=0; i<Array.length && esSilla==true; i++) {
				if(Array[fila][columna]<Array[i][columna]) {
					esSilla = false; //porque tendr�a que ser el max en la columna
					System.out.println("El n�mero "+Array[fila][columna]+" NO es silla");
				}
			}
		}
		if(esSilla==true) {
			System.out.println("El n�mero "+Array[fila][columna]+" SI es silla");
		}
	}
	
	//METODO 6 - DIAGONAL CRAZY
	static int[] diagonal(int fila, int columna, String direccion, int[][]Array) {
		
		int contador = 0;
		
		if(direccion.equals("nose")) { //para comprobar la diagonal de izquierda a derecha
			for(int i=fila; i<Array.length; i++) { //empieza en la fila que ha dicho el user y recorre hasta el final del Array
				contador++;
			}
			int[]AUX = new int[contador];
			contador = 0; //reseteo contador
			
			for(int i=fila; i<Array.length; i++) {
				for(int j=columna; j<Array[i].length; j++) {
					if(i==j) {
						AUX[contador]=Array[i][j];//esto para capturar la diagonal principal
						contador++;
					}
				}
			}
			return AUX;
		}else {
			for(int i=Array.length-1; i>=fila; i--) {
				contador++;
			}
			int[]AUX = new int[contador];
			contador = 0; //reseteo contador
			
			for(int i=fila; i<Array.length; i++) {
				for(int j=columna; j<Array[i].length; j++) {
					if(i==(Array[i].length-1)-j) {
						AUX[contador]=Array[i][j];//esto para capturar la diagonal inversa
						contador++;
					}
				}
			}
			return AUX;
		}
	}

}
