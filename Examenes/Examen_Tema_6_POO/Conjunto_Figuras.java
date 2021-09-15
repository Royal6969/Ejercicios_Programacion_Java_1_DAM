package pack_Figura;

import java.util.Arrays;

public class Conjunto_Figuras{
	
	//ATRIBUTOS
	Figura[] conjuntoFiguras = new Figura[10];

	//CONSTRUCTOR
	public Conjunto_Figuras(Figura[] conjuntoFiguras) {
		super();
		this.conjuntoFiguras = conjuntoFiguras;
	}

	//CONSTRUCTOR vacio
	public Conjunto_Figuras() {
		super();
	}

	//GETTER Y SETTER
	public Figura[] getConjuntoFiguras() {
		return conjuntoFiguras;
	}

	public void setConjuntoFiguras(Figura[] conjuntoFiguras) {
		this.conjuntoFiguras = conjuntoFiguras;
	}

	//To String
	@Override
	public String toString() { //esta vez se queda así tal cual
		return "Conjunto_Figuras [conjuntoFiguras=" + Arrays.toString(conjuntoFiguras) + "]";
	}
	
	//METODOS
	
	public void listadoCompleto() {
		
		for(int i=0; i<Figura.getnFigura(); i++) {
			System.out.println(this.conjuntoFiguras[i].imprimirCaracteristicas());
		}
	}
	
	public void listadoAgrupado() {
		
		int contador1 = 0, contador2 = 0;
		
		for(int i=0; i<Figura.getnFigura(); i++) {
			
			if(this.conjuntoFiguras[i] instanceof Circulo) {
				System.out.println(this.conjuntoFiguras[i].imprimirCaracteristicas());
				contador1++;
			}
		}
		System.out.println(contador1);
		
		for(int i=0; i<Figura.getnFigura(); i++) {
			
			if(this.conjuntoFiguras[i] instanceof Triangulo) {
				System.out.println(this.conjuntoFiguras[i].imprimirCaracteristicas());
				contador2++;
			}
		}
		System.out.println(contador2);
	}
	
	public void cambiarColorCirculos(String color) {
		
		for(int i=0; i<Figura.getnFigura(); i++) {
			
			if(this.conjuntoFiguras[i] instanceof Circulo) {
				this.conjuntoFiguras[i].cambiarColor(color);
			}
		}
	}

}
