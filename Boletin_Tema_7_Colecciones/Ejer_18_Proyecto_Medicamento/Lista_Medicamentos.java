package Ejer_18_Proyecto_Medicamento;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * D. Clase ListaMedicamentos
 */

public class Lista_Medicamentos {

	//ATRIBUTO
	private ArrayList<Medicamento_Impl> Lista_Medicamentos =  new ArrayList<Medicamento_Impl>();

	//CONSTRUCTOR Lleno
	public Lista_Medicamentos(ArrayList<Medicamento_Impl> lista_Medicamentos) {
		super();
		Lista_Medicamentos = lista_Medicamentos;
	}

	//CONSTRUCTOR Vacío
	public Lista_Medicamentos() {
		super();
	}

	//GETTER Y SETTER
	public ArrayList<Medicamento_Impl> getLista_Medicamentos() {
		return Lista_Medicamentos;
	}

	public void setLista_Medicamentos(ArrayList<Medicamento_Impl> lista_Medicamentos) {
		Lista_Medicamentos = lista_Medicamentos;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Medicamentos [Lista_Medicamentos=" + Lista_Medicamentos + "]";
	}
	
	//METODOS
	public void insertarMedicamento() throws ExcepcionPrecioMenorCero {
		
		Medicamento_Impl jarabe = new Medicamento_Impl(); //vacio
		
		jarabe = jarabe.darAltaMedicameto();
		
		Lista_Medicamentos.add(jarabe);
	}
	
	public void listarMedicamentos() {
		
		for(int i=0; i<Lista_Medicamentos.size(); i++) {
			System.out.println(Lista_Medicamentos.get(i).toString());
		}
	}
	
	public void incrementarPrecio() throws ExcepcionPrecioMenorCero { ///como ya creé un método para incrementar, no se devuelve nada aquí
		
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		double precio;
		
		System.out.println("Introduzca el codigo del medicamento");
		codigo = sc.nextInt();
		
		for(int i=0; i<Lista_Medicamentos.size(); i++) {
			 if(Lista_Medicamentos.get(i).getCodigo() == codigo) {
				 Medicamento_Impl pastilla = Lista_Medicamentos.get(i);
				 
				 System.out.println("¿Cuánto quiere aumentar el precio?");
				 precio = sc.nextDouble();
				 pastilla.incrementaPrecio(precio); //hay dos métodos de incremenar... NO CONFUNDIR
			 }
		}
	}
	
	public void sonIguales() {
		
		Scanner sc = new Scanner(System.in);
	
		boolean encontrado1 = false;
		boolean encontrado2 = false;
		
		Medicamento_Impl a = new Medicamento_Impl();
		Medicamento_Impl b = new Medicamento_Impl();
		
		int codigo1;
		System.out.println("Introduzca el codigo del medicamento");
		codigo1 = sc.nextInt();
		
		int codigo2;
		System.out.println("Introduzca el codigo del medicamento");
		codigo2 = sc.nextInt();
		
		for(int i=0; i<Lista_Medicamentos.size(); i++) {
			if(Lista_Medicamentos.get(i).getCodigo() == codigo1) {
				encontrado1 = true;
				a = Lista_Medicamentos.get(i);
			}
		}
		for(int i=0; i<Lista_Medicamentos.size(); i++) {
			if(Lista_Medicamentos.get(i).getCodigo() == codigo2) {
				encontrado2 = true;
				b = Lista_Medicamentos.get(i);
			}
		}
		if(encontrado1 == true && encontrado2 == true) {
			if(a.equals(b)){
				System.out.println("Los dos Medicamentos son iguales!");
			
			}else {
				System.out.println("Estos dos medicamentos No son iguales!");
			}
		}
	}
	
}
