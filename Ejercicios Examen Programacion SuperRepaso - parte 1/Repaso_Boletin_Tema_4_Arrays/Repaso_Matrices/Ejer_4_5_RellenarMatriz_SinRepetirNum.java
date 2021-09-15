package Repaso_Matrices;

public class Ejer_4_5_RellenarMatriz_SinRepetirNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[6][10];
		int min = 999;
		int max = -999;
		boolean repetido = false;
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<10; j++) {
				//matriz[i][j] = (int)(Math.random()*(999-100)+100);
				do {
					repetido = false;
					matriz[i][j] = (int)(Math.random()*(999-100)+100);
					
					for(int k=0; k<=i && repetido==false; k++) {
						for(int l=0; l<j && repetido==false; l++) {
							if(matriz[i][j] == matriz[k][l]) {
								repetido = true;
							}else {
								repetido = false;
							}
						}
					}
				}while(repetido==true); //mientras que se encuentre uno repetido, volver a generar números
				
				if(repetido == false) {
					if(matriz[i][j] < min) {
						min = matriz[i][j];
					}
					if(matriz[i][j] > max) {
						max = matriz[i][j];
					}
				}
			}
		}
		for(int i=0; i<6; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
