package Ejer_13_SublistasPositivosNegativos;

import java.util.ArrayList;

public class Sublistas {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				ArrayList<Numeros> lista=new ArrayList<Numeros>();
				Numeros n1=new Numeros(1);
				Numeros n2=new Numeros(-2);
				Numeros n3=new Numeros(3);
				Numeros n4=new Numeros(-9);
				Numeros n5=new Numeros(2);
				Numeros n6=new Numeros(6);
				Numeros n7=new Numeros(-1);
				Numeros n8=new Numeros(5);
				
				lista.add(n1);
				lista.add(n2);
				lista.add(n3);
				lista.add(n4);
				lista.add(n5);
				lista.add(n6);
				lista.add(n8);
				lista.add(n7);
				
				System.out.println("Lista original");
				listado(lista);
				separacionSublistas(lista);
			}

			public static void separacionSublistas(ArrayList<Numeros> list) {
				ArrayList<Numeros> positivos=new ArrayList<Numeros>();
				ArrayList<Numeros> negativos=new ArrayList<Numeros>();
				
				for(int i=0;i<list.size();i++) {
					int ent=list.get(i).getNum();
					if(ent>=0) {
						Numeros e=new Numeros(ent);
						positivos.add(e);
					}else {
						Numeros e=new Numeros(ent);
						negativos.add(e);
					}
				}
				
				System.out.println("\n\nLista de positivos: ");
				listado(positivos);
				System.out.println("\nLista de negativos: ");
				listado(negativos);
			}
			
			public static void listado(ArrayList<Numeros> lista) {
				for(int i=0;i<lista.size();i++)
					System.out.print(lista.get(i).toString());
			}

}
