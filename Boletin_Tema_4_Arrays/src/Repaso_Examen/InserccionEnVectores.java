package Repaso_Examen;

import java.util.Scanner;

public class InserccionEnVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[]Vector = {1,2,3,4,5,6,7,8,9,10};
		int[]VectorAUX = new int[11];//tiene que ser uno más, y si el Vector ya tiene un hueco vacio, No hace falta el VectorAUX
		//y donde pone Vector AUX seria Vector a secas
		int numAUX;
		
		int num = 8;
		int pos =0;
		boolean encontrado = false;
		
		for(int i=0; i<Vector.length; i++) {
			System.out.print(Vector[i]+"\t");
		}
		System.out.println();
		
		//esto es para cuando me lo dan desordenado
		/*for(int i=0; i<Vector.length-1; i++) {
				for(int j=0; j<Vector.length-1; j++) {
					if(Vector[j]>Vector[j+1]) { //if(numero actual>numero siguiente)
						numAUX = Vector[j]; //al auxiliar le damos el valor del número actual
						Vector[j] = Vector[j+1];// y al núemro actual le damos el valor del número siguiente
						Vector[j+1] = numAUX;//finalmente al número siguiente le damos el valor que metimos en el auxiliar (el número actual!!)
					}
				}
			}*/
		for(int i=0; i<Vector.length; i++) {
			System.out.print(Vector[i]+"\t");
		}
		System.out.println();
		
		for(int i=0; i<Vector.length; i++) {//si no necesitase el VEectorAUX esto lo bprraria
			VectorAUX[i] = Vector[i];
		}
		if(VectorAUX[0]>=num) { //para insertar por la izquierda
			for(int i=VectorAUX.length-1; i>0; i--) {
				VectorAUX[i] = VectorAUX[i-1];
			}
			VectorAUX[0]=num;
		}else if(num>Vector[Vector.length-1]) {//insertar por la derecha
			VectorAUX[VectorAUX.length-1]=num;
		}else {//insertar por en medio
			for(int i=0; i<VectorAUX.length && encontrado==false; i++) {
				if(VectorAUX[i]>num) {
					pos=i;
					encontrado = true;
				}
			}
				for(int i=VectorAUX.length-1; i>pos; i--) {
					VectorAUX[i] = VectorAUX[i-1];
				}
				VectorAUX[pos]=num;
		}
		for(int i=0; i<VectorAUX.length; i++) {
			System.out.print(VectorAUX[i]+"\t");
		}
	}

}
