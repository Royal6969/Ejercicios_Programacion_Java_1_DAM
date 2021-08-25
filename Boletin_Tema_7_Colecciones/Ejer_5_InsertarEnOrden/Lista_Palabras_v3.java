package Ejer_5_InsertarEnOrden;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 5. Construye un m�todo insertaEnOrden, que a�ade a una lista ordenada pasada como par�metro, 
 * un nuevo elemento, que tambi�n se pasa como par�metro. 
 * De forma que la lista siga estando ordenada.
 *
 * 4. Construye un m�todo calculaInversa que devuelva invertida una lista pasada como par�metro. 
 * A�ade esta opci�n al ejercicio 3.
 * 
 * 3. Realiza un programa equivalente al ejercicio 1 pero en esta ocasi�n, 
 * el programa debe manipular palabras en lugar de n�meros. 
 * A�adir la opci�n de ordenar
 *
 * Ejer 1:
 * Realiza un programa que introduzca 20 valores aleatorios (entre 0 y 100) en un ArrayList 
 * y que luego calcule la suma, la media, el m�ximo y el m�nimo de esos n�meros. 
 */

public class Lista_Palabras_v3 {

	//ATRIBUTO
	//ArrayList<Elemento> listaElemento=new ArrayList<Elemento> ();
	ArrayList<Palabras_v3> objeto = new ArrayList<Palabras_v3>();

	//CONSTRUCTOR lleno
	public Lista_Palabras_v3(ArrayList<Palabras_v3> objeto) {
		super();
		this.objeto = objeto;
	}

	//CONSTRUCTOR vac�o
	public Lista_Palabras_v3() {
		super();
	}

	//GETTER Y SETTER
	public ArrayList<Palabras_v3> getObjeto() {
		return objeto;
	}

	public void setObjeto(ArrayList<Palabras_v3> objeto) {
		this.objeto = objeto;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Palabras [objeto=" + objeto + "]";
	}
	
	//M�TODOS
	public void ordenarPalabras() {
		Collections.sort(this.getObjeto());
	}
	public void calculaInversa() {
		
		//los datos del Array pero en orden inverso
		System.out.println("El Array List invertido es:");
		for(int i=this.getObjeto().size()-1; i>=0; i--) {
			System.out.println(this.getObjeto().get(i));
		}
	}
	public void insertarEnOrden(String nombre) {
		
		boolean salir = false;
		
		for(int i=0; i<this.getObjeto().size() && salir==false; i++) {
			
			if(nombre.compareToIgnoreCase(this.getObjeto().get(i).getPalabra()) < 0) {
				this.getObjeto().add(i, new Palabras_v3(nombre));
				
				salir = true;
			}
		}
		
		for(int i=0; i<this.getObjeto().size(); i++) {
			System.out.print(this.getObjeto().get(i));
		}
	}
}
