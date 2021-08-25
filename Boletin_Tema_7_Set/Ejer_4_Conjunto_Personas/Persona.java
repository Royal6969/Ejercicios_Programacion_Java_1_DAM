package Ejer_4_Conjunto_Personas;
 
 /* . Sean s1 y s2, los conjuntos que respectivamente representan a los alumnos
matriculados en una asignatura en el presente curso acad�mico y en el anterior.
Set permite simular operaciones sobre conjuntos: uni�n mediante el m�todo
addAll(Collection), intersecci�n (s�lo elementos comunes a los dos conjuntos)
mediante el m�todo retainAll(Collection) y la diferencia mediante el m�todo
removeAll(Collection).
Se desea realizar:
a. un m�todo que a partir de ambos conjuntos, muestre un listado con los
alumnos repetidores.
b. un m�todo que a partir de ambos conjuntos, muestre un listado con cada
alumno matriculado en uno u otro curso.
c. un m�todo que a partir de ambos conjuntos, muestre un listado con los
alumnos NO repetidores en el presente curso
 */

public class Persona {

	//ATRIBUTOS
	String nombre;

	//CONSTRUCTOR
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	//CONSTRUCTOR VAcio
	public Persona() {
		super();
	}

	//GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//To String
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
	
	
}
