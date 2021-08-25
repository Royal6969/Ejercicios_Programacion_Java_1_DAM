package Ejer_9_Empleados;

import java.util.Arrays;

public class Conjunto_Empleado {

	private Empleado[] conjuntoEmpleados = new Empleado[10]; //normal general 10 maximo

	//CONSTRUCTOR vacio
	public Conjunto_Empleado() {
		super();
	}
	
	//CONSTRUCTOR lleno
	public Conjunto_Empleado(Empleado[] conjuntoEmpleados) {
		super();
		this.conjuntoEmpleados = conjuntoEmpleados;
	}

	//GETTER Y SETTER
	public Empleado[] getConjuntoEmpleados() {
		return conjuntoEmpleados;
	}

	public void setConjuntoEmpleados(Empleado[] conjuntoEmpleados) {
		this.conjuntoEmpleados = conjuntoEmpleados;
	}

	//TO String
	@Override
	public String toString() {
		return "Conjunto_Empleado [conjuntoEmpleados=" + Arrays.toString(conjuntoEmpleados) + "]";
	}
	
	//METODOS
	public void listadoCompleto() { //no es estatico, no estoy en el main
		
		for(int i=0; i<Empleado.getnCedula(); i++) {
			System.out.println(this.getConjuntoEmpleados()[i]);
		}
	}
	
	public void listadoEdades() {
		
		for(int i=0; i<Empleado.getnCedula(); i++) {
			System.out.print(this.getConjuntoEmpleados()[i]);
			
			this.conjuntoEmpleados[i].mostrarCategoriaPorEdad();
		}
	}
	
	public void listadoLenguajes() {
		
		int contador = 0;
		Conjunto_Empleado conjuntoAUX = new Conjunto_Empleado();
		
		for(int i=0; i<Empleado.getnCedula(); i++) {
		
			if(this.getConjuntoEmpleados()[i] instanceof Programador) { //instanceof diferencia entre las clases hijas que se tienen
				conjuntoAUX.getConjuntoEmpleados()[contador] = this.getConjuntoEmpleados()[i];
				contador++;
			}
		}
		//Metodo burbuja
		for(int i=0; i<contador-1; i++) {
			for(int j=i+1; j<contador; j++) { //for tipicos del burbuja
				
				if(((Programador)conjuntoAUX.getConjuntoEmpleados()[i]).getLenguaje().compareToIgnoreCase(((Programador)conjuntoAUX.getConjuntoEmpleados()[j]).getLenguaje())>0) {
					Programador prograAUX = ((Programador)conjuntoAUX.getConjuntoEmpleados()[i]);
					conjuntoAUX.getConjuntoEmpleados()[i] = conjuntoAUX.getConjuntoEmpleados()[j];
					conjuntoAUX.getConjuntoEmpleados()[j] = prograAUX;
				}//este if es para ordenadar y por tanto, cambiar de posicion
			}
		}
		for(int i=0; i<contador; i++) {
			System.out.println(conjuntoAUX.getConjuntoEmpleados()[i]); //para mostrar
		}
	}
	
	public void listadoAsientosDescendente() {
		
		int contador = 0;
		Conjunto_Empleado conjuntoAUX = new Conjunto_Empleado();
		
		for(int i=0; i<Empleado.getnCedula(); i++) {
		
			if(this.getConjuntoEmpleados()[i] instanceof Contable) { //instanceof diferencia entre las clases hijas que se tienen
				conjuntoAUX.getConjuntoEmpleados()[contador] = this.getConjuntoEmpleados()[i];
				contador++;
			}
		}
		//METODO BURBUJA
		for(int i=0; i<contador-1; i++) {
			for(int j=i+1; j<contador; j++) { //for tipicos del burbuja
				
				if(((Contable)conjuntoAUX.getConjuntoEmpleados()[j]).getAsientoHora()>((Contable)conjuntoAUX.getConjuntoEmpleados()[i]).getAsientoHora()) {
					Contable contaAUX = ((Contable)conjuntoAUX.getConjuntoEmpleados()[i]);
					conjuntoAUX.getConjuntoEmpleados()[i] = conjuntoAUX.getConjuntoEmpleados()[j];
					conjuntoAUX.getConjuntoEmpleados()[j] = contaAUX;
				}//este if es para ordenadar y por tanto, cambiar de posicion
			}
		}
		for(int i=0; i<contador; i++) {
			System.out.println(conjuntoAUX.getConjuntoEmpleados()[i]); //para mostrar
		}
	}

}
