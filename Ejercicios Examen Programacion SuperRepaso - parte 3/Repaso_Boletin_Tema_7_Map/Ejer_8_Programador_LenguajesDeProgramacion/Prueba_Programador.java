package Ejer_8_Programador_LenguajesDeProgramacion;

import java.util.Collections;
import java.util.HashMap;
import java.util.SortedMap;

/*
 * 7. Crear una lista de programadores con los siguientes datos. 
 * De cada programador se desea almacenar su nombre, su edad 
 * y mediante una estructura de mapa los lenguajes de programación (en orden alfabético) que conoce, 
 * con la fecha correspondiente de inicio de trabajo con dicho lenguaje. 
 * 
 * Se pide:
 * 
 * A. Listar todos los datos ordenados alfabéticamente según el nombre del programador.
 * B. Listar todos los datos ordenados según la edad del programador
 */
public class Prueba_Programador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creamos el objeto a travñes de lista_programadores como hacemos smp
		Lista_Programadores programadores = new Lista_Programadores();
		
		//creamos varios objetos de Programador y les ponemos directamente los datos
		Programador programador1 = new Programador("sergio", 26);
		Programador programador2 = new Programador("jaime", 19);
		Programador programador3 = new Programador("carlos", 20);
		
		//la forma de insertar los datos en un SortedMap es la siguiente: objeto.getSortedMap.put("dato_String", "dato_Fecha")
		programador1.getLenguajes().put("java", new Fecha(1999, 8, 20));
		programador1.getLenguajes().put("c++", new Fecha(1995, 04, 17));
		programador1.getLenguajes().put("javascript", new Fecha(2005, 02, 28));
		
		programador2.getLenguajes().put("php", new Fecha(2000, 01, 30));
		programador2.getLenguajes().put("oracle", new Fecha(2004, 03, 30));
		programador2.getLenguajes().put("python", new Fecha(2007, 06, 05));
		
		programador3.getLenguajes().put("html", new Fecha(1998, 10, 20));
		programador3.getLenguajes().put("css", new Fecha(2006, 11, 15));
		programador3.getLenguajes().put("sass", new Fecha(2010, 12, 20));
		
		//añadimos cada programador a la lista de los programadores
		programadores.getLista_programadores().add(programador1);
		programadores.getLista_programadores().add(programador2);
		programadores.getLista_programadores().add(programador3);
		
		//para ordenar alfabéticamente los programadores por sus nombres
		Collections.sort(programadores.getLista_programadores());
		//para mostrarlos
		for(int i=0; i<programadores.getLista_programadores().size(); i++) {
			System.out.println(programadores.getLista_programadores().get(i));
		}
		System.out.println();
		//para ordenar ascendentemente los programadores según sus edades
		Collections.sort(programadores.getLista_programadores(), new Comparar_Edad_Programador());
		//para mostrarlos otra vez
		for(int i=0; i<programadores.getLista_programadores().size(); i++) {
			System.out.println(programadores.getLista_programadores().get(i));
		}
	}

}
