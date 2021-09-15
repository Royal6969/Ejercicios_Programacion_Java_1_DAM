package Ejer_5_AlumnosEnAsignaturas;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/*
 * 5. Crear un mapa, que debe contener 
 * como clave: el nombre de una asignatura (las asignaturas son las siguientes: PROGRAMACI�N, LM y BD) 
 * y como dato: una lista de cinco alumnos que la cursan con sus notas (clase Alumno: nomApe y nota). 
 * Una vez creado este mapa, listarlo por asignatura (EN ORDEN ASCENDENTE DE NOMBRE Y APELLIDOS DE ALUMNO).
 * 
 * DATOS DE ENTRADA: 
 * 
 * Para PROGRAMACI�N: 
 * Rub�n Hern�ndez,5; 
 * Susana N��ez,7; 
 * Elena Ruiz,6; 
 * Guillermo Caro,8; 
 * Tania Falero,5. 
 * 
 * Para LM: 
 * Hern�n Barco,7;
 * Vicente Guerra, 6; 
 * Carmen Vega,8; 
 * Bel�n Cuesta,5; 
 * Bert�n Blades,7. 
 * 
 * Para BD: 
 * Alejandro Ortiz,5; 
 * Daniel N��ez,8; 
 * Valeria Fern�ndez, 4;
 * Agust�n Soler, 9; 
 * Emilio Jerez,3.
 * 
 * A continuaci�n, a los profesores de estas asignaturas les toca el gordo de navidad 
 * y deciden poner un cinco a todos los alumnos suspensos. 
 * Cambia las calificaciones correspondientes y lista de nuevo el mapa.
 * 
 * Crear tres clases: Alumno, ListAlumno y Principal.
 */
public class Prueba_Alumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//y ahora aqu� S� viene el HashMap
		//Crear un mapa, que debe contener como clave: el nombre de una asignatura y como dato: una lista de cinco alumnos 
		HashMap<String, Lista_Alumnos> notasAsignaturas = new HashMap<String, Lista_Alumnos>(); //en el String pondremos la asignatura que se trate, y en la Lista_Alumnos estar�n los alumnos de esa asignatura
		
		//ahora creamos las 3 listas, una para cada asignatura
		Lista_Alumnos programacion = new Lista_Alumnos();
		Lista_Alumnos lmsgi = new Lista_Alumnos();
		Lista_Alumnos bbdd = new Lista_Alumnos();
		
		//aqu� acostumbr�bamos a crear el objeto de alumno y dps a�adirlo a la lista, pero por ahorrar tiempo y c�digo, haremos ambas cosas a la vez
		programacion.getLista_alumnos().add(new Alumno("Ruben Hernandez", 5));
		programacion.getLista_alumnos().add(new Alumno("Susana Nu�ez", 7));
		programacion.getLista_alumnos().add(new Alumno("Elena Ruiz", 6));
		programacion.getLista_alumnos().add(new Alumno("Guillermo Caro", 8));
		programacion.getLista_alumnos().add(new Alumno("Tania Falero", 5));
		
		lmsgi.getLista_alumnos().add(new Alumno("Hernan Barco", 7));
		lmsgi.getLista_alumnos().add(new Alumno("Vicente Guerra", 6));
		lmsgi.getLista_alumnos().add(new Alumno("Carmen Vega", 8));
		lmsgi.getLista_alumnos().add(new Alumno("Belen Cuesta", 5));
		lmsgi.getLista_alumnos().add(new Alumno("Bertin Blades", 7));
		
		bbdd.getLista_alumnos().add(new Alumno("Alejandro Ortiz", 5));
		bbdd.getLista_alumnos().add(new Alumno("Daniel Nu�ez", 8));
		bbdd.getLista_alumnos().add(new Alumno("Valeria Fernandez", 4));
		bbdd.getLista_alumnos().add(new Alumno("Agustin Soler", 9));
		bbdd.getLista_alumnos().add(new Alumno("Emilio Jerez", 3));
		
		//ahora tan solo tenemos que a�adir estas listas al hashMap con .put()
		notasAsignaturas.put("programacion", programacion);
		notasAsignaturas.put("lmsgi", lmsgi);
		notasAsignaturas.put("bbdd", bbdd);
		
		//listarlo por asignatura (EN ORDEN ASCENDENTE DE NOMBRE Y APELLIDOS DE ALUMNO).
		//para ordenar los grupos por nombre y apellido (ordenaci�n natural) usamos el Collections.sort()
		Collections.sort(programacion.getLista_alumnos());
		Collections.sort(lmsgi.getLista_alumnos());
		Collections.sort(bbdd.getLista_alumnos());
		
		//cuando llego aqu�, ya s�lo me falta hacer un m�todo para el AprobadoGeneral y otro para imprimir todo el HashMap
		aprobadoGeneral(notasAsignaturas);
		imprimirNotas(notasAsignaturas);
		
	}
	//M�TODOS
	/* A continuaci�n, a los profesores de estas asignaturas les toca el gordo de navidad 
	 * y deciden poner un cinco a todos los alumnos suspensos. 
	 * Cambia las calificaciones correspondientes y lista de nuevo el mapa. */
	
	//para lanzar el aprobado general
	public static void aprobadoGeneral(HashMap<String, Lista_Alumnos> notasAsignaturas) {
		//1� necesito recorrer el HashMap con un Iterator
		//Iterator<String> iterator = notasAsignaturas.keySet().iterator(); //OJO esto estar�a mal, en vez de un String le tengo que pasar la Lista_Alumnos que es quien contiene los alumnos con sus notas, y tmp es .keySet() ya que tendr�amos que coger el .Values(), el cual es un m�todo propio de los HashMap que permite fijarse tanto la clave como el dato
		Iterator<Lista_Alumnos> iterator = notasAsignaturas.values().iterator();
		while(iterator.hasNext()) {
			//Alumno alumno = iterator.next(); //OJO esto estar�a mal porque lo que tengo que crear en vd es un objeto de Lista_Alumnos!! 
			Lista_Alumnos grupo = iterator.next();
			//Ojito ahora, porque como tengo que manejar un Lista_Alumnos ... y es un ArrayList... se har�a con un FOR
			for(int i=0; i<grupo.getLista_alumnos().size(); i++) {
				if(grupo.getLista_alumnos().get(i).getNota() < 5) { //si nos encontramos un alumno con menos de un 5 (suspenso)
					grupo.getLista_alumnos().get(i).setNota(5); //le seteamos su nota a un 5 (aprobado general)
				}
			}
		}
	}
	//para recorrer e imprimir las notas de los alumnos
	public static void imprimirNotas(HashMap<String, Lista_Alumnos> notasAsignaturas) {
		Iterator<String> iterator = notasAsignaturas.keySet().iterator(); //poninedo esta vez un String como tipo de dato para el Iterator, me ir� fijando en cada una de las tres asignaturas
		while(iterator.hasNext()) {
			String asignatura = iterator.next(); //creamos el String de asignatura para recorrerlas...
			Lista_Alumnos lista_asignaturas = notasAsignaturas.get(asignatura); //...en una lista_asignaturas que tmb creamos, se est�n guardando las asignaturas (las asignaturas, que son los objectKey del hashMap de notasAsignaturas, se han guardado en el String asignatura)
			//teniendo ahora en cuenta que cada asignatura guardaba un alumno y su nota...
			System.out.println();
			System.out.println("Los alumnos y notas de la asignatura "+asignatura+" son:");
			System.out.println(lista_asignaturas);
			System.out.println();
		}
	}
}
