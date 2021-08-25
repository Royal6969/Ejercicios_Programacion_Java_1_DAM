package Ejer_4_Tiempo;

/*4. Crea la clase Tiempo con los métodos suma y resta . 
 * Los objetos de la clase Tiempo son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20, 30) 
 * donde los parámetros que se le pasan al constructor son las horas, los minutos y los segundos respectivamente. 
 * Crea el método toString para ver los intervalos de tiempo de la forma 10h 35m 5s . 
 * Permite la suma de dos objetos de esta clase: por ejemplo 30m 40s y 35m 20s el resultado debería ser 1h 6m 0s . 
 * Realiza un programa de prueba para comprobar que la clase funciona bien.
*/

/*
 * Un objeto de la clase Tiempo se puede crear de dos maneras diferentes.
 * Se pueden indicar las horas, los minutos y los segundos de la forma new Tiempo(3, 20, 45), 
 * o bien se puede indicar únicamente la cantidad de segundos de la forma new Tiempo(12045) 
 * (ambos objetos definen el mismo intervalo de tiempo).
 * Internamente, la clase solo almacena los segundos totales. 
 * A partir de éstos, se puede deducir todo lo demás.
 */

public class Tiempo_INTERNET {

	//ATRIBUTOS//
	private int segundos;

	//CONSTRUCTOR//
	public Tiempo_INTERNET(int segundos) {
		super();
		this.segundos = segundos;
	}

	//volvemos a generar el constructor y le añadimos las horas y minutos
	public Tiempo_INTERNET(int horas, int minutos, int segundos) {
		super();
		//this.segundos = segundos; 	(OJO, esta linea la vamos a cambiar)
		//por un calculo que pase todo el formato del tiempo a segundos, es decir, 
		//pasar las horas y minutos a segundos y sumarlo todos para obtener los segundos totales
		this.segundos = (horas*3600)+(minutos*60)+segundos; 
	}

	//GETTER Y SETTER//
	public int getSegundos() {
		return segundos;
	}
/*
 *	public void setSegundos(int segundos) {
 *		this.segundos = segundos;
 *	}
 *	SOLO NOS INTERESA EL GETTER
 */	
	
	//TO String//
		@Override
		public String toString() {
			//return "Tiempo [segundos=" + segundos + "]"; esto tan feo lo vamos a cambiar dps, pero antes...
			
			int segundos, minutos, horas; 
			
			segundos = this.segundos;
			
			horas = segundos/3600;
			segundos -= horas*3600; //NO ENTIENDO ESTA LINEA
			
			minutos = segundos/60;
			segundos -= minutos*60; //NO ENTIENDO ESTA LINEA
			
			if(this.segundos<0) {
				return "-("+(-horas)+" horas "+(-minutos)+" minutos "+(-segundos)+"segundos)"; //por qué tiene las variables en negativo??
				
			}else {
				return horas+" horas "+minutos+" minutos "+segundos+" segundos";
			}
		}
		
	//MÉTODOS de SUMAR Y RESTAR los tiempos//
	public Tiempo_INTERNET suma(Tiempo_INTERNET t) { //aquí mismo declaramos un tiempo llamado (t)
		return new Tiempo_INTERNET(this.segundos+t.getSegundos()); //NO ENTIENDO ESTA LINEA
	}
	
	public Tiempo_INTERNET resta(Tiempo_INTERNET t) {
		return new Tiempo_INTERNET(this.segundos-t.getSegundos());
	}

	
	

	
}
