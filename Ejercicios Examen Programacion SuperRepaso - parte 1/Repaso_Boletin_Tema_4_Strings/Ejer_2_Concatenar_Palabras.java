package Boletin_Tema_4_Strings;

public class Ejer_2_Concatenar_Palabras {

/*
 * 2. Dadas tres cadenas: nombre, apellido1 y apellido2, obtener otra cadena concatenando las tres.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = "sergio";
		String apellido1 = "diaz";
		String apellido2 = 	"campos";
		
		String resultado = nombre.concat(apellido1).concat(apellido2);
	
		System.out.println(resultado);
	}

}
