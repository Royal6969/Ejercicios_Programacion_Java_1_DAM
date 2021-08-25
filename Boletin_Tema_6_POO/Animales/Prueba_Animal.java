package Animales;

public class Prueba_Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ave golondrina = new Ave();
		Ave cuervo = new Ave(Sexo.MACHO);
		
		Pingüino pingu = new Pingüino();
		Pingüino pingoleta = new Pingüino(Sexo.HEMBRA);
		
		golondrina.vuela();
		pingu.vuela();
		pingu.aseate();
		pingu.duerme();
		pingu.setRaza("Emperador");
		
		System.out.println(pingu);
	}
	
}
