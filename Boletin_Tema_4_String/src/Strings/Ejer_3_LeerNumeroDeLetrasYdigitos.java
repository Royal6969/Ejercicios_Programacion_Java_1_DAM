package Strings;

import java.util.Scanner;

public class Ejer_3_LeerNumeroDeLetrasYdigitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Dado un objeto de la clase String contar diferentes tipos de caracteres. 
		//En particular, el método deberá imprimir el número de letras, dígitos y espacios en blanco de la cadena. 
		//Intenta hacer un programa que escriba el conteo (por ejemplo) de la cadena. 
		//“Hola, soy Gorka Elorduy Garcia, y soy programador desde el 2012”. 
	
		Scanner sc = new Scanner(System.in);
		
		int nNums = 0; //contador para contar los números
		int nLetras = 0; //contador para contar las letras
		String texto; //para lo que el usuario escriba 
		
		System.out.println("Introduce el texto");
		texto = sc.nextLine();
		
		for(int i=0; i<texto.length(); i++) {//bucle for para recorrer todo el texto que haya introducido el usuario
			if(Character.isDigit(texto.charAt(i))) {//aquí hacemos una intrucción que dice:
				//que si el caracter es un digito (número){}
				//y dentro del paréntesis, le decimos que en el Texto vaya uno a uno por carácter (letra) observando
				nNums++;
				
			}else {//y sino pues cuento las letras... pero no quiero contar los espscios...
				if(texto.charAt(i) != (char)32) {//OJO, en ASCII el espacio es el 32
					//entonces SI en el texto, recorriendo sus caracteres, 
					//nos encontramos con los que sean diferentes a 32 (espacios)
					nLetras++;
				}
				
			}
		}
		System.out.println("Su texto tiene "+nLetras+" letras, y "+nNums+" números");
	}

}
