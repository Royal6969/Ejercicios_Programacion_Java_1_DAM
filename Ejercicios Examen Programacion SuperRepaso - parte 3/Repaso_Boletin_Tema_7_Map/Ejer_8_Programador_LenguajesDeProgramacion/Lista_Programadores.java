package Ejer_8_Programador_LenguajesDeProgramacion;
import java.util.ArrayList;
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
public class Lista_Programadores {

	//ATRIBUTOS
	ArrayList<Programador> lista_programadores = new ArrayList<Programador>();

	//CONSTRUCTOR Vacío
	public Lista_Programadores() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Lista_Programadores(ArrayList<Programador> lista_programadores) {
		super();
		this.lista_programadores = lista_programadores;
	}

	//GETTER Y SETTER
	public ArrayList<Programador> getLista_programadores() {
		return lista_programadores;
	}

	public void setLista_programadores(ArrayList<Programador> lista_programadores) {
		this.lista_programadores = lista_programadores;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Programadores [lista_programadores=" + lista_programadores + "]";
	}
	
	
}
