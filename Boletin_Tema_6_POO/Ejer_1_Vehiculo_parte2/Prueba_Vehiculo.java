package Ejer_1_Vehiculo_parte2;

import java.util.Scanner;

public class Prueba_Vehiculo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int opc;
		int cont;
		int num;
		Conjunto_Vehiculos conjvehiculo = new Conjunto_Vehiculos();
		
		do {
			mostrarmenu();
			opc=s.nextInt();
			switch(opc) {
			case 1:
				conjvehiculo.getConjvehiculo()[conjvehiculo.getCont()]=new Bicicleta();
				conjvehiculo.setCont(conjvehiculo.getCont()+1);
				break;
				
			case 2:
				System.out.println("Dime la posicion de la bici");
				num=s.nextInt();
				
				System.out.println("Dime cuanto has recorrido");
				cont=s.nextInt();
				
				
				break;
				
			case 3:
				System.out.println("Dime cuanto has recorrido");
				cont=s.nextInt();
				((Bicicleta) conjvehiculo[0]).caballito();
				break;
				
			case 4:
				
				break;
				
			case 5:
				System.out.println("Dime cuanto has recorrido");
				cont=s.nextInt();
				((Coche) conjvehiculo[1]).andar(cont);
				break;
				
			case 6:
				((Coche) conjvehiculo[1]).quemarueda();
				break;
				
			case 7:
				System.out.println(((Bicicleta) conjvehiculo[0]).getKilometrosRecorridos());
				break;
				
			case 8:
				System.out.println(((Coche) conjvehiculo[1]).getKilometrosRecorridos());
				break;
				
			case 9:
				System.out.println(Vehiculo.getKilometrosTotales());
				break;
				
			case 10:
				System.out.println(Vehiculo.getVehiculosCreados());
				break;
				
			case 0:
				System.out.println("Adios");
				break;
				
			default:
				System.out.println("Lo siento, esa opcion no existe");
				System.out.println();
				break;
			}
		}while(opc!=0);
	}
	
	public static void mostrarmenu() {
		System.out.println("1) Crear bici");
		System.out.println("2) Bici anda");
		System.out.println("3) Bici caballito");
		System.out.println("4) Crear coche");
		System.out.println("5) Coche anda");
		System.out.println("6) Coche quema rueda");
		System.out.println("7) Bici Kilometros");
		System.out.println("8) Coche kilometros");
		System.out.println("9) Kilometros totales");
		System.out.println("10) Nº de Vehiculos creados");
		System.out.println("0) Salir");
	}

}
