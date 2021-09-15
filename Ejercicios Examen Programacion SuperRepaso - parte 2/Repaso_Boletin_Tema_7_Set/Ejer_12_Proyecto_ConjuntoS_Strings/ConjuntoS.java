package Ejer_12_Proyecto_ConjuntoS_Strings;
/*
 * 12. Se dispone de la clase ConjuntoS para implementar conjuntos de cadenas de tipo String. 
 * 
 * Los prototipos de los métodos de esta clase son:
 * int tamaño(); // devuelve el nº de cadenas que contiene el conjunto.
 * boolean esVacio(); // devuelve true si el tamaño es 0.
 * boolean añadir(String s); // añade una nueva cadena al conjunto.
 * int comunes(ConjuntoS c); // devuelve el nº de elementos en común con el conjunto pasado por parámetro.
 * List aLista(); // devuelve una lista con los elementos del conjunto.
 * ConjuntoS(); // crea un conjunto vacío.
 * ConjuntoS(ConjuntoS c); // crea un conjunto a partir de otro.
 * 
 * Implemente un método estático examen tal que dado un ConjuntoS c 
 * devuelva otro formado por aquellas cadenas
 * que no tengan en común el primer carácter con respecto a alguna otra cadena de c. 
 * 
 * Es decir, si por ejemplo c = {“d”, “abad”, “bcd”, “xabcd”, “cd”, “xb2”, “bcd2”, “ybcd”} 
 * entonces el conjunto resultante debe ser {“d”, “abad”, “cd”, “ybcd”} 
 * ya que el resto de cadenas de c tienen el primer carácter en común con alguna otra cadena de c. 
 * 
 * Hay que tener en cuenta que cada cadena se debe comparar con el resto de cadenas del conjunto,
 * es decir, sin contar ella misma porque si no siempre se devolvería el conjunto vacío.
 * Para ello deberá construir y utilizar el método public static boolean encomúnprimero(String p, List ls) 
 * tal que dado un String s y una lista de String ls devuelve un valor lógico que es cierto 
 * si p tiene el primer carácter en común con alguna cadena de ls y falso en caso contrario. 
 * Debe utilizar el método char charAt(int) de String.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import Ejer_6_Palabra_SublistaRepetidos_NoRepetidos.Palabra;

public class ConjuntoS { //OJO, el enfoque de este ejercicio es como si no tuvieramos la clase del objeto original, y partimos de ésta la cual sería un tipo de "Lista_x"
	
	//ATRIBUTOS
	ArrayList<String> conjunto_cadenas = new ArrayList<String>(); //tenemos que ver que el tipo de dato es un String, ya que estamos hablando de cadenas

	//CONSTRUCTOR Vacío
	public ConjuntoS() {
		super();
	}

	//CONSTRUCTOR Lleno
	public ConjuntoS(ArrayList<String> conjunto_cadenas) {
		super();
		this.conjunto_cadenas = conjunto_cadenas;
	}

	//GETTER Y SETTER
	public ArrayList<String> getConjunto_cadenas() {
		return conjunto_cadenas;
	}

	public void setConjunto_cadenas(ArrayList<String> conjunto_cadenas) {
		this.conjunto_cadenas = conjunto_cadenas;
	}

	//To String
	@Override
	public String toString() {
		return "ConjuntoS [conjunto_cadenas=" + conjunto_cadenas + "]";
	}
	
	//MÉTODOS
	//vamos a ir poniendo primero todos los esqueletos de los métodos que nos dice el enunciado, hacemos copia y pega con un "public delante" y abriendo las llaves...
	public int tamaño() { // devuelve el nº de cadenas que contiene el conjunto. (osea un .size)
		int numCadenas;
		
		numCadenas = this.getConjunto_cadenas().size();
		
		return numCadenas;
	}
	
	public boolean esVacio() { // devuelve true si el tamaño es 0. (osea, otra vez el .size)
		boolean esVacio = false;
		
		if(this.getConjunto_cadenas().size() == 0) {
			esVacio = true;
		}else {
			esVacio = false;
		}
		
		return esVacio;
	}
	
//	public boolean añadir_v1(String s) { // añade una nueva cadena al conjunto. (osea el .add)	
//	}este método que nos dice el enunciado no tiene mucho sentido, porque no pinta nada un boolean aquí ... 
	//asi que mi 2º version de este método es...
	public void añadir_v2() {
		Scanner sc = new Scanner(System.in);
		
		String cadena;
		System.out.println("Introduzca una nueva cadena de caracteres/palabras");
		cadena = sc.next();
		
		this.getConjunto_cadenas().add(cadena);
	}
	
	public int comunes(ConjuntoS c) { 
		//vamos a suponer que este (ConjuntoS c) sería un objeto de "Conjunto_S" que nos están pasando para que comparemos y guardemos en un Conjunto auxiliar, las cadenas comunes que haya entre el Conjunto c que nos mandan y el "conjunto_cadenas" original
		int numComunes = 0; 
		
		ConjuntoS conjuntoAUX = new ConjuntoS();
		
		conjuntoAUX.getConjunto_cadenas().addAll(conjunto_cadenas); //1º) al conjunto auxiliar le añadimos una copia del conjunto_cadenas
		conjuntoAUX.getConjunto_cadenas().retainAll(c.getConjunto_cadenas()); //2º) en el conjunto auxiliar guardamos las cadenas en comunes que haya tmb en el Conjutno que nos pasan como parámetro (en otras palabras, así estamos comparando el (Conjunto_S conjunto_cadenas) con (Conjunto_S c)
		numComunes = conjuntoAUX.getConjunto_cadenas().size(); //3º) le decimos al contador el número de posiciones del auxiliar, que serían el numero de cadenas comunes
		
		return numComunes;
	}
	
	//public List aLista() { // devuelve una lista con los elementos del conjunto.
	//lo primero es darle al fallo que nos da, e importar el List.java.util //aparte le falta el tipo de dato, osea, List<tipoDato> aLista
	public List<String> aLista(){
		List<String> aLista = new ArrayList<>(); //hay que ser hábil y ver que se trata de un List de ArrayList
		aLista.addAll(getConjunto_cadenas()); //se añade una copia del conjunto_cadenas
		
		return aLista;
	}
	
	public void ConjuntoS() { // crea un conjunto vacío.
	
	}
	
	//si seguimos leyendo el enunciado nos encontramos con esto...
	public static boolean enComúnPrimero(String p, List ls) { //toda la descripción de lo que hay que hacer está de la mitad del enunciado para alante
		boolean repetido = false;
		
		//para recorrer esta lista del tipo List, vamos a utilizar un tipo de Iterator para recorrer el List
		ListIterator<String> iterator = ls.listIterator(); //el tipo de dato que maneja es obvio que es String, y OJO a que el tipo de iterator sería listIterator
		while(iterator.hasNext()) {
			String cadena = iterator.next();
			
			if(!(p.equalsIgnoreCase(cadena))) { //si son distintos
				if(p.charAt(0) == cadena.charAt(0)) { //si el primer carácter de p es igual al primer carácter del auxiliar palabra...
					repetido = true; //activamos el boolean
					ls.remove(cadena); //y de la lista eliminamos la cadena que coincide y se repite
				}
			}
		}
		if(repetido == true) {
			return true;
		}else {
			return false;
		}
	}
	
	//una vez hecho el método anterior de "enComunPrimero" ahora vamos con el siguiente método que completaría la funcionalidad del anterior que nos pide el enunciado
	public static ConjuntoS crearConjuntoApartirDe (ConjuntoS c) { // crea un conjunto a partir de otro. //ponemos un nombre al conjunto auxiliar ...conjuntoAUX
		List<String> listAUX = new ArrayList<String>(); //crear una lista auxiliar de tipo ArrayList obviamente con el tipo de dato String
		listAUX.addAll(c.getConjunto_cadenas()); //añadir a listAUX una copia del ConjuntoS que nos han pasado como parámetro
		
		ListIterator<String> iterator = listAUX.listIterator();
		while(iterator.hasNext()) {
			String cadena = iterator.next();
			
			if(ConjuntoS.enComúnPrimero(cadena, listAUX)) { //los metodos estáticos se llaman a través de clases
				listAUX.remove(cadena);
			}
		}
		ConjuntoS nuevoConjunto = new ConjuntoS(); //creamos el nuevo conjunto del ConjuntoS para guardar una copia de cómo ha quedado finalmente la listaAUX
		nuevoConjunto.getConjunto_cadenas().addAll(listAUX);
		
		return nuevoConjunto;
	}
}
