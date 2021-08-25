package Ejer_18_Proyecto_Medicamento;

import java.util.Scanner;

/* B. Clase MedicamentoImpl: establecer que dos medicamentos no son iguales 
 * si tienen códigos distintos (redefinir equals)
 * 
 * ATRIBUTOS:
 * 
 * private Integer codigo;
 * private String nombre;
 * private Double precio;
 * private Boolean receta;
 * 
 * CONSTRUCTOR:
 * 
 * public MedicamentoImpl(Integer c, String n, Double p, Boolean r) throws
 * ExcepcionPrecioMenorCero{
 * 	if (p<0){
 * 		throw new ExcepcionPrecioMenorCero(" Error intento de crear un medicamento con precio negativo");
 * 	}
 * 
 * codigo=c;
 * nombre=n;
 * 
 *comprobar que p es positivo
 *
 *precio=p;
 *receta=r;
 *}
*/

public class Medicamento_Impl implements Medicamento{

	//ATRIBUTOS
	private int codigo;
	private String nombre;
	private double precio;
	private boolean receta;
	
	//CONSTRUCTOR Lleno
	public Medicamento_Impl(int c, String n, double p, boolean r) throws ExcepcionPrecioMenorCero{
		if (p<0){
			throw new ExcepcionPrecioMenorCero();
		}
		codigo=c;
		nombre=n;
		 
		//comprobar que p es positivo
		 
		precio=p;
		receta=r;
	}
	
	
	//CONSTRUCTOR Vacío
	public Medicamento_Impl() {
		super();
	}

	//GETTER Y SETTER
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	//public void setPrecio(double precio) {
	//	this.precio = precio;
	//}


	//public void setReceta(boolean receta) {
	//	this.receta = receta;
	//}
	
	//To String
	@Override
	public String toString() {
		return "Medicamento_Impl [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", receta=" + receta
				+ "]";
	}

	@Override
	public int compareTo(Medicamento arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCodigo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getReceta() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setPrecio(double np) throws ExcepcionPrecioMenorCero {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setReceta(boolean nr) {
		// TODO Auto-generated method stub
		
	}

	//MÉTODOS
	@Override
	public void incrementaPrecio(double p) throws ExcepcionPrecioMenorCero {
		// TODO Auto-generated method stub
		
		this.setPrecio(this.getPrecio() + p);
	}

	public Medicamento_Impl darAltaMedicameto() throws ExcepcionPrecioMenorCero {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		String nombre;
		double precio;
		boolean receta;
		String recetaUsuario;
		
		System.out.println("Introduzca un código");
		codigo = sc.nextInt();
		System.out.println("Introduzca un nombre");
		nombre = sc.next();
		System.out.println("Introduzca el precio");
		precio = sc.nextDouble();
		System.out.println("¿Tiene receta? (si/no)");
		recetaUsuario = sc.next();
		
		if(recetaUsuario.equalsIgnoreCase("si")) {
			receta = true;
		
		}else {
			receta = false;
		}
		
		Medicamento_Impl jarabe = new Medicamento_Impl(codigo, nombre, precio, receta);
		
		return jarabe;
	}
	
	public boolean equals(Object obj) {
		
		boolean esIgual = false;
		
		if(obj instanceof Medicamento_Impl) {
			Medicamento_Impl medicina = (Medicamento_Impl) obj;
			esIgual = this.getCodigo() == medicina.getCodigo() && this.getNombre().equalsIgnoreCase(medicina.getNombre()) && this.getPrecio() == medicina.getPrecio() && this.getReceta() == medicina.getReceta();
		}
		return esIgual;
	}

}
