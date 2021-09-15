package Ejer_8_SumarNumeros_ArgumentosParametros_MostrarSuma;

public class Ejer_8_SumarNumeros_MostrarSuma_ArgumentosParametros_v2 {

	public static void main(String[] argumento) {
		// TODO Auto-generated method stub

		int suma = 0;
		
		for(int i=0; i<argumento.length; i++) {
			suma += Integer.parseInt(argumento[i]);
		}
		System.out.println(suma);
	}

}
