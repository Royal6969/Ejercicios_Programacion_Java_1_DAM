package Ejer_5_NotasAsignaturas;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Prueba_Alumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Lista_Alumnos> grupo = new HashMap<String, Lista_Alumnos>();
		
		Lista_Alumnos programacion = new Lista_Alumnos();
		Lista_Alumnos lenguajeMarca = new Lista_Alumnos();
		Lista_Alumnos baseDeDatos = new Lista_Alumnos();
		
		
		programacion.getLista_Alumnos().add(new Alumno("Ruben Hernández", 5));
		programacion.getLista_Alumnos().add(new Alumno("Susana Nuñez", 7));
		programacion.getLista_Alumnos().add(new Alumno("Elena Ruiz", 6));
		programacion.getLista_Alumnos().add(new Alumno("Guillermo Caro", 8));
		programacion.getLista_Alumnos().add(new Alumno("Tania Falero", 5));
		
		lenguajeMarca.getLista_Alumnos().add(new Alumno("Hernán Barco", 7));
		lenguajeMarca.getLista_Alumnos().add(new Alumno("Vicente Guerra", 6));
		lenguajeMarca.getLista_Alumnos().add(new Alumno("Carmen Vega", 8));
		lenguajeMarca.getLista_Alumnos().add(new Alumno("Belén Cuesta", 5));
		lenguajeMarca.getLista_Alumnos().add(new Alumno("Bertín Blades", 7));
		
		baseDeDatos.getLista_Alumnos().add(new Alumno("Alejandro Ortiz", 5));
		baseDeDatos.getLista_Alumnos().add(new Alumno("Daniel Nuñez", 8));
		baseDeDatos.getLista_Alumnos().add(new Alumno("Valeria Fernández", 4));
		baseDeDatos.getLista_Alumnos().add(new Alumno("Agustín Soler", 9));
		baseDeDatos.getLista_Alumnos().add(new Alumno("Emilio Jerez", 3));
		
		
		//ahora para ordenar los grupos por nombre y apellido (ordenación natural)
		Collections.sort(programacion.getLista_Alumnos());
		Collections.sort(lenguajeMarca.getLista_Alumnos());
		Collections.sort(baseDeDatos.getLista_Alumnos());
		
		grupo.put("programacion", programacion);
		grupo.put("lenguajeMarca", lenguajeMarca);
		grupo.put("baseDeDatos", baseDeDatos);
		
		aprobadoGeneral(grupo);
		recorrerHashMap(grupo);
		
	}
	//MÉTODOS
	public static void aprobadoGeneral(HashMap<String,Lista_Alumnos>grupo) {
		
		//Iterator<String> it = puntuacion.keySet().iterator();
		Iterator<Lista_Alumnos> it = grupo.values().iterator();
		
		while(it.hasNext()) {
			
			Lista_Alumnos listaClase = it.next();
			
			for(int i=0; i<listaClase.getLista_Alumnos().size(); i++) {
				
				if(listaClase.getLista_Alumnos().get(i).getNota() < 5) {
					
					listaClase.getLista_Alumnos().get(i).setNota(5);
				}
			}
		}
	}
	
	public static void recorrerHashMap(HashMap<String,Lista_Alumnos>grupo) {
		
		Iterator<String> it = grupo.keySet().iterator(); //con esto me fijo en los Strings
		
		while(it.hasNext()) {
			
			String asignaturas = it.next();
			Lista_Alumnos listaAsignaturas = grupo.get(asignaturas);
			
			System.out.println();
			System.out.println("Los alumnos de "+asignaturas+" son:");
			System.out.println();
			System.out.println(listaAsignaturas);
		}
	}
	
	

}
