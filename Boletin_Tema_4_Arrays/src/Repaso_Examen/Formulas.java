package Repaso_Examen;

import java.util.Scanner;

public class Formulas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		//Para ORDENAR un VECTOR
		
		int[]VectorAUX = new int[+1 del Vector original]
		int numAUX;
		
		for(int i=0; i<Vector.lenght; i++) {
			for(int j=0; j<Vector.lenght; i++) {
				if(Vector[j]>Vector[j+1]) {
					numAUX = Vector[j];
					Vector[j] = Vector[j+1];
					Vector[j+1] = numAUX;
				}
			}
		}/*COMPLEMENTARIAMENTE pasar los datos del Vector original al VectorAUX
		 * for(int i=0; i<Vector.lenght; i++){
		 * 		VectorAUX[i] = Vector[i];
		 */
		
		//Para INSERTAR por la IZQUIERDA
		
		int num; 
		
		if(VectorAUX>=num) {
			for(int i=VectorAUX.length-1; i>0; i--) {//esto mueve los numeros a la derecha
				VectorAUX[i] = VectorAUX[i-1];		 //esto mueve los numeros a la derecha
			}
			VectorAUX[i] = num;
		}
		
		//Para INSERTAR por la DERECHA
		
		if(num>Vector[Vector.lenght-1]) {
			VectorAUX[VectorAUX.lenght-1]=num;
		}
		
		//Para INSERTAR por EN MEDIO
		
		boolean encontrado = false;
		int posicion = 0;
		
		for(int i=0; i<VectorAUX.length && encontrado==false; i++) {
			if(VectorAUX[i]>num) {
				posicion = i;
				encontrado = true;
			}
		}
		for(int i=VectorAUX.length; i>posicion; i++) {
			VectorAUX[i] = VectorAUX[i-1];
		}
		VectorAUX[posicion] = num;
		
		//Para MODIFICAR algún número por otro número 
		
		int num2;
		
		System.out.println("Pido el numero que se quiere cambiar");
		num = sc.nextInt();
		System.out.println("Pido el nuevo número que se va a meter");
		num2 = sc.nextInt();
		
		for(int i=0; i<Vector.lenght; i++) {
			if(num==Vector[i]) {
				Vector[i] = num2;
			}
		}
		
		//para ELIMINAR algún número
		
		System.out.println("Pido el numero que se quiere eliminar");
		num = sc.nextInt();
		
		for(int i=0; i<Vector.lenght; i++) {
			if(num==Vector[i]) {
				for(int j=i; j<Vector.lenght; j++) {
					Vector[j] = Vector[j+1];
				}
			}
		}
		
		//BUSCAR MINIMO en un vector
		
		int min = 999999;
				
		for(int i=0; i<Vector.lenght; i++) {
			if(Vector[i]<min) {
				min = Vector[i];
			}
		}
		
		//BUSCAR MAXIMO en un vector
		
		int max = -999999;
				
		for(int i=0; i<Vector.lenght; i++) {
			if(Vector[i]>max) {
				max = Vector[i];
			}
		}
		
		//para VOLTEAR/INVERTIR un vector
		
		int[][]VectorAUX = new int[Vector.lenght];
		int posicion = -1;
		
		for(int i=Vector.lenght-1; i>0; i--) {
			VectorAUX[posicion] = Vector[i];
			posicion++;
		}
		for(int i=0; i<Vector.lenght; i++) {
			Vector[i] = VectorAUX[i];
			System.out.println("Aqui imprimiria el vector original ya dado la vuelta");
		}
		
		//para BÚSQUEDA DICOTÓMICA en un vector
		
		int[]Vector = {1,2,3,4,5,6,7,8,9,10};
		int num = 6;
		int posicion;
		
		boolean salir = true;
		int superior = Vector[Vector.length-1];
		int inferior = Vector[0];
		int centro = 0;
		
		while(inferior<=superior && salir==true) {
			centro = (superior+inferior)/2;
			
			if(Vector[centro]=num) {
				salir = false;
			}else if(num<Vector[centro]) {
				superior = centro-1;
			}else {
				superior = centro+1;
			}
		}
		if(salir==true) {
			centro = -1;
		}
		posicion = centro;
		System.out.println("Aqui pongo que la posicion del numero es "+posicion);
		
		//para BÚSQUEDA SECUENCIAL en un vector
		
		int[]Vector = {1,3,5,7,9,8,6,4,2,10};
		int posicion = -1;
		boolean encontrado = false;
		int num = 6;
		
		for(int i=0; i<Vector.length && encontrado==false; i++) {
			if(Vector[i]==num) {
				encontrado = true;
				posicion = i;
			}
		}
		System.out.println("Aqui pongo que la posicion encontrada fue: "+posicion);
		
		//Para ROTAR números a la DERECHA (n) veces
		
		int[]Vector = {1,2,3,4,5,6,7,8,9,10};
		int rotar = 3;
		int AUX;
		
		for(int i=0; i<rotar; i++) {
			AUX = Vector[Vector.length-1];
			
			for(int j=Vector.length-1; j>0; j--) {
				Vector[j] = Vector[j-1];
			}
			Vector[0] = AUX;
		}
		
		//Para ROTAR números a la IZQUIERDA (n) veces
		
		int[]Vector = {1,2,3,4,5,6,7,8,9,10};
		int rotar = 3;
		int AUX;
		
		for(int i=0; i<rotar; i++) {
			AUX = Vector[0];
			
			for(int j=0; j<Vector[Vector.length-1]; j++) {
				Vector[j] = Vector[j+1];
			}
			Vector[Vector.length-1] = AUX;
		}
	}

}
