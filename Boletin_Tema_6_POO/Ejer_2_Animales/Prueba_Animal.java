package Ejer_2_Animales;

public class Prueba_Animal {

	public static void main(String[] args) {
		Gato gato=new Gato("Macho", 5, false);
		Perro perro=new Perro("Hembra", 3, 10);
		Ping�ino pingu=new Ping�ino("Macho", 50, 3);
		Canario cani=new Canario("Hembra", 100, "Peque�o");
		Lagarto lag=new Lagarto("Macho", 20);
		
		gato.caga();
		perro.cazar();
		pingu.ba�arse();
		cani.cantar();
		lag.cola();
	}
}
