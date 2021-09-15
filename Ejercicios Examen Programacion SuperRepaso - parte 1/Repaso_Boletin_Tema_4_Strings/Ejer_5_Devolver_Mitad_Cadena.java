package Boletin_Tema_4_Strings;

public class Ejer_5_Devolver_Mitad_Cadena {

/*
 * 5. Dada una cadena de caracteres, devuelve la mitad inicial de la cadena.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "Hola, soy Gorka Elorduy Garcia, y soy programador desde el 2012";
		System.out.println(frase);
		
		System.out.println(frase.substring(0,frase.length()/2)); //desde el primer caracter 0 hasta la mitad de los caracteres de la frase
		
	}

}
