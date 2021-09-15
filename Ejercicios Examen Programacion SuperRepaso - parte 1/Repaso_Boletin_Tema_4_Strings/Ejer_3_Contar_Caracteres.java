package Boletin_Tema_4_Strings;

public class Ejer_3_Contar_Caracteres {

/*
 * 3. Dado un objeto de la clase String contar diferentes tipos de caracteres. En particular, el método
deberá imprimir el número de letras, dígitos y espacios en blanco de la cadena. Intenta hacer un
programa que escriba el conteo (por ejemplo) de la cadena. “Hola, soy Gorka Elorduy Garcia, y soy
programador desde el 2012”
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "Hola, soy Gorka Elorduy Garcia, y soy programador desde el 2012";
		int contLetra = 0;
		int contDigito = 0;
		int contEspacio = 0;
		
		for(int i=0; i<frase.length(); i++) {
			if(Character.isDigit(frase.charAt(i))) {
				contDigito++;
			
			}else if(Character.isLetter(frase.charAt(i))) { //otra opcion, frase.charAt(i) != (char)32 ...casteo a chars ... y el 32 corresponde a las letras
				contLetra++;
			
			}else {
				contEspacio++;
			}
		}
		System.out.println("El texto tiene "+contLetra+" letras, "+contDigito+" números y "+contEspacio+" espacios.");
	}
}