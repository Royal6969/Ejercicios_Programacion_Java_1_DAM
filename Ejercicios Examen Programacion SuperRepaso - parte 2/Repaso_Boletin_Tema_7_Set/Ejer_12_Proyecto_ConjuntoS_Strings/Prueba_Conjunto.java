package Ejer_12_Proyecto_ConjuntoS_Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
public class Prueba_Conjunto {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//vamos a crear 3 conjuntos 
		ConjuntoS conjunto1 = new ConjuntoS();
		ConjuntoS conjunto2 = new ConjuntoS();
		ConjuntoS conjunto3 = new ConjuntoS();
		//ahora creo una lista tipo List de ArrayList
		List<String> lista = new ArrayList<String>();
		//y por �ltimo un par de variables int para recoger los resultados de algunos m�todos
		int tama�o, numComunes;
		
		//a�adimos 3 palabras al conjunto1 con nuestro metodo de a�adir
		conjunto1.a�adir_v2();
		conjunto1.a�adir_v2();
		conjunto1.a�adir_v2();
		
		//recogemos el tama�o del conjunto1 
		tama�o = conjunto1.tama�o();
		System.out.println(tama�o);
		
		//comprobamos si el conjunto1 est� vac�o
		if(conjunto1.esVacio() == true) {
			System.out.println("El conjunto1 est� vac�o");
		}else {
			System.out.println("El conjunto1 NO est� vac�o");
		}
		
		//ahora vamos a a�adir palabras al conjunto2
		conjunto2.a�adir_v2();
		conjunto2.a�adir_v2();
		conjunto2.a�adir_v2();
		
		//vamos a ver el n�mero de cadenas comunes entre el conjunto1 y el conjunto2
		numComunes = conjunto1.comunes(conjunto2);
		System.out.println(numComunes);
		
		//vamos a recoger una copia del conjunto1 trasladado a una lista List con nuestro m�todo aList
		lista = conjunto1.aLista();
		System.out.println(lista);
		
		conjunto3 = ConjuntoS.crearConjuntoApartirDe(conjunto1);
		System.out.println(conjunto3);
	}

}
