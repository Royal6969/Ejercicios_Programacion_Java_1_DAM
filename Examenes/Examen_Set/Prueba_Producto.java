package Examen_Set;

import java.util.Scanner;
import java.util.Set;

public class Prueba_Producto {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		
		Lista_Productos productos = new Lista_Productos();
		Set<Producto>[] listaDeProductos = new Set[3]; 
		Lista_Productos lista1 = new Lista_Productos();
		Lista_Productos lista2 = new Lista_Productos();
		Lista_Productos lista3 = new Lista_Productos();
		productos.rellenarDatosEntrada(listaDeProductos);
		lista1.setLista_productos(listaDeProductos[0]);
		lista2.setLista_productos(listaDeProductos[1]);
		lista3.setLista_productos(listaDeProductos[2]);
		
		do {
			showMenu();
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				System.out.println("La lista 1 contiene:");
				lista1.listarProductos();
				System.out.println();
				System.out.println("La lista 2 contiene:");
				lista2.listarProductos();
				System.out.println();
				System.out.println("La lista 3 contiene:");
				lista3.listarProductos();
				System.out.println();
				break;
			case 2: 
				productos.listarProductosComunes(lista1, lista2, lista3);
				System.out.println();
				break;
			case 3:
				productos.listarProductosNoVendidos(lista1, lista2, lista3);
				System.out.println();
				break;
			case 4: //este el case extra
				productos.listarProductosComunesA2listas(lista1, lista2, lista3);
				System.out.println();
				break;
			case 5:
				productos.listadoProductosOrdenadosPorNombre();
				System.out.println();
				break;
			case 6:
				productos.listadoCompletoVendidos(lista1, lista2, lista3);
				System.out.println();
				break;
			case 0:
				System.out.println("Gracias y hasta luego!");
				break;
			}
		}while(opcion != 0);
		
	}
	//MÉTDOS
	public static void showMenu() {
		System.out.println("Introduzca una opcion del menú");
		System.out.println("1.- Mostrar las listas de pedidos\n"
				+ "2.- Mostrar la lista de los productos que aparecen en todos los pedidos\n"
				+ "3.- Mostrar la lista de los productos que NO aparecen en ningún pedido\n"
				+ "4.- Mostrar la lista de TODOS los productos comunes en dos listas\n"
				+ "5.- Mostrar la lista de TODOS los productos existentes ordenados por nombre\n"
				+ "6.- Mostrar la lista de los productos vendidos, ordenados por su cantidad de ventas\n"
				+ "0.-Salir");
	}
	
	
	
	
}
