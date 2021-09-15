package Ejer_4_Alumno_AddAll_RetainAll_RemoveAll;
/* 4. Sean s1 y s2, los conjuntos que respectivamente representan a los alumnos
matriculados en una asignatura en el presente curso académico y en el anterior.

Set permite simular operaciones sobre conjuntos: 
unión mediante el método addAll(Collection), 
intersección (sólo elementos comunes a los dos conjuntos) mediante el método retainAll(Collection) 
y la diferencia mediante el método removeAll(Collection).

Se desea realizar:
a. un método que a partir de ambos conjuntos, muestre un listado con los
alumnos repetidores.
b. un método que a partir de ambos conjuntos, muestre un listado con cada
alumno matriculado en uno u otro curso.
c. un método que a partir de ambos conjuntos, muestre un listado con los
alumnos NO repetidores en el presente curso
*/
import java.util.HashSet;
import java.util.Set;

public class Lista_Alumnos {

	//ATRIBUTOS
	/* 4. Sean s1 y s2, los conjuntos que respectivamente representan a los alumnos
	matriculados en una asignatura en el presente curso académico y en el anterior.*/
	Set<Alumno> lista_alumnos_s1 = new HashSet<Alumno>();
	Set<Alumno> lista_alumnos_s2 = new HashSet<Alumno>();
	
	//CONSTRUCTOR Vacío
	public Lista_Alumnos() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Lista_Alumnos(Set<Alumno> lista_alumnos_s1, Set<Alumno> lista_alumnos_s2) {
		super();
		this.lista_alumnos_s1 = lista_alumnos_s1;
		this.lista_alumnos_s2 = lista_alumnos_s2;
	}

	//GETTER Y SETTER
	public Set<Alumno> getLista_alumnos_s1() {
		return lista_alumnos_s1;
	}

	public void setLista_alumnos_s1(Set<Alumno> lista_alumnos_s1) {
		this.lista_alumnos_s1 = lista_alumnos_s1;
	}

	public Set<Alumno> getLista_alumnos_s2() {
		return lista_alumnos_s2;
	}

	public void setLista_alumnos_s2(Set<Alumno> lista_alumnos_s2) {
		this.lista_alumnos_s2 = lista_alumnos_s2;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Alumnos [lista_alumnos_s1=" + lista_alumnos_s1 + ", lista_alumnos_s2=" + lista_alumnos_s2 + "]";
	}
	
	//MÉTODOS
	//a. un método que a partir de ambos conjuntos, muestre un listado con los alumnos repetidores.
	public void alumnosRepetidores(Set<Alumno> lista_alumnos_s1, Set<Alumno> lista_alumnos_s2) {
		Set<Alumno> lista_repetidores = new HashSet<Alumno>(); //creamos una lista para unificar repetidores
		
		lista_repetidores.addAll(lista_alumnos_s1); //aquí se acaban de meter en "lista_repetidores" todos los elementos de "lista_Alumnos_s1"
		lista_repetidores.retainAll(lista_alumnos_s2); //aquí se han guardado las coincidencias que había entre s1 y s2
		
		System.out.println("Los alumnos repetidores son");
		System.out.println(lista_repetidores.toString());
		System.out.println();
	}
	//b. un método que a partir de ambos conjuntos, muestre un listado con cada alumno matriculado en uno u otro curso.
	public void alumnosMatriculados(Set<Alumno> lista_alumnos_s1, Set<Alumno> lista_alumnos_s2) {
		Set<Alumno> lista_matriculados = new HashSet<Alumno>(); //creamos una lista para unificar los alumnos
		
		lista_matriculados.addAll(lista_alumnos_s1); //aquí se acaban de meter en "lista_repetidores" todos los elementos de "lista_Alumnos_s1"
		lista_matriculados.addAll(lista_alumnos_s2);  //aquí se acaban de meter en "lista_repetidores" todos los elementos de "lista_Alumnos_s2"
		
		System.out.println("Los alumnos de este año en ambos cursos son:");
		System.out.println(lista_matriculados.toString());
		System.out.println();
	}
	//c. un método que a partir de ambos conjuntos, muestre un listado con los alumnos NO repetidores en el presente curso
	public void alumnosNoRepetidores(Set<Alumno> lista_alumnos_s1, Set<Alumno> lista_alumnos_s2) {
		Set<Alumno> lista_noRepetidores = new HashSet<Alumno>(); //creamos una lista para unificar los alumnos que NO han repetido
		
		lista_noRepetidores.addAll(lista_alumnos_s1);  //aquí se acaban de meter en "lista_repetidores" todos los elementos de "lista_Alumnos_s1"
		lista_noRepetidores.removeAll(lista_alumnos_s2); //aquí se acaban de eliminar las coincidencias de s2 con s1
	
		System.out.println("Los alumnos que NO son repetidores son:");
		System.out.println(lista_noRepetidores.toString());
		System.out.println();
	}
}
