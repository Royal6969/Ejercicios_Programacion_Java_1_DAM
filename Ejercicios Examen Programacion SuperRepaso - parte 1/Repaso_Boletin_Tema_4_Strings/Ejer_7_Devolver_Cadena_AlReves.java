package Boletin_Tema_4_Strings;

public class Ejer_7_Devolver_Cadena_AlReves {

/*
 * 7. Dada una cadena mostrarla al revés.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "Hola, soy Gorka Elorduy Garcia, y soy programador desde el 2012";
		System.out.println(frase);
		
		for(int i=frase.length()-1; i>=0; i--) {
			System.out.print(frase.charAt(i));
		}
	}

}
