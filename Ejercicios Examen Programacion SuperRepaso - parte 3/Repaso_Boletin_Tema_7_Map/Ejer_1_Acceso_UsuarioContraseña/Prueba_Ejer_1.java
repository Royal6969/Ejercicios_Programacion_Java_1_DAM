package Ejer_1_Acceso_UsuarioContraseña;

import java.util.HashMap;
import java.util.Scanner;

/*
 * 1. Implementa el control de acceso al área restringida de un programa. 
 * Se debe pedir un nombre de usuario y una contraseña. 
 * Si el usuario introduce los datos correctamente, el programa dirá “Ha accedido al área restringida”. 
 * El usuario tendrá un máximo de 3 oportunidades. 
 * Si se agotan las oportunidades el programa dirá “Lo siento, no tiene acceso al área restringida”. 
 * Los nombres de usuario con sus correspondientes contraseñas 
 * deben estar previamente almacenados en una estructura de la clase HashMap.
 */
public class Prueba_Ejer_1 {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creamos el HashMap ... normalmente tiene una estructura de datos tipo <String, Integer>
		//en este caso, será usado para a modo de "<Usuario, Contraseña>"
		HashMap<String, Integer> acceso = new HashMap<String, Integer>();
		
		acceso.put("sergio", 123); //con put podemos meterle datos en ambos campos
		acceso.put("carlos", 456);
		acceso.put("chema", 789);
		acceso.put("fernando", 101112);
		acceso.put("adan", 131415);
		
		//creamos un par de variables para el usuario/contraseña (los mismo tipos de datos que definimos en el hashMap) + el contador de fallos
		String usuario;
		int contraseña;
		int fallos = 3;
		boolean salir = false; //tmb necesitábamos un boolean para salir, ya que si esto va por fallos... además es un DO/WHILE como una casa de grande y normalmente se usan estos booleans
		
		System.out.println("Introduzca el usuario"); //comenzaremos pidiendo la ocntraseña como en cualquier login normal
		usuario = sc.next();
		
		if(acceso.containsKey(usuario)) { //comprobamos que el usuario exista, y si está, continuamos con la contraseña
			do {
				System.out.println("Introduzca la contraseña");
				contraseña = sc.nextInt();
				
				if(acceso.get(usuario) == contraseña) { //si el objectKey de usuario (la contraseña) coincide con la contraseña introducida...
					System.out.println("Ha accedido al área restringida");
					salir = true;
				
				}else {
					System.out.println("Lo siento, no tiene acceso al área restringida");
					fallos --;
					if(fallos==0) {
						System.out.println("Ha superado los 3 intentos, terminal bloqueado");
					}
				}
			}while(fallos>0 && salir==false);
		
		}else {
			System.out.println("No existe este usuario");
		}
	}

}
