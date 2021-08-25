package Metodos;

import java.util.Scanner;

public class Ejer_1_MetodosMatrizUniDimendional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea una biblioteca de funciones para arrays (de una dimensión) 
		//de números enteros que contenga las siguientes funciones:
			//1. generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo
			//intervalo (mínimo y máximo) se indica como parámetro.
			//2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
			//3. maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
			//4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
			//5. estaEnArrayInt: Dice si un número está o no dentro de un array.
			//6. posicionEnArray: Busca un número en un array y devuelve la posición (el índice)
			//en la que se encuentra.
			//7. volteaArrayInt: Le da la vuelta a un array.
			//8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
			//9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un array
		
		Scanner sc = new Scanner(System.in);
		
		int longitud;
		System.out.println("Introduzca la longitud del Array");
		longitud = sc.nextInt();
		
		int[]Array = new int[longitud];
		int num, min, max;
		int numMIN;
		int numMAX;
		double media = 0;
		
		System.out.println("Introduzca el intervalo mínimo y máximo para los números que se generarán en el Array");
		min = sc.nextInt();
		max = sc.nextInt();
		
		generaArrayInt(min, max, Array);
		
		numMIN = minimoArrayInt(Array);
		System.out.println("El número mínimo del Array es: "+numMIN);
		
		numMAX = maximoArrayInt(Array);
		System.out.println("El número máximo del Array es: "+numMAX);
		
		media = mediaArrayInt(Array);
		System.out.println("La media del Arrray es: "+media);
		
		System.out.println("Introduzca un número para comprobar si está en el Array");
		num = sc.nextInt();
		if(estaEnArrayInt(num,Array)==true)System.out.println("Se ha encontrado");
		else System.out.println("No se ha encontrado");
		
		System.out.println("Introduzca un número para comprobar si está en el Array");
		num = sc.nextInt();
		int posicion=posicionEnArray(num,Array);
		if(posicion==-1)System.out.println("No encontrado");
		else System.out.println("La posición es "+(posicion+1));
		
		volteaArrayInt(Array);
		
		System.out.println("¿Cuántas veces quiere rotar a la derecha los números del Array");
		num = sc.nextInt();
		rotaDerechaArrayInt(num, Array);
		
		System.out.println("¿Cuántas veces quiere rotar a la izquierda los números del Array");
		num = sc.nextInt();
		rotaIzquierdaArrayInt(num, Array);
		
	}
	//METODO 1 - GENERA ARRAY INT
	static void generaArrayInt(int min, int max, int[]vector) { 
	//meto estas variables en el paréntesis porque el ejer nos indica que hay que indicarlas como parámetro
		for(int i=0; i<vector.length; i++) {
			vector[i] = (int) (Math.random()*((max-min+1)+min));
			System.out.print(vector[i]+" ");
		}
		System.out.println();
	}

	//METODO 2 - MINIMO ARRAY INT
	static /*void*/int minimoArrayInt(int[]vector) {
		
		int min = 999999;
		
		for(int i=0; i<vector.length; i++) {
			if(vector[i]<min) {
				min=vector[i];
			}
		}
		return min;
	}
	
	//METODO 3 - MAXIMO ARRAY INT
	static int maximoArrayInt(int[]vector) {
		
		int max = -999999;
				
		for(int i=0; i<vector.length; i++) {
			if(vector[i]>max) {
				max=vector[i];
			}
		}
		return max;
	}
	
	//METODO 4 - MEDIA ARRAY INT
	static double mediaArrayInt(int[]vector) {
		
		double suma = 0;
		double contador = 0;
		
		for(int i=0; i<vector.length; i++) {
			suma+=vector[i];
			contador++;
		}
		double media = suma/contador;
		return media;
	}
	
	//METODO 5 - ESTA EN ARRAY INT
	static boolean estaEnArrayInt(int num, int[]vector) {
		
		boolean encontrado = false;
		
		for(int i=0; i<vector.length && encontrado==false; i++) {
			if(num==vector[i]) {
				encontrado = true;
			}
		}
		if(encontrado==true) {
			return true;
		}else {
			return false;
		}
	
	}
	
	//METODO 6 - POSICION EN ARRAY
	static int posicionEnArray(int num, int[]vector) {
		
		int posicion = -1; //no pongo un 0 porque si no se encontrase coincidencias en el vector...
		//el return me devolvería un 0, y un 0 ya puede ser un mismo número del vector
		boolean encontrado = false;
		
		for(int i=0; i<vector.length && encontrado==false; i++) {
			if(num==vector[i]) {
				encontrado = true;
				posicion=i;
			}
		}
		return posicion;
	}
	
	//METODO 7 - VOLTEA ARRAY INT
	static void volteaArrayInt(int[]vector) {
		
		int[]AUX = new int[vector.length];
		int posicion = 0;
		
		for(int i=vector.length-1; i>=0; i--) { //si no le pongo el -1 cuando recorro para atrás, me saldrá OUT OF BOUNDS
			AUX[posicion]=vector[i];// aquí guardo en el vector AUX el vector normal al revés
			posicion++;
		}
		for(int i=0; i<vector.length; i++) {
			vector[i]=AUX[i]; //y aquí guardo el vector normal ya dado la vuelta para que se quede así el resto del ejercicio
			System.out.print(vector[i]+" ");
		}
		System.out.println();
	}
	
	//METODO 8 - ROTA DERECHA ARRAY INT
	static void rotaDerechaArrayInt(int num, int[]vector) {
		
		int AUX;
		
		for(int i=0; i<num; i++) {
			AUX = vector[vector.length-1];
			
			for(int j=vector.length-1; j>0; j--) {
				vector[j]=vector[j-1];
			}
			vector[0]=AUX;
		}
		for(int i=0; i<vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
		System.out.println();
	}
	
	//METODO 9 - ROTA IZQUIERDA ARRAY INT
	static void rotaIzquierdaArrayInt(int num, int[]vector) {
		
		int AUX = 0;
		
		for(int i=0; i<num; i++) {
			AUX = vector[0];
			
			for(int j=0; j<vector.length-1; j++) {
				vector[j]=vector[j+1];
			}
			vector[vector.length-1]=AUX;
		}
		for(int i=0; i<vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
		System.out.println();
	}
}
