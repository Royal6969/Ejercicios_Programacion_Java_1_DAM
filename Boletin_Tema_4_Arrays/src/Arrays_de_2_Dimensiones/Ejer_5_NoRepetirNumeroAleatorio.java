package Arrays_de_2_Dimensiones;

public class Ejer_5_NoRepetirNumeroAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//5. Modifica el programa anterior de tal forma que no se repita ningún número en el array.
		
		int[][] matriz = new int[6][10];
		int max = -9999; // RECUERDA: el maximo se iguala desde abajo
		int min = 9999; //RECUERDA: el minimo se iguala desde arriba
		
		//para recorrer los numeros (filas y columnas) de la matriz
		for(int i=0; i<6; i++) { //este para recorrer las FILAS
			for(int j=0; j<10; j++) { //este para recorrer las COLUMNAS
/////////////////// AQUÍ ESTÁ LA MODIFICACIÓN /////////////////////////////////////////////////////////
				boolean repetido = false;
				
				do{
					repetido = false;//comenzamos el buble DO WHILE con el boolean REPETIDO en false...
					
					//hacer{ que si el número de la matriz fuese igual al número generado aleatoriamente
					matriz[i][j] = (int) (Math.random()*1001);//(numero maximo-numero inicial)+numero inicial
						
						for(int k=0; k<=i && repetido==false; k++) {//para recorrer de nuevo las FILAS comprobando si los números están repetidos o no // OJO con poner smp el booleano de búsqueda en estos casos
							for(int m=0; m<j && repetido==false; m++) {//para recorrer de nuevo las COLUMNAS comprobando si los númeroes están repetidos o no
								//RECUERDA que la [i] aquí representa el (recorrer hasta la 6º fila, y la [j] representa (recorrer hasta la 10º columna)
								//OJO! en el primer FOR tiene que ser (k<=i) para que esto no se haga infinito
								if(matriz[i][j]==matriz[k][m]) {//MATRIZ[I][J] es smp el último número (en la última fila y última columna), y la MATRIZ[K][M] es lo que se está recorriendo ahora
									//si el número por el que vamos de la matriz[k][m], fuese igual a un número que ya se hubiera generado antes en la matriz[i][j]...
									repetido = true; //activamos el boolean, ¡¡¡ se ha encontrado un numero repetido !!!
								}else {// y sino se ha encontrado ningún número repetido...
									repetido = false;//continuamos con el boolean REPETIDO en false :D
								}
							}
						}
	                }while(repetido==true); //Repetir todo esto anterior mientras se encuentre un número repetido
					//osea, que si se encuentra uno repetido, que se vuelva a generar otra vez hasta que no se repita
	                
				if(repetido==false) {//y mientras que el boolean REPETIDO se mantenga en false (mientras que no se encuentre un número repetido)...
					
/////////////// PARA SABER EL MAXIMO Y EL MÍNIMO /////////////////////////////////////////////////////////
				if(matriz[i][j]<min) { //si el numero de la matriz es menor que el minimo
					min = matriz[i][j];//pues el minimo será el número de esa posición de la matriz
				}
				if(matriz[i][j]>max) { //si el numero de la matriz es mayor que el máximo
					max = matriz[i][j];//pues el maximo será el número de esa posición de la matriz
				}
			}
//////////////////////////////////////////////////////////////////////////////////////////////////////////
		  }//Cerrar el FOR de recorrer las columnas del principio
		}//Cerrar el FOR de recorrer las filas del principio
		
		//para MOSTRAR la matriz final resultante
		for(int i=0; i<6; i++) { //este para recorrer las FILAS
			for(int j=0; j<10; j++) { //este para recorrer las COLUMNAS
				System.out.print(matriz[i][j]+"\t");//ACUERDATE DE QUITAR EL LN ... y el truco del tabulador
			}
			System.out.println();//para saltar y crear la siguiente fila debajo de la anterior
		}
		System.out.println();
		
		//para RECOGER EL MAX Y MIN y MOSTRARLO en SYSO
		for(int i=0; i<6; i++) { //este para recorrer las FILAS
			for(int j=0; j<10; j++) { //este para recorrer las COLUMNAS
				if(max == matriz[i][j]) {
					System.out.println("El número máximo es "+max+" y está en la posición: ["+(i+1)+"]["+(j+1)+"]");
				}
				if(min == matriz[i][j]) {
					System.out.println("El número mínimo es "+min+" y está en la posición: ["+(i+1)+"]["+(j+1)+"]");
				}
			}	
		}
	}

}
