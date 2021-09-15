package Ejer_8_Publicacion;

import java.util.Scanner;

public class Prueba_Publicacion {

static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conjunto_Publicacion conjunto_publicacion = new Conjunto_Publicacion(); //aqui smp elijo el vacio, am menos que me digan lo contrario
		
		int opcion;
		
		do {
			showMenu();
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				if(Publicacion.getNcod() > 9) { //para comprobar si ya están creadas todas las posiciones...
					System.out.println("Ya no caben más");
				}else {
					altaRevista(conjunto_publicacion);
				}
				break;
				
			case 2:
				if(Publicacion.getNcod() > 9) { //para comprobar si ya están creadas todas las posiciones...
					System.out.println("Ya no caben más");
				}else {
					altaLibro(conjunto_publicacion);
				}
				break;
				
			case 3:
				//pedir el num desde aqui y hacer un IF/ELSE para ver si el num es <> de nCod, y pasar el num como parámetro al método de abajo
				prestarLibro(conjunto_publicacion);
				break;
				
			case 4:
				devolverLibro(conjunto_publicacion);
				break;
				
			case 5:
				conjunto_publicacion.listadoCompleto(); //para llamar a un metodo de otra clase... se llama desde el objeto de esta clase
				break;
				
			case 6:
				conjunto_publicacion.listadoRevistas();
				break;
				
			case 7:
				conjunto_publicacion.listadoLibrosPrestados();
				break;
				
			case 0:
				System.out.println("Gracias y hasta luego!");
				break;
			}
			
		}while(opcion!=0);
	}
	//MÉTODOS
	public static void showMenu(){
		System.out.println(" 1- ALTA DE REVISTA\n"
				+ "	2- ALTA DE LIBRO\n"
				+ "	3- PRESTAR UN LIBRO\n"
				+ "	4- DEVOLVER UN LIBRO\n"
				+ "	5- LISTADO COMPLETO\n"
				+ "	6- LISTADO DE REVISTAS MOSTRANDO NÚMERO TOTAL DE REVISTAS\n"
				+ "	7- LISTADO ORDENADO DE LIBROS MOSTRANDO SI ESTÁ O NO PRESTADO\n"
				+ "	0- SALIR");
	}
	public static void altaRevista(Conjunto_Publicacion conjunto_publicacion) {
		int num;
		String titulo;
		int año;
		
		System.out.println("Dime el número de la revista");
		num = sc.nextInt();
		System.out.println("Dime el título de la revista");
		titulo = sc.next();
		System.out.println("Dime el año de la revista");
		año = sc.nextInt();
		
		conjunto_publicacion.getConjunto_publicacion()[Publicacion.getNcod()] = new Revista(titulo, año, num);
	}
	public static void altaLibro(Conjunto_Publicacion conjunto_publicacion) {
		//para saber los atributos que se crean en estos metodos, hay que mirar el constructor lleno de la clase en cuestión (si el lleno no esta activo... mirar el vacío)
		String titulo; 
		int año;
		System.out.println("Dime el titulo del libro");
		titulo = sc.next();
		System.out.println("Dime el año del libro");
		año = sc.nextInt();
		
		conjunto_publicacion.getConjunto_publicacion()[Publicacion.getNcod()] = new Libro(titulo, año);
	}
	public static void prestarLibro(Conjunto_Publicacion conjunto_publicacion) {
		int num;
		System.out.println("Dime el nº del libro");
		num = sc.nextInt();
		
		if(conjunto_publicacion.getConjunto_publicacion()[num] instanceof Libro) { //instanceof = pertenece a
			if(((Libro)conjunto_publicacion.getConjunto_publicacion()[num]).isPrestado() == false) { //comprobar si está o no prestado
				((Libro)conjunto_publicacion.getConjunto_publicacion()[num]).prestar();
			}else {
				((Libro)conjunto_publicacion.getConjunto_publicacion()[num]).prestado();
			}
		}else {
			System.out.println("Este nº no corresponde a ningún libro");
		}
	}
	public static void devolverLibro(Conjunto_Publicacion conjunto_publicacion) {
		int num;
		System.out.println("Dime el nº del libro");
		num = sc.nextInt();
		
		if(conjunto_publicacion.getConjunto_publicacion()[num] instanceof Libro) { //instanceof = pertenece a
			if(((Libro)conjunto_publicacion.getConjunto_publicacion()[num]).isPrestado() == true) { //comprobar si está o no prestado
				((Libro)conjunto_publicacion.getConjunto_publicacion()[num]).devolver();;
			}else {
				System.out.println("Este libro no está prestado, por lo que se encuentra disponible");
			}
		}else {
			System.out.println("Este nº no corresponde a ningún libro");
		}
	}
}
