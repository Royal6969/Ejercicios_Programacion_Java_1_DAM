package Ejer_6_exists;

import java.io.File;

public class Ejer_6_exists {

/*
 * 6. El siguiente programa de ejemplo comprueba si un determinado archivo existe o no mediante 
exists() y, en caso de que exista, lo elimina mediante delete() . Si intent�ramos borrar un 
archivo que no existe obtendr�amos un error.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File directorio = new File("Ejer_6.txt");
		
		if(directorio.exists()) {
			System.out.println("El archivo existe y ser� eliminado");
			directorio.delete();
		
		}else {
			System.out.println("No se ha encontrado el archivo");
		}
	}

}
