package pack_Figura;

public class tEscaleno extends Triangulo{

	//ATRIBUTOS
	private double lado1, lado2, lado3;

	//CONSTRUCTOR
	public tEscaleno(/*String color,*/ double base, double altura, double lado1, double lado2, double lado3) {
		super(/*color,*/ base, altura);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
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

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	//To String
	@Override
	public String imprimirCaracteristicas() {
		return super.imprimirCaracteristicas()+"tIsosceles [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + "]";
	}
	
	//METODOS
	public double calcularPerimetro() {
		
		double perimetro;
		
		perimetro = this.lado1 + this.lado2 + this.lado3;
		
		return perimetro;
	}
	
}
