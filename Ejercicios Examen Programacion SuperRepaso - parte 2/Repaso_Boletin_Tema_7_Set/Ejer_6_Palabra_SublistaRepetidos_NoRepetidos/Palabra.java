package Ejer_6_Palabra_SublistaRepetidos_NoRepetidos;
/*
 * 6. Dado un array de palabras, donde existir�n repeticiones (yo, vengo, yo, voy, yo, soy), 
 * se propone crear dos conjuntos para listar por separado las palabras que est�n sin repetir (vengo, voy ,soy), 
 * y las palabras que s� lo est�n (yo).
 */
public class Palabra {

	//ATRIBUTOS
	private String palabra;

	//CONSTRUCTOR Vac�o
	public Palabra() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Palabra(String palabra) {
		super();
		this.palabra = palabra;
	}

	//GETTER Y SETTER
	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	//To String
	@Override
	public String toString() {
		return "Palabra [palabra=" + palabra + "]";
	}
	
	
}
