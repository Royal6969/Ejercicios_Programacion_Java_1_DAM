package Ejer_1_AleatoriosSumaMediaMaxMin;

import java.util.ArrayList;

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
	public int sumarNumeros() {
		int suma = 0;
		
		for(int i=0; i<this.getObjeto().size(); i++) {
			suma += this.getObjeto().get(i).getNum();
		}
		return suma;
	}
	public double mediaNumeros() {
		int suma = 0;
		
		for(int i=0; i<this.getObjeto().size(); i++) {
			suma += this.getObjeto().get(i).getNum();
		}
		suma /= this.getObjeto().size();
		
		return suma;
	}
	public void rangoNumeros() {
		int min = 999999;
		int max = -999999;
		
		for(int i=0; i<this.getObjeto().size(); i++) {
			if(this.getObjeto().get(i).getNum()<min) {
				min = this.getObjeto().get(i).getNum();
			}
			if(this.getObjeto().get(i).getNum()>max) {
				max = this.getObjeto().get(i).getNum();
			}
		}
		System.out.println("El número mínimo del ArrayList es: "+min);
		System.out.println("El número máximo del ArrayList es: "+max);
	}
}
