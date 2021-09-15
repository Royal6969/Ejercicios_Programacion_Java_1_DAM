package pack_Figura;

public abstract class Triangulo extends Figura{

	//ATRIBUTOS
	private double base, altura;

	//CONSTRUCTOR
	public Triangulo(/*String color,*/ double base, double altura) {
		super(/*color*/);
		this.base = base;
		this.altura = altura;
	}

	//GETTER Y SETTER
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	//To String
	@Override
	public String imprimirCaracteristicas() {
		return super.imprimirCaracteristicas()+"Triangulo [base=" + base + ", altura=" + altura + "]";
	}
	
	//METODOS
	public double calcularArea() {
		
		double area;
		
		area = (this.altura * this.altura) / 2;
		
		return area;
	}
	
	
	
	
}
