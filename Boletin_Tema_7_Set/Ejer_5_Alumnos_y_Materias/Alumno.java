package Ejer_5_Alumnos_y_Materias;

/*
 * 5. Dados tres conjuntos con los alumnos aprobados respectivamente 
 * en un examen del idioma inglés, el francés y el alemán. 
 * Se pide implementar un método que devuelva un array con los tres conjuntos siguientes:
 * 
 * a. candidatos que superaron la prueba de inglés y otra más.
 * b. candidatos que superaron al menos dos idiomas.
 * c. candidatos que superaron sólo un examen.
 */

public class Alumno implements Comparable<Alumno>{

	//ATRIBUTOS
	private String nombre;
	private int id;
	
	//CONSTRUCTOR Lleno
	public Alumno(String nombre, int id) {
		super();
		this.nombre = nombre;
		this.id = id;
	}

	//CONSTRUCTOR Vacío
	public Alumno() {
		super();
	}

	//GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//To STring 
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", id=" + id + "]";
	}
	
	//cuando pongo el comparable arriba, me da error, porque ahora aqui tengo que crear el compare to
	public int compareTo(Alumno sergio) {
		
		return this.nombre.compareToIgnoreCase(sergio.nombre);
	}

	//
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        
        //smp que vaya a usar el equals del set... van estos 3 smp antes
        
        if(this.id != other.id) {
        	
        	return false;
        }
        return true;
	}//to esto es para cuando se vaya a meter un id repetido, no lo permita, no se meta, porque en los set no pueden haber elementos repetidos

	@Override
	public int hashCode() { //recordamos que el hashCode es para meter un atributo y que lo meta ordenado
		
		return id;
	}
	
	
}
