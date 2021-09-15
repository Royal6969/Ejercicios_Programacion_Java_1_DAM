package Repaso_M�todos;

import java.util.Scanner;

public class Ejer_1_Funciones_Arrays_vectorEnteros {

/*
 * 1. Crea una biblioteca de funciones para arrays (de una dimensi�n) de n�meros
enteros que contenga las siguientes funciones:
1. generaArrayInt: Genera un array de tama�o n con n�meros aleatorios cuyo
intervalo (m�nimo y m�ximo) se indica como par�metro.
2. minimoArrayInt: Devuelve el m�nimo del array que se pasa como par�metro.
3. maximoArrayInt: Devuelve el m�ximo del array que se pasa como par�metro.
4. mediaArrayInt: Devuelve la media del array que se pasa como par�metro.
5. estaEnArrayInt: Dice si un n�mero est� o no dentro de un array.
6. posicionEnArray: Busca un n�mero en un array y devuelve la posici�n (el �ndice)
en la que se encuentra.
7. volteaArrayInt: Le da la vuelta a un array.
8. rotaDerechaArrayInt: Rota n posiciones a la derecha los n�meros de un array.
9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los n�meros de un array
 */
	
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max, min, tama�o, num;
		double media = 0;
		System.out.println("Dime tama�o array");
		tama�o = sc.nextInt();
		int[] vector = new int[tama�o];
		System.out.println("Introduzca min intervalo");
		min = sc.nextInt();
		System.out.println("Introduzca max intervalo");
		max = sc.nextInt();
		
		generaArrayInt(vector, max, min);
		System.out.println();
		min = minimoArrayInt(vector);
		System.out.println(min);
		System.out.println();
		max = maximoArrayInt(vector);
		System.out.println(max);
		System.out.println();
		media = mediaArrayInt(vector);
		System.out.println(media);
		System.out.println();
		System.out.println("Dime un n�mero para buscarlo en el vector");
		num = sc.nextInt();
		if(estaEnArrayInt(vector, num)) {
			System.out.println("S� est� el n�mero en el array");
		}else {
			System.out.println("No est� el n�mero en el array");
		}
		System.out.println("Dime un n�mero para buscarlo y saber su posici�n en el vector");
		num = sc.nextInt();
		num = posicionEnArray(vector, num);
		System.out.println(num);
		System.out.println();
		volteaArrayInt(vector);
		System.out.println();
		System.out.println("Cu�ntas posiciones quiere rotar el vector a la derecha");
		num = sc.nextInt();
		rotaDerechaArrayInt_v1(vector, num);
		System.out.println();
		System.out.println("Cu�ntas posiciones quiere rotar el vector a la izquierda");
		num = sc.nextInt();
		rotaIzquierdaArrayInt_v1(vector, num);
		System.out.println();
	}
	public static void generaArrayInt(int[] vector, int max, int min) {
		for(int i=0; i<vector.length; i++) {
			vector[i] = (int)(Math.random()*(max-min+1)+min);
			System.out.print(vector[i]+"\t");
		}
		System.out.println();
	}
	//2. minimoArrayInt: Devuelve el m�nimo del array que se pasa como par�metro.
	public static int minimoArrayInt(int[] vector) {
		int min = 999999;
		
		for(int i=0; i<vector.length; i++) {
			if(vector[i]<min) {
				min = vector[i];
			}
		}
		return min;
	}
	//3. maximoArrayInt: Devuelve el m�ximo del array que se pasa como par�metro.
	public static int maximoArrayInt(int[] vector){
		int max = -999999;
		
		for(int i=0; i<vector.length; i++) {
			if(vector[i]>max) {
				max = vector[i];
			}
		}
		return max;
	}
	//4. mediaArrayInt: Devuelve la media del array que se pasa como par�metro.
	public static double mediaArrayInt(int[] vector) {
		double suma = 0;
		double media = 0;
		
		for(int i=0; i<vector.length; i++) {
			suma += vector[i];
		}
		media = suma/vector.length;
		return media;
	}
	//5. estaEnArrayInt: Dice si un n�mero est� o no dentro de un array.
	public static boolean estaEnArrayInt(int[] vector, int num) {
		boolean encontrado = false;
		
		for(int i=0; i<vector.length && encontrado==false; i++) {
			if(vector[i]==num) {
				encontrado = true;
			}
		}
		return encontrado;
	}
	//6. posicionEnArray: Busca un n�mero en un array y devuelve la posici�n (el �ndice) en la que se encuentra.
	public static int posicionEnArray(int[] vector, int num) {
		int pos = -1;
		boolean encontrado = false;
		
		for(int i=0; i<vector.length && encontrado==false; i++) {
			if(vector[i]==num) {
				pos = i;
				encontrado = true;
			}
		}
		return pos;
	}
	//7. volteaArrayInt: Le da la vuelta a un array.
	public static void volteaArrayInt(int[] vector) {
		int[] aux = new int[vector.length];
		int pos = 0;
		
		for(int i=vector.length-1; i>=0; i--) {
			aux[pos] = vector[i];
			pos++;
		}
		for(int i=0; i<vector.length; i++) {
			vector[i] = aux[i];
			System.out.print(vector[i]+"\t");
		}
	}
	//8. rotaDerechaArrayInt: Rota n posiciones a la derecha los n�meros de un array.
	public static void rotaDerechaArrayInt_v1(int[] vector, int num) {
		int numGuardado = 0;
		
		for(int j=0; j<num; j++) {
			for(int i=vector.length-1; i>=0; i--) {
				if(i==vector.length-1) {
					numGuardado = vector[i];
				}else if(i==0) {
					vector[i+1] = vector[i];
					vector[i] = numGuardado;
				}else {
					vector[i+1] = vector[i];
				}
			}
		}
		
		for(int i=0; i<vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
	}
	//8. extra facil
	static void rotaderechaArrayInt_v2(int x, int[]Array) {
        int Aux;
        for(int j=0;j<x;j++) {
            Aux=Array[Array.length-1];
            for(int i=Array.length-1;i>0;i--) {
                Array[i]=Array[i-1];
            }
            Array[0]=Aux;
        }
        for(int i=0;i<Array.length;i++) {
            System.out.print(Array[i]+"|");
        }
        System.out.println();
    }
	//9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los n�meros de un array
	public static void rotaIzquierdaArrayInt_v1(int[] vector, int num) {
		int numGuardado = 0;
		
		for(int j=0; j<num; j++) {
			for(int i=0; i<vector.length; i++) {
				if(i==0) {
					numGuardado = vector[i];
				}else if(i==vector.length-1) {
					vector[i-1] = vector[i];
					vector[i] = numGuardado;
				}else {
					vector[i-1] = vector[i];
				}
			}
		}
		for(int i=0; i<vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
	}
}
