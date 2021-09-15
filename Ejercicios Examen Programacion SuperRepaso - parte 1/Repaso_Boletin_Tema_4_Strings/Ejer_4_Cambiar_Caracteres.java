package Boletin_Tema_4_Strings;

public class Ejer_4_Cambiar_Caracteres {

/*
 * 4. Dado un String, devuelve otro objeto String en el que se cambian todas las vocales minúsculas del
original por la letra ‘o’. 
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "Hola, soy Gorka Elorduy Garcia, y soy programador desde el 2012";
		System.out.println(frase);
		
		frase = frase.replace('a', 'o').replace('e', 'o').replace('i', 'o').replace('u', 'o');
		System.out.println(frase);
	}

}
