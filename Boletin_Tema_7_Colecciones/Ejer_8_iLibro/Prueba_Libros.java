package Ejer_8_iLibro;

import java.util.Scanner;

public class Prueba_Libros {

	 /* 
	 * Implementar dos funciones en el main:
	 * a. func1: dada una lista de libros, devuelva el n�mero de libros que tienen al  menos 300 p�ginas 
	 * y a lo sumo 4 autores: int func1(List)
	 * b. func2: dada una lista de libros, devuelva verdadero si existe al menos un  libro an�nimo: 
	 * boolean func2(List).La clase Libro implementa ILibro. 
	 * Crear una lista de libros en el main, y probar ambas funciones.
	 * 
	 */

static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista_Libros libro = new Lista_Libros();
		
		for(int i=0; i<5; i++) {
			System.out.println("Introduzca un t�tulo");
			String titulo = sc.next();
			System.out.println("Introduzca el n� de p�ginas");
			int numPaginas = sc.nextInt();
			System.out.println("Introduzca la editorial");
			String editorial = sc.next();
			String[] autores = {"JuanCa", "Sergio", "Carlos"};
			
			libro.getObjeto().add(new Libros(titulo, numPaginas, autores, editorial));	
		}
		int numero = libro.librosGrandes();
		
		System.out.println("Hay "+numero+" libros con al menos 300 p�ginas y 4 autores");
		
		if(libro.librosAnonimos()) {
			System.out.println("Si hay libros an�nimos");
		}else {
			System.out.println("No hay libros an�nimos");
		}
	}
	

}
