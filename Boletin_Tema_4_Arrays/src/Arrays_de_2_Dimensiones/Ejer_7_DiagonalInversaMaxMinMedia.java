package Arrays_de_2_Dimensiones;

public class Ejer_7_DiagonalInversaMaxMinMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]matriz = new int[9][9];
		int[]diagonal = new int[9];
		int min = 9999;
		int max = -9999;
		int suma = 0;
		int media = 0;
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				matriz[i][j] = (int) (Math.random()*(900-500)+500); ////(numero maximo-numero inicial)+numero inicial
				System.out.print(matriz[i][j]+"\t");
				
				if(i==(matriz[i].length-1)-j) { //no entiendo esto
					diagonal[i]=matriz[i][j];
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Estos son los números de la diagonal inversa");
		
		for(int i=0; i<9; i++) { //Como hago para que salgan los números al reves???
			System.out.print(diagonal[i]+"\t");
		
			if(diagonal[i]>max) {
				max=diagonal[i];
			}
			if(diagonal[i]<min) {
				min=diagonal[i];
			}
			suma+=diagonal[i];
		}
		media=suma/diagonal.length;
		
		System.out.println();
		System.out.println();
		
		System.out.println("El número máximo de la diagonal principal es: "+max);
		System.out.println("El número mínimo de la diagonal principal es: "+min);
		System.out.println("La suma de los números de la diagonal principal es: "+suma);
		System.out.println("La media de los números de la diagonal principal es: "+media);
	}

}
