package Ejer_5_AlumnosEnAsignaturas;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/*
 * 5. Crear un mapa, que debe contener 
 * como clave: el nombre de una asignatura (las asignaturas son las siguientes: PROGRAMACIÓN, LM y BD) 
 * y como dato: una lista de cinco alumnos que la cursan con sus notas (clase Alumno: nomApe y nota). 
 * Una vez creado este mapa, listarlo por asignatura (EN ORDEN ASCENDENTE DE NOMBRE Y APELLIDOS DE ALUMNO).
 * 
 * DATOS DE ENTRADA: 
 * 
 * Para PROGRAMACIÓN: 
 * Rubén Hernández,5; 
 * Susana Núñez,7; 
 * Elena Ruiz,6; 
 * Guillermo Caro,8; 
 * Tania Falero,5. 
 * 
 * Para LM: 
 * Hernán Barco,7;
 * Vicente Guerra, 6; 
 * Carmen Vega,8; 
 * Belén Cuesta,5; 
 * Bertín Blades,7. 
 * 
 * Para BD: 
 * Alejandro Ortiz,5; 
 * Daniel Núñez,8; 
 * Valeria Fernández, 4;
 * Agustín Soler, 9; 
 * Emilio Jerez,3.
 * 
 * A continuación, a los profesores de estas asignaturas les toca el gordo de navidad 
 * y deciden poner un cinco a todos los alumnos suspensos. 
 * Cambia las calificaciones correspondientes y lista de nuevo el mapa.
 * 
 * Crear tres clases: Alumno, ListAlumno y Principal.
 */
public class Prueba_Alumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//y ahora aquí SÍ viene el HashMap
		//Crear un mapa, que debe contener como clave: el nombre de una asignatura y como dato: una lista de cinco alumnos 
		HashMap<String, Lista_Alumnos> notasAsignaturas = new HashMap<String, Lista_Alumnos>(); //en el String pondremos la asignatura que se trate, y en la Lista_Alumnos estarán los alumnos de esa asignatura
		
		//ahora creamos las 3 listas, una para cada asignatura
		Lista_Alumnos programacion = new Lista_Alumnos();
		Lista_Alumnos lmsgi = new Lista_Alumnos();
		Lista_Alumnos bbdd = new Lista_Alumnos();
		
		//aquí acostumbrábamos a crear el objeto de alumno y dps añadirlo a la lista, pero por ahorrar tiempo y código, haremos ambas cosas a la vez
		programacion.getLista_alumnos().add(new Alumno("Ruben Hernandez", 5));
		programacion.getLista_alumnos().add(new Alumno("Susana Nuñez", 7));
		programacion.getLista_alumnos().add(new Alumno("Elena Ruiz", 6));
		programacion.getLista_alumnos().add(new Alumno("Guillermo Caro", 8));
		programacion.getLista_alumnos().add(new Alumno("Tania Falero", 5));
		
		lmsgi.getLista_alumnos().add(new Alumno("Hernan Barco", 7));
		lmsgi.getLista_alumnos().add(new Alumno("Vicente Guerra", 6));
		lmsgi.getLista_alumnos().add(new Alumno("Carmen Vega", 8));
		lmsgi.getLista_alumnos().add(new Alumno("Belen Cuesta", 5));
		lmsgi.getLista_alumnos().add(new Alumno("Bertin Blades", 7));
		
		bbdd.getLista_alumnos().add(new Alumno("Alejandro Ortiz", 5));
		bbdd.getLista_alumnos().add(new Alumno("Daniel Nuñez", 8));
		bbdd.getLista_alumnos().add(new Alumno("Valeria Fernandez", 4));
		bbdd.getLista_alumnos().add(new Alumno("Agustin Soler", 9));
		bbdd.getLista_alumnos().add(new Alumno("Emilio Jerez", 3));
		
		//ahora tan solo tenemos que añadir estas listas al hashMap con .put()
		notasAsignaturas.put("programacion", programacion);
		notasAsignaturas.put("lmsgi", lmsgi);
		notasAsignaturas.put("bbdd", bbdd);
		
		//listarlo por asignatura (EN ORDEN ASCENDENTE DE NOMBRE Y APELLIDOS DE ALUMNO).
		//para ordenar los grupos por nombre y apellido (ordenación natural) usamos el Collections.sort()
		Collections.sort(programacion.getLista_alumnos());
		Collections.sort(lmsgi.getLista_alumnos());
		Collections.sort(bbdd.getLista_alumnos());
		
		//cuando llego aquí, ya sólo me falta hacer un método para el AprobadoGeneral y otro para imprimir todo el HashMap
		aprobadoGeneral(notasAsignaturas);
		imprimirNotas(notasAsignaturas);
		
	}
	//MÉTODOS
	/* A continuación, a los profesores de estas asignaturas les toca el gordo de navidad 
	 * y deciden poner un cinco a todos los alumnos suspensos. 
	 * Cambia las calificaciones correspondientes y lista de nuevo el mapa. */
	
	//para lanzar el aprobado general
	public static void aprobadoGeneral(HashMap<String, Lista_Alumnos> notasAsignaturas) {
		//1º necesito recorrer el HashMap con un Iterator
		//Iterator<String> iterator = notasAsignaturas.keySet().iterator(); //OJO esto estaría mal, en vez de un String le tengo que pasar la Lista_Alumnos que es quien contiene los alumnos con sus notas, y tmp es .keySet() ya que tendríamos que coger el .Values(), el cual es un método propio de los HashMap que permite fijarse tanto la clave como el dato
		Iterator<Lista_Alumnos> iterator = notasAsignaturas.values().iterator();
		while(iterator.hasNext()) {
			//Alumno alumno = iterator.next(); //OJO esto estaría mal porque lo que tengo que crear en vd es un objeto de Lista_Alumnos!! 
			Lista_Alumnos grupo = iterator.next();
			//Ojito ahora, porque como tengo que manejar un Lista_Alumnos ... y es un ArrayList... se haría con un FOR
			for(int i=0; i<grupo.getLista_alumnos().size(); i++) {
				if(grupo.getLista_alumnos().get(i).getNota() < 5) { //si nos encontramos un alumno con menos de un 5 (suspenso)
					grupo.getLista_alumnos().get(i).setNota(5); //le seteamos su nota a un 5 (aprobado general)
				}
			}
		}
	}
	//para recorrer e imprimir las notas de los alumnos
	public static void imprimirNotas(HashMap<String, Lista_Alumnos> notasAsignaturas) {
		Iterator<String> iterator = notasAsignaturas.keySet().iterator(); //poninedo esta vez un String como tipo de dato para el Iterator, me iré fijando en cada una de las tres asignaturas
		while(iterator.hasNext()) {
			String asignatura = iterator.next(); //creamos el String de asignatura para recorrerlas...
			Lista_Alumnos lista_asignaturas = notasAsignaturas.get(asignatura); //...en una lista_asignaturas que tmb creamos, se están guardando las asignaturas (las asignaturas, que son los objectKey del hashMap de notasAsignaturas, se han guardado en el String asignatura)
			//teniendo ahora en cuenta que cada asignatura guardaba un alumno y su nota...
			System.out.println();
			System.out.println("Los alumnos y notas de la asignatura "+asignatura+" son:");
			System.out.println(lista_asignaturas);
			System.out.println();
		}
	}
}
