package pack_Figura;

public class tIsoceles extends Triangulo{

	//ATRIBUTOS
	private double lado1, lado2;

	//CONSTRUCTOR
	public tIsoceles(/*String color,*/ double base, double altura, double lado1, double lado2) {
		super(/*color,*/ base, altura);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	//GETTER Y SETTER
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	//To String
	@Override
	public String imprimirCaracteristicas() {
		return super.imprimirCaracteristicas()+"tEscaleno [lado1=" + lado1 + ", lado2=" + lado2 + "]";
	}
	
	//METODOS
	public double calcularPerimetro() {
		
		double perimetro;
		
		perimetro = (this.lado1 * 2) + this.lado2;
		
		return perimetro;
	}
	
}

