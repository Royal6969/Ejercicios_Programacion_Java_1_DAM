package Ejer_16_Proyecto_Disco;
/*
 * 16. ENUNCIADO PROYECTO DISCO
 * Men� de opciones:
 * 1. Insertar nuevo disco, seg�n su codigo, que es �nico
 * 2. Listado ordenado seg�n autor
 * 3. Listado agrupado por g�nero, mostrando el n�mero de discos de cada g�nero
 * 4. Listado por duraci�n
 * 5. Eliminar un disco seg�n su c�digo
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

	//CONSTRUCTOR Vac�o
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
	
	//M�TODOS
	//1. Insertar nuevo disco, seg�n su codigo, que es �nico
	public void insertarDisco() {
		//empezamos creando un objeto de Disco donde vamos a guardar los atributos que pidamos con el otro m�todo
		Disco disco = new Disco();
		boolean salir = false; //este boolean lo usaremos para salir en caso de qu eel c�digo (ID) ya exista
		
		disco.pedirDatosDisco(); //pedimos los datos con nuestro m�todo
		for(int i=0; i<this.getLista_discos().size(); i++) { //recorrer el ArrayList
			if(this.getLista_discos().get(i).getCodigo().equalsIgnoreCase(disco.getCodigo())) { //si el codigo del disco por el que va recorriendo coincide con el codigo que se le quiere poner a este nuevo disco, cancelamos este intento
				salir = true;
			}
		}
		if(salir == true) { //si s� exist�a... mensajito de error
			System.out.println("Lo sentimos, pero ese disco ya existe en la lista");
		}else { //y si no exist�a, pues a�adimos
			this.getLista_discos().add(disco);
		}
		System.out.println();
	}
	//2. Listado ordenado seg�n autor
	public void ordenarPorAutores() {
		Collections.sort(this.getLista_discos());
	}
	//3. Listado agrupado por g�nero, mostrando el n�mero de discos de cada g�nero
	//tras haber creado la clase comparator y su peque�o m�todo con el compareTo volvemos aqu� para crear el m�todo definitivo que ordenar� seg�n g�nero
	public void ordenarPorGenero() {
		Collections.sort(this.getLista_discos(), new Genero_Comparator());
		
		//mostrando el n�mero de discos de cada g�nero
		int numDiscos = 0;
		boolean salir = false;
		
		for(int i=0; i<this.getLista_discos().size(); i++) { //recorremos cada disco del ArrayList
			String genero = this.getLista_discos().get(i).getGenero(); //vamos guardando cada g�nero del disco por el que vamos recorriendo en el ArrayList
			
			while(i<this.getLista_discos().size() && genero.compareToIgnoreCase(this.getLista_discos().get(i).getGenero()) == 0 && salir == false) {
				if(genero.equalsIgnoreCase(this.getLista_discos().get(i).getGenero())) {
					System.out.println(this.getLista_discos().get(i));
					numDiscos ++;
					i++;
					
				}else {
					salir = true;
				}
			}
			System.out.println("Hay "+numDiscos+" del g�nero "+genero);
		}
		System.out.println();
	}
	//4. Listado por duraci�n
	//tras haber creado la clase comparator y su peque�o m�todo con el compareTo volvemos aqu� para crear el m�todo definitivo que ordenar� seg�n la duraci�n
	public void ordenarPorDuracion() {
		Collections.sort(this.getLista_discos());
	}
	//5. Eliminar un disco seg�n su c�digo
	public void eliminarDisco() {
		Scanner sc = new Scanner(System.in);
		String codigo; //recuerda que era un String
		System.out.println("Introduzca el c�digo del disco que desea eliminar");
		codigo = sc.next();
		
		boolean salir = false; //por que se salga antes y optimizar el rendimiento del c�digo
		
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
	//necesitamos un m�todo para imprimir
	public void imprimirDiscos() {
		for(int i=0; i<this.getLista_discos().size(); i++) {
			System.out.println(this.getLista_discos().get(i));
		}
	}
}
