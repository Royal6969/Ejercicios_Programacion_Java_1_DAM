package Ejer_18_Proyecto_Medicamento;

import java.util.Scanner;

/*
 * B. Clase MedicamentoImpl: establecer que dos medicamentos no son iguales si tienen códigos distintos (redefinir equals)
 * ATRIBUTOS:
 * private Integer codigo;
 * private String nombre;
 * private Double precio;
 * private Boolean receta;
 * 
 * CONSTRUCTOR:
 * public MedicamentoImpl(Integer c, String n, Double p, Boolean r) throws
 * ExcepcionPrecioMenorCero{
 * if (p<0){
 * throw new ExcepcionPrecioMenorCero(" Error intento de crear un medicamento con precio negativo");
 * }
 * codigo=c;
 * nombre=n;
 * // comprobar que p es positivo
 * precio=p;
 * receta=r;
 * }
 */
public class Medicamento_Impl implements Medicamento{ //estaba clarísimo lo del implements Medicamento no?

	//ATRIBUTO
	private int codigo;
	private String nombre;
	private double precio;
	private boolean receta;
	
	//CONSTRUCTOR Vacío
	public Medicamento_Impl() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Medicamento_Impl(int codigo, String nombre, double precio, boolean receta) throws ExcepcionPrecioMenorCero {
		super();
		if (precio < 0){
			throw new ExcepcionPrecioMenorCero(); //el mensajito ya lo hemos definido en su clase Excepción
		}
		//y esto ya sería el constructor lleno normal
		this.codigo= codigo;
		this.nombre = nombre;
		// comprobar que p es positivo
		this.precio = precio;
		this.receta = receta;
	}

	//GETTER Y SETTER
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isReceta() {
		return receta;
	}

	public void setReceta(boolean receta) {
		this.receta = receta;
	}

	//To String
	@Override
	public String toString() {
		return "Medicamento_Impl [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", receta=" + receta
				+ "]";
	}

	//Add unimplements methods
	@Override
	public int compareTo(Medicamento medicamento) {
		if(this.getNombre().equalsIgnoreCase(medicamento.getNombre())) {
			return (int)this.getPrecio() - (int)medicamento.getPrecio();
		}else {
			return this.getNombre().compareToIgnoreCase(medicamento.getNombre());
		}
	}

	@Override
	public boolean getReceta() {
		// TODO Auto-generated method stub
		return false;
	}

	//ojito aunque este metodo es un unimplemented method, ya se trata de un método que tenemos que tratar
	//MÉTODOS
	@Override
	public void incrementaPrecio(double p) throws ExcepcionPrecioMenorCero {
		// TODO Auto-generated method stub
		this.setPrecio(this.getPrecio() + p); //esto es justo lo que dice que hace, se setea el nuevo precio, de haber cogido el precio base y sumarle el precio que se estaba pasando como parámetro
	}
	
	public Medicamento_Impl pedirDatos() throws ExcepcionPrecioMenorCero { //recordar que hemos quedado en que en todo lo que intervenga el precio, vamos a poner la excepcion
		String tieneReceta; //ojito!! ya tenemos los atributos en esta clase, asique no los vamos a volver a declarar, pero si que necesitamos guardar el valor del boolean receta y lo guardaremos como un true=si y false=no en este String
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el codigo del medicamento");
		this.codigo = sc.nextInt();
		System.out.println("Introduzca el nombre del medicamento");
		this.nombre = sc.next();
		System.out.println("Introduzca el precio del medicamento");
		this.precio = sc.nextDouble();
		System.out.println("¿El usuario necesita receta medica?");
		tieneReceta = sc.next();
		
		if(tieneReceta == "si") { //aqui le damos valor a nuestro "tieneReceta"
			this.receta = true;
		}else {
			this.receta = false;
		}
		
		Medicamento_Impl medicamento = new Medicamento_Impl(codigo, tieneReceta, precio, receta);
		return medicamento;
	}
	
	//dps de haber hecho el método de si dos medicamentos son iguales o no, vamos a redefinir el método equals
	public boolean equals(Object medicamentoX) { //para hacerlo, usamos un objeto de la clase Object de Java //ojo equals no admite void!!
		boolean sonIguales = false;
		
		if(medicamentoX instanceof Medicamento_Impl) { //si medicamentoX es un objeto de la clase medicamento_impl (ojo que Object es la clase padre de Java)
			Medicamento_Impl medicamento = (Medicamento_Impl) medicamentoX;
			sonIguales = this.getCodigo() == medicamento.getCodigo()
					&& 	 this.getNombre().equalsIgnoreCase(medicamento.getNombre())
					&&	 this.getPrecio() == medicamento.getPrecio()
					&&   this.getReceta() == medicamento.getReceta();
		}
		return sonIguales;
	}
	public boolean equals_v2 (Medicamento_Impl medicamentoY) { //mucho mejor esto si lo entiendo
		boolean sonIguales = false;
			
		sonIguales = this.getCodigo() == medicamentoY.getCodigo()
				&& 	 this.getNombre().equalsIgnoreCase(medicamentoY.getNombre())
				&&	 this.getPrecio() == medicamentoY.getPrecio()
				&&   this.getReceta() == medicamentoY.getReceta();
		
		return sonIguales;
	}
	public boolean equals_v3 (Medicamento_Impl medicamentoY) { //definitivamente me quedo con este
		boolean sonIguales = false;
			
		if(this.getCodigo() == medicamentoY.getCodigo()
				&& 	 this.getNombre().equalsIgnoreCase(medicamentoY.getNombre())
				&&	 this.getPrecio() == medicamentoY.getPrecio()
				&&   this.getReceta() == medicamentoY.getReceta()) {
			sonIguales = true;
		}
		
		return sonIguales;
	}
}
