package Ejer_7_MatrizDinamica;

public class Prueba_Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		Matriz matriz1 = new Matriz(3, 3); //el ejemplo va a ser de una matriz 3x3
		Matriz matriz2 = new Matriz(3, 3, matrix);
		
		matriz1.imprimir();
		System.out.println();
		matriz2.imprimir();
		System.out.println();
		
		matriz1.sett(0, 0, new Numeros(5)); //el numero es cualquiera para el ej
		matriz1.imprimir();
		System.out.println();
		matriz2.sett(0, 0, new Numeros(9));
		matriz2.imprimir();
		System.out.println();
		
		Numeros b = matriz1.gett(1, 1); //la posicion 2x2 para el ej
		System.out.println(b);
		Numeros c = matriz2.gett(2, 2);
		System.out.println(c);
		
		matriz1.espejo();
		matriz1.imprimir();
		System.out.println();
		matriz2.espejo();
		matriz2.imprimir();
		System.out.println();
		
		matriz1.traspuesta();
		matriz1.imprimir();
		System.out.println();
		matriz2.traspuesta();
		matriz2.imprimir();
		System.out.println();
	}

}
