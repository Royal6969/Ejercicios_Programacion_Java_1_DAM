package Ejer_6_Socio;

import java.util.Arrays;

import Ejer_9_Empleados.Contable;
import Ejer_9_Empleados.Programador;

public class Conjunto_Socios {
	
	//ATRIBUTO
	private Socio[] conjuntoSocios = new Socio[10];

	//CONSTRUCTOR vacio
	public Conjunto_Socios() {
		super();
	}

	//CONSTRUCTOR lleno
	public Conjunto_Socios(Socio[] conjuntoSocios) {
		super();
		this.conjuntoSocios = conjuntoSocios;
	}

	//GETTER Y SETTER
	public Socio[] getConjuntoSocios() {
		return conjuntoSocios;
	}

	public void setConjuntoSocios(Socio[] conjuntoSocios) {
		this.conjuntoSocios = conjuntoSocios;
	}

	//TO String
	@Override
	public String toString() {
		return "Conjunto_Socios [conjuntoSocios=" + Arrays.toString(conjuntoSocios) + "]";
	}
	
	//METODOS
	
	public void listadoCompleto() {
		for(int i=0; i<Socio.getnSocios(); i++) {
			System.out.println(this.getConjuntoSocios()[i]);
		}
	}
	
	public void listadoNombre() {
		//METODO BURBUJA
		for(int i=0; i<Socio.getnSocios()-1; i++) {
			for(int j=i+1; j<Socio.getnSocios(); j++) { //for tipicos del burbuja
				
				if((this.getConjuntoSocios()[i]).getNombre().compareToIgnoreCase(this.getConjuntoSocios()[j].getNombre())>0) {
					Socio socioAUX = (this.getConjuntoSocios()[i]);
					this.getConjuntoSocios()[i] = this.getConjuntoSocios()[j];
					this.getConjuntoSocios()[j] = socioAUX;
				}//este if es para ordenadar y por tanto, cambiar de posicion
			}
		}
		this.listadoCompleto();
	}
	
	public void listadoEdades() {
		
		//METODO BURBUJA
				for(int i=0; i<Socio.getnSocios()-1; i++) {
					for(int j=i+1; j<Socio.getnSocios(); j++) { //for tipicos del burbuja
						
						if(this.getConjuntoSocios()[j].getCumpleaños().getAño()<this.getConjuntoSocios()[i].getCumpleaños().getAño()) {
							Socio socioAUX = this.getConjuntoSocios()[i];
							this.getConjuntoSocios()[i] = this.getConjuntoSocios()[j];
							this.getConjuntoSocios()[j] = socioAUX;
						
						}else if(this.getConjuntoSocios()[j].getCumpleaños().getMes()<this.getConjuntoSocios()[i].getCumpleaños().getMes()) {
							Socio socioAUX = this.getConjuntoSocios()[i];
							this.getConjuntoSocios()[i] = this.getConjuntoSocios()[j];
							this.getConjuntoSocios()[j] = socioAUX;
						
						}else if(this.getConjuntoSocios()[j].getCumpleaños().getDia()<this.getConjuntoSocios()[i].getCumpleaños().getDia()) {
							Socio socioAUX = this.getConjuntoSocios()[i];
							this.getConjuntoSocios()[i] = this.getConjuntoSocios()[j];
							this.getConjuntoSocios()[j] = socioAUX;
						}
					}
				}
				this.listadoCompleto();
	}
	

}
