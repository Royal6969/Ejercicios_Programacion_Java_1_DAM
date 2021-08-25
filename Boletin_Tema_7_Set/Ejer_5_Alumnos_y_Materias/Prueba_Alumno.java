package Ejer_5_Alumnos_y_Materias;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import Ejer_4_Conjunto_Personas.Persona;

public class Prueba_Alumno {

	/*
	 * 5. Dados tres conjuntos con los alumnos aprobados respectivamente 
	 * en un examen del idioma inglés, el francés y el alemán. 
	 * Se pide implementar un método que devuelva un array con los tres conjuntos siguientes:
	 * 
	 * a. candidatos que superaron la prueba de inglés y otra más.
	 * b. candidatos que superaron al menos dos idiomas.
	 * c. candidatos que superaron sólo un examen.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Alumno> ingles = new HashSet<Alumno>();
		Set<Alumno> frances = new HashSet<Alumno>();
		Set<Alumno> aleman = new HashSet<Alumno>();

		Alumno alumno1 = new Alumno("Sergio", 1);
		Alumno alumno2 = new Alumno("Carlos", 2);
		Alumno alumno3 = new Alumno("Fernando", 3);
		Alumno alumno4 = new Alumno("JuanCarlos", 4);
		Alumno alumno5 = new Alumno("Chema", 5);
		Alumno alumno6 = new Alumno("Alfonso", 6);
		Alumno alumno7 = new Alumno("Adan", 7);
		Alumno alumno8 = new Alumno("Angel", 8);
		Alumno alumno9 = new Alumno("David", 9);

		ingles.add(alumno1);
		ingles.add(alumno2);
		ingles.add(alumno3);
		ingles.add(alumno4);
		
		frances.add(alumno3);
		frances.add(alumno4);
		frances.add(alumno5);
		frances.add(alumno6);
		frances.add(alumno9);
		
		aleman.add(alumno5);
		aleman.add(alumno6);
		aleman.add(alumno7);
		aleman.add(alumno8);
		
		aprobadosInglesYotraMas(ingles, frances, aleman);
		System.out.println();
		aprobados2idiomasOmas(ingles, frances, aleman);
		System.out.println();
		aprobados1examen(ingles, frances, aleman);
		System.out.println();
	}
	//MÉTODOS
	public static void aprobadosInglesYotraMas(Set<Alumno> ingles, Set<Alumno> frances, Set<Alumno> aleman) {
		
		Set<Alumno> sAUX1 = new HashSet<Alumno>();
		Set<Alumno> sAUX2 = new HashSet<Alumno>();
		
		sAUX1.addAll(ingles);
		sAUX2.addAll(ingles);
		
		sAUX1.retainAll(frances);
		sAUX2.retainAll(aleman);
		
		sAUX1.addAll(sAUX2);
		
		Iterator<Alumno> iter = sAUX1.iterator(); //la formula del iterartor, hay que importarlo!
	        while(iter.hasNext()){				  //que sirve para mostrar cualquier arrayList
		        Alumno x = iter.next();
		        System.out.println(x);
        }
	}
	
	public static void aprobados2idiomasOmas(Set<Alumno> ingles, Set<Alumno> frances, Set<Alumno> aleman) {
		
		Set<Alumno> sAUX1 = new HashSet<Alumno>();
		Set<Alumno> sAUX2 = new HashSet<Alumno>();
		Set<Alumno> sAUX3 = new HashSet<Alumno>();
		
		sAUX1.addAll(ingles);
		sAUX2.addAll(ingles);
		sAUX3.addAll(frances);
	
		sAUX1.retainAll(frances);
		sAUX2.retainAll(aleman);
		sAUX3.retainAll(aleman);
		
		sAUX1.addAll(sAUX2);
		sAUX1.addAll(sAUX3);
		
		Iterator<Alumno> iter = sAUX1.iterator(); //la formula del iterartor, hay que importarlo!
        while(iter.hasNext()){				  //que sirve para mostrar cualquier arrayList
	        Alumno x = iter.next();
	        System.out.println(x);
        }
	}
	
	public static void aprobados1examen(Set<Alumno> ingles, Set<Alumno> frances, Set<Alumno> aleman) {
		
		Set<Alumno> sAUX1 = new HashSet<Alumno>();
		Set<Alumno> sAUX2 = new HashSet<Alumno>();
		Set<Alumno> sAUX3 = new HashSet<Alumno>();

		sAUX1.addAll(ingles);
		sAUX2.addAll(frances);
		sAUX3.addAll(aleman);
	
		sAUX1.removeAll(frances);
		sAUX1.removeAll(aleman);
		sAUX2.removeAll(aleman);
		sAUX2.removeAll(ingles);
		sAUX3.removeAll(ingles);
		sAUX3.removeAll(frances);
		
		sAUX1.addAll(sAUX2);
		sAUX1.addAll(sAUX3);
		
		Iterator<Alumno> iter = sAUX1.iterator(); //la formula del iterartor, hay que importarlo!
        while(iter.hasNext()){				  //que sirve para mostrar cualquier arrayList
	        Alumno x = iter.next();
	        System.out.println(x);
        }
	}

}
