package Ejer_18_Proyecto_Medicamento;
import java.util.ArrayList;
import java.util.Scanner;

public class Lista_Medicamentos {

	//ATRIBUTOS
	ArrayList<Medicamento_Impl> lista_medicamentos = new ArrayList<Medicamento_Impl>();

	//CONSTRUCTOR Vacío
	public Lista_Medicamentos() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Lista_Medicamentos(ArrayList<Medicamento_Impl> lista_medicamentos) {
		super();
		this.lista_medicamentos = lista_medicamentos;
	}

	//GETTER Y SETTER
	public ArrayList<Medicamento_Impl> getLista_medicamentos() {
		return lista_medicamentos;
	}

	public void setLista_medicamentos(ArrayList<Medicamento_Impl> lista_medicamentos) {
		this.lista_medicamentos = lista_medicamentos;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Medicamentos [lista_medicamentos=" + lista_medicamentos + "]";
	}
	
	//MÉTODO
	//a. INSERTAR MEDICAMENTO (con su código, nombre, precio y si tiene o no receta) //esto lo hacemos en la clase medicamento lo de pedir los datos 
	public void insertarMedicamento() throws ExcepcionPrecioMenorCero {
		Medicamento_Impl medicamento = new Medicamento_Impl(); //creamos un medicamento
		medicamento = medicamento.pedirDatos(); //en el cual vamos a guardar los datos del medicamento que se crea en el otro método de pedirDatos()
		this.lista_medicamentos.add(medicamento); //añadimos el medicamento al ArrayList
	}
	
	//b. LISTAR MEDICAMENTOS (ordenados por nombre y en caso de igualdad por su precio) //aquí me está pidiendo una ordenación natural (CompareTo)
	public void listarMedicamentos() {
		for(int i=0; i<this.lista_medicamentos.size(); i++) {
			System.out.println(this.lista_medicamentos.get(i));
		}
	}
	
	//c. INCREMENTAR PRECIO %
	public void incrementarPrecio_v2() throws ExcepcionPrecioMenorCero {//como ya creé un método para incrementar, no se devuelve nada aquí
		//en el anterior metodo de incrementar el precio lo que hacíamos era aumentar un precio a través de la suma de otro que venía como parámetro
		//en esta ocasion, vamos a pedir el precio, comprobar qu eel medicamento existe...
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		System.out.println("Introduzca el código del medicamento al que quiere aumentar el precio");
		codigo = sc.nextInt();
		
		for(int i=0; i<this.lista_medicamentos.size(); i++) { //recorremos para buscar el medicamento
			if(this.lista_medicamentos.get(i).getCodigo() == codigo) {
				Medicamento_Impl medicamento = this.lista_medicamentos.get(i); //atrapamos ese medicamento que encontramos para alterar su precio ahora
				System.out.println("¿En cuanto % quiere aumentar el precio?");
				double precio = sc.nextDouble();
				medicamento.incrementaPrecio(precio); //llamamos al anterior metodo de incrementar precio para pasarle el precio que nos ha dicho el usuario
			}
		}
	}
	
	//d. DECIR SI DOS MEDICAMENTOS SON IGUALES
	public void sonIguales() { //aparte de este método, tendríamos que redefinir el método equals dps...
		Scanner sc = new Scanner(System.in);
		//esto tiene un razonamiento muy sencillo y estructurado paso a paso:
		Medicamento_Impl medicamento1 = new Medicamento_Impl(); //creo un medicamento(1)
		Medicamento_Impl medicamento2 = new Medicamento_Impl(); //creo otro medicamento(2)
		boolean encontrado1 = false; //creo un boolean para el primero
		boolean encontrado2 = false; //creo otro boolean para el segundo
		int codigo1, codigo2; //creo un codigo para buscar al primero y otro codigo para buscar al segundo
		System.out.println("Introduzca el codigo de un medicamento para compararlo con otro");
		codigo1 = sc.nextInt();
		System.out.println("Introduzca el código del otro medicamento para comprar con el primero");
		codigo2 = sc.nextInt();
		//recorremos lista_medicamentos buscando alguna coincidencia con el codigo1
		for(int i=0; i<this.lista_medicamentos.size(); i++) {
			if(this.lista_medicamentos.get(i).getCodigo() == codigo1){
				encontrado1 = true;
				medicamento1 = this.lista_medicamentos.get(i);
			}
		}
		//recorremos lista_medicamentos buscando alguna coincidencia con el codigo2
		for(int i=0; i<this.lista_medicamentos.size(); i++) {
			if(this.lista_medicamentos.get(i).getCodigo() == codigo2) {
				encontrado2 = true;
				medicamento2 = this.lista_medicamentos.get(i);
			}
		}
		//comparamos los resultados de las búsquedas para ver si ambos encontrados son iguales entre ellos o no
		if(encontrado1 == true && encontrado2 == true) { //aparte de este método, tendríamos que redefinir el método equals dps...
			if(medicamento1.equals(medicamento2)) {
				System.out.println("Los dos medicamentos son iguales");
			}else {
				System.out.println("Estos medicamentos son diferentes");
			}
		}
		//ahora tenemos que volver a Medicamento_impl para redefinir el método equals
	}
	
}
