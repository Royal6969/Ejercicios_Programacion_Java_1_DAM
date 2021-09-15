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
public class Alumno {

	//ATRIBUTOS
	private String nombre; //como el enunciado no dice nada de atributos intuímos el más sencillo

	//CONSTRUCTOR Vacío
	public Alumno() {
		super();
	}

	//CONSTRUCTOR lleno
	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
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
		return "Alumno [nombre=" + nombre + "]";
	}
}
