package pack_Figura;

public class Circulo extends Figura{

	//ATRIBUTOS
	double radio;

	//CONSTRUCTOR
	public Circulo(/*String color,*/ double radio) {
		super(/*color*/);
		this.radio = radio;
	}

	//GETTER Y SETTER
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	//To String
	@Override
	public String imprimirCaracteristicas() {
		return super.imprimirCaracteristicas()+"Circulo [radio=" + radio + "]";
	}
	
	//METODOS
	
	public double calcularPerimetro() {
		
		double perimetro;
		
		perimetro = 2 * Figura.getPi() * radio;
		
		return perimetro;
	}
	
	public double calcularArea() {
		
		double area;
		
		area = Figura.getPi() * Math.pow(this.radio, 2);
		
		return area;
	}
	
}
