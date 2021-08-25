package Ejer_16_Proyecto_Disco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import Ejer_10_Cartas.Cartas;

/*
 * 6. ENUNCIADO PROYECTO DISCO
Men� de opciones:
1. Insertar nuevo disco, seg�n su codigo, que es �nico
2. Listado ordenado seg�n autor
3. Listado agrupado por g�nero, mostrando el n�mero de discos de cada g�nero
4. Listado por duraci�n
5. Eliminar un disco seg�n su c�digo
6. Salir
Clases:
- Disco
- LDisco: insertaDisco, eliminaDisco, listadoAutor, listadoDuracion,listadoGenero.
- PruebaDisco
- GeneroComparator
- DuracionComparator
 */

public class Lista_Discos {

	//ATRIBUTOS
	//ArrayList<Elemento> listaElemento=new ArrayList<Elemento> ();
	ArrayList<Disco> objeto = new ArrayList<Disco>();

	//CONSTRUCTOR Lleno
	public Lista_Discos(ArrayList<Disco> objeto) {
		super();
		this.objeto = objeto;
	}

	//CONSTRUCTOR Vac�o
	public Lista_Discos() {
		super();
	}

	//GETTER Y SETTER
	public ArrayList<Disco> getObjeto() {
		return objeto;
	}

	public void setObjeto(ArrayList<Disco> objeto) {
		this.objeto = objeto;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Discos [objeto=" + objeto + "]";
	}
	
	//M�TODOS
	public void insertarDisco() {
		
		Disco cd = new Disco();
		
		boolean salir = false;
		
		cd.pedirDatos();
		
		for(int i=0; i<this.getObjeto().size() && salir==false; i++) {
			
			if(this.getObjeto().get(i).getCodDisco().equalsIgnoreCase(cd.getCodDisco())) {
				salir = true;
			}
		}
		
		if(salir==true) {
			System.out.println("Error, este c�digo de disco ya existe");
			
		}else {
			this.getObjeto().add(cd);
		}
	}
	
	public void ordenarSegunAutores() {
		
		Collections.sort(this.objeto);
		
		this.imprimirListaDiscos();
	}
	
	public void imprimirListaDiscos() {
		
		for(int i=0; i<this.objeto.size(); i++) {
			
			System.out.println(this.objeto.get(i));
		}
	}
	
	public void ordenarSegunGenero() {
		
		Collections.sort(this.objeto, new Genero_Compare());
		
		int contador = 0;
		boolean salir = false;
		
		for(int i=0; i<this.objeto.size(); ) {
			
			String Generos = this.getObjeto().get(i).getGenero();
			
			while(i<this.getObjeto().size() && Generos.compareToIgnoreCase(this.getObjeto().get(i).getGenero()) == 0 && salir==false) {
				
				if(Generos.equalsIgnoreCase(this.getObjeto().get(i).getGenero())) {
					System.out.println(this.getObjeto().get(i));
					contador++;
					i++;
					
				}else {
					salir = true;
				}
			}
			System.out.println("Hay "+contador+" "+Generos);
			contador = 0;
			salir = false;
		}
	}
	
	public void listadoPorDuracion() {
		
		Collections.sort(this.objeto, new Duracion_Compare());
		
		this.imprimirListaDiscos();
	}
	
	public void eliminarDisco() {
		
		Scanner sc = new Scanner(System.in);
		String codDisco;
		boolean salir = false;
		
		System.out.println("Introduzca el c�digo del disco que quiere eliminar");
		codDisco = sc.next();
		
		for(int i=0; i<this.objeto.size() && salir==false; i++) {
			if(this.getObjeto().get(i).getCodDisco().equalsIgnoreCase(codDisco)) {
				
				this.getObjeto().remove(i);
				salir = true;
			}
		}
	}
	
}
