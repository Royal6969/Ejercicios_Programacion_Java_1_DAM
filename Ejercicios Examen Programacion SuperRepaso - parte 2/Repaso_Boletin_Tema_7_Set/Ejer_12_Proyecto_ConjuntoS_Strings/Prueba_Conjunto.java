package Ejer_12_Proyecto_ConjuntoS_Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
		//y por último un par de variables int para recoger los resultados de algunos métodos
		int tamaño, numComunes;
		
		//añadimos 3 palabras al conjunto1 con nuestro metodo de añadir
		conjunto1.añadir_v2();
		conjunto1.añadir_v2();
		conjunto1.añadir_v2();
		
		//recogemos el tamaño del conjunto1 
		tamaño = conjunto1.tamaño();
		System.out.println(tamaño);
		
		//comprobamos si el conjunto1 está vacío
		if(conjunto1.esVacio() == true) {
			System.out.println("El conjunto1 está vacío");
		}else {
			System.out.println("El conjunto1 NO está vacío");
		}
		
		//ahora vamos a añadir palabras al conjunto2
		conjunto2.añadir_v2();
		conjunto2.añadir_v2();
		conjunto2.añadir_v2();
		
		//vamos a ver el número de cadenas comunes entre el conjunto1 y el conjunto2
		numComunes = conjunto1.comunes(conjunto2);
		System.out.println(numComunes);
		
		//vamos a recoger una copia del conjunto1 trasladado a una lista List con nuestro método aList
		lista = conjunto1.aLista();
		System.out.println(lista);
		
		conjunto3 = ConjuntoS.crearConjuntoApartirDe(conjunto1);
		System.out.println(conjunto3);
	}

}
