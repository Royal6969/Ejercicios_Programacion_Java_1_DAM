package Boletin_Tema_4_Strings;

import java.util.Scanner;

public class Ejer_8_Buscador_Palabras_Texto {

/*
 * 8. Dada una cadena principal, buscar una segunda cadena y decir si está contenida en la principal.
Indicar cuántas veces está contenida. Devover la primera cadena, pero transformando en mayúsculas
la parte que coincide con la segunda cadena introducida. Por ejemplo, si se introducen las cadenas
“Este es mi amigo Juan” y “amigo”, devolverá “Este es mi AMIGO Juan”.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "Hola, soy Gorka Elorduy Garcia, y soy programador desde el 2012";
		System.out.println(frase);
		
		Scanner sc = new Scanner(System.in);
		
		String busqueda;
		System.out.println("introduzca lo que quiera buscar del texto");
		busqueda = sc.next();
		
		int contResultados = 0;
		int contTexto = frase.length()-busqueda.length(); //a la longitud de la frase le resto la longitud de la busqueda
		
		for(int i=0; i<contTexto+1; i++) {
			if(frase.substring(i, i+busqueda.length()).equals(busqueda)){ //busca primero longitud y dps comprueba si es la palabra
				contResultados++;
			}
		}
		frase = frase.replaceAll(busqueda, busqueda.toUpperCase());
		
		System.out.println("Se ha encontrado "+contResultados+ " resultados");
		System.out.println("Y en mayusculas sería: "+frase);
	}

}
