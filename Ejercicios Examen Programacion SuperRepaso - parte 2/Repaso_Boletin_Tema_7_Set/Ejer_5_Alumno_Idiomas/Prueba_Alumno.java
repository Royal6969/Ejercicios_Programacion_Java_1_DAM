package Ejer_5_Alumno_Idiomas;
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
		Alumno alumno9 = new Alumno("David");
		
		alumnos.getIngles().add(alumno1);
		alumnos.getIngles().add(alumno2);
		alumnos.getIngles().add(alumno3);
		alumnos.getIngles().add(alumno4);
		
		alumnos.getFrances().add(alumno3);
		alumnos.getFrances().add(alumno4);
		alumnos.getFrances().add(alumno5);
		alumnos.getFrances().add(alumno6);
		alumnos.getFrances().add(alumno9);
		
		alumnos.getAleman().add(alumno5);
		alumnos.getAleman().add(alumno6);
		alumnos.getAleman().add(alumno7);
		alumnos.getAleman().add(alumno8);
		
		int opcion;
		
		do {
			showMenu();
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				alumnos.aprobadosInglesMasOtraMas(alumnos.getIngles(), alumnos.getFrances(), alumnos.getAleman());
				break;
				
			case 2:
				alumnos.aprobadosAlMenosDosIdiomas(alumnos.getIngles(), alumnos.getFrances(), alumnos.getAleman());
				break;
				
			case 3:
				alumnos.aprobadosSoloUnExamen(alumnos.getIngles(), alumnos.getFrances(), alumnos.getAleman());
				break;
				
			case 0:
				System.out.println("gracias y hasta luego!");
				break;
			}
			
		}while(opcion != 0);
	}
	//MÉTODOS
	public static void showMenu() {
		System.out.println("1. muestre un listado con los candidatos que superaron la prueba de inglés y otra más.\n"
				+ "2. muestre un listado con los candidatos que superaron al menos dos idiomas.\n"
				+ "3. muestre un listado con los candidatos que superaron sólo un examen.\n"
				+ "0. salir");
	}
	
}
