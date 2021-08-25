package Ejemplo_1_ArrayList_de_Objetos;

import java.util.ArrayList; // OMG
import java.util.Scanner;

public class Prueba_Elemento {
	
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList<Elemento> listaElemento=new ArrayList<Elemento> ();
		ArrayList<Elemento> objeto = new ArrayList<Elemento>();
		
		int opcion;
		
		do {
			mostrarMenu();
			System.out.println("Elija una opcion del menú");
			opcion = sc.nextInt();
			System.out.println();
			
			switch(opcion) {
			
			case 1:
				altaElemento(objeto);
				break;
				
			case 2:
				modificarElemento(objeto);
				break;
				
			case 3:
				eliminarElemento(objeto);
				break;
				
			case 4:
				int id;
				System.out.println("Introduzca el ID del Elemento que quiera buscar en el ArrayList");
				id = sc.nextInt();
				
				buscarElemento(objeto, id);
				break;
				
			case 5:
				imprimirArrayList(objeto);
				break;
				
			case 0:
				System.out.println("Gracias por probar el ArrayList de ejemplo");
				break;
			}
			
		}while(opcion!=0);
		
	}
	public static void altaElemento(ArrayList<Elemento> objeto) {
		
		int id;
		String nombre;
		
		System.out.println("Introduzca un ID para el elemento");
		id = sc.nextInt();
		
		System.out.println("Introduzca un nombre para el elemento");
		nombre = sc.next();
		
		objeto.add(new Elemento(id, nombre)); 
		
		System.out.println();
	}
	public static void modificarElemento(ArrayList<Elemento> objeto) {
		
		int posicion;
		
		int id;
		String nombre;
		
		System.out.println("¿Qué elemento es el que quiere modificar?");
		posicion = sc.nextInt();
		
		System.out.println("Introduzca un nuevo ID para cambiarselo a este elemento");
		id = sc.nextInt();
		
		System.out.println("Introduzca un nuevo nombre para cambiarselo a este elemento");
		nombre = sc.next();
		
		objeto.set(posicion, new Elemento(id, nombre)); //esto no está bn del todo
		
		System.out.println();
	}
	public static void eliminarElemento(ArrayList<Elemento> objeto) {
		
		int posicion;
		
		System.out.println("¿Qué elemento es el que quiere modificar?");
		posicion = sc.nextInt();
		
		objeto.remove(posicion);
		
		System.out.println();
	}
	public static void buscarElemento(ArrayList<Elemento> objeto, int id) {
		
		int posicion = -1; 
		boolean salir = false;
		
		for(int i=0; i<objeto.size() && salir==false; i++) { //el size sustituyó al length
			if(objeto.get(i).getId()==id) {
				System.out.println(objeto.get(i));
				posicion = i;
				salir = true;
			}
		}
		System.out.println("El elemento se ha encontrado en la posición: "+posicion);
		
		System.out.println();
	}
	public static void imprimirArrayList(ArrayList<Elemento> objeto) {
		
		for(int i=0; i<objeto.size(); i++) {
			System.out.println(objeto.get(i));
		}
		
		System.out.println();
	}
	public static void mostrarMenu() {
		
		System.out.println("1. Dar de alta un nuevo Elemento");
		System.out.println("2. Modificar elemento");
		System.out.println("3. Eliminar elemento");
		System.out.println("4. Buscar elemento");
		System.out.println("5. Imprimir el ArrayList");
		System.out.println("0. Salir");
		
		System.out.println();
	}

}
