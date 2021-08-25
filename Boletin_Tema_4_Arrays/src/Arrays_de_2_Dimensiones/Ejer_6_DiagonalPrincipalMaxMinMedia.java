package Arrays_de_2_Dimensiones;

public class Ejer_6_DiagonalPrincipalMaxMinMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]matriz = new int[10][10];
		int[]diagonal = new int[10];
		int min = 9999;
		int max = -9999;
		int suma = 0;
		int media = 0;
		
		for(int i=0; i<10; i++) { //existe otra forma de recorrer y captar estas posiciones a la vez...
			for(int j=0; j<10; j++) {
				matriz[i][j] = (int) (Math.random()*(300-200)+200); ////(numero maximo-numero inicial)+numero inicial
				System.out.print(matriz[i][j]+"\t");
				
				if(i==j) { //existe otra forma de recorrer y captar estas posiciones a la vez...
					diagonal[i]=matriz[i][j];
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Estos son los números de la diagonal principal");
		
		for(int i=0; i<10; i++) {
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
