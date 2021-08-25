package Ejer_14_Cadena_Montaje_Robots;

/*
 * 14. Tenemos una cadena de montaje de robots de distintos tipos. 
 * Hemos modelado las distintas piezas de los robots a partir de la clase PiezaRobot:
 * 
 * public class PiezaRobot {
 * private int referencia; // número de fabricación único para cada pieza
 * private double claveRobot; // tipo de robot al que pertenece la pieza
 * private String pieza; // tipo de pieza
 * private String testCalidad; //resultado de test de calidad sobre la pieza 
 * // Implementación de métodos set y get.
 * }
 */

public class PiezaRobot implements Comparable<PiezaRobot>{
	
	//ATRIBUTOS
	private int referencia; // número de fabricación único para cada pieza
	private double claveRobot; // tipo de robot al que pertenece la pieza
	private String pieza; // tipo de pieza
	private String testCalidad; //resultado de test de calidad sobre la pieza 
	
	//CONSTRUCTOR Lleno
	public PiezaRobot(int referencia, double claveRobot, String pieza, String testCalidad) {
		super();
		this.referencia = referencia;
		this.claveRobot = claveRobot;
		this.pieza = pieza;
		this.testCalidad = testCalidad;
	}

	//CONSTRUCTOR Vacío
	public PiezaRobot() {
		super();
	}

	//GETTER Y SETTER
	public int getReferencia() {
		return referencia;
	}

	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}

	public double getClaveRobot() {
		return claveRobot;
	}

	public void setClaveRobot(double claveRobot) {
		this.claveRobot = claveRobot;
	}

	public String getPieza() {
		return pieza;
	}

	public void setPieza(String pieza) {
		this.pieza = pieza;
	}

	public String getTestCalidad() {
		return testCalidad;
	}

	public void setTestCalidad(String testCalidad) {
		this.testCalidad = testCalidad;
	}

	//To String
	@Override
	public String toString() {
		return "PiezaRobot [referencia=" + referencia + ", claveRobot=" + claveRobot + ", pieza=" + pieza
				+ ", testCalidad=" + testCalidad + "]";
	}

	//Implement Methods
	@Override
	public int compareTo(PiezaRobot comparar) {
		
		if(this.getClaveRobot() != comparar.getClaveRobot()) {
			
			return (int) (this.getClaveRobot() - this.getClaveRobot());
		}else {
			
			return this.getPieza().compareToIgnoreCase(comparar.getPieza());
		}
	}
	
}
