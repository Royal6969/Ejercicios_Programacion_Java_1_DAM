package Ejer_5_Mostrar_Listado;

import java.io.File;

public class Ejer_5_Mostrar_Listado {

/*
 * 5. Mostrar por pantalla un listado con todos los archivos que contiene un directorio.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File directorio = new File("C:\\Users\\Sergio DC\\eclipse-workspace\\Boletin_Tema_8_Ficheros");
		
		String[] listaArchivos = directorio.list(); //a un array de String se le asigna una lista de todo lo que contiene el directorio señalado antes
		
		System.out.println(listaArchivos.length);
	}

}
