package Numeros_Aleatorios;

public class Ejer_3_SignosAleatoriosEnLineasAleatorias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realiza un programa que pinte por pantalla diez l�neas formadas por caracteres. 
		//El car�cter con el que se pinta cada l�nea se elige de forma aleatoria 
		//entre uno de los siguientes: *, -, =, ., |, @. 
		//Las l�neas deben tener una longitud aleatoria entre 1 y 40 caracteres.
		
		String signo = "";//ponemos las comillas como truco psra inicializar el String
		//en realidad el String no hace falta porque para ver el signo puedo usar un Syso
		int longitud; //la longitud aleatoria de la l�nea
		int PosibleSigno; //el signo aleatorio se definir� en Cases de Switch
		
		for(int i=1; i<=10; i++) {//bucle For para saber cu�ntas l�neas se van a pintar
			longitud = (int)(Math.random()*40+1);//hacemos aleatoria la longitus de las l�neas
			PosibleSigno = (int)(Math.random() *6);//hacemos aleatoria la posibilidad de que salga cada signo diferente
			
			switch(PosibleSigno) {//el usuario no elige opci�n porque la opcion la hemos hecha aleatoria
			
			case 0:
				signo = "*";
				break;
				
			case 1:
				signo = "-";
				break;
				
			case 2:
				signo = "=";
				break;
				
			case 3:
				signo = ".";
				break;
				
			case 4:
				signo = "|";
				break;
				
			case 5:
				signo = "@";
				break;
				
			default:
			}
			//pintar las l�neas
			for(int j=1; j<=longitud; j++) {//bucle For para mostrar los signos de las l�neas y saber hasta cuantos mostrar
				System.out.print(signo); //importante quitar el LN para que ponga los signos seguidos en sus l�neas
			}
			System.out.println("");
		}
	}

}
