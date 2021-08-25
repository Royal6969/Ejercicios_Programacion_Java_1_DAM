package Gatos;

public class Gato {

	// atributos //
	
	private String color, raza, sexo;
	private int edad;
	private double peso;
	
/* METODOS -------------------------- */
	
	// Constructor //
	
	public Gato(String color, String raza, String sexo, int edad, double peso) {
		super();
		this.color = color;
		this.raza = raza;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
	}

	// GETTER y SETTER //
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// TO String //
	@Override
	public String toString() {
		return "Gato [color=" + color + ", raza=" + raza + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + "]";
	}
	
	// ACCIONES //
	
	public void maullar() {
		System.out.println("Miiaauuu");
	}
	
	public void ronronear() {
		System.out.println("Mmmrrrrrr");
	}
	
	public void comer(String comida) {

		if(comida.equals("pescado")) {
			System.out.println("Ñam! que rico! graciasss");
		}else {
			System.out.println("Uff, lo siento, sólo como pescado");
		}
	}
	
	public void pelearCon(Gato enemigo) { //el Gato seria como un int y el enemigo es la variable
		
		if(this.sexo.equals("hembra")) {
		//si, miGato suSexo esIgual a hembra
			System.out.println("lo siento, soy chica y no peleo");
			
		}else { // y este else es para el gato enemigo
			if(enemigo.sexo.equals("hembra")) {
				System.out.println("lo siento, no hago daño a las gatas");
			}else {
				System.out.println("Prepárate para morir");
			}
		}
	}
	
	
	
	
	
	
	
}
