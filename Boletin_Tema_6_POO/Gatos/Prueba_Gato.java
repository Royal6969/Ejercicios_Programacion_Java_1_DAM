package Gatos;

import java.util.Scanner;

public class Prueba_Gato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gato misifu = new Gato ("negro", "española", "macho", 5, 10);
		Gato mamon  = new Gato("blanco", "persa", "macho", 7, 8);
		
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		
		do {
            System.out.println("1. Maulla");
            System.out.println("2. Ronronea");
            System.out.println("3. Come");
            System.out.println("4. Pelea");
            System.out.println("5. Mostrar datos");
            System.out.println("0. Salir");
            opcion = sc.nextInt();

            switch(opcion){
            case 0:
                System.out.println("Adios");
                break;
                
            case 1:
                misifu.maullar();
                mamon.maullar();
                break;
                
            case 2:
                misifu.ronronear();
                mamon.ronronear();
                break;
                
            case 3:
                misifu.comer("pescado");
                mamon.comer("arroz");
                break;
                
            case 4:
                misifu.pelearCon(mamon);
                break;
                
            case 5:
                System.out.println(misifu);
                System.out.println(mamon);
                break;
                
            default:
                System.out.println("No valido");
                break;
              
            }
            
		}while(opcion!=0);
		
		
	}

}
