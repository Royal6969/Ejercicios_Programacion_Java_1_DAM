package Animales;

public class Prueba_Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ave golondrina = new Ave();
		Ave cuervo = new Ave(Sexo.MACHO);
		
		Ping�ino pingu = new Ping�ino();
		Ping�ino pingoleta = new Ping�ino(Sexo.HEMBRA);
		
		golondrina.vuela();
		pingu.vuela();
		pingu.aseate();
		pingu.duerme();
		pingu.setRaza("Emperador");
		
		System.out.println(pingu);
	}
	
}
