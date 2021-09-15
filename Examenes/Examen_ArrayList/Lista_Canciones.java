package Examen_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lista_Canciones {

	//ATRIBUTOS
	ArrayList<Cancion> lista_canciones = new ArrayList<Cancion>();

	//CONSTRUCTOR Vacio
	public Lista_Canciones() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Lista_Canciones(ArrayList<Cancion> lista_canciones) {
		super();
		this.lista_canciones = lista_canciones;
	}

	//GETTER Y SETTER
	public ArrayList<Cancion> getLista_canciones() {
		return lista_canciones;
	}

	public void setLista_canciones(ArrayList<Cancion> lista_canciones) {
		this.lista_canciones = lista_canciones;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Canciones [lista_canciones=" + lista_canciones + "]";
	}
	
	//METODOS
	//1. Insertar una nueva canción. Si el nombre de la canción está en blanco, saltará una excepción
	public void insertarCancion() throws Excepcion_Nombre{
		Cancion cancion = new Cancion();
		cancion = cancion.pedirDatos();
		this.lista_canciones.add(cancion);
	}
	//2. Listado canciones ordenado según intérprete
	public void listadoSegunInterprete() {
		Collections.sort(this.lista_canciones);
		
		for(int i=0; i<this.lista_canciones.size(); i++) {
			System.out.println(this.lista_canciones.get(i));
		}
	}
	//3. Listado ordenado por género mostrando cada número total de canciones por género, y al final, su total global
	public void listadoSegunGenero() {
		Collections.sort(this.lista_canciones, new Genero_Comparator());
		int numGeneros = 0; //porque como minimo hay una cancion por genero en la lista
		int numTotal = 0;
		boolean salir = false;
		
		for(int i=0; i<this.lista_canciones.size(); /*i++*/) {
			Genero generoAUX = this.lista_canciones.get(i).getGenero();
			
			while(i < this.lista_canciones.size() && generoAUX.equals(this.lista_canciones.get(i).getGenero()) && salir == false) {
				if(generoAUX.equals(this.lista_canciones.get(i).getGenero())) {
					System.out.println(this.lista_canciones.get(i));
					numGeneros ++;
					i ++; //para que pase a la siguiente cancion
				}else {
					salir = true; //cancela el while pero no salta en el For a la siguiente cancion porque sino se saltaria esta cancion actual por la que va
				}
			}
			System.out.println("Hay "+numGeneros+" canciones del genero "+generoAUX);
			numTotal += numGeneros;
			numGeneros = 0; //reinicio
			salir = false; //reinicio
		}
		System.out.println("El total de canciones es "+numTotal);
	}
	//4. Mostrar los datos de la canción más antigua y de la más reciente
	public void listadoPorAños() {
		Collections.sort(this.lista_canciones, new Año_Comparator());
		
		System.out.println("La cancion más antigua es "+this.lista_canciones.get(0));
		System.out.println("la canción más reciente es "+this.lista_canciones.get(this.lista_canciones.size()-1));
	}
	
	//5. Pedir los nombres de dos canciones y decir si son iguales (dos canciones se consideran iguales si tienen el mismo nombre e intérprete
	public void sonIguales() {
		Scanner sc = new Scanner(System.in);
		
		Cancion cancion1 = new Cancion();
		Cancion cancion2 = new Cancion();
		String nombre1;
		String nombre2;
		boolean encontrado1 = false;
		boolean encontrado2 = false;
		
		System.out.println("Introduzca el nombre de la primera canción");
		nombre1 = sc.next();
		System.out.println("Introduzca el nombre de la segunda canción");
		nombre2 = sc.next();
		
		for(int i=0; i<this.lista_canciones.size() && encontrado1 == false; i++) {
			if(this.lista_canciones.get(i).getNombre() == nombre1) {
				encontrado1 = true;
				cancion1 = this.lista_canciones.get(i);
			}
		}
		for (int i=0; i<this.lista_canciones.size() && encontrado2 == false; i++) {
			if(this.lista_canciones.get(i).getNombre() == nombre2) {
				encontrado2 = true;
				cancion2 = this.lista_canciones.get(i);
			}
		}
		if(encontrado1 == true && encontrado2 == true) {
			if(cancion1.equals(cancion2)) { //redefinir ahora el equals en la clase Cancion
				System.out.println("Estas dos canciones son iguales");
			}else {
				System.out.println("Estas dos canciones NO son iguales");
			}
		}
	}
	
}
