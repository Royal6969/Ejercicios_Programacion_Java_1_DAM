package Ejer_10_Ipunto_Internet;

import java.util.Scanner;

public class Principal {
	
	//Main
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //crear un objeto Scanner
		String newLine = System.getProperty("line.separator"); // Permite hacer una línea nueva
		int n= 0;
		double a=0;
		double b=0;
		Punto nuevoPunto=new Punto();
		boolean salir=false;
		int fuera=0;
		
		while (!salir) {	
			System.out.println("Escoja que quiere hacer: " + newLine
					+ "1. Dar valor al punto " + newLine 
					+ "2. Reiniciar (Borrar coordenadas del punto) " + newLine
					+ "3. Dar nuevas coordenadas al punto (mover) " + newLine
					+ "4. Cacular la distancia de un punto a otro " + newLine
					+ "5. Cambiar el origen del punto " + newLine
					+ "6. Calcular la distancia al origen " + newLine
					+ "7. Salir");
			n=sc.nextInt();
			
			switch (n) {
				case 1:  //Dar valor al punto
						
						//Guardamos coordenada a: 
						System.out.println("Indica un valor para x: ");
						a=sc.nextDouble();
						nuevoPunto.setX(a);
						
						//Guardamos coordenada b. 
						System.out.println("Indica un valor para y: ");
						b=sc.nextDouble();
						nuevoPunto.setY(b);
						
						//mostrar resultado por pantalla
						System.out.println("Tus coordenadas son: ");
						nuevoPunto.imprime();
						
						//salir
				         sc.nextLine(); //borrar caché. 
						System.out.println("Para salir pulse 1. Para continuar pulse cualquier otro número.");
						fuera=sc.nextInt();
						if (fuera==1) {
							salir= true;
						}
						break;
						
				case 2:  //Reiniciar - Borrar cordenadas
						int confirmacion = 0; 
						 sc.nextLine(); //borrar caché.
						System.out.println("¿Estás seguro de que quieres borrar las coordenadas del punto? Entonces pulsa 1. Sino, pulsa cualquier otro número");
						confirmacion=sc.nextInt();
						
						if (confirmacion==1) {
							//borramos
							nuevoPunto.borrar();
						}
					
						System.out.println("Tus coordenadas son: ");
						nuevoPunto.imprime();
						
						//salir
						 sc.nextLine(); //borrar caché.
						System.out.println("Para salir pulse 1. Para continuar pulse cualquier otro número.");
						fuera=sc.nextInt();
						if (fuera==1) {
							salir= true;
						}
						break;
		
				case 3: //Dar nuevas coordenadas al punto. 
						//Peidmos coordenada a: 
					 	sc.nextLine(); //borrar caché.
						System.out.println("Indica un valor para x: ");
						a=sc.nextDouble();
						
						//Pedimos coordenada b. 
						System.out.println("Indica un valor para y: ");
						b=sc.nextDouble();
	
						//Movemos el punto
						nuevoPunto.mover(a,b);
						
						//mostrar resultado por pantalla
						System.out.println("Tus coordenadas son: ");
						nuevoPunto.imprime();
						
						//salir
						System.out.println("Para salir pulse 1. Para continuar pulse cualquier otro número.");
						fuera=sc.nextInt();
						if (fuera==1) {
							salir= true;
						}
						break;
						
				case 4: //Calcular la distancia de un punto a otro
						Punto puntoDistancia= new Punto();
						double c=0;
						double d=0;
						double distancia=0;
						sc.nextLine(); //borrar caché.
						System.out.println("Ey, dime las coordenadas del otro punto para que calcule");
						//Guardamos coordenada 1: 
						System.out.println("Indica un valor para x: ");
						c=sc.nextDouble();
						puntoDistancia.setX(c);
						
						//Guardamos coordenada 2. 
						System.out.println("Indica un valor para y: ");
						d=sc.nextDouble();
						puntoDistancia.setY(d);
						
						//mostrar resultado de nuevo punto por pantalla
						System.out.println("Las coordenadas de ese punto son: ");
						puntoDistancia.imprime();
	
						//Calculamos la distancia
						distancia=nuevoPunto.distancia(puntoDistancia);
						System.out.println("La distancia de esos dos puntos es: " + distancia);
						
						//salir
						 sc.nextLine(); //borrar caché.
						System.out.println("Para salir pulse 1. Para continuar pulse cualquier otro número.");
						fuera=sc.nextInt();
						if (fuera==1) {
							salir= true;
						}
						break;
						
				case 5:  //Cambiar el origen del punto
						Punto nuevoOrigen= new Punto();
						double e=0;
						double f=0;
						
						 sc.nextLine(); //borrar caché.
						System.out.println("Ey, dime cuánto quieres que valga el origen ¿no?");
						//Guardamos coordenada 1: 
						System.out.println("Indica un valor para x: ");
						e=sc.nextDouble();
						nuevoOrigen.setX(e);
						
						//Guardamos coordenada 2. 
						System.out.println("Indica un valor para y: ");
						f=sc.nextDouble();
						nuevoOrigen.setY(f);
						
						//Resultado aquí
						Punto.cambiaOrigen(nuevoOrigen);
						System.out.println("El nuevo origen es el siguiente: ");
						Punto.origen.imprime();
						
						//salir
						sc.nextLine(); //borrar caché.
						System.out.println("Para salir pulse 1. Para continuar pulse cualquier otro número.");
						fuera=sc.nextInt();
						if (fuera==1) {
							salir= true;
						}
						break;
				
				case 6: //Calcula la distancia al origen
						double resultado=0; 
						resultado=nuevoPunto.distanciaOrigen();
						System.out.println("La distancia al origen es " + resultado);
						//salir
						sc.nextLine(); //borrar caché.
						System.out.println("Para salir pulse 1. Para continuar pulse cualquier otro número.");
						fuera=sc.nextInt();
						if (fuera==1) {
							salir= true;
						}
						break;
						
				case 7: //salir
					    salir=true;
			}
		}
		sc.close();
		System.out.println("Hasta pronto!");
		System.exit(0);
	}
}
