package Examen_Map;

import java.util.HashSet;
import java.util.Set;

public class Lista_Productos {

	//ATRIBUTOS
	Set<Producto> lista_productos = new HashSet<Producto>();

	//CONSTRUCTOR Vacio
	public Lista_Productos() {
		super();
	}

	//CONSTRUCTOR Lleno
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
	public void rellenarListasProductos(Lista_Productos lista1, Lista_Productos lista2, Lista_Productos lista3) {
		
		lista1.getLista_productos().add(new Producto("pan", 3));
		lista1.getLista_productos().add(new Producto("leche", 6));
		lista1.getLista_productos().add(new Producto("manzanas", 6));
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
	}
	
}
