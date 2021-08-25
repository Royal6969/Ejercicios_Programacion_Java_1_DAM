package Ejer_8_SumaArgumetos;

public class Ejer_8_SumaArgumentos {

/*
 * 8. Programa en el que se suman todos los argumentos que se pasan como parámetros y se muestra 
por pantalla el resultado de la suma.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suma = 0;
		
		for(int i=0; i<args.length; i++) { //args =  pestaña run ... run congigurations ... arguments
			suma += Integer.parseInt(args[i]); // formula casteo
		}
			System.out.println(suma); //para que se fije ne el valor de por donde va
	}

}
