package Ejer_9_Empleados;

public class Empleado {

	//ATRIBUTOS
	private String nombre;
	private String cedula;
	private int edad;
	private boolean casado;
	private double salario;
	private static int nCedula = 0; //es estatico porque es un atributo recurrente que utilizamos para ver la posición máxima del array
	
	//CONSTRUCTOR vacio
	// este vacio solo se crea dps de haber creado las clases hijas
	public Empleado() {
		super();
	}

	//CONSTRUCTOR lleno
	public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
		this.nCedula++; //para cuando se meta un nuevo programador se sume 1
	}

	//GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public static int getnCedula() {
		return nCedula;
	}

	public static void setnCedula(int nCedula) {
		Empleado.nCedula = nCedula;
	}

	//To String
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + "\n cedula=" + cedula + "\n edad="
				+ edad + "\n casado=" + casado + "\n salario=" + salario + "]\n";
	}
	
	//MÉTODOS
	public void mostrarCategoriaPorEdad() {
		
		if(this.edad<=21) {
			System.out.println("Principiante");
		}
		if(this.edad>=22 && edad<=35) {
			System.out.println("Intermedio");
		}
		if(this.edad>35) {
			System.out.println("Senior");
		}
	}
	
	public void aumentarSalario(double porcentaje) {
		
		this.salario += (this.salario*(porcentaje/100)); 
		
		System.out.println(this.salario);
	}

	
	
	
}
