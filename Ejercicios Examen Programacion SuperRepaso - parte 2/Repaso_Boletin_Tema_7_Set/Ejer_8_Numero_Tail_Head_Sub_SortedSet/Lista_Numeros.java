package Ejer_8_Numero_Tail_Head_Sub_SortedSet;
import java.util.SortedSet;
import java.util.TreeSet;
/*
 * 8. Crear un conjunto ordenado de 10 números enteros (orden natural) y probar los métodos siguientes:
 * a. tailSet
 * b. headSet
 * c. subSet
 */
public class Lista_Numeros {

	//ATRIBUTOS
	SortedSet<Numero> lista_numeros = new TreeSet<Numero>();

	public Lista_Numeros() {
		super();
	}

	public Lista_Numeros(SortedSet<Numero> lista_numeros) {
		super();
		this.lista_numeros = lista_numeros;
	}

	public SortedSet<Numero> getLista_numeros() {
		return lista_numeros;
	}

	public void setLista_numeros(SortedSet<Numero> lista_numeros) {
		this.lista_numeros = lista_numeros;
	}

	@Override
	public String toString() {
		return "Lista_Numeros [lista_numeros=" + lista_numeros + "]";
	}
	
	
}
