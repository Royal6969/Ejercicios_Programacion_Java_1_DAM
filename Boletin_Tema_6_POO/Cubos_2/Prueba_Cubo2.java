package Cubos_2;

import java.util.Scanner;

public class Prueba_Cubo2 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		//Esto fue el 1º Prueba Cubo del otro paquete
		
/*		Cubo micubo=new Cubo(8, 0);
		Cubo tucubo=new Cubo(10, "Rojo", "Plastico", true, 0);
		
		System.out.println("Cubo 1");
		System.out.println(micubo);
		micubo.setCantidad(7);
		System.out.println("Cubo 1");
		System.out.println(micubo);
		
		micubo.pasaragua(tucubo, 5);
		System.out.println("Pasamos 5 litros al cubo 2");
		System.out.println("Cubo 1");
		System.out.println(micubo);
		System.out.println("Cubo 2");
		System.out.println(tucubo);
*/
		//Aqui empieza realmente Prueba_Cubo2
		
		int opcion; //para el switch del menu
		
		ConjuntoCubos vectorCubos = new ConjuntoCubos();
		
		do {
			mostrarMenu();
			opcion = s.nextInt();
			
			switch(opcion) {
			
			case 1:
				vectorCubos.darAlta();
				break;
				
			case 2:
				vectorCubos.pasarAgua();
				break;
				
			case 3:
				vectorCubos.listar();
				break;
				
			case 4:
				vectorCubos.listarColor();
				break;
				
			case 5:
				vectorCubos.listarLleno();
				break;
				
			case 6:
				vectorCubos.cambiarCantidad();
				break;
				
			case 7:
				//vectorCubos.sumarCantidades();
				int opcion2;
				System.out.println("Dime la opción para sumar las cantidades de los cubos");
				opcion2 = s.nextInt();
				
				switch(opcion2) {
					
				case 1:
					System.out.println(Cubo2.getSumarCantidades());
					break;
					
				case 2:
					vectorCubos.sumarCantidades();
					break;
				}
				break;
				
			case 0:
				System.out.println("Adios");
				break;
				
			default:
				break;
			}
		}while(opcion!=0);
	}


	public static void mostrarMenu() {
		
		System.out.println("1) Dar de alta un cubo");
		System.out.println("2) Pasar liquido de un cubo a otro");
		System.out.println("3) Listado completo");
		System.out.println("4) Listado por color");
		System.out.println("5) Listado de los cubos llenos");
		System.out.println("6) Modificar cantidad");
		System.out.println("7) Sumar las cantidades de todos los cubos");
		System.out.println("7.1. Sumar Cubos forma Cubo2");
		System.out.println("7.2. Sumar Cubos forma de conjuntoCubos");
		System.out.println("0) Salir");
}


}
