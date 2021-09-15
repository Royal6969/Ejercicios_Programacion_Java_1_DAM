package pack_Figura;

import java.util.Scanner;

public class Prueba_Figura {

static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conjunto_Figuras conjuntoFiguras = new Conjunto_Figuras();
		
		int opcion;
		
		do {
			System.out.println("Introduzca la opción del menú que quiera realizar");
			mostrarMenu();
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				altaCirculo(conjuntoFiguras);
				break;
				
			case 2:
				int opcion2;
				mostrarMenu2();
				opcion2 = sc.nextInt();
				
				switch(opcion2) {
				
				case 1:
					altaEquilatero(conjuntoFiguras);
					break;
					
				case 2:
					altaIsosceles(conjuntoFiguras);
					break;
					
				case 3:
					altaEscaleno(conjuntoFiguras);
					break;
	
				//no hace falta case 4 de la opcion del 0 de salir porque ya estamos dentro del menú principal, si lo pusiera mal, simplemente se sale de este submenú y vuelve solo al principal
					
				default:
					System.out.println("Lo sentimos, esta opción no existe en el menú");
					break;
				}
				break;
				
			case 3:
				conjuntoFiguras.listadoCompleto();
				break;
				
			case 4:
				conjuntoFiguras.listadoAgrupado();
				break;
				
			case 5:
				String color;
				System.out.println("Introduzca un color para aplicarselo a todos los círculos");
				color = sc.next();
				
				conjuntoFiguras.cambiarColorCirculos(color);
				break;
				
			case 0:
				System.out.println("Muchas gracias y hasta luego");
				
			default:
				System.out.println("Lo sentimos, esta opción no existe en el menú");
				break;
			}
		}while(opcion!=0);
	
	}
	public static void mostrarMenu() {
		System.out.println("1- ALTA DE CÍRCULO");
		System.out.println("2- ALTA DE TRIÁNGULO");
		System.out.println("3- LISTADO COMPLETO DE DATOS DE CADA FIGURA GEOMÉTRICA, MOSTRANDO EL RESULTADO DE CALCULAR CADA ÁREA Y CADA PERÍMETRO. Y AL FINALIZAR EL TOTAL DE FIGURAS EXISTENTE.");
		System.out.println("4- LISTADO COMPLETO DE FIGURAS AGRUPADAS SEGÚN SU TIPO, MOSTRANDO CADA SUBTOTAL.");
		System.out.println("5- CAMBIAR COLOR A TODOS LOS CÍRCULOS.");
		System.out.println("0- SALIR ");
	}
	
	public static void altaCirculo(Conjunto_Figuras conjuntoFiguras) {
		
		//String color;
		double radio;
		
		//System.out.println("Introduzca el color del Circulo");
		//color = sc.next();
		System.out.println("Introduzca el radio del Circulo");
		radio = sc.nextDouble();
		
		conjuntoFiguras.getConjuntoFiguras()[Figura.getnFigura()] = new Circulo(/*color,*/ radio);
	}
	
	public static void mostrarMenu2() {
		System.out.println("2.1- Alta triangulo Equilatero");
		System.out.println("2.2- Alta triangulo Isoceles");
		System.out.println("2.3- Alta triangulo Escaleno");
	}
	
	public static void altaEquilatero(Conjunto_Figuras conjuntoFiguras) {
		
		//String color;
		double base;
		double altura;
		double lado1;
		
		//System.out.println("Introduzca el color del triangulo");
		//color = sc.next();
		System.out.println("Introduzca los cm de la base del triangulo");
		base = sc.nextDouble();
		System.out.println("Introduzca los cm de la altura del triangulo");
		altura = sc.nextDouble();
		System.out.println("Introduzca los cm de un lado del triangulo");
		lado1 = sc.nextDouble();
		
		conjuntoFiguras.getConjuntoFiguras()[Figura.getnFigura()] = new tEquilatero(/*color,*/ base, altura, lado1);
	}
	
	public static void altaIsosceles(Conjunto_Figuras conjuntoFiguras) {
		
		//String color;
		double base, altura, lado1, lado2;
		
		//System.out.println("Introduzca el color del triangulo");
		//color = sc.next();
		System.out.println("Introduzca los cm de la base del triangulo");
		base = sc.nextDouble();
		System.out.println("Introduzca los cm de la altura del triangulo");
		altura = sc.nextDouble();
		System.out.println("Introduzca los cm de un lado del triangulo");
		lado1 = sc.nextDouble();
		System.out.println("Introduzca los cm de un lado del triangulo");
		lado2 = sc.nextDouble();
		
		conjuntoFiguras.getConjuntoFiguras()[Figura.getnFigura()] = new tIsoceles(/*color,*/ base, altura, lado1, lado2);
	}
	
	public static void altaEscaleno(Conjunto_Figuras conjuntoFiguras) {
		
		//String color;
		double base, altura, lado1, lado2, lado3;
		
		//System.out.println("Introduzca el color del triangulo");
		//color = sc.next();
		System.out.println("Introduzca los cm de la base del triangulo");
		base = sc.nextDouble();
		System.out.println("Introduzca los cm de la altura del triangulo");
		altura = sc.nextDouble();
		System.out.println("Introduzca los cm de un lado del triangulo");
		lado1 = sc.nextDouble();
		System.out.println("Introduzca los cm de un lado del triangulo");
		lado2 = sc.nextDouble();
		System.out.println("Introduzca los cm de un lado del triangulo");
		lado3 = sc.nextDouble();
		
		conjuntoFiguras.getConjuntoFiguras()[Figura.getnFigura()] = new tEscaleno(/*color,*/ base, altura, lado1, lado2, lado3);
	}
	
	

}
