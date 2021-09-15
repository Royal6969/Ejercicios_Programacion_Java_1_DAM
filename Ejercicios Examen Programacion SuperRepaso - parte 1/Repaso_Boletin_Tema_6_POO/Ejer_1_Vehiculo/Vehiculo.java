package Ejer_1_Vehiculo;
/*
 * 1. Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de la primera.
Para la clase Vehiculo, crea los atributos de clase vehiculosCreados y kilometrosTotales, así
como el atributo de instancia kilometrosRecorridos. Crea también algún método específico para
cada una de las subclases. Prueba las clases creadas mediante un programa con un menú como
el que se muestra a continuación ; instanciar un objeto tipo Bicicleta y otro tipo Coche:
VEHÍCULOS
=========
1. Anda con la bicicleta
2. Haz el caballito con la bicicleta
3. Anda con el coche
4. Quema rueda con el coche
5. Ver kilometraje de la bicicleta
6. Ver kilometraje del coche
7. Ver kilometraje total
8. Ver número total de vehículos creados.
9. Salir
 */
public abstract class Vehiculo {

	//ATRIBUTOS
	 private static int vehiculosCreados = 0; //el truco de las cosas absolutas son esttaicas
	 private static int kilometrosTotales = 0;
	 private int kilometrosRecorridos = 0;
	
	 //CONSTRUCTOR Vacio
	 public Vehiculo() {
		super();
		Vehiculo.vehiculosCreados++;
	}

	 //CONSTRUCTOR Lleno
	public Vehiculo(int kilometrosRecorridos) {
		super();
		this.kilometrosRecorridos = kilometrosRecorridos;
		Vehiculo.vehiculosCreados++;
		Vehiculo.kilometrosTotales += kilometrosRecorridos;
	}

	//GETTER Y SETTER
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

	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}

	public void setKilometrosRecorridos(int kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}

	//To String
	@Override
	public String toString() {
		return " kilometrosRecorridos=" + kilometrosRecorridos + "]";
	}
	//MÉTODOS
	public void andar(int kms) { //creo un contador
		System.out.println("Estoy andandooooo");
		this.kilometrosRecorridos += kms;
		Vehiculo.kilometrosTotales += kms;
	}
	 
}
