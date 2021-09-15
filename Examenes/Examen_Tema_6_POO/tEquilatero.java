package pack_Figura;

public class tEquilatero extends Triangulo{

	//ATRIBUTOS
	private double lado1;

	//CONSTRUCTOR
	public tEquilatero(/*String color,*/ double base, double altura, double lado1) {
		super(/*color,*/ base, altura);
		this.lado1 = lado1;
	}

	//GETTER Y SETTER
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	//To String
	@Override
	public String imprimirCaracteristicas() {
		return super.imprimirCaracteristicas()+"tEquilatero [lado1=" + lado1 + "]";
	}
	
	//METODOS
	public double calcularPerimetro() {
		
		double perimetro;
		
		perimetro = this.lado1 * 3;
		
		return perimetro;
	}
	
	
}
