package Strings;

public class Ejer_2_ConcatenarNombreYapellidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2. Dadas tres cadenas: nombre, apellido1 y apellido2, 
		//obtener otra cadena concatenando las tres.
		
		String nombre="Sergio ";
        String apellido1="Díaz ";
        String apellido2="Campos ";
        String concatenado;

        concatenado = nombre.concat(apellido1.concat(apellido2));
        System.out.println(concatenado);
	}

}
