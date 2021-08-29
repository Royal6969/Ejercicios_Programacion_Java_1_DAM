package Ej_3_Excepcion_MenuArrays;

import java.util.Scanner;

import Ej_2_ExcepcionDeRango.ExcepcionDeRango;

public class Prueba_Excepcion_MenuArray {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nombres = new String[7]; 
		int contador = 0;
		
		for(int i=0; i<nombres.length; i++) {
			darAltaNombres(contador, nombres);
			contador++;
		}
		
	}
	public static void darAltaNombres(int contador, String[]nombres) {
		
		String nombre;
		System.out.println("Escriba un nombre");
		nombre = sc.next();
		
		try {
			if(nombre.length()>20) {
				throw new Excepcion1_TooLargeNameException();
			
			}else if(contador>6){
				throw new Excepcion2_TamExcedidoException();
			
			}else {
				nombres[contador]=nombre;
			}
		}catch(Excepcion1_TooLargeNameException e){
			System.out.println(e.toString());
		}catch(Excepcion2_TamExcedidoException e) {
			System.out.println(e.toString());
		}
	
	}

}
