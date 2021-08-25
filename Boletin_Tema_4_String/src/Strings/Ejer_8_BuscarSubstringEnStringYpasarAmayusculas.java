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
			//dentro del String texto, acotamos un rango para el SubString de búsqueda
			//y añadimos el Equals para comparar nuestra búsqueda con el SubString acotado
				nPalabra++; //para el mensaje del syso de cuantas veces salió el resultado
			}
		}
		texto = texto.replaceAll(busqueda, busqueda.toUpperCase()); //para que la parte de la búsqueda se pase a mayúsculas (replace+ToUpperCase)
		
		System.out.println("Su búsqueda se ha encontrado: "+nPalabra+" veces");
		System.out.println("Y pasándolo a mayúsculas sería: "+texto);
	}

}
