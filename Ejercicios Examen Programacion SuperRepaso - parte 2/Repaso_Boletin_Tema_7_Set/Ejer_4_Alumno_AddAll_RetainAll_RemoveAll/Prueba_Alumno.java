package Ejer_4_Alumno_AddAll_RetainAll_RemoveAll;
import java.util.Scanner;
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
public class Prueba_Alumno {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista_Alumnos alumnos = new Lista_Alumnos();
		
		Alumno alumno1 = new Alumno("Sergio");
		Alumno alumno2 = new Alumno("Carlos");
		Alumno alumno3 = new Alumno("Fernando");
		Alumno alumno4 = new Alumno("JuanCarlos");
		Alumno alumno5 = new Alumno("Chema");
		Alumno alumno6 = new Alumno("Alfonso");
		Alumno alumno7 = new Alumno("Adan");
		Alumno alumno8 = new Alumno("Angel");
		
		alumnos.getLista_alumnos_s1().add(alumno1);
		alumnos.getLista_alumnos_s1().add(alumno2);
		alumnos.getLista_alumnos_s1().add(alumno3);
		alumnos.getLista_alumnos_s1().add(alumno4);
		alumnos.getLista_alumnos_s1().add(alumno5);
		alumnos.getLista_alumnos_s1().add(alumno6);
		
		alumnos.getLista_alumnos_s2().add(alumno4);
		alumnos.getLista_alumnos_s2().add(alumno5);
		alumnos.getLista_alumnos_s2().add(alumno6);
		alumnos.getLista_alumnos_s2().add(alumno7);
		alumnos.getLista_alumnos_s2().add(alumno8);
		
		System.out.println(alumnos.getLista_alumnos_s1().toString());
		System.out.println();
		System.out.println(alumnos.getLista_alumnos_s2().toString());
		System.out.println();
		
		int opcion;
		
		do {
			showMenu();
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				alumnos.alumnosRepetidores(alumnos.getLista_alumnos_s1(), alumnos.getLista_alumnos_s2());
				break;
				
			case 2:
				alumnos.alumnosMatriculados(alumnos.getLista_alumnos_s1(), alumnos.getLista_alumnos_s2());
				break;
				
			case 3:
				alumnos.alumnosNoRepetidores(alumnos.getLista_alumnos_s1(), alumnos.getLista_alumnos_s2());
				break;
				
			case 0:
				System.out.println("gracias y hasta luego!");
				break;
			}
			
		}while(opcion != 0);
	}
	//MÉTODOS
	public static void showMenu() {
		System.out.println("1. muestre un listado con los alumnos repetidores.\n"
				+ "2. muestre un listado con cada alumno matriculado en uno u otro curso.\n"
				+ "3. muestre un listado con los alumnos NO repetidores en el presente curso.\n"
				+ "0. salir");
	}
	
}
