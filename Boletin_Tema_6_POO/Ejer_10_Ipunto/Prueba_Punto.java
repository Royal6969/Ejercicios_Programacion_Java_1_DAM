package Ejer_10_Ipunto;

public class Prueba_Punto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double distancia;
		
		Punto punto1 = new Punto(3.5, 9.0);
		Punto punto2 = new Punto(15.8, 20.0);
		
		Pixel pixel1 = new Pixel(30.0, 15.5);
		Pixel pixel2 = new Pixel(19.9, 15.1);
		
		punto1.imprimir();
		punto2.imprimir();
	
		punto1.mover(punto2);
		punto2.mover(punto1);
		
		punto1.mover(15.5, 20.9);
		punto2.mover(13.7, 9.8);
		
		punto1.imprimir();
		punto2.imprimir();
		
		distancia = punto1.distancia(punto2);
		System.out.println(distancia);
		distancia = punto2.distancia(punto1);
		System.out.println(distancia);
		
		distancia = punto1.distanciaOrigen();
		System.out.println(distancia);
		distancia = punto2.distanciaOrigen();
		System.out.println(distancia);
		
		punto1.borrar();
		punto2.borrar();
		
		////////////////////////////////////////////////////////
		
		pixel1.imprimir();
		pixel2.imprimir();
		
		distancia = pixel1.distanciaOrigen();
		System.out.println(distancia);
		distancia = pixel2.distanciaOrigen();
		System.out.println(distancia);
		
		distancia = pixel1.distancia(punto2);
		System.out.println(distancia);
		distancia = pixel2.distancia(punto1);
		System.out.println(distancia);
		
		pixel1.cambiarColor(3);
		pixel2.cambiarColor(5);
		
		pixel1.imprimir();
		pixel2.imprimir();
		
		pixel1.borrar();
		pixel2.borrar();
		
		pixel1.imprimir();
		pixel2.imprimir();
	}

}
