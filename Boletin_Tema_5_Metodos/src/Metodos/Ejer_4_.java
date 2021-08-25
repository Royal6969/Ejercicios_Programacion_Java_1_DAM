package Metodos;

import java.util.Scanner;

public class Ejer_4_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea una funci�n con la siguiente cabecera: public String convierteEnPalabras(int n)
		//Esta funci�n convierte los d�gitos del n�mero n en las correspondientes palabras 
		//y lo devuelve todo en una cadena de caracteres. 
		//Por ejemplo, el 470213 convertido a palabras ser�a: cuatro, siete, cero, dos, uno, tres
		//Utiliza esta funci�n en un programa para comprobar que funciona bien. 
		//Desde la funci�n no se debe mostrar nada por pantalla, solo se debe usar print desde el programa principal. 
		//F�jate que hay una coma detr�s de cada palabra salvo al final.
	
		Scanner sc = new Scanner(System.in);
		int n;
		String num;
		System.out.println("Introduzca un n�mero");
		n = sc.nextInt();
		
		num = convierteEnPalabras(n);
		System.out.println(num);
		
	}
	public static String convierteEnPalabras(int n) {
		
		String num = "";
		int AUX = 0;
		int opcion;
		
		while(n>0) { //WHILE f�rmula darle la vuelta al n�mero
			AUX=(AUX*10)+(n%10);
			n/=10;
		}
		while(AUX>0) {
			opcion=AUX%10; //para ir descoponiendo el n�mero y cogiendo la decima por la derecha
			AUX/=10; //para ir quitando esa cifra que se va quedando por la derecha
			
			switch(opcion) {
			case 0:
				num = num.concat(" cero,");
				break;
			
			case 1:
				num = num.concat(" uno,");
				break;
				
			case 2:
				num = num.concat(" dos,");
				break;
			
			case 3:
				num = num.concat(" tres,");
				break;
				
			case 4:
				num = num.concat(" cuatro,");
				break;
				
			case 5:
				num = num.concat(" cinco,");
				break;
				
			case 6:
				num = num.concat(" seis,");
				break;
				
			case 7:
				num = num.concat(" siete,");
				break;
				
			case 8:
				num = num.concat(" ocho,");
				break;
				
			case 9:
				num = num.concat(" nueve,");
				break;
			}
		}
		num = num.substring(1, num.length()-1); 
		//el Substring de num (palabra de cada numerito)  va a ser igual al un intervalo...
		//desde el 0 hasta el penultimo n�mero (porque al final no queremos que haya una coma)
		
		return num;
	}

}
