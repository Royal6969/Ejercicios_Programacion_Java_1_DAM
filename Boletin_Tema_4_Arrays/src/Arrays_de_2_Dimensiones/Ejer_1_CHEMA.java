package Arrays_de_2_Dimensiones;

import java.util.Scanner;

public class Ejer_1_CHEMA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//Variables
		int[][] tabla1 = new int[4][5];
		int[] sumafila = new int[4];
		int[] sumacols = new int[5];
		int sumatotal = 0;
	
		//Pedir numeros
		for(int i=0; i<4; i++)
		{
			for(int k=0; k<5; k++)
			{
				System.out.println("Introduce un numero: ");
				tabla1[i][k] = sc.nextInt();
				sumafila[i] = sumafila[i] + tabla1[i][k];
			}
		}
		System.out.println();
		
		//Hacer la suma de las columnas
		for(int i=0; i<5; i++)
		{
			for(int k=0; k<4; k++)
			{
				sumacols[i] = sumacols[i] + tabla1[k][i];
			}
		}
				
		//Suma total
		for(int i=0; i<5; i++)
		{
			sumatotal=sumatotal+sumacols[i];
		}
		for(int i=0; i<4; i++)
		{
			sumatotal=sumatotal+sumafila[i];
		}
		
		//Mostrar array
		for(int i=0; i<4; i++)
		{
			for(int k=0; k<5; k++)
			{
				System.out.print(tabla1[i][k]+" ");
			}
			
			System.out.println(sumafila[i]);
			System.out.println();
		}
		
		for(int i=0 ;i<5; i++)
		{
				System.out.print(sumacols[i]+" ");
		}
		
		System.out.println(sumatotal);
	}

}
