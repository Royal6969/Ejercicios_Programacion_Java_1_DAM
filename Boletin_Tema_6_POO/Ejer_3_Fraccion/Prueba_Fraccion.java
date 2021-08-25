package Ejer_3_Fraccion;

public class Prueba_Fraccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Crear un objeto de la clase Fraccion o una fracción 
		Fraccion x = new Fraccion(2,3);
		Fraccion y = new Fraccion(4,3);
		
	//Mostrar una fracción
		System.out.println("x--> "+x.toString());
		//System.out.println("x--> "+x);
	
	//Suma de dos fracciones
		System.out.println("x+y = "+Fraccion.sumar(x, y));
		
	//Resta de dos fracciones
		System.out.println("x+y = "+Fraccion.restar(x, y));
	
	//Multiplicar dos fracciones
		System.out.println("x*y = "+Fraccion.multiplicar(x, y));
	
	//Dividir dos fracciones
		System.out.println("x/y = "+Fraccion.dividir(x, y));
		
	//Mostrar Fraccion inversa de x
		System.out.println("La inversa de x es: "+Fraccion.inversa(x));
		
	//Simplificar una fraccion
		Fraccion resultado1 = new Fraccion(5,10);
		System.out.println(resultado1.simplificar());
		
	//Operaciones combinadas
//		 Fraccion x = new Fraccion(2,3);	esta ya la tenemos creada desde el principio
//	     Fraccion y = new Fraccion(4,3);	esta ya la tenemos creada desde el principio
	     Fraccion z = new Fraccion(1,2);
	     Fraccion resultado2 = Fraccion.multiplicar(Fraccion.sumar(x,y),z);
	     System.out.println("(x+y)*z= "+resultado2);
	}

}
