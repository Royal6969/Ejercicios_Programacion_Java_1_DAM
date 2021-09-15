package Ejer_12_Proyecto_ConjuntoS_Strings;
/*
 * 12. Se dispone de la clase ConjuntoS para implementar conjuntos de cadenas de tipo String. 
 * 
 * Los prototipos de los m�todos de esta clase son:
 * int tama�o(); // devuelve el n� de cadenas que contiene el conjunto.
 * boolean esVacio(); // devuelve true si el tama�o es 0.
 * boolean a�adir(String s); // a�ade una nueva cadena al conjunto.
 * int comunes(ConjuntoS c); // devuelve el n� de elementos en com�n con el conjunto pasado por par�metro.
 * List aLista(); // devuelve una lista con los elementos del conjunto.
 * ConjuntoS(); // crea un conjunto vac�o.
 * ConjuntoS(ConjuntoS c); // crea un conjunto a partir de otro.
 * 
 * Implemente un m�todo est�tico examen tal que dado un ConjuntoS c 
 * devuelva otro formado por aquellas cadenas
 * que no tengan en com�n el primer car�cter con respecto a alguna otra cadena de c. 
 * 
 * Es decir, si por ejemplo c = {�d�, �abad�, �bcd�, �xabcd�, �cd�, �xb2�, �bcd2�, �ybcd�} 
 * entonces el conjunto resultante debe ser {�d�, �abad�, �cd�, �ybcd�} 
 * ya que el resto de cadenas de c tienen el primer car�cter en com�n con alguna otra cadena de c. 
 * 
 * Hay que tener en cuenta que cada cadena se debe comparar con el resto de cadenas del conjunto,
 * es decir, sin contar ella misma porque si no siempre se devolver�a el conjunto vac�o.
 * Para ello deber� construir y utilizar el m�todo public static boolean encom�nprimero(String p, List ls) 
 * tal que dado un String s y una lista de String ls devuelve un valor l�gico que es cierto 
 * si p tiene el primer car�cter en com�n con alguna cadena de ls y falso en caso contrario. 
 * Debe utilizar el m�todo char charAt(int) de String.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import Ejer_6_Palabra_SublistaRepetidos_NoRepetidos.Palabra;

public class ConjuntoS { //OJO, el enfoque de este ejercicio es como si no tuvieramos la clase del objeto original, y partimos de �sta la cual ser�a un tipo de "Lista_x"
	
	//ATRIBUTOS
	ArrayList<String> conjunto_cadenas = new ArrayList<String>(); //tenemos que ver que el tipo de dato es un String, ya que estamos hablando de cadenas

	//CONSTRUCTOR Vac�o
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
	
	//M�TODOS
	//vamos a ir poniendo primero todos los esqueletos de los m�todos que nos dice el enunciado, hacemos copia y pega con un "public delante" y abriendo las llaves...
	public int tama�o() { // devuelve el n� de cadenas que contiene el conjunto. (osea un .size)
		int numCadenas;
		
		numCadenas = this.getConjunto_cadenas().size();
		
		return numCadenas;
	}
	
	public boolean esVacio() { // devuelve true si el tama�o es 0. (osea, otra vez el .size)
		boolean esVacio = false;
		
		if(this.getConjunto_cadenas().size() == 0) {
			esVacio = true;
		}else {
			esVacio = false;
		}
		
		return esVacio;
	}
	
//	public boolean a�adir_v1(String s) { // a�ade una nueva cadena al conjunto. (osea el .add)	
//	}este m�todo que nos dice el enunciado no tiene mucho sentido, porque no pinta nada un boolean aqu� ... 
	//asi que mi 2� version de este m�todo es...
	public void a�adir_v2() {
		Scanner sc = new Scanner(System.in);
		
		String cadena;
		System.out.println("Introduzca una nueva cadena de caracteres/palabras");
		cadena = sc.next();
		
		this.getConjunto_cadenas().add(cadena);
	}
	
	public int comunes(ConjuntoS c) { 
		//vamos a suponer que este (ConjuntoS c) ser�a un objeto de "Conjunto_S" que nos est�n pasando para que comparemos y guardemos en un Conjunto auxiliar, las cadenas comunes que haya entre el Conjunto c que nos mandan y el "conjunto_cadenas" original
		int numComunes = 0; 
		
		ConjuntoS conjuntoAUX = new ConjuntoS();
		
		conjuntoAUX.getConjunto_cadenas().addAll(conjunto_cadenas); //1�) al conjunto auxiliar le a�adimos una copia del conjunto_cadenas
		conjuntoAUX.getConjunto_cadenas().retainAll(c.getConjunto_cadenas()); //2�) en el conjunto auxiliar guardamos las cadenas en comunes que haya tmb en el Conjutno que nos pasan como par�metro (en otras palabras, as� estamos comparando el (Conjunto_S conjunto_cadenas) con (Conjunto_S c)
		numComunes = conjuntoAUX.getConjunto_cadenas().size(); //3�) le decimos al contador el n�mero de posiciones del auxiliar, que ser�an el numero de cadenas comunes
		
		return numComunes;
	}
	
	//public List aLista() { // devuelve una lista con los elementos del conjunto.
	//lo primero es darle al fallo que nos da, e importar el List.java.util //aparte le falta el tipo de dato, osea, List<tipoDato> aLista
	public List<String> aLista(){
		List<String> aLista = new ArrayList<>(); //hay que ser h�bil y ver que se trata de un List de ArrayList
		aLista.addAll(getConjunto_cadenas()); //se a�ade una copia del conjunto_cadenas
		
		return aLista;
	}
	
	public void ConjuntoS() { // crea un conjunto vac�o.
	
	}
	
	//si seguimos leyendo el enunciado nos encontramos con esto...
	public static boolean enCom�nPrimero(String p, List ls) { //toda la descripci�n de lo que hay que hacer est� de la mitad del enunciado para alante
		boolean repetido = false;
		
		//para recorrer esta lista del tipo List, vamos a utilizar un tipo de Iterator para recorrer el List
		ListIterator<String> iterator = ls.listIterator(); //el tipo de dato que maneja es obvio que es String, y OJO a que el tipo de iterator ser�a listIterator
		while(iterator.hasNext()) {
			String cadena = iterator.next();
			
			if(!(p.equalsIgnoreCase(cadena))) { //si son distintos
				if(p.charAt(0) == cadena.charAt(0)) { //si el primer car�cter de p es igual al primer car�cter del auxiliar palabra...
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
	
	//una vez hecho el m�todo anterior de "enComunPrimero" ahora vamos con el siguiente m�todo que completar�a la funcionalidad del anterior que nos pide el enunciado
	public static ConjuntoS crearConjuntoApartirDe (ConjuntoS c) { // crea un conjunto a partir de otro. //ponemos un nombre al conjunto auxiliar ...conjuntoAUX
		List<String> listAUX = new ArrayList<String>(); //crear una lista auxiliar de tipo ArrayList obviamente con el tipo de dato String
		listAUX.addAll(c.getConjunto_cadenas()); //a�adir a listAUX una copia del ConjuntoS que nos han pasado como par�metro
		
		ListIterator<String> iterator = listAUX.listIterator();
		while(iterator.hasNext()) {
			String cadena = iterator.next();
			
			if(ConjuntoS.enCom�nPrimero(cadena, listAUX)) { //los metodos est�ticos se llaman a trav�s de clases
				listAUX.remove(cadena);
			}
		}
		ConjuntoS nuevoConjunto = new ConjuntoS(); //creamos el nuevo conjunto del ConjuntoS para guardar una copia de c�mo ha quedado finalmente la listaAUX
		nuevoConjunto.getConjunto_cadenas().addAll(listAUX);
		
		return nuevoConjunto;
	}
}
