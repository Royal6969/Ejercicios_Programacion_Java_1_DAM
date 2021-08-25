package Ejer_1_AccesoAreaRestringida;

import java.util.HashMap;
import java.util.Scanner;

/*
 * 1. Implementa el control de acceso al �rea restringida de un programa. 
 * Se debe pedir un nombre de usuario y una contrase�a. 
 * Si el usuario introduce los datos correctamente, el programa dir� �Ha accedido al �rea restringida�. 
 * El usuario tendr� un m�ximo de 3 oportunidades. 
 * Si se agotan las oportunidades el programa dir� �Lo siento, no tiene acceso al �rea restringida�. 
 * Los nombres de usuario con sus correspondientes contrase�as deben estar almacenados 
 * en una estructura de la clase HashMap.
 */

public class Prueba {

static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> registro = new HashMap<String, Integer>(); 
		
		registro.put("sergio", 12345);
		registro.put("fernando", 6789);
		registro.put("carlos", 9876);
		registro.put("adan", 4321);
		registro.put("chema", 1111);
		
		String usuario;
		int contrase�a;
		int fallos = 0;
		boolean salir = false;
		
		System.out.println("Introduzca usuario");
		usuario = sc.next();
		
		if(registro.containsKey(usuario)) {
			
			do {
				
			System.out.println("Introduzca contrase�a");
			contrase�a = sc.nextInt();
			
			if(registro.get(usuario) == contrase�a) {
				System.out.println("Ha accedido al �rea restringida");
				salir = true;
			
			}else {
				fallos ++;
				System.out.println("Contrase�a incorrecta");
			}
			
			}while(fallos<3 && !salir);
		
		}else {
			System.out.println("Este usuario no se encuentra registrado");
		}
	}

}
