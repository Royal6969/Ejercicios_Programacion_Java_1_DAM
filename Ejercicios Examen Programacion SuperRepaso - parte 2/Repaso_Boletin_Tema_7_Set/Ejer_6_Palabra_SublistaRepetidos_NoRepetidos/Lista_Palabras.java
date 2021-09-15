package Ejer_6_Palabra_SublistaRepetidos_NoRepetidos;
/*
 * 6. Dado un array de palabras, donde existirán repeticiones (yo, vengo, yo, voy, yo, soy), 
 * se propone crear dos conjuntos para listar por separado las palabras que están sin repetir (vengo, voy ,soy), 
 * y las palabras que sí lo están (yo).
 */
import java.util.HashSet;
import java.util.Set;

public class Lista_Palabras {

	//ATRIBUTOS
	Set<Palabra> lista_palabras = new HashSet<Palabra>();
	Set<Palabra> lista_palabrasSinRepetir = new HashSet<Palabra>();
	Set<Palabra> lista_palabrasRepetidas = new HashSet<Palabra>();
	
	//CONSTRUCTOR Vacío
	public Lista_Palabras() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Lista_Palabras(Set<Palabra> lista_palabras, Set<Palabra> lista_palabrasSinRepetir,
			Set<Palabra> lista_palabrasRepetidas) {
		super();
		this.lista_palabras = lista_palabras;
		this.lista_palabrasSinRepetir = lista_palabrasSinRepetir;
		this.lista_palabrasRepetidas = lista_palabrasRepetidas;
	}

	//GETTER Y SETTER
	public Set<Palabra> getLista_palabras() {
		return lista_palabras;
	}

	public void setLista_palabras(Set<Palabra> lista_palabras) {
		this.lista_palabras = lista_palabras;
	}

	public Set<Palabra> getLista_palabrasSinRepetir() {
		return lista_palabrasSinRepetir;
	}

	public void setLista_palabrasSinRepetir(Set<Palabra> lista_palabrasSinRepetir) {
		this.lista_palabrasSinRepetir = lista_palabrasSinRepetir;
	}

	public Set<Palabra> getLista_palabrasRepetidas() {
		return lista_palabrasRepetidas;
	}

	public void setLista_palabrasRepetidas(Set<Palabra> lista_palabrasRepetidas) {
		this.lista_palabrasRepetidas = lista_palabrasRepetidas;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Palabras [lista_palabras=" + lista_palabras + ", lista_palabrasSinRepetir="
				+ lista_palabrasSinRepetir + ", lista_palabrasRepetidas=" + lista_palabrasRepetidas + "]";
	}
	
	//MÉTODOS
	public void listarPalabrasSinRepetir(Set<Palabra> lista_palabras, Set<Palabra> lista_palabrasSinRepetir, Set<Palabra> lista_palabrasRepetidas) {
		
	}
	public void listarPalabrasRepetidas(Set<Palabra> lista_palabras, Set<Palabra> lista_palabrasSinRepetir, Set<Palabra> lista_palabrasRepetidas) {
		
	}
	
}
