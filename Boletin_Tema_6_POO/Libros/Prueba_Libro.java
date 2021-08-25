package Libros;

public class Prueba_Libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro lib = new Libro("A1B2C3", "Programacion", "Eva", 150);
		
		Libro librito = new Libro();
		
		System.out.println(lib);
		
		System.out.println(librito);
		
		librito.setTitulo("Base De Datos");
		
		System.out.println(librito);
		
		System.out.println(librito.getTitulo());
		
		
	}

}
