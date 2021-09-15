package Ejer_8_Programador_LenguajesDeProgramacion;
/*
 * 7. Crear una lista de programadores con los siguientes datos. 
 * De cada programador se desea almacenar su nombre, su edad 
 * y mediante una estructura de mapa los lenguajes de programación (en orden alfabético) que conoce, 
 * con la fecha correspondiente de inicio de trabajo con dicho lenguaje. 
 * 
 * Se pide:
 * 
 * A. Listar todos los datos ordenados alfabéticamente según el nombre del programador.
 * B. Listar todos los datos ordenados según la edad del programador
 */
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Programador implements Comparable<Programador>{ //A. Listar todos los datos ordenados alfabéticamente según el nombre del programador.

	//De cada programador se desea almacenar su nombre, su edad 
	//ATRIBUTOS
	private String nombre;
	private int edad;
	//y mediante una estructura de mapa los lenguajes de programación (en orden alfabético) que conoce
	//con la fecha correspondiente de inicio de trabajo con dicho lenguaje. 
	private SortedMap<String, Fecha> lenguajes;
	//para quitar el error de Fecha, hay que parar para crear la clase Fecha ... con los atributos de año,mes y día, el resto de la clase es automático
	//una vez cuando volvemos aquí, vemos que ya no hay error
	
	//CONSTRUCTOR Vacío
	public Programador() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Programador(String nombre, int edad) { //eliminar de aquí el SortedMap<String, Fecha> lenguajes
		super();
		this.nombre = nombre;
		this.edad = edad;
		//OJO con esto...
		//this.lenguajes = lenguajes; esto es lo que aparece automaticamente pero hay que cambiarlo ...
		this.lenguajes = new TreeMap<String, Fecha>();
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

	public SortedMap<String, Fecha> getLenguajes() {
		return lenguajes;
	}

	public void setLenguajes(SortedMap<String, Fecha> lenguajes) {
		this.lenguajes = lenguajes;
	}
	
	//To String
	@Override
	public String toString() {
		return "Programador [nombre=" + nombre + ", edad=" + edad + ", lenguajes=" + lenguajes + "]";
	}

	//Comparable --> CompareTo
	@Override
	public int compareTo(Programador programador) { //A. Listar todos los datos ordenados alfabéticamente según el nombre del programador.
		// TODO Auto-generated method stub
		return this.getNombre().compareToIgnoreCase(programador.getNombre());
	}
	
}
