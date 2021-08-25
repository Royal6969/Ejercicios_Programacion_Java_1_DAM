package Ejer_7_MatrizDinamica;

import java.util.ArrayList;
import java.util.Collections;

public class Lista_Numeros {

		//ATRIBUTO
		//ArrayList<Elemento> listaElemento=new ArrayList<Elemento> ();
		ArrayList<Numeros> objeto = new ArrayList<Numeros>();

		//CONSTRUCTOR
		public Lista_Numeros(ArrayList<Numeros> objeto) {
			super();
			this.objeto = objeto;
		}
		
		//Constructor vacio
		public Lista_Numeros() {
			super();
		}


		//GETTER Y SETTER
		public ArrayList<Numeros> getObjeto() {
			return objeto;
		}

		public void setObjeto(ArrayList<Numeros> objeto) {
			this.objeto = objeto;
		}

		//To String
		@Override
		public String toString() {
			return "Lista_Numeros [objeto=" + objeto + "]";
		}
		
		//METODOS
		public void ordenarNumeros() {
			
			Collections.sort(this.getObjeto());
		}
}
