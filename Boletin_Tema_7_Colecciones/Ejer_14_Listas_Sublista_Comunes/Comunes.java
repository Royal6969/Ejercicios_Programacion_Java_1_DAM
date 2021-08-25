package Ejer_14_Listas_Sublista_Comunes;

import java.util.ArrayList;

/*14. Dadas dos listas de elementos de tipo Entero, 
 * obtener una sóla con todos los elementos que están en ambas.
 */

public class Comunes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Entero> lista1=new ArrayList<Entero>();
		Entero n1=new Entero(1);
		Entero n2=new Entero(-2);
		Entero n3=new Entero(3);
		Entero n4=new Entero(-9);
		Entero n5=new Entero(2);
		Entero n6=new Entero(6);
		Entero n7=new Entero(-1);
		Entero n8=new Entero(5);
		
		lista1.add(n1);
		lista1.add(n2);
		lista1.add(n3);
		lista1.add(n4);
		lista1.add(n5);
		lista1.add(n6);
		lista1.add(n8);
		lista1.add(n7);
		
		ArrayList<Entero> lista2=new ArrayList<Entero>();
		Entero n9=new Entero(1);
		Entero n10=new Entero(3);
		Entero n11=new Entero(6);
		Entero n12=new Entero(9);
		Entero n13=new Entero(2);
		Entero n14=new Entero(8);
		Entero n15=new Entero(-1);
		Entero n16=new Entero(5);
		
		lista2.add(n9);
		lista2.add(n10);
		lista2.add(n11);
		lista2.add(n12);
		lista2.add(n13);
		lista2.add(n14);
		lista2.add(n15);
		lista2.add(n16);
		
		System.out.println("Lista 1");
		listado(lista1);		
		System.out.println("\nLista 2");
		listado(lista2);
		agruparListas(lista1, lista2);
	}

	/**Metodo que agrupa ambas listas en una y luego elimina los elementos repetidos*/
	public static void agruparListas(ArrayList<Entero> l1, ArrayList<Entero> l2) {
		ArrayList<Entero>listaCompleta=new ArrayList<Entero>();

		for(int i=0;i<l1.size();i++) {
			if(busqueda(l2, l1.get(i))==true){
				listaCompleta.add(l1.get(i));
			}
		}
		for(int i=0;i<l2.size();i++) {
			if(busqueda(l1, l2.get(i))==true){
				listaCompleta.add(l2.get(i));
			}
		}
		
		eliminar(listaCompleta);
		System.out.println("\n\nLista agrupadas");
		listado(listaCompleta);
	}

	public static void listado(ArrayList<Entero> lista) {
		for(int i=0;i<lista.size();i++)
			System.out.print(lista.get(i).toString());
	}
	
	public static boolean busqueda(ArrayList<Entero> lista, Entero e) {
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getNum()==e.getNum())
				return true;
		}
		return false;
	}
	
	public static void eliminar(ArrayList<Entero> lista) {
		for(int i=0;i<lista.size();i++) {
			for(int j=i+1;j<lista.size();j++) {
				if(lista.get(i).getNum()==lista.get(j).getNum())
					lista.remove(j);
			}
		}
	}
}
