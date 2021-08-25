package Ejer_11_ClaseEntero_CompletarEjerEva;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Entero> l1 = new ArrayList<Entero>();
		List<Entero> l2 = new ArrayList<Entero>();
		
		Entero e1 = new Entero(0);
		
		l1.add(e1);
		
		for (int i=1; i<=6; i++) {
			l1.add(new Entero(i));
			l2.add(new Entero(i+3));
		}
		
		e1.setNum(5);
		
		l2.add(e1);((Entero)(l1.get(0))).setNum(10);
		
		l1.set(5,new Entero(4));
		
		System.out.println("l1: "+l1.toString()); 
		System.out.println("l2: "+l2.toString());
		System.out.println("l1: "+l1.subList(0,3).toString());
		System.out.println("l2: "+(l2.indexOf(new Entero(3))));
		
		// Escriba el código que muestre los tres últimos elementos de la lista l2,
		// utilizando iteradores específicos para listas
		
		int cont=0;

        ListIterator<Entero> it = l2.listIterator(l2.size()); //el Iterator es para recorrer los set y el listIterartor es para recorrer las listas
        
        while(cont<3){
        	Entero obj =it.previous();
        	System.out.println(obj);
        
        	cont++;
        }
		
		SortedSet<Entero> s1 = new TreeSet<Entero>(l1); //creo el s1 y le meto la lista de l1 
		SortedSet<Entero> s2 = new TreeSet<Entero>();
		Set<Entero> s3 = s1;
		//mismo bloque de memoria, smp que modifique s1 se modificará l1, esto es identidad... y tmb con s3
		
		s3.add(new Entero(12));
		s2.addAll(l2);
		s2.add(l1.get(1));
		s2.retainAll(l1);
		
		System.out.println("s1: "+s1.toString());
		System.out.println("s2: "+s2.toString());
		
		// Escriba el código que sume 10 a todos los elementos del conjnto s1
		// y mostrar los elementos de s1 superiores a 15
		
		Iterator<Entero> it2 = s1.iterator();
		
		while(it2.hasNext()) {
			
			Entero a = it2.next(); //para que pase al suiente numero
			Entero b = new Entero(10);
			
			a.setNum(a.suma(a, b));
			
			if(a.getNum() > 15) {
				
				System.out.println(a);
			}
		}
		
		System.out.println("s1: "+s1.tailSet(new Entero(15)).toString());
		System.out.println("s1: "+s1.toString());
		System.out.println("s2: "+s2.toString());
		System.out.println("l1: "+l1.toString());
		System.out.println("l2: "+l2.toString()); 
	}

}
