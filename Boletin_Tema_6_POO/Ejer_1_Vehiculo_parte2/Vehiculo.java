package Ejer_1_Vehiculo_parte2;

public class Vehiculo {

	private static int vehiculosCreados=0;
	private static int kilometrosTotales=0;
	private int kilometrosRecorridos=0;
	
	
	public Vehiculo() {
		super();
		Vehiculo.vehiculosCreados+=1;
	}
	public Vehiculo(int kilometrosRecorridos) {
		super();
		this.kilometrosRecorridos = kilometrosRecorridos;
		Vehiculo.vehiculosCreados+=1;
		Vehiculo.kilometrosTotales+=kilometrosRecorridos;
	}
	
	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}
	public void setKilometrosRecorridos(int kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}

	public static int getVehiculosCreados() {
		return vehiculosCreados;
	}
	public static void setVehiculosCreados(int vehiculosCreados) {
		Vehiculo.vehiculosCreados = vehiculosCreados;
	}
	
	public static int getKilometrosTotales() {
		return kilometrosTotales;
	}
	public static void setKilometrosTotales(int kilometrosTotales) {
		Vehiculo.kilometrosTotales = kilometrosTotales;
	}
	
	
	@Override
	public String toString() {
		return "Vehiculo kilometrosRecorridos=" + kilometrosRecorridos + "]";
	}
	public void andar(int cont) {
		System.out.println("Mira que rapido voy");
		this.kilometrosRecorridos+=cont;
		Vehiculo.kilometrosTotales+=cont;
	}
}
