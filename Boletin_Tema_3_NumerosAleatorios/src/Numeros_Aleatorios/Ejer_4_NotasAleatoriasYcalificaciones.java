package Numeros_Aleatorios;

public class Ejer_4_NotasAleatoriasYcalificaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escribe un programa que muestre 20 notas generadas al azar. 
		//Las notas deben aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. 
		//Al final aparecerá el número de suspensos, el número de suficientes, el número de bienes, etc.

		int nota;
		int PosibleNota;
		int suspensos = 0;
		int suficientes = 0;
		int bienes = 0;
		int notables = 0;
		int sobresalientes = 0;
		
		
		for(int i=1; i<=20; i++) {//bucle For para el número de notas que se van a generar (20)
			
			nota = (int)(Math.random()*10+1);
			//System.out.println(nota); esto sobraría
			
			switch(nota) {
			
			case 5:
				System.out.println(nota+ " es un Suficiente"); //demostración
				suficientes++;
				break;
			
			case 6:
				System.out.println("Bien");
				bienes++;
				break;
				
			case 7:
				System.out.println("Notable");
				notables++;
				break;
				
			case 8:
				System.out.println("Notable");
				notables++;
				break;
				
			case 9:
				System.out.println("Sobresaliente");
				sobresalientes++;
				break;
				
			case 10:
				System.out.println("Sobresaliente");
				sobresalientes++;
				break;
				
			default:
				System.out.println("Suspenso");
				suspensos++;
				break;
				}
			
		}
		System.out.println("El número de suspensos es " +suspensos);
		System.out.println("El número de suspensos es " +suficientes);
		System.out.println("El número de suspensos es " +bienes);
		System.out.println("El número de suspensos es " +notables);
		System.out.println("El número de suspensos es " +sobresalientes);
		
	}

}
