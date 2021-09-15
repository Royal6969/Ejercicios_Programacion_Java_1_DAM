package Boletin_Tema_4_Strings;

public class Ejer_6_Sustituir_Ocurrencias_Texto {

/*
 * 6. Dada una cadena de caracteres, sustituya todas las ocurrencias del texto “es” por “no por”. 
 * Escribe un segundo método que sustituya todos los dígitos por un único carácter asterisco.  
 * Es decir, si la cadena de caracteres es “esto1234es5678bueno900” 
 * el primer método debe devolver “noporto1234no por5678bueno900”, 
 * y el segundo debe devolver “esto*es*bueno*”.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase1 = "esto1234es5678bueno900";
		System.out.println(frase1);
		
		String auxFrase1;
		
		auxFrase1 = frase1.replaceAll("es", "no por");
		System.out.println(auxFrase1);
		
		frase1 = frase1.replaceAll("\\d+", "*"); // \\d+ esto coge todos los dígitos SEGUIDOS que vaya encontrando
		System.out.println(frase1);
	}

}
