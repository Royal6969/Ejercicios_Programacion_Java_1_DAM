package Ejer_7_Programador_y_Lenguajes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Prueba_Programador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Programador> Lista_Programadores = new ArrayList<Programador>();

		HashMap<String, Fecha> programador1 = new HashMap<String, Fecha>();
		HashMap<String, Fecha> programador2 = new HashMap<String, Fecha>();
		HashMap<String, Fecha> programador3 = new HashMap<String, Fecha>();
		
		
		programador1.put("Java", new Fecha(30, 6, 2020));
		programador1.put("Python", new Fecha(25, 9, 2020));
		programador1.put("C++", new Fecha(15, 3, 2020));
		
		programador2.put("Java", new Fecha(14, 2, 2020));
		programador2.put("Python", new Fecha(31, 10, 2020));
		programador2.put("C++", new Fecha(24, 12, 2020));
		
		programador3.put("React", new Fecha(10, 1, 2021));
		programador3.put("Three", new Fecha(17, 4, 2021));
		programador3.put("Angular", new Fecha(5, 5, 2021));
		
		
		Programador JuanCarlos = new Programador("Juan Carlos", 20, programador1);
		Programador Fernando = new Programador("Fernando", 21, programador2);
		Programador Sergio = new Programador("Sergio", 26, programador3);
		
		Lista_Programadores.add(JuanCarlos);
		Lista_Programadores.add(Fernando);
		Lista_Programadores.add(Sergio);
		
		
		Collections.sort(Lista_Programadores); //con esto se ha ordenado la lista por nombre alfabetico
		
		System.out.println(Lista_Programadores);
		
		Collections.sort(Lista_Programadores, new Compare_Edad()); //con esto se ha ordenado por edad
		
		System.out.println();
		System.out.println(Lista_Programadores);
		
		
	}

}
