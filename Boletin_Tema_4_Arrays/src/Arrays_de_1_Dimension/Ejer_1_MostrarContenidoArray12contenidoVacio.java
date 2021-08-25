package Arrays_de_1_Dimension;

public class Ejer_1_MostrarContenidoArray12contenidoVacio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.Define un Array de 12 números enteros con nombre num y asigna los valores según la tabla que se muestra a conyinuación.
		//Muestra el contenido de todos los elemnetos del Array.
		//¿Qué sucede con los valores de los elementos que no han sido inicializados?
		
		int[] num = new int[12];
		
		num[0] = 1;
		num[1] =
		num[2] = 66;
		num[3] = 7;
		num[4] = 
		num[5] = 
		num[6] = 
		num[7] = 47;
		num[8] = 
		num[9] = 
		num[10]= 2;
				
		for(int i=0; i<12; i++) {
			System.out.print(num[i]+ " ");
		}
		//en los espacios vacios aparece "basura". No se de donde vienen esos números...
	}

}
