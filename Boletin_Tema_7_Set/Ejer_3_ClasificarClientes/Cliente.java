package Ejer_3_ClasificarClientes;

/*
 * 3. Una empresa desea clasificar a sus clientes en función de su edad ([0,14),[14,18),[18,..)). 
 * Dado un conjunto de personas, obtener un array con los tres conjuntos resultantes.
 */

public class Cliente {

	//ATRIBUTOS
	private int edad;

	//CONSTRUCTOR Lleno
	public Cliente(int edad) {
		super();
		this.edad = edad;
	}

	//CONSTRUCTOR Vacío
	public Cliente() {
		super();
	}

	//GETTER Y SETTER
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//To String
	@Override
	public String toString() {
		return "Cliente [edad=" + edad + "]";
	}
	
	
}
