package Strings;

import java.util.Scanner;

public class Ejer_8_1_BuscarPalabraEnUnTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String texto;
		System.out.println("introduzca un texto");
		texto = sc.nextLine();
		System.out.println();
		
		String busqueda;
		System.out.println("Introduzca una letra/palabra para buscarla en el texto");
		busqueda = sc.nextLine();
		System.out.println();
		
		int posicion;
		//con .indexOf encontraremos la 1º coincidencia
		posicion = texto.indexOf(busqueda); //usar el .indexOf(str)
		
		System.out.println("La primera posición de la busqueda ("+busqueda+") es: "+(posicion+1));
	
//_________________________________________________________________________________________________________________
		
		//String texto;
		//System.out.println("introduzca un texto");
		//texto = sc.nextLine();
		
		//String busqueda;
		//System.out.println("Introduzca una letra para buscarla en la palabra");
		//busqueda = sc.nextLine();
		
		//int posicion;
		//con .indexOf encontraremos la última coincidencia
		posicion = texto.lastIndexOf(busqueda); //usar el .lastIndexOf(str)
		
		System.out.println("La última posición de la busqueda ("+busqueda+") es: "+(posicion+1));
		
//_________________________________________________________________________________________________________________
		
		
		//String texto;
		//System.out.println("introduzca un texto");
		//texto = sc.nextLine();
		
		//String busqueda;
		//System.out.println("Introduzca una letra para buscarla en la palabra");
		//busqueda = sc.nextLine();
		
		//int posicion;
		//con .indexOf encontraremos la 1º coincidencia
		posicion = texto.indexOf(" "); //usar el .indexOf(str)
		
		System.out.println("La posición del primer espacio en blanco es: "+(posicion+1));
		
		//ahora, si queremos sacar la 1º palabra que hay antes hasta el espacio en blanco que hemos fijado antes en la posicion...
		String PrimeraPalabra;
		//PrimeraPalabra = cadena.substring(beginIndex, endIndex)
		PrimeraPalabra = texto.substring(0, posicion);
		
		System.out.println("Lo que hay antes hasta llegar al primer espacio en blanco es: "+PrimeraPalabra);	

//_________________________________________________________________________________________________________________
	
	
		//String texto;
		//System.out.println("introduzca un texto");
		//texto = sc.nextLine();
				
		//String busqueda;
		//System.out.println("Introduzca una letra para buscarla en la palabra");
		//busqueda = sc.nextLine();
	
		char[] TextoEnChar = texto.toCharArray();
		
		for(int i=0; i<texto.length(); i++) { //para ir recorriendo el vector e ir casteándolo....
			String letra; //variable para ir guardando la transformación de cada caracter a String y poder usar luego el Equals !!
			letra = String.valueOf(TextoEnChar[i]); //usar el ValueOf(obj)
			
			if(busqueda.equalsIgnoreCase(letra)) { //usar EqualsIgnoreCase(AnotherString) para captar tanto las minúsculas como las mayúsculas
			//la busqueda es una String, y si cada letra del texto es tmb un String... se puden encontrar resultados coincidentes más fácilmente !!
			System.out.println("La letra "+busqueda+" se encuentra en la posición "+(i+1));
			}
		}
		
//_________________________________________________________________________________________________________________
	
		
		//String texto;
		//System.out.println("introduzca un texto");
		//texto = sc.nextLine();
						
		//String busqueda;
		//System.out.println("Introduzca una letra para buscarla en la palabra");
		//busqueda = sc.nextLine();
		
		String[] PalabrasTexto; //creo un Array para guardar las palabras del texto
		
		PalabrasTexto = texto.split(" "); //Uso el .Split(espacio) para indicar que entre dada espacio del texto lo que hay es una palabra 
		
		for(int i=0; i<PalabrasTexto.length; i++) {
			if(PalabrasTexto[i].equals(busqueda)) {
				System.out.println("Su búsqueda "+busqueda+" se ha encontrado en la posición: "+(i+1));
			}
		}
	}

}
