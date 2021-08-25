package Strings;

import java.util.Scanner;

public class Ejer_8_BuscarSubstringEnStringYpasarAmayusculas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String texto;
		System.out.println("introduzca un texto");
		texto = sc.nextLine();
		System.out.println();
		
		String busqueda;
		System.out.println("Introduzca una letra/palabra para buscarla en el texto");
		busqueda = sc.nextLine();
		System.out.println();
		
		int nPalabra = 0; //contador de las veces que aparece la busqueda en el texto
		int nSubPalabra; //para saber el rango dentro del texto en el que tengo que buscar la busqueda
		
		nSubPalabra = texto.length()-busqueda.length(); 
		
		for(int i=0; i<nSubPalabra+1; i++) { //si nSubPalabra fuese impar, le sumamos +1 para que pueda recorrer todo el String del texto (porque sino se queda corto por el final)
			if(texto.substring(i, i+busqueda.length()).equals(busqueda)) { 
			//dentro del String texto, acotamos un rango para el SubString de b�squeda
			//y a�adimos el Equals para comparar nuestra b�squeda con el SubString acotado
				nPalabra++; //para el mensaje del syso de cuantas veces sali� el resultado
			}
		}
		texto = texto.replaceAll(busqueda, busqueda.toUpperCase()); //para que la parte de la b�squeda se pase a may�sculas (replace+ToUpperCase)
		
		System.out.println("Su b�squeda se ha encontrado: "+nPalabra+" veces");
		System.out.println("Y pas�ndolo a may�sculas ser�a: "+texto);
	}

}
