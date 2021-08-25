package Bucles;

public class Ejer_19_Primo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Genera y muestra por pantalla los 20 primeros números primos.
		
		int num = 4;
		boolean primo=true;
		System.out.println("El número 1 es primo");
		System.out.println("El número 2 es primo");
		System.out.println("El número 3 es primo");
		
		int i = 0; //contador para la división
		int cont = 0;
		
		while(cont<17) { //habría forma de iniciar el num=0 y que el cont<20 ???
			
			i=num-1;
			primo=true;
		
			while(i>1 && primo) {
				if (num%i==0) { //si el resto es 0 entonces no es primo
					primo=false;
				} i--; //aquí no debería de ir un else?? 	
			}
			if(primo) {
				System.out.println("El número " +num+ " es primo");
				cont++;
			}
			num++;
		}
	}

}
