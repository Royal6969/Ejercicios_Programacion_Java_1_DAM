package Numeros_Aleatorios;

public class Ejer_3_SignosAleatoriosEnLineasAleatorias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. 
		//El carácter con el que se pinta cada línea se elige de forma aleatoria 
		//entre uno de los siguientes: *, -, =, ., |, @. 
		//Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.
		
		String signo = "";//ponemos las comillas como truco psra inicializar el String
		//en realidad el String no hace falta porque para ver el signo puedo usar un Syso
		int longitud; //la longitud aleatoria de la línea
		int PosibleSigno; //el signo aleatorio se definirá en Cases de Switch
		
		for(int i=1; i<=10; i++) {//bucle For para saber cuántas líneas se van a pintar
			longitud = (int)(Math.random()*40+1);//hacemos aleatoria la longitus de las líneas
			PosibleSigno = (int)(Math.random() *6);//hacemos aleatoria la posibilidad de que salga cada signo diferente
			
			switch(PosibleSigno) {//el usuario no elige opción porque la opcion la hemos hecha aleatoria
			
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
			//pintar las líneas
			for(int j=1; j<=longitud; j++) {//bucle For para mostrar los signos de las líneas y saber hasta cuantos mostrar
				System.out.print(signo); //importante quitar el LN para que ponga los signos seguidos en sus líneas
			}
			System.out.println("");
		}
	}

}
