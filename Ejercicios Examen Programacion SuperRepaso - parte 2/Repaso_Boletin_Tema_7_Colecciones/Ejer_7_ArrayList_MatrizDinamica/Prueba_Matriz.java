package Ejer_7_ArrayList_MatrizDinamica;

public class Prueba_Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]matriz1 = {{1,2,3},{4,5,6},{7,8,9}}; //creamos una matriz sencilla
		Matriz m1 = new Matriz(3, 3); //creamos objeto de la clase Matriz //pulsa la sugerencia de los 2 parámetros
		Matriz m2 = new Matriz(3, 3, matriz1); //creamos objeto de la clase Matriz //pulso la sugerencia de los 3 parámetros
		
		//mostrar las dos matrices de la clase Matriz
		m1.imprimir();
		System.out.println();
		m2.imprimir();
		System.out.println();
		
		m1.set_v2(0, 0, new Numero(5)); //setear el numero 5 en la primera posición la matriz m1
		m1.imprimir();
		System.out.println();
		
		m2.set_v2(0, 0, new Numero(10)); //setear el numero 10 en la primera posición la matriz m2
		m2.imprimir();
		System.out.println();
		
		Numero n1 = m1.get_v2(1, 1); //obtener el numero de la segunda posición de la matriz m1
		System.out.println(n1);
		
		Numero n2 = m2.get_v2(2, 2); //obtener el numero de la tercera posición de la matriz m2
		System.out.println(n2);
		
		m1.espejo();
		m1.imprimir();
		System.out.println();
		
		m2.espejo();
		m2.imprimir();
		System.out.println();
		
		m1.traspuesta();
		m1.imprimir();
		System.out.println();
		
		m2.traspuesta();
		m2.imprimir();
		System.out.println();
	}

}
