package Practica_Inicial;

public class Presentacion_Practica_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] caracter = new char [6];
		
		caracter[0] = 'A';
		caracter[1] = '%';
		caracter[2] = '&';
		caracter[3] = '+';
		caracter[4] = 'A';
		caracter[5] = '3';
		
		System.out.println("El ARRAY CARÁCTER contiene los siguientes elementos: ");
		for(int i=0; i<6; i++) {
			System.out.print(caracter[i]+ " ");
		}
		
		
	}

}
