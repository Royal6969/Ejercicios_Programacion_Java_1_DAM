package Ejer_7_Programador_y_Lenguajes;

import java.util.HashMap;

/*
 * 7. Crear una lista de programadores con los siguientes datos. 
 * De cada programador se desea almacenar su nombre, su edad 
 * y mediante una estructura de mapa los lenguajes de programación (en orden alfabético) que conoce, 
 * con la fecha correspondiente de inicio de trabajo con dicho lenguaje. 
 * 
 * Se pide:
 * 
 * A. Listar todos los datos ordenados alfabéticamente según el nombre del programador. 
 * B. Listar todos los datos ordenados según la edad del programador.
 */

public class Programador implements Comparable<Programador>{

	//ATRIBUTOS
	private String nombre;
	private int edad;
	
	HashMap<String, Fecha> lenguajes = new HashMap<String, Fecha>();

	//CONSTRUCTOR Lleno
	public Programador(String nombre, int edad, HashMap<String, Fecha> lenguajes) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.lenguajes = lenguajes;
	}

	//CONSTRUCTOR Vacío
	public Programador() {
		super();
	}

	//GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public HashMap<String, Fecha> getLenguajes() {
		return lenguajes;
	}

	public void setLenguajes(HashMap<String, Fecha> lenguajes) {
		this.lenguajes = lenguajes;
	}

	//To String
	@Override
	public String toString() {
		return "Programador [nombre=" + nombre + ", edad=" + edad + ", lenguajes=" + lenguajes + "]\n";
	}

	//Implement methods
	@Override
	public int compareTo(Programador p) {
		
		return this.getNombre().compareToIgnoreCase(p.getNombre());
	}
	
	
}
