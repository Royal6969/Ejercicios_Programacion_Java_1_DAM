package Ejer_12_NumerosRepetidos;

import java.util.ArrayList;

public class EliminarRepetidos_Ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Entero> lista=new ArrayList<Entero>();
		Entero n1=new Entero(1);
		Entero n2=new Entero(2);
		Entero n3=new Entero(3);
		Entero n4=new Entero(5);
		Entero n5=new Entero(2);
		Entero n6=new Entero(6);
		Entero n7=new Entero(7);
		Entero n8=new Entero(5);
		
		lista.add(n1);
		lista.add(n2);
		lista.add(n3);
		lista.add(n4);
		lista.add(n5);
		lista.add(n6);
		lista.add(n7);
		lista.add(n8);
		
		System.out.println("Lista original");
		listado(lista);
		eliminar(lista);
		System.out.println("\nLista sin repetidos");
		listado(lista);
	}
	
	public static void eliminar(ArrayList<Entero> lista) {
		
		for(int i=0;i<lista.size();i++) {
			for(int j=i+1;j<lista.size();j++) {
				
				if(lista.get(i).getNum()==lista.get(j).getNum())
					lista.remove(j);
			}
		}
	}
	
	public static void listado(ArrayList<Entero> lista) {
		for(int i=0;i<lista.size();i++)
			System.out.print(lista.get(i).toString());
	}

}

