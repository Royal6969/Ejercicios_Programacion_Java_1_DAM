package Examen_Map;

import java.util.HashMap;
import java.util.Iterator;

public class Prueba_Producto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Lista_Productos> productos = new HashMap<Integer, Lista_Productos>();
		
		inicializarMapa(productos);
		listarMapaProductos(productos);
		System.out.println();
		actualizarStock(productos);
		listarMapaProductos(productos);
		System.out.println();
		
	}
	
	//MÉTODOS
	public static void inicializarMapa(HashMap<Integer, Lista_Productos> productos) {
		Almacen almacen1 = new Almacen(1, "almacen1");
		Almacen almacen2 = new Almacen(2, "almacen2");
		Almacen almacen3 = new Almacen(3, "almacen3");
		
		Lista_Productos lista1 = new Lista_Productos();
		Lista_Productos lista2 = new Lista_Productos();
		Lista_Productos lista3 = new Lista_Productos();
		//aqui me doy cuenta de que tengfo que rellenar estas listas, y me voy a la clase Lista_Productos para hacer tal método
		lista1.rellenarListasProductos(lista1, lista2, lista3);
		
		productos.put(almacen1.getNumAlmacen(), lista1);
		productos.put(almacen2.getNumAlmacen(), lista2);
		productos.put(almacen3.getNumAlmacen(), lista3);
	}
	
	public static void listarMapaProductos(HashMap<Integer, Lista_Productos> productos) {
		Iterator<Integer> iterator = productos.keySet().iterator();
		while(iterator.hasNext()) {
			int num = iterator.next();
			System.out.println(num); //primero imprimo el numero del almacen solo
			System.out.println(productos.get(num)); //y dps salen los productos con ese numero de almacen
		}
	}
	
/*
 * f. Mediante el método actualizarStock y partiendo del mapa inicializado, 
 * obtener un listado de todos los productos con su cantidad actualizada, 
 * ordenados alfabéticamente por nombre de producto. 
 * Y añadir la lista actualizada como una nueva entrada en el mapa, cuya clave o número de almacén será -99.
 */
	public static void actualizarStock(HashMap<Integer, Lista_Productos> productos) {
		Almacen almacen99 = new Almacen(-99, "almacen99"); //creo un almacen para guardar la nueva lista
		Lista_Productos lista99 = new Lista_Productos(); //creo la nueva lista
		
		Iterator<Integer> iterator1 = productos.keySet().iterator();
		while(iterator1.hasNext()) {
			int numAlmacen = iterator1.next();
			
			Iterator<Producto> iterator2 = productos.get(numAlmacen).getLista_productos().iterator();
			while(iterator2.hasNext()) {
				Producto numAlmacen1 = iterator2.next();
				
				if(lista99.getLista_productos().contains(numAlmacen1)) { //si contiene el objeto del almacen1
					Iterator<Producto> iterator3 = lista99.getLista_productos().iterator(); 
					while(iterator3.hasNext()) { 
						Producto numAlmacen2=iterator3.next();
						
						if(numAlmacen2.equals(numAlmacen1)) {
							numAlmacen2.setCantProducto(numAlmacen2.getCantProducto()+numAlmacen1.getCantProducto());
						}
					}
				}else {
					lista99.getLista_productos().add(numAlmacen1);
				}
			}	
		}
		productos.put(almacen99.getNumAlmacen(), lista99);
	}

}
