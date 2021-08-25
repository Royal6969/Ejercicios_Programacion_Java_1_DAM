package Ejer_1_AccesoAreaRestringida;

import java.util.HashMap;
import java.util.Scanner;

/*
 * 1. Implementa el control de acceso al área restringida de un programa. 
 * Se debe pedir un nombre de usuario y una contraseña. 
 * Si el usuario introduce los datos correctamente, el programa dirá “Ha accedido al área restringida”. 
 * El usuario tendrá un máximo de 3 oportunidades. 
 * Si se agotan las oportunidades el programa dirá “Lo siento, no tiene acceso al área restringida”. 
 * Los nombres de usuario con sus correspondientes contraseñas deben estar almacenados 
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
		int contraseña;
		int fallos = 0;
		boolean salir = false;
		
		System.out.println("Introduzca usuario");
		usuario = sc.next();
		
		if(registro.containsKey(usuario)) {
			
			do {
				
			System.out.println("Introduzca contraseña");
			contraseña = sc.nextInt();
			
			if(registro.get(usuario) == contraseña) {
				System.out.println("Ha accedido al área restringida");
				salir = true;
			
			}else {
				fallos ++;
				System.out.println("Contraseña incorrecta");
			}
			
			}while(fallos<3 && !salir);
		
		}else {
			System.out.println("Este usuario no se encuentra registrado");
		}
	}

}
