package Condicionales;

import java.util.Scanner;

public class Ejer_18_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escribe un programa que calcule el precio final de un producto según su base imponible
		//(precio antes de impuestos), el tipo de IVA aplicado (general, reducido o superreducido) y el
		//código promocional. Los tipos de IVA general, reducido y superreducido son del 21%, 10%
		//y 4% respectivamente. Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc
		//que significan respectivamente que no se aplica promoción, el precio se reduce a la mitad,se
		//descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se muestran los
		//valores correctos, aunque los números no estén tabulados.
		
		double BI;
		double precio;
		String Dto;
		double DtoAUX; 
		String IVA;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la Base Imponible del producto ");
		BI = sc.nextDouble();
		System.out.println("Introduzca el Descuento correspondiente (nopro, mitad, meno5 o 5porc)");
		Dto = sc.next();
		System.out.println("Introduzca el tipo de IVA de su producto (general, reducido o superreducido)");
		IVA = sc.next();
		
		System.out.println("Base imponible: " +BI);
		
		if(IVA.equals("general")) { //para comparar los Strings No se usa el == 
			precio=BI*0.21; //no se pueden poner comas
			System.out.println("El IVA es general: " +precio);
			
			precio=precio+BI;
			System.out.println("El precio con su IVA es: " +precio);
		
		}else if(IVA.equals("reducido")) {
			precio=BI*0.1; //no se pueden poner comas
			System.out.println("El IVA es reducido: " +precio);
			
			precio=precio+BI;
			System.out.println("El precio con su IVA es: " +precio);
		
		}else {
			precio=BI*0.04; //no se pueden poner comas
			System.out.println("El IVA es superreducido: " +precio);
			
			precio=precio+BI;
			System.out.println("El precio con su IVA es: " +precio);
		}
		
		if(Dto.equals("nopro")) {
			System.out.println("El precio de su producto NO tiene descuento: " +precio);
		
		}else if(Dto.equals("mitad")) {
			precio=precio/2;
			System.out.println("Su descuento MITAD es de: -" +precio);
			System.out.println("El precio final de su producto es: " +precio);
		
		}else if(Dto.equals("meno5")) {
			precio=precio-5;
			System.out.println("Su descuento MENO5 es de: -5");
			System.out.println("El precio final de su producto es: " +precio);
		
		}else{
			DtoAUX=precio*0.05;
			System.out.println("Su descuento 5PORC es de: " +DtoAUX);
			precio=precio-DtoAUX;
			System.out.println("El precio final de su producto es: " +precio);
		}
		
	}

}
