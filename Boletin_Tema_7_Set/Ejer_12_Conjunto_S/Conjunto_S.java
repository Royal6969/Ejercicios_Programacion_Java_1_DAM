package Ejer_12_Conjunto_S;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * 12. Se dispone de la clase ConjuntoS para implementar conjuntos de cadenas de tipo String. 
 * Los prototipos de los m�todos de esta clase son:
 * int tama�o(); // devuelve el n� de cadenas que contiene el conjunto.
 * boolean esVacio(); // devuelve true si el tama�o es 0.
 * boolean a�adir(String s); // a�ade una nueva cadena al conjunto. 
 * int comunes(ConjuntoS c); // devuelve el n� de elementos en com�n con el conjunto pasado por par�metro. 
 * List aLista(); // devuelve una lista con los elementos del conjunto.
 * ConjuntoS(); // crea un conjunto vac�o.
 * ConjuntoS(ConjuntoS c); // crea un conjunto a partir de otro.
 * 
 * Implemente un m�todo est�tico examen tal que dado un ConjuntoS c devuelva otro formado
 * por aquellas cadenas que no tengan en com�n el primer car�cter con respecto a alguna otra cadena de c. 
 * Es decir, si por ejemplo c = {�d�, �abad�, �bcd�, �xabcd�, �cd�, �xb2�, �bcd2�, �ybcd�} 
 * entonces el conjunto resultante debe ser {�d�, �abad�, �cd�, �ybcd�} 
 * ya que el resto de cadenas de c tienen el primer car�cter en com�n con alguna otra cadena de c. 
 * Hay que tener en cuenta que cada cadena se debe comparar con el resto de cadenas del conjunto, es decir, 
 * sin contar ella misma porque si no siempre se devolver�a el conjunto vac�o.
 * Para ello deber� construir y utilizar el m�todo public static boolean encom�nprimero(String p, List ls) 
 * tal que dado un String s y una lista de String ls devuelve un valor l�gico 
 * que es cierto si p tiene el primer car�cter en com�n con alguna cadena de ls y falso en caso contrario. 
 * Debe utilizar el m�todo char charAt(int) de String.
*/

public class Conjunto_S {

	//ATRIBUTOS
	ArrayList<String> cadena = new ArrayList<String>();

	//CONSTRUCTOR Lleno
	public Conjunto_S(Conjunto_S cadenas) {
		super();
		this.cadena = cadenas.getCadena();
	}

	//CONSTRUCTOR Vac�o
	public Conjunto_S() {
		super();
	}

	//GETTTER Y SETTER
	public ArrayList<String> getCadena() {
		return cadena;
	}

	public void setCadena(ArrayList<String> cadena) {
		this.cadena = cadena;
	}

	//To String
	@Override
	public String toString() {
		return "Conjunto_S [cadena=" + cadena + "]";
	}
	
	//M�TODOS
	public int tama�o() {
		
		return this.getCadena().size();
	}
	
	public boolean esVacio() {
		
		if(this.getCadena().size() == 0) {
			
			return true;
		}else {
			return false;
		}
	}
	
	//preguntar a Eva por que el enunciado dice "boolean a�adir"
	public void a�adir(String palabra) {
		
		this.getCadena().add(palabra);
	}
	
	public int comunes(Conjunto_S listaComunes) {
		
		Conjunto_S aux = new Conjunto_S();
		
		aux.getCadena().addAll(this.getCadena());
		
		aux.getCadena().retainAll(listaComunes.getCadena());
		
		return aux.getCadena().size(); //se devuelve el numero de palabras comunes
	}
	
	public List<String> aLista(){
		
		List<String> aux = new ArrayList<String>();
		
		aux.addAll(this.getCadena());
		
		return aux;
	}
	
	public static Conjunto_S examen(Conjunto_S c) {
			
		List<String> ls = new ArrayList<String>();
		
		ls.addAll(c.getCadena());
		
		ListIterator<String> it1 = ls.listIterator();
        
        while(it1.hasNext()){
        	String obj =it1.next();
        	
        	if(Conjunto_S.enComunPrimero(obj, ls)) {
        		ls.remove(obj);
        	}
        }
        
        Conjunto_S z = new Conjunto_S();
        
        z.getCadena().addAll(ls);
        
        return z;
	}
	
	public static boolean enComunPrimero(String p, List ls) {
		
		boolean repetido = false;

        ListIterator<String> it = ls.listIterator();
        
        while(it.hasNext()){
        	String obj =it.next();
        	
        	if(!p.equals(obj)) { //p es diferente a objeto?? 
        		if(p.charAt(0) == obj.charAt(0)) {
        			repetido = true;
        			ls.remove(obj);
        		}
        	}
        }
        if(repetido == true) {
        	return true;
        }else {
        	return false;
        }
	}
	
}
