package Ejer_8_Publicacion;

import java.util.Arrays;

public class Conjunto_Publicacion { //no es hija de Publicación

	//ATRIBUTOS
	Publicacion[] conjunto_publicacion = new Publicacion[10]; //PREGUNTAR EN EL EXAMEN LA LONGITUS DEL ARRAY

	//CONSTRUCTOR Vació
	public Conjunto_Publicacion() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Conjunto_Publicacion(Publicacion[] conjunto_publicacion) {
		super();
		this.conjunto_publicacion = conjunto_publicacion;
	}

	//GETTER Y SETTER
	public Publicacion[] getConjunto_publicacion() {
		return conjunto_publicacion;
	}

	public void setConjunto_publicacion(Publicacion[] conjunto_publicacion) {
		this.conjunto_publicacion = conjunto_publicacion;
	}

	//To String
	@Override
	public String toString() {
		return "Conjunto_Publicacion [conjunto_publicacion=" + Arrays.toString(conjunto_publicacion) + "]";
	}
	//MÉTODOS
	public void listadoCompleto() { //no se les pasa nada como parámetro en esta clase
		for(int i=0; i<Publicacion.getNcod(); i++) { //smp vamos a recorrer los numeros unicos
			System.out.println(this.getConjunto_publicacion()[i]);
		}
		System.out.println();
	}
	public void listadoRevistas() {
		int numRevs = 0;
		
		for(int i=0; i<Publicacion.getNcod(); i++) {
			if(this.getConjunto_publicacion()[i] instanceof Revista) {
				System.out.println(this.getConjunto_publicacion()[i]);
				numRevs++;
			}
		}
		System.out.println("Se han encontrado "+numRevs+" revistas");
		System.out.println();
	}
	public void listadoLibrosPrestados() {
		Conjunto_Publicacion aux = new Conjunto_Publicacion();
		int pos = 0;
		
		for(int i=0; i<Publicacion.getNcod(); i++) {
			if(this.getConjunto_publicacion()[i] instanceof Libro) {
				aux.getConjunto_publicacion()[pos] = this.getConjunto_publicacion()[i];
				pos++;
			}
		}
		//metodo burbuja
		for(int i=0; i<(pos-1); i++) {
			for(int j=i+1; j<pos; j++) {
				if(((Libro)aux.getConjunto_publicacion()[i]).isPrestado() != ((Libro)aux.getConjunto_publicacion()[j]).isPrestado()) {
					Libro L1 = ((Libro)aux.getConjunto_publicacion()[i]);
					aux.getConjunto_publicacion()[i] = aux.getConjunto_publicacion()[j];
					aux.getConjunto_publicacion()[j] = L1;
				}
			}
		}
		for(int i=0; i<pos; i++) {
			System.out.println(aux.getConjunto_publicacion()[i]);
		}
		System.out.println();
	}
	
}
