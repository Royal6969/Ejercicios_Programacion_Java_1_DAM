package Ejer_1_Acceso_UsuarioContrase�a;

import java.util.HashMap;
import java.util.Scanner;

/*
 * 1. Implementa el control de acceso al �rea restringida de un programa. 
 * Se debe pedir un nombre de usuario y una contrase�a. 
 * Si el usuario introduce los datos correctamente, el programa dir� �Ha accedido al �rea restringida�. 
 * El usuario tendr� un m�ximo de 3 oportunidades. 
 * Si se agotan las oportunidades el programa dir� �Lo siento, no tiene acceso al �rea restringida�. 
 * Los nombres de usuario con sus correspondientes contrase�as 
 * deben estar previamente almacenados en una estructura de la clase HashMap.
 */
public class Prueba_Ejer_1 {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creamos el HashMap ... normalmente tiene una estructura de datos tipo <String, Integer>
		//en este caso, ser� usado para a modo de "<Usuario, Contrase�a>"
		HashMap<String, Integer> acceso = new HashMap<String, Integer>();
		
		acceso.put("sergio", 123); //con put podemos meterle datos en ambos campos
		acceso.put("carlos", 456);
		acceso.put("chema", 789);
		acceso.put("fernando", 101112);
		acceso.put("adan", 131415);
		
		//creamos un par de variables para el usuario/contrase�a (los mismo tipos de datos que definimos en el hashMap) + el contador de fallos
		String usuario;
		int contrase�a;
		int fallos = 3;
		boolean salir = false; //tmb necesit�bamos un boolean para salir, ya que si esto va por fallos... adem�s es un DO/WHILE como una casa de grande y normalmente se usan estos booleans
		
		System.out.println("Introduzca el usuario"); //comenzaremos pidiendo la ocntrase�a como en cualquier login normal
		usuario = sc.next();
		
		if(acceso.containsKey(usuario)) { //comprobamos que el usuario exista, y si est�, continuamos con la contrase�a
			do {
				System.out.println("Introduzca la contrase�a");
				contrase�a = sc.nextInt();
				
				if(acceso.get(usuario) == contrase�a) { //si el objectKey de usuario (la contrase�a) coincide con la contrase�a introducida...
					System.out.println("Ha accedido al �rea restringida");
					salir = true;
				
				}else {
					System.out.println("Lo siento, no tiene acceso al �rea restringida");
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
