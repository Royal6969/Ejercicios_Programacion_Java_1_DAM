package Ejer_1_Vehiculo_parte1;

import java.util.Scanner;


public class Prueba_Vehiculo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int opc;
		int cont;
		Bicicleta bici=new Bicicleta();
		Coche coche=new Coche();
		
		do {
			mostrarmenu();
			opc=s.nextInt();
			switch(opc) {
			case 1:
				System.out.println("Dime cuanto has recorrido");
				cont=s.nextInt();
				bici.andar(cont);
				break;
			case 2:
				System.out.println("Dime cuanto has recorrido");
				cont=s.nextInt();
				bici.caballito();
				break;
			case 3:
				System.out.println("Dime cuanto has recorrido");
				cont=s.nextInt();
				coche.andar(cont);
				break;
			case 4:
				coche.quemarueda();
				break;
			case 5:
				System.out.println(bici.getKilometrosRecorridos());
				break;
			case 6:
				System.out.println(coche.getKilometrosRecorridos());
				break;
			case 7:
				System.out.println(Vehiculo.getKilometrosTotales());
				break;
			case 8:
				System.out.println(Vehiculo.getVehiculosCreados());
				break;
			case 9:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Lo siento, esa opcion no existe");
				System.out.println();
				break;
			}
		}while(opc!=9);
	}
	
	public static void mostrarmenu() {
		System.out.println("1) Bici anda");
		System.out.println("2) Bici caballito");
		System.out.println("3) Coche anda");
		System.out.println("4) Coche quema rueda");
		System.out.println("5) Bici Kilometros");
		System.out.println("6) Coche kilometros");
		System.out.println("7) Kilometros totales");
		System.out.println("8) Nº de Vehiculos creados");
		System.out.println("9) Salir");
	}
}
