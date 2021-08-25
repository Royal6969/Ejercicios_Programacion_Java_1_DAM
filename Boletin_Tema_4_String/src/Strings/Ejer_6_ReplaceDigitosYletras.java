package Strings;

public class Ejer_6_ReplaceDigitosYletras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Dada una cadena de caracteres, sustituya todas las ocurrencias del texto �es� por �no por�. 
		//Escribe un segundo m�todo que sustituya todos los d�gitos por un �nico car�cter asterisco. 
		//Es decir, si la cadena de caracteres es �esto1234es5678bueno900� 
		//el primer m�todo debe devolver �noporto1234no por5678bueno900�, 
		//y el segundo debe devolver �esto*es*bueno*�.
		
		String caracteres = "esto1234es5678bueno900";
		String AUX = caracteres.replaceAll("es", "no por");
		System.out.println(AUX);
		
		caracteres = caracteres.replaceAll("\\d+", "*");
		//el codigo (\\d+) significa todos los digitos en ASCII
		//y el asterisco se pone entre comillas dobles porque son m�s de unoo
		System.out.println(caracteres);
	}

}
