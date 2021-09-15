package Ejer_1_Vehiculo;

import java.util.Scanner;

public class Prueba_Vehiculo {

static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bicicleta bici = new Bicicleta();
		Coche coche = new Coche();
		
		int opcion;
		
		do {
			showMenu();
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				bici.andar(30);
				break;
			
			case 2:
				bici.hacerCaballito();
				break;
				
			case 3:
				coche.andar(40);
				break;
				
			case 4:
				coche.quemaRueda();
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
				System.out.println("Gracias y hasta luego!");
				break;
			}
			
		}while(opcion!=9);
	}
	public static void showMenu() {
		System.out.println("1. Anda con la bicicleta\n"
				+ "2. Haz el caballito con la bicicleta\n"
				+ "3. Anda con el coche\n"
				+ "4. Quema rueda con el coche\n"
				+ "5. Ver kilometraje de la bicicleta\n"
				+ "6. Ver kilometraje del coche\n"
				+ "7. Ver kilometraje total\n"
				+ "8. Ver número total de vehículos creados.\n"
				+ "9. Salir");
	}
	

}
