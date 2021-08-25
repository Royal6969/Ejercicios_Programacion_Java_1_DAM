package Ejer_4_Conjunto_Personas;
 
 /* . Sean s1 y s2, los conjuntos que respectivamente representan a los alumnos
matriculados en una asignatura en el presente curso académico y en el anterior.
Set permite simular operaciones sobre conjuntos: unión mediante el método
addAll(Collection), intersección (sólo elementos comunes a los dos conjuntos)
mediante el método retainAll(Collection) y la diferencia mediante el método
removeAll(Collection).
Se desea realizar:
a. un método que a partir de ambos conjuntos, muestre un listado con los
alumnos repetidores.
b. un método que a partir de ambos conjuntos, muestre un listado con cada
alumno matriculado en uno u otro curso.
c. un método que a partir de ambos conjuntos, muestre un listado con los
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
