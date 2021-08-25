package Cubos_2;

import java.util.Arrays;
import java.util.Scanner;

public class ConjuntoCubos {

	//ATRIBUTOS// //estos atributos es lo que antes en Prueba_Cubo2 eran las variables declaradas, las cuales se han pasado aqui
	private Cubo2[] conjuntoCubos = new Cubo2[10];
	private int posicion = 0;  //para saber la posicion del Array

	//CONSTRUCTOR//
	public ConjuntoCubos(Cubo2[] conjuntoCubos, int posicion) {
		super();
		this.conjuntoCubos = conjuntoCubos;
		this.posicion = posicion; 
	}

	//CONSTRUCTOR vacio//
	public ConjuntoCubos() {
		super();
	}

	//GETTER Y SETTER//
	public Cubo2[] getConjuntoCubos() {
		return conjuntoCubos;
	}

	public void setConjuntoCubos(Cubo2[] conjuntoCubos) {
		this.conjuntoCubos = conjuntoCubos;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

/*
	@Override
	public String toString() {
		return "ConjuntoCubos [conjuntoCubos=" + Arrays.toString(conjuntoCubos) + ", posicion=" + posicion + "]";
	}
*/
	
	//METODOS// 
	
	public void darAlta() { //Ya no uso el Static porque usaré las variables de mi misma clase
		
		Scanner s=new Scanner(System.in);
		
		int capacidad;
		String color;
		String material;
		boolean asa;
		String asas; //aqui se añade este para más adelante
		int cantidad;
		
		if(this.posicion<=9) {
			
			do{
				System.out.println("Dime su capacidad");
				capacidad = s.nextInt();
				
				System.out.println("Dime su color");
				color = s.next();
				
				System.out.println("Dime su material");
				material = s.next();
				
				System.out.println("¿Tiene asa?(si o no)");
				asas = s.next();
				
				System.out.println("Dime cuanto liquido tiene dentro");
				cantidad = s.nextInt();
				
				if(cantidad>capacidad) {
					
					System.out.println("El cubo no podria tener tanto liquido, cambie su capacidad o su cantidad");
					System.out.println();
				}
				else { //aqui viene el String de asas que creamos antes
					
					if(asas.equalsIgnoreCase("si")) { //ignorar mayus y minus
						asa=true;
					}
					else {
						asa=false;
					}
					
					Cubo2 aux = new Cubo2(capacidad, color, material, asa, cantidad); //se crea un objeto cubo
					
					conjuntoCubos[this.posicion] = aux;
					this.posicion++;
					System.out.println();
				}
				
		}while(cantidad>capacidad); //no se admite que rebose
			
	}
		
	else {//Si la posicion ya es mayor que 9...
		
		System.out.println("No quedan huecos en el array. No se pueden crear más cubos");
		System.out.println();
	}

}

	public void pasarAgua() {
		
		Scanner s=new Scanner(System.in);
	
		int num;
		int num1;
		int cantidad;
		
		System.out.println("Dime la posicion del cubo 1");
		num=s.nextInt();
		
		System.out.println("Dime la posicion del cubo 2");
		num1=s.nextInt();
		
		System.out.println("Dime la cantidad a pasar");
		cantidad=s.nextInt();
		
		if(num<this.posicion && num1<this.posicion && num>=0 && num1>=0) { //validar que el cubo existe en el Array
			conjuntoCubos[num].pasarAgua2(conjuntoCubos[num1], cantidad); //se llama a su vez al método del Cubo2
		
		}else {
			System.out.println("No se puede hacer, intente de nuevo");
			System.out.println();
	}
}

	public void listar() {
		
		for(int i=0; i<this.posicion; i++) {
			System.out.println("El cubo en la posicion "+i+" "+conjuntoCubos[i]);
		}
		System.out.println();
}

	public void listarColor() {
		
		Scanner s = new Scanner(System.in);
	
		String color;
	
		System.out.println("Dime un color");
		color = s.next();
		
		for(int i=0; i<this.posicion; i++) {
			if(conjuntoCubos[i].getColor().equalsIgnoreCase(color)) {
				System.out.println(conjuntoCubos[i]);
			}
		}
		System.out.println();
}

	public void listarLleno() {
		
		for(int i=0; i<this.posicion; i++) {
			if(conjuntoCubos[i].getCantidad()==conjuntoCubos[i].getCapacidad()) { 
				System.out.println(conjuntoCubos[i]);
			}
		}
		System.out.println();
}

	public void cambiarCantidad() {
	
		Scanner s = new Scanner(System.in);
	
		int num;
		int cantidad;
	
		System.out.println("Dime que cubo quieres cambiar");
		num=s.nextInt();
	
		System.out.println("Dime la cantidad nueva");
		cantidad=s.nextInt();
	
		if(num<this.posicion && num>=0) { //validar que está dentro del Array
			if(conjuntoCubos[num].getCapacidad()>=cantidad) {
				conjuntoCubos[num].setCantidad(cantidad);
		
			}else {
				System.out.println("Esta mal la cantidad, no puede rebosar");
			}
		}
		else {
			System.out.println("Esta mal la posicion, el cubo no se encuentra en el Array");
		}
		
}
	
	public void sumarCantidades() {
		
		int suma = 0;
		
		for(int i=0; i<this.posicion; i++) { //recorrer con la posicion, el vector puede tener valores nulos !!
			suma+=conjuntoCubos[i].getCantidad();
		}
		
		System.out.println("La suma de todas las cantidades es: "+suma);
	}

	
	
	
}
