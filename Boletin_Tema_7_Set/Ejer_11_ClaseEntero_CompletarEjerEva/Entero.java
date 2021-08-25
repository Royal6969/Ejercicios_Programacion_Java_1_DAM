package Ejer_11_ClaseEntero_CompletarEjerEva;

/*
 * 11. Siga la traza escribiendo en las líneas numeradas, la salida que se produciría por
pantalla. En las líneas en blanco, implemente el código necesario para realizar lo
que se indique en los comentarios correspondientes. Los prototipos de los métodos
disponibles en la clase Entero son: Entero(int), int get(), void set(int), Entero
suma(Entero,Entero), String toString(), int compareTo(Object).
import java.util.*;
class prueba {
public static void main (String args[]) {
List l1 = new ArrayList();
List l2 = new ArrayList();
Entero e1 = new Entero(0);
l1.add(e1);
for (int i=1; i<=6; i++) {
l1.add(new Entero(i));
l2.add(new Entero(i+3));
}
e1.set(5);
l2.add(e1);((Entero)(l1.get(0))).set(10);
l1.set(5,new Entero(4));
System.out.println("l1: "+l1.toString()); (1)
System.out.println("l2: "+l2.toString());(2)
System.out.println("l1: "+l1.subList(0,3).toString());(3)
System.out.println("l2: "+(l2.indexOf(new Entero(3)))); (4)
// Escriba el código que muestre los tres últimos elementos de la lista l2,
// utilizando iteradores específicos para listas
________________________________________________________________
________________________________________________________________
________________________________________________________________
________________________________________________________________
SortedSet s1 = new TreeSet(l1);
SortedSet s2 = new TreeSet();
Set s3 = s1;
s3.add(new Entero(12));
s2.addAll(l2);
s2.add(l1.get(1));
s2.retainAll(l1);
System.out.println("s1: "+s1.toString());(5)
System.out.println("s2: "+s2.toString());(6)
// Escriba el código que sume 10 a todos los elementos del conjnto s1
// y mostrar los elementos de s1 superiores a 15
________________________________________________________________
________________________________________________________________
________________________________________________________________
________________________________________________________________
________________________________________________________________
________________________________________________________________
System.out.println("s1: "+s1.tailSet(new Entero(15)).toString());
System.out.println("s1: "+s1.toString()); (7)
System.out.println("s2: "+s2.toString()); (8)
System.out.println("l1: "+l1.toString());(9)
System.out.println("l2: "+l2.toString());(10)
}
}
(1)___________________________________________________________________
(2)___________________________________________________________________
(3)___________________________________________________________________
(4)___________________________________________________________________
(5)___________________________________________________________________
(6)___________________________________________________________________
(7)___________________________________________________________________
(8)___________________________________________________________________
(9)___________________________________________________________________
(10)__________________________________________________________________
b) Escriba el código necesario para que funcione correctamente la clase Set utilizada en la
clase prueba.______________________________________________________________________
______________________________________________________________________
______________________________________________________________________
 */
public class Entero implements Comparable<Entero>{

	//ATRIBUTOS
	private int num;

	//CONSTRUCTOR
	public Entero(int num) {
		super();
		this.num = num;
	}

	//CONSTRUCTOR Vacío
	public Entero() {
		super();
	}

	//GETTER Y SETTER
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	//To String
	@Override
	public String toString() {
		return "Entero [num=" + num + "]";
	}

	//HASHCODE -- Para pasar los Strings a Int 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}

	//EQUAL -- Para que en los Set no se metan repetidos
	@Override 
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entero other = (Entero) obj;
		if (num != other.num)
			return false;
		return true;
	}

	//IMPLEMENTS METHODS
	@Override
	public int compareTo(Entero num) {
		// TODO Auto-generated method stub
		//return 0;
		
		return (this.getNum() - num.getNum()); //para ordenar numéricamente
	}
	
	//MÉTODOS
	
	public int suma(Entero a, Entero b) {
		
		return (a.getNum() + b.getNum());
	}
}
