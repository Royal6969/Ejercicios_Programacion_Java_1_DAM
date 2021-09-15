package Ejer_16_Proyecto_Disco;
/*
 * 16. ENUNCIADO PROYECTO DISCO
 * Menú de opciones:
 * 1. Insertar nuevo disco, según su codigo, que es único
 * 2. Listado ordenado según autor
 * 3. Listado agrupado por género, mostrando el número de discos de cada género
 * 4. Listado por duración
 * 5. Eliminar un disco según su código
 * 6. Salir
 * 
 * Clases:
 * Disco
 * LDisco: insertaDisco, eliminaDisco, listadoAutor, listadoDuracion,listadoGenero.
 * PruebaDisco
 * GeneroComparator
 * DuracionComparator
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lista_Discos {

	//ATRIBUTOS
	ArrayList<Disco> lista_discos = new ArrayList<Disco>();

	//CONSTRUCTOR Vacío
	public Lista_Discos() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Lista_Discos(ArrayList<Disco> lista_discos) {
		super();
		this.lista_discos = lista_discos;
	}

	//GETTER Y SETTER
	public ArrayList<Disco> getLista_discos() {
		return lista_discos;
	}

	public void setLista_discos(ArrayList<Disco> lista_discos) {
		this.lista_discos = lista_discos;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Discos [lista_discos=" + lista_discos + "]";
	}
	
	//MÉTODOS
	//1. Insertar nuevo disco, según su codigo, que es único
	public void insertarDisco() {
		//empezamos creando un objeto de Disco donde vamos a guardar los atributos que pidamos con el otro método
		Disco disco = new Disco();
		boolean salir = false; //este boolean lo usaremos para salir en caso de qu eel código (ID) ya exista
		
		disco.pedirDatosDisco(); //pedimos los datos con nuestro método
		for(int i=0; i<this.getLista_discos().size(); i++) { //recorrer el ArrayList
			if(this.getLista_discos().get(i).getCodigo().equalsIgnoreCase(disco.getCodigo())) { //si el codigo del disco por el que va recorriendo coincide con el codigo que se le quiere poner a este nuevo disco, cancelamos este intento
				salir = true;
			}
		}
		if(salir == true) { //si sí existía... mensajito de error
			System.out.println("Lo sentimos, pero ese disco ya existe en la lista");
		}else { //y si no existía, pues añadimos
			this.getLista_discos().add(disco);
		}
		System.out.println();
	}
	//2. Listado ordenado según autor
	public void ordenarPorAutores() {
		Collections.sort(this.getLista_discos());
	}
	//3. Listado agrupado por género, mostrando el número de discos de cada género
	//tras haber creado la clase comparator y su pequeño método con el compareTo volvemos aquí para crear el método definitivo que ordenará según género
	public void ordenarPorGenero() {
		Collections.sort(this.getLista_discos(), new Genero_Comparator());
		
		//mostrando el número de discos de cada género
		int numDiscos = 0;
		boolean salir = false;
		
		for(int i=0; i<this.getLista_discos().size(); i++) { //recorremos cada disco del ArrayList
			String genero = this.getLista_discos().get(i).getGenero(); //vamos guardando cada género del disco por el que vamos recorriendo en el ArrayList
			
			while(i<this.getLista_discos().size() && genero.compareToIgnoreCase(this.getLista_discos().get(i).getGenero()) == 0 && salir == false) {
				if(genero.equalsIgnoreCase(this.getLista_discos().get(i).getGenero())) {
					System.out.println(this.getLista_discos().get(i));
					numDiscos ++;
					i++;
					
				}else {
					salir = true;
				}
			}
			System.out.println("Hay "+numDiscos+" del género "+genero);
		}
		System.out.println();
	}
	//4. Listado por duración
	//tras haber creado la clase comparator y su pequeño método con el compareTo volvemos aquí para crear el método definitivo que ordenará según la duración
	public void ordenarPorDuracion() {
		Collections.sort(this.getLista_discos());
	}
	//5. Eliminar un disco según su código
	public void eliminarDisco() {
		Scanner sc = new Scanner(System.in);
		String codigo; //recuerda que era un String
		System.out.println("Introduzca el código del disco que desea eliminar");
		codigo = sc.next();
		
		boolean salir = false; //por que se salga antes y optimizar el rendimiento del código
		
		for(int i=0; i<this.getLista_discos().size() && salir == false; i++) { //recorremos los discos
			if(this.getLista_discos().get(i).getCodigo().equalsIgnoreCase(codigo)) { //si algun codigo de algun disco en el ArrayList coincide con el codigo que el usuario busca...
				this.getLista_discos().remove(i); //eliminamos tal disco
				salir = true; //salimos del FOR
			
			}else {
				System.out.println("Este disco no existe en la lista");
			}
		}
		System.out.println();
	}
	//necesitamos un método para imprimir
	public void imprimirDiscos() {
		for(int i=0; i<this.getLista_discos().size(); i++) {
			System.out.println(this.getLista_discos().get(i));
		}
	}
}
