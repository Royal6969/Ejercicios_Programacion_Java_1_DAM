package Repaso_Matrices;

public class Ejer_1_Matriz_SumaFila_SumaColumna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[4][5];
		int suma = 0; 
		int total = 0;
		
		//rellenar y mostrar
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				matriz[i][j] = (int)(Math.random()*21);
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		//suma filas a la derecha
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(matriz[i][j]+"\t");
				suma += matriz[i][j];
			}
			System.out.println(suma);
			total += suma; //acumular en total
			suma = 0; //resteo a 0
		}
		
		//suma columnas abajo
		for(int j=0; j<5; j++) {
			for(int i=0; i<4; i++) {
				suma += matriz[i][j];
			}
			System.out.print(suma+"\t");
			total += suma;
			suma = 0;
		}
		//mostrar total en la esquina
		System.out.println(total);
	}

}
