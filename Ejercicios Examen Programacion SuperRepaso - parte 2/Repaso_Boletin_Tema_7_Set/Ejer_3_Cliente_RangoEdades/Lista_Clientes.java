package Ejer_3_Cliente_RangoEdades;
/*
 * 3. Una empresa desea clasificar a sus clientes en función de su edad ([0,14),[14,18),[18,..)). 
 * Dado un conjunto de personas, obtener un array con los tres conjuntos resultantes.
 */
import java.util.HashSet;
import java.util.Set;

public class Lista_Clientes {

	//ATRIBUTOS
	Set<Cliente> lista_clientes = new HashSet<Cliente>(); //creamos la lista principal
	Set<Cliente> intervaloEdad_1 = new HashSet<Cliente>();//1º rango [0,14)
	Set<Cliente> intervaloEdad_2 = new HashSet<Cliente>();//2º rango [14,18)
	Set<Cliente> intervaloEdad_3 = new HashSet<Cliente>();//3º rango [18,...)
	
	//CONSTRUCTOR Vacio
	public Lista_Clientes() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Lista_Clientes(Set<Cliente> lista_clientes, Set<Cliente> intervaloEdad_1, Set<Cliente> intervaloEdad_2,
			Set<Cliente> intervaloEdad_3) {
		super();
		this.lista_clientes = lista_clientes;
		this.intervaloEdad_1 = intervaloEdad_1;
		this.intervaloEdad_2 = intervaloEdad_2;
		this.intervaloEdad_3 = intervaloEdad_3;
	}

	//GETTER Y SETTER
	public Set<Cliente> getLista_clientes() {
		return lista_clientes;
	}

	public void setLista_clientes(Set<Cliente> lista_clientes) {
		this.lista_clientes = lista_clientes;
	}

	public Set<Cliente> getIntervaloEdad_1() {
		return intervaloEdad_1;
	}

	public void setIntervaloEdad_1(Set<Cliente> intervaloEdad_1) {
		this.intervaloEdad_1 = intervaloEdad_1;
	}

	public Set<Cliente> getIntervaloEdad_2() {
		return intervaloEdad_2;
	}

	public void setIntervaloEdad_2(Set<Cliente> intervaloEdad_2) {
		this.intervaloEdad_2 = intervaloEdad_2;
	}

	public Set<Cliente> getIntervaloEdad_3() {
		return intervaloEdad_3;
	}

	public void setIntervaloEdad_3(Set<Cliente> intervaloEdad_3) {
		this.intervaloEdad_3 = intervaloEdad_3;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Clientes [lista_clientes=" + lista_clientes + ", intervaloEdad_1=" + intervaloEdad_1
				+ ", intervaloEdad_2=" + intervaloEdad_2 + ", intervaloEdad_3=" + intervaloEdad_3 + "]";
	}
	
	
}
