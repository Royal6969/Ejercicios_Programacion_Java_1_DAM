package Examen_Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lista_Productos {

	//ATRIBUTOS
	Set<Producto> lista_productos = new HashSet<Producto>();

	//CONSTRUCTOR Vacio
	public Lista_Productos() {
		super();
	}

	//CONSTRUCTOR LLeno
	public Lista_Productos(Set<Producto> lista_productos) {
		super();
		this.lista_productos = lista_productos;
	}

	//GETTER Y SETTER
	public Set<Producto> getLista_productos() {
		return lista_productos;
	}

	public void setLista_productos(Set<Producto> lista_productos) {
		this.lista_productos = lista_productos;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Productos [lista_productos=" + lista_productos + "]";
	}
	
	//MÉTODOS
	public void rellenarDatosEntrada(Set[] listaDeProductos) { //
		Lista_Productos lista1 = new Lista_Productos();
		Lista_Productos lista2 = new Lista_Productos();
		Lista_Productos lista3 = new Lista_Productos();
		
		lista1.getLista_productos().add(new Producto("pan", 3));
		lista1.getLista_productos().add(new Producto("leche", 6));
		lista1.getLista_productos().add(new Producto("manzana", 6));
		lista1.getLista_productos().add(new Producto("brocoli", 1));
		lista1.getLista_productos().add(new Producto("kefir", 1));
		lista1.getLista_productos().add(new Producto("chocolate", 1));
		lista1.getLista_productos().add(new Producto("maiz", 3));
		lista1.getLista_productos().add(new Producto("kiwi", 4));
		lista1.getLista_productos().add(new Producto("habichuelas", 1));
		lista1.getLista_productos().add(new Producto("piña", 1));
		
		lista2.getLista_productos().add(new Producto("pan de cereales", 4));
		lista2.getLista_productos().add(new Producto("huevos", 12));
		lista2.getLista_productos().add(new Producto("pavo", 1));
		lista2.getLista_productos().add(new Producto("queso", 1));
		lista2.getLista_productos().add(new Producto("kiwi", 4));
		lista2.getLista_productos().add(new Producto("piña", 1));
		lista2.getLista_productos().add(new Producto("mango", 2));
		lista2.getLista_productos().add(new Producto("chocolate", 1));
		
		lista3.getLista_productos().add(new Producto("pan de centeno", 3));
		lista3.getLista_productos().add(new Producto("huevos", 12));
		lista3.getLista_productos().add(new Producto("mango", 2));
		lista3.getLista_productos().add(new Producto("berenjena", 1));
		lista3.getLista_productos().add(new Producto("patatas", 6));
		lista3.getLista_productos().add(new Producto("cereales", 1));
		lista3.getLista_productos().add(new Producto("chocolate", 1));
		lista3.getLista_productos().add(new Producto("espinacas", 1));
		
		listaDeProductos[0] = lista1.getLista_productos();
		listaDeProductos[1] = lista2.getLista_productos();
		listaDeProductos[2] = lista3.getLista_productos();
	}
	
	public void listarProductos() {
		Iterator<Producto> iterator = this.getLista_productos().iterator();
		while(iterator.hasNext()) {
			Producto producto = iterator.next();
			System.out.println(producto);
		}
	}
	
	public void listarProductosComunes(Lista_Productos lista1, Lista_Productos lista2, Lista_Productos lista3) {
		Lista_Productos listaAUX = new Lista_Productos();
		
		listaAUX.getLista_productos().addAll(lista1.getLista_productos());
		listaAUX.getLista_productos().retainAll(lista2.getLista_productos());
		listaAUX.getLista_productos().retainAll(lista3.getLista_productos());
		
		listaAUX.listarProductos();
	}
	
	public void listarProductosNoVendidos(Lista_Productos lista1, Lista_Productos lista2, Lista_Productos lista3) {
		Lista_Productos listaCompleta = new Lista_Productos();
		
		listaCompleta.getLista_productos().add(new Producto("pan", 0));
		listaCompleta.getLista_productos().add(new Producto("leche", 0));
		listaCompleta.getLista_productos().add(new Producto("manzanas", 0));
		listaCompleta.getLista_productos().add(new Producto("brocoli", 0));
		listaCompleta.getLista_productos().add(new Producto("kefir", 0));
		listaCompleta.getLista_productos().add(new Producto("chocolate", 0));
		listaCompleta.getLista_productos().add(new Producto("maiz", 0));
		listaCompleta.getLista_productos().add(new Producto("kiwi", 0));
		listaCompleta.getLista_productos().add(new Producto("habichuelas", 0));
		listaCompleta.getLista_productos().add(new Producto("piña", 0));
		listaCompleta.getLista_productos().add(new Producto("pan de cerales", 0));
		listaCompleta.getLista_productos().add(new Producto("huevos", 0));
		listaCompleta.getLista_productos().add(new Producto("queso", 0));
		listaCompleta.getLista_productos().add(new Producto("mango", 0));
		listaCompleta.getLista_productos().add(new Producto("lechuga", 0));
		listaCompleta.getLista_productos().add(new Producto("pan de centeno", 0));
		listaCompleta.getLista_productos().add(new Producto("berenjena", 0));
		listaCompleta.getLista_productos().add(new Producto("patatas", 0));
		listaCompleta.getLista_productos().add(new Producto("cereales", 0));
		listaCompleta.getLista_productos().add(new Producto("espinacas", 0));
		listaCompleta.getLista_productos().add(new Producto("col", 0));
		listaCompleta.getLista_productos().add(new Producto("zanahoria", 0));
		
		listaCompleta.getLista_productos().removeAll(lista1.getLista_productos());
		listaCompleta.getLista_productos().removeAll(lista2.getLista_productos());
		listaCompleta.getLista_productos().removeAll(lista3.getLista_productos());
		
		listaCompleta.listarProductos();
		System.out.println();
	}
	
	public void listarProductosComunesA2listas(Lista_Productos lista1, Lista_Productos lista2, Lista_Productos lista3) {
		Lista_Productos listaAUX1 = new Lista_Productos();
		Lista_Productos listaAUX2 = new Lista_Productos();
		Lista_Productos listaAUX3 = new Lista_Productos();
		
		listaAUX1.getLista_productos().addAll(lista1.getLista_productos());
		listaAUX1.getLista_productos().retainAll(lista2.getLista_productos());
		
		listaAUX2.getLista_productos().addAll(lista1.getLista_productos());
		listaAUX2.getLista_productos().retainAll(lista3.getLista_productos());
		
		listaAUX3.getLista_productos().addAll(lista2.getLista_productos());
		listaAUX3.getLista_productos().retainAll(lista3.getLista_productos());
		
		listaAUX1.getLista_productos().addAll(listaAUX2.getLista_productos());
		listaAUX1.getLista_productos().addAll(listaAUX3.getLista_productos());
		
		listaAUX1.listarProductos();
		System.out.println();
	}
	
	public void listadoProductosOrdenadosPorNombre() {
		Lista_Productos listaCompleta = new Lista_Productos();
		
		listaCompleta.getLista_productos().add(new Producto("pan", 0));
		listaCompleta.getLista_productos().add(new Producto("leche", 0));
		listaCompleta.getLista_productos().add(new Producto("manzanas", 0));
		listaCompleta.getLista_productos().add(new Producto("brocoli", 0));
		listaCompleta.getLista_productos().add(new Producto("kefir", 0));
		listaCompleta.getLista_productos().add(new Producto("chocolate", 0));
		listaCompleta.getLista_productos().add(new Producto("maiz", 0));
		listaCompleta.getLista_productos().add(new Producto("kiwi", 0));
		listaCompleta.getLista_productos().add(new Producto("habichuelas", 0));
		listaCompleta.getLista_productos().add(new Producto("piña", 0));
		listaCompleta.getLista_productos().add(new Producto("pan de cerales", 0));
		listaCompleta.getLista_productos().add(new Producto("huevos", 0));
		listaCompleta.getLista_productos().add(new Producto("queso", 0));
		listaCompleta.getLista_productos().add(new Producto("mango", 0));
		listaCompleta.getLista_productos().add(new Producto("lechuga", 0));
		listaCompleta.getLista_productos().add(new Producto("pan de centeno", 0));
		listaCompleta.getLista_productos().add(new Producto("berenjena", 0));
		listaCompleta.getLista_productos().add(new Producto("patatas", 0));
		listaCompleta.getLista_productos().add(new Producto("cereales", 0));
		listaCompleta.getLista_productos().add(new Producto("espinacas", 0));
		listaCompleta.getLista_productos().add(new Producto("col", 0));
		listaCompleta.getLista_productos().add(new Producto("zanahoria", 0));
		
		ArrayList<Producto> listaOrdenada = new ArrayList<Producto>();
		listaOrdenada.addAll(listaCompleta.getLista_productos());
		
		Collections.sort(listaOrdenada);
		for(int i=0; i<listaOrdenada.size(); i++) {
			System.out.println(listaOrdenada.get(i));
		}
	}
	
	public void listadoCompletoVendidos(Lista_Productos lista1, Lista_Productos lista2, Lista_Productos lista3) {
		ArrayList<Producto> listaOrdenada = new ArrayList<Producto>(); //para dps aplicarle otro CompareTo
		listaOrdenada.addAll(lista1.getLista_productos());
		boolean repetido = false;
		
		Iterator<Producto> iterator1 = lista2.getLista_productos().iterator();
		while(iterator1.hasNext()) {
			Producto producto = iterator1.next();
			
			repetido = false;
			for(int i=0; i<listaOrdenada.size() && repetido == false; i++) {
				if(listaOrdenada.get(i).equals(producto)) {
					listaOrdenada.get(i).setCantidad(listaOrdenada.get(i).getCantidad() + producto.getCantidad());
					repetido = true;
				}
			}
			if(repetido == false) {
				listaOrdenada.add(producto);
			}
		}
		Iterator<Producto> iterator2 = lista3.getLista_productos().iterator();
		while(iterator2.hasNext()) {
			Producto producto = iterator2.next();
			
			repetido = false;
			for(int i=0; i<listaOrdenada.size() && repetido == false; i++) {
				if(listaOrdenada.get(i).equals(producto)) {
					listaOrdenada.get(i).setCantidad(listaOrdenada.get(i).getCantidad() + producto.getCantidad());
					repetido = true;
				}
			}
			if(repetido == false) {
				listaOrdenada.add(producto);
			}
		}
		Collections.sort(listaOrdenada, new Cantidad_Comparator());
		
		for(int i=0; i<listaOrdenada.size(); i++) {
			System.out.println(listaOrdenada.get(i));
		}
		System.out.println();
	}
		
}
