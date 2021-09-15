package Ejer_9_EuroCoin;
/*
 * 9. La máquina Eurocoin genera una moneda de curso legal 
cada vez que se pulsa un botón siguiendo la siguiente pauta: 
o bien coincide el valor con la moneda anteriormente generada 
- 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25 céntimos, 50 céntimos, 1 euro o 2 euros 
- o bien coincide la posición – cara o cruz. 
Simula, mediante un programa, la generación de 6 monedas aleatorias siguiendo la pauta correcta. 
Cada moneda generada debe ser una instancia de la clase Moneda 
y la secuencia se debe ir almacenando en una lista.
Ejemplo:
2 céntimos – cara
2 céntimos – cruz
50 céntimos – cruz
1 euro – cruz
1 euro – cara
10 céntimos – cara
 */
public class Moneda {

	//ATRIBUTOS
	//no los dice el enunciado... hay que intuirlos... o como coño se intuyen?
	private String posicion;
	private String cantidad;
	private static String[] lado = {"cara", "cruz"};
	private static String[] valor = {"1 centimo", "2 centimos", "5 centimos", "10 centimos", "25 centimos", "50 centimos", "1 euro", "2 euros"};
	
	//CONSTRUCTOR Vacío
	public Moneda() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Moneda(String posicion, String cantidad) {
		super();
		this.posicion = posicion;
		this.cantidad = cantidad;
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

	public static String[] getLado() {
		return lado;
	}

	public static void setLado(String[] lado) {
		Moneda.lado = lado;
	}

	public static String[] getValor() {
		return valor;
	}

	public static void setValor(String[] valor) {
		Moneda.valor = valor;
	}

	//To String
	@Override
	public String toString() {
		return "Moneda [posicion=" + posicion + ", cantidad=" + cantidad + "]";
	}
	
	
}
