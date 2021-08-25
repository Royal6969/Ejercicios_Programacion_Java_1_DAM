package Ejer_4_Tiempo;

public class Tiempo {

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
	
	//ATRIBUTOS
	private int segundos, minutos, horas;

	//CONSTRUCTOR
	public Tiempo(int segundos, int minutos, int horas) {
		super();
		this.segundos = segundos;
		this.minutos = minutos;
		this.horas = horas;
	}

	//GETTER Y SETTER
	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	//TO String
	@Override
	public String toString() {
		return "Tiempo [segundos=" + segundos + ", minutos=" + minutos + ", horas=" + horas + "]";
	}
	
	//METODO SUMAR 
	
	public void sumarTiempos(Tiempo t1) { //aqui declaro el objeto como en prueba_Tiempo
		
		int aux;
		
		if(this.segundos+t1.segundos>=60) {
			aux = (this.segundos+t1.segundos)/60;
			this.minutos += aux;
			
			this.segundos += (t1.segundos-60*aux);
			
		}else {
			this.segundos += t1.segundos;
		}
		
		if(this.minutos+t1.minutos>=60) {
			aux = (this.minutos+t1.minutos)/60;
			this.horas += aux;
			
			this.minutos += (t1.minutos-60*aux);
			
		}else {
			this.minutos += t1.minutos;
		}
		
		this.horas += t1.horas;
	}
	
	public void restarTiempos(Tiempo t1) {
		int aux;
		
		if(this.horas-t1.horas<=0) {
			aux = (this.horas-t1.horas)*-60; //si de la resta surge un negativo, y se multiplica por un positivo, quedaria feo esto
			this.minutos -= aux; 
			
			this.horas = 0;
		
		}else {
			this.horas -= t1.horas;
		}
		if(this.minutos-t1.minutos<=60) {
			aux = (this.minutos-t1.minutos)/60;
			this.segundos -= aux;
			
			this.minutos -= (t1.minutos+60*aux);
		
		}else {
			this.minutos -= t1.minutos;
		}
		this.segundos -= t1.segundos;
	}
	
}
