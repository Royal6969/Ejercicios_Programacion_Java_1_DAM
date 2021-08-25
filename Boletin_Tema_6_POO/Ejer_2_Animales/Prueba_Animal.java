package Ejer_2_Animales;

public class Prueba_Animal {

	public static void main(String[] args) {
		Gato gato=new Gato("Macho", 5, false);
		Perro perro=new Perro("Hembra", 3, 10);
		Pingüino pingu=new Pingüino("Macho", 50, 3);
		Canario cani=new Canario("Hembra", 100, "Pequeño");
		Lagarto lag=new Lagarto("Macho", 20);
		
		gato.caga();
		perro.cazar();
		pingu.bañarse();
		cani.cantar();
		lag.cola();
	}
}
