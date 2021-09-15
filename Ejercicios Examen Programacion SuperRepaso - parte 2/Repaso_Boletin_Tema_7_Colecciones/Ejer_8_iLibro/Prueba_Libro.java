package Ejer_8_iLibro;

import java.util.Scanner;

/*
Implementar dos funciones en el main:
a. func1: dada una lista de libros, devuelva el número de libros 
que tienen al menos 300 páginas y a lo sumo 4 autores: int func1(List)
b. func2: dada una lista de libros, devuelva verdadero si existe 
al menos un libro anónimo: boolean func2(List).La clase Libro implementa ILibro. 

Crear una lista de libros en el main, y probar ambas funciones.
 */
public class Prueba_Libro {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista_Libros libros = new Lista_Libros();
		
		for(int i=0; i<2; i++) {
			System.out.println((i+1)+". Introduzca el título del libro");
			String titulo = sc.next();
			System.out.println((i+1)+". Introduzca el número de páginas del libro");
			int numPaginas = sc.nextInt();
			System.out.println((i+1)+". Introduzca la editorial del libro");
			String editorial = sc.next();
			//String[] autores = {"JuanCa", "Sergio", "Carlos"};
			String[] autores = new String[2];
			for(int j=0; j<autores.length; j++) { //¿como seria pa pedir los autores?
				System.out.println((i+1)+"."+(j+1)+". Introduzla un autor");
				String autor = sc.next();
				autores[j] = autor;
				System.out.print(autores+"\t");
			}
			libros.getLista_libros().add(new Libro(titulo, numPaginas, autores, editorial)); //seguir el orden para meter los atributos (el orden del constructor)
		}
		int numLibros;
		numLibros = libros.librosGrandes();
		
		System.out.println("Hay "+numLibros+" libros con al menos 300 páginas y 4 autores");
		
		if(libros.esLibroAnonimo()) {
			System.out.println("El libro es anónimo");
		}else {
			System.out.println("El libro no es anónimo, porque tiene autores");
		}
	}

}
