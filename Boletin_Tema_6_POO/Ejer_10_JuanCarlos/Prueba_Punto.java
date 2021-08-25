package Ejer_10_JuanCarlos;

public class Prueba_Punto {

	public static void main(String[] args) {
		/*Haga un programa principal para probar todos los métodos construidos, tanto para la
		clase Punto, como para la clase Pixel. Compruebe cómo se pueden invocar los métodos
		de la clase Punto desde objetos de la clase Pixel*/
		
		Punto punto=new Punto(5, 5);
		Punto punto1=new Punto(10,10);
		Pixel pixel=new Pixel(punto, 5);
		double sol;
		Multilinea conjrecta=new Multilinea();
		
		punto.mover(8, 9);
		punto.imprime();
		punto.mover(pixel);
		punto.imprime();
		pixel.imprime();
		pixel.cambiacolor(9);
		pixel.imprime();
		sol=pixel.distancia(Punto.getOrigen());
		System.out.println(sol);
		sol=punto.distancia(pixel);
		System.out.println(sol);
		punto.imprime();
		pixel.imprime();
		sol=punto.distanciaorigen();
		System.out.println(sol);
		punto.cambiaorigen(pixel);
		punto.imprime();
		punto.imprime();
		pixel.imprime();
		punto.borrar();
		pixel.borrar();
		punto.imprime();
		pixel.imprime();
		Recta recta=new Recta(punto, punto1);
		recta.imprime();
		conjrecta.insertalado(recta);
		conjrecta.imprime();
		
	}

}
