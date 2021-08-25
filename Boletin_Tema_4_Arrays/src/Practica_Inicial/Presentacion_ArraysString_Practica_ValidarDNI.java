package Practica_Inicial;

import java.util.Scanner;

public class Presentacion_ArraysString_Practica_ValidarDNI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//Leer un DNI y validarlo (buscar el algoritmo para validar la letra).

		String DNI;
		int numsDNI;
		String[] cifras = {"0","1","2","3","4","5","6","7","8","9"};
		String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		String nums;
		String letrasDNI;
		String MiLetra;
		int resto;
		boolean salir = false;
		
		System.out.println("Introduzca los números del DNI para averiguar su Letra");
		DNI = sc.next();
		
		if(DNI.length()==9) {//comprobar los 9 caracteres
			for(int i=0; i<8 && salir==false; i++) {//for para comprobar que los 8 primeros caracteres sean números
				nums=DNI.substring(i);//Substring se para en cada posición y lee el valor que hay
				
				for(int j=0; j<cifras.length && salir==false; j++) { //recorre el StringCifras en busca de algún carácter que NO sea un número
					if(nums.equals(cifras[j])) {//comparación con cualquier número normal
						
					}else {
						salir=true;//sino, SALIR !!
					}
				}
			}
			if(salir==false) {
			numsDNI=Integer.parseInt(DNI.substring(0,7));
			//Integer.parse y el tipo de variable que yo quiera convertir, la variable que luego le meto en el paréntesis
			//.substring(0,x) será para medir hasta el rango de posiciones que en este caso quiero hasta la octava
			
			resto=numsDNI%23; 
			letrasDNI=letras[resto];
			MiLetra=DNI.substring(8).toUpperCase();
			
			if(MiLetra.equals(letrasDNI)) {
			
				}else {
					salir=true;
				}
			
			}
		}else {
			salir=true;
		}
		if(salir==false) {
			System.out.println("El DNI es correcto");
		}else {
			System.out.println("El DNI es incorrecto");
		}
	}

}
