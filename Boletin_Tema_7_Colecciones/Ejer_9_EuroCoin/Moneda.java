package Ejer_9_EuroCoin;

/*
 * 9. La m�quina Eurocoin genera una moneda de curso legal cada vez que se pulsa un
 * bot�n siguiendo la siguiente pauta: o bien coincide el valor con la moneda anteriormente generada 
 * - 1 c�ntimo, 2 c�ntimos, 5 c�ntimos, 10 c�ntimos, 25 c�ntimos, 50 c�ntimos, 1 euro o 2 euros 
 * - o bien coincide la posici�n � cara o cruz. 
 * Simula, mediante un programa, la generaci�n de 6 monedas aleatorias siguiendo la pauta correcta. 
 * Cada moneda generada debe ser una instancia de la clase Moneda 
 * y la secuencia se debe ir almacenando en una lista.
 * 
 * Ejemplo:
 * 2 c�ntimos � cara
 * 2 c�ntimos � cruz
 * 50 c�ntimos � cruz
 * 1 euro � cruz
 * 1 euro � cara
 * 10 c�ntimos � cara
 */

public class Moneda {

	//ATRIBUTOS
	private String posicion;
	private String cantidad;
	private static String[] pos = {"cara", "cruz"};
	private static String[] cant = {"1 centimo", "2 centimos", "5 centimos", "10 centimos", "25 centimos", "50 centimos", "1 euro", "2 euros"};
	
	//CONSTRUCTOR LLENO
	public Moneda(String posicion, String cantidad) {
		super();
		this.posicion = posicion;
		this.cantidad = cantidad;
	}

	//CONSTRUCTOR VAC�O
	public Moneda() {
		super();
	}

	//GETTER Y SETTER
	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public static String[] getPos() {
		return pos;
	}

	public static void setPos(String[] pos) {
		Moneda.pos = pos;
	}

	public static String[] getCant() {
		return cant;
	}

	public static void setCant(String[] cant) {
		Moneda.cant = cant;
	}

	//To String
	@Override
	public String toString() {
		return "Moneda [posicion=" + posicion + ", cantidad=" + cantidad + "]";
	}
	
	
}
